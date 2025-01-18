package service;

import domain.Contact;

public interface IServiceAgenda {
    void createContact();
    Contact searchContact(int id);
    void deleteContact(int id);
    void listContacts();
}
