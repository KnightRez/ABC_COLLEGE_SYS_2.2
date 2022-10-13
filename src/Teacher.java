import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Teacher extends Person {
    private int _department;
    private int _designation;
    private double _salary = 1200;
    private int _teachingHours;

//    enum Department {
//        Business, Computing
//    }
//    enum Designation {
//        //Head of faculty (HOF)
//        //Coordinator (CO)
//        //Lecturer (L)
//        HOF, CO, L
//    }

    public Teacher(int ID, String firstName, String lastName, String address, String gender, String phoneNumber, int department, int designation, int teachingHours) {
        super(ID, firstName, lastName, address, gender, phoneNumber);
        _department = department;
        _designation = designation;
        _teachingHours = teachingHours;
    }

    private Map<Integer, String> Designation = new HashMap<Integer, String>(){
        {{
            put(1, "HOF");
            put(2, "CO");
            put(3, "L");
        }}
    };

    public enum Designation {
        HeadOfFaculty,
        Coordinator,
        Lecturer
    }

    public void calculateSalary(){
        double ha, ma, ta;
        switch (_designation) {
            case 1:
                System.out.println("Head of Faculty");
                if (_teachingHours > 8) {
                    _salary += (_teachingHours - 8) * 325;
                }

                break;
            case 2:
                System.out.println("Coordinator");
                if (_teachingHours > 13) {
                    _salary += (_teachingHours - 13) * 325;
                }
                break;
            case 3:
                System.out.println("Lecturer");
                if (_teachingHours > 18) {
                    _salary += (_teachingHours - 18) * 325;
                }
                break;
            default:
                System.out.println("Invalid designation");
                break;
        }

        ha = _salary*0.1;
        ma = _salary*0.03;
        ta = _salary*0.05;
        _salary += ha+ma+ta;
    }

    public void DisplayEntry() {
        DisplayPerson();
        System.out.println("Department: " + _department);
        System.out.println("Designation: " + _designation);
        System.out.println("Salary: " + _salary);
        System.out.println("Teaching Hours: " + _teachingHours);
    }

    public int getDepartment() {
        return _department;
    }

    public int getDesignation() {
        return _designation;
    }

    public double getSalary() {
        return _salary;
    }

    public int getTeachingHours() {
        return _teachingHours;
    }

    public void setDepartment(int department) {
        _department = department;
    }

    public void setDesignation(int designation) {
        _designation = designation;
    }

    public void setSalary(int salary) {
        _salary = salary;
    }

    public void setTeachingHours(int teachingHours) {
        _teachingHours = teachingHours;
    }
}