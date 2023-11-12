package work02;
import work01.*;

public class Person {
    private static int nextId = 1;
    private final int id;
    private String firstname;
    private String lastname;

    public Person(String firstname, String lastname) {
        new Utilitor().testString(firstname);
        this.firstname = firstname;
        new Utilitor().testString(lastname);
        this.lastname = lastname;
        id = nextId;
        nextId++;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person {");
        sb.append("id=").append(id);
        sb.append(", firstname='").append(firstname).append('\'');
        sb.append(", lastname='").append(lastname).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setFirstname(String firstname) {
        new Utilitor().testString(firstname);
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        new Utilitor().testString(lastname);
        this.lastname = lastname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        else return false;
    }
}
