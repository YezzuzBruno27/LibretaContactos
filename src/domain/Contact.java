package domain;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("domain.Contact{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", number='").append(number).append('\'');
        sb.append(", age=").append(age);
        sb.append(", occupation='").append(occupation).append('\'');
        sb.append(", dateAdded=").append(dateAdded);
        sb.append('}');
        return sb.toString();
    }
}
