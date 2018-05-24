package xml_json.json_parsing.person_example;

import java.util.Arrays;

public class Person {
    private String name;
    private int age;
    private String[] phone;
    private String[] hobbies;
    private Address address;

    public Person(String name, int age, String[] phone, String[] hobbies, Address address) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.hobbies = hobbies;
        this.address = address;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone=" + Arrays.toString(phone) +
                ", hobbies=" + Arrays.toString(hobbies) +
                ", address=" + address +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String[] getPhone() {
        return phone;
    }

    public void setPhone(String[] phone) {
        this.phone = phone;
    }

    public String[] getHobbies() {
        return hobbies;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
