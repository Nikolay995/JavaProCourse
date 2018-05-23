package xml_json.jaxb.test_jaxb;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Customer {
 private String name;
 private int id;
 private int age;

    public Customer(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public Customer() {

    }

    public String getName() {

        return name;
    }
@XmlElement
    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
@XmlAttribute
    public void setId(int id) {
        this.id = id;
    }
@XmlElement
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
