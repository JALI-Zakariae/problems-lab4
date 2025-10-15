package student;

public class Person {
    private static int nextId = 1;
    protected int id;
    private String firstName;
    private String secondName;
    private String phone;
    private String email;

    public Person(String firstName, String secondName, String telephone, String email) {
        this.id = nextId++;
        this.firstName = firstName;
        this.secondName = secondName;
        this.phone = telephone;
        this.email = email;
        // add others
    }

    public static int getNextId() {
        return nextId;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getId() {
        return id;
    }
}

