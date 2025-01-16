import java.util.ArrayList;

public interface IAgenda {
    void createContact();
    Contact searchContact(int id);
    void deleteContact(int id);
    void listContacts();
}
