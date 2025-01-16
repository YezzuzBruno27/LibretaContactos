import java.time.LocalDate;

public class Contact {
    int id;
    String name;
    String number;
    int age;
    String occupation;
    LocalDate dateAdded;

    public Contact(){}
    public Contact(int id,String name, String number, int age, String occupation, LocalDate date) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.age = age;
        this.occupation = occupation;
        this.dateAdded = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}
