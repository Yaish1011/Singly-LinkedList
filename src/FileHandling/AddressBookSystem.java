package FileHandling;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    String file = "E:\\STUDY\\BL\\FileHandling.txt";


    List<Contact> list = new ArrayList<>();


    public void readallcontacts() throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(file));

        String line;
        while ((line = br.readLine()) != null) {
            String[] details = line.split(",");
            if (details.length == 3) {
                Contact contact = new Contact(details[0].trim(), details[1].trim(), details[2].trim());
                list.add(contact);
            }
        }

    }

    public void printAllContacts() {
        for (Contact contact : list) {
            System.out.println(contact);
        }
    }
    public void addingContact() {
        list.add(new Contact("Yash", "8001234567", "Chandrapur"));
        list.add(new Contact("Om", "9009876543", "Solapur"));
        list.add(new Contact("Prathmesh", "7007654321", "Nashik"));
    }

    public void printAllContacts2() {

        for (Contact contact : list) {
            System.out.println(contact);
        }
    }
    public void writeAllContactToFile() throws IOException{
        BufferedWriter br = new BufferedWriter(new FileWriter(file));
        for (Contact contact : list) {
            br.write(contact.toString());
            br.newLine();
        }

    }
    public void printAllContacts3() {
        for (Contact contact : list) {
            System.out.println(contact);
        }
    }
}
