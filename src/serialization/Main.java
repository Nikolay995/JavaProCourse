package serialization;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Contact contact_1 = new Contact("Petr", "Petrov", 25,"+38080808081");
        File file = new File("serial.txt");
        try ( ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {

            oos.writeObject(contact_1);
            System.out.println("Write success!");

            Contact contact_2 = (Contact) ois.readObject();
            System.out.println(contact_1.toString());
            System.out.println(contact_2.toString());

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }}
