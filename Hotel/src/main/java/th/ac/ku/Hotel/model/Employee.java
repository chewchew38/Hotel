package th.ac.ku.Hotel.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
    @Id
    private int id;

    private String name;
    private int salary;
    private int tel;
    private String pin;

    public Employee() {}

    public Employee(int id, String name, int salary, int tel, String pin) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.tel = tel;
        this.pin = pin;
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getPin() { return pin; }

    public void setPin(String pin) { this.pin = pin; }
}
