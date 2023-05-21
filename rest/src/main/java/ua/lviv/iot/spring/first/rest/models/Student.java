package ua.lviv.iot.spring.first.rest.models;

public class Student {
    private String firstName;
    private String lastName;
    private Integer id;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Student() {
        
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String newFirstName) {
        this.firstName = newFirstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String newLastName) {
        this.lastName = newLastName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(final Integer newId) {
        this.id = newId;
    }
}
