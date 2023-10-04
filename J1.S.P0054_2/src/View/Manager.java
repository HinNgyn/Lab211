package View;

import contactmanagement.Contact;
import contactmanagement.Validation;
import java.util.ArrayList;

public class Manager {

    Validation validation = new Validation();

    public void realMenu() {
        ArrayList<Contact> lc = new ArrayList<>();
        lc.add(new Contact(1, "Iker Casillas", "Star", "Spain", "1234567890", "Iker", "Casillas"));
        lc.add(new Contact(2, "John Terry", "Star", "England", "1234567890", "John", "Terry"));
        lc.add(new Contact(3, "Raul Gonzalez", "Star", "Spain", "1234567890", "Raul", "Gonzalez"));
        //loop until user want to exit
        while (true) {
            int choice = menu();
            switch (choice) {
                case 1:
                    createContact(lc);
                    break;
                case 2:
                    printAllContact(lc);
                    break;
                case 3:
                    deleteContactd(lc);
                    break;
                case 4:
                    return;
            }
        }
    }

    // display menu
    public int menu() {
        System.out.println("1. Add a contact.");
        System.out.println("2. Display all contact.");
        System.out.println("3. Delete a contact.");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        int choice = validation.checkInputIntLimit(1, 4);
        return choice;
    }

    // allow user create contact
    public void createContact(ArrayList<Contact> lc) {

        System.out.print("Enter id contact: ");
        int contactId = validation.checkInputInt();

        // check if contact ID already exists
        while (getContactById(lc, contactId) != null) {
            System.out.println("This ID already exists. Please enter a different ID.");
            System.out.print("Enter id contact: ");
            contactId = validation.checkInputInt();
        }

        System.out.print("Enter first name: ");
        String firstName = validation.checkInputString();
        System.out.print("Enter last name: ");
        String lastName = validation.checkInputString();
        System.out.print("Enter group: ");
        String group = validation.checkInputString();
        System.out.print("Enter address: ");
        String address = validation.checkInputString();
        System.out.print("Enter phone: ");
        String phone = validation.checkInputPhone();

        lc.add(new Contact(contactId, firstName + lastName, group, address, phone, firstName, lastName));
        System.err.println("Add successful.");
    }

    // allow user display all contacts
    public void printAllContact(ArrayList<Contact> lc) {
        System.out.printf("%-5s%-25s%-20s%-20s%-20s%-20s%-20s\n", "Id", "Name", "First name", "Last name", "Group", "Address", "Phone");

        // print information of contacts from first to last in the list of contacts
        for (Contact contact : lc) {
            System.out.printf("%-5d%-25s%-20s%-20s%-20s%-20s%-20s\n", contact.getContactId(), contact.getFullName(), contact.getFirstName(), contact.getLastName(), contact.getGroup(), contact.getAddress(), contact.getPhone());
        }
    }

    // allow user to delete a contact
    public void deleteContactd(ArrayList<Contact> lc) {
        System.out.print("Enter id: ");
        int idDelete = validation.checkInputInt();
        Contact contactDelete = getContactById(lc, idDelete);
        if (contactDelete == null) {
            System.err.println("Not found contact.");
            return;
        } else {
            lc.remove(contactDelete);
        }
        System.err.println("Delete successful.");

    }

    // get contact by id
    public Contact getContactById(ArrayList<Contact> lc, int idDelete) {
        for (Contact contact : lc) {
            if (contact.getContactId() == idDelete) {
                return contact;
            }
        }
        return null;
    }
}
