package serialization;

import java.io.Serializable;
import java.util.Objects;

public class Contact  implements Serializable {
    private String firstName;
    private String secondName;
    private int age;
    private String phoneNumber;

    public Contact() {
    }

    public Contact(String firstName, String secondName, int age, String phoneNumber) {

        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return age == contact.age &&
                phoneNumber.equals(contact.phoneNumber) &&
                Objects.equals(firstName, contact.firstName) &&
                Objects.equals(secondName, contact.secondName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(firstName, secondName, age, phoneNumber);
    }
}
