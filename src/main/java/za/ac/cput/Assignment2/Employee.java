package za.ac.cput.Assignment2;

import java.util.Objects;

/**
    @Author Chadleigh Dunbar - 218065256
 */

public class Employee {


    private String firstName, lastName, dateAppointed;
    private int employeeID;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateAppointed() {
        return dateAppointed;
    }

    public void setDateAppointed(String dateAppointed) {
        this.dateAppointed = dateAppointed;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateAppointed='" + dateAppointed + '\'' +
                ", employeeID=" + employeeID +
                '}';
    }

}

