import java.util.ArrayList;

public interface IAgenda {
    void createContact();
    Contact searchContact(int id);
    void deleteContact();
    void listContacts();
}
