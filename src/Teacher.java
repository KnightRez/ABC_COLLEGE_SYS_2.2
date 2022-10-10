import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {
    private int department;
    private int designation;
    private int salary;
    private int teachingHours;
    private List<Teacher> teachers = new ArrayList<Teacher>();

    public Teacher(int ID, String firstName, String lastName, String gender, String address, long phoneNumber,int department, int designation, int salary, int teachingHours) {
        super(ID, firstName, lastName, gender, address, phoneNumber);
        this.department = department;
        this.designation = designation;
        this.salary = salary;
        this.teachingHours = teachingHours;
    }

    public int getDepartment() {
        return department;
    }

    public int getDesignation() {
        return designation;
    }

    public int getSalary() {
        return salary;
    }

    public int getTeachingHours() {
        return teachingHours;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setDesignation(int designation) {
        this.designation = designation;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setTeachingHours(int teachingHours) {
        this.teachingHours = teachingHours;
    }

    public void DisplayEntry() {
        DisplayPerson();
        System.out.println("Department: " + department);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
        System.out.println("Teaching Hours: " + teachingHours);
    }

    public void addTeacher()
    {
        teachers.add(InputTeachers());
    }

    public void updateTeacher(int ID, Teacher entry)
    {
        teachers.replaceAll(e -> e.getID() == ID ? entry : e);
    }

    public void deleteTeacher(int Id) {
        teachers.removeIf(entry -> entry.getID() == Id);
    }

    public void calculateSalary(int Id)

    {
        double overtime, totalSalary = 1200.00, ha, ma, ta, netSalary;
        //find id function
        //compare Designation
        if (designation == 1){
            if (teachingHours > 8){
                overtime = (teachingHours - 8)*325;
                totalSalary += overtime;
            }

        }
        else if (designation == 2){
            if (teachingHours > 13){
                overtime = (teachingHours - 13)*325;
                totalSalary += overtime;
            }
        }
        else if (designation == 3){
            if (teachingHours > 18){
                overtime = (teachingHours - 18)*325;
                totalSalary += overtime;
            }
        }
        else{
            //error
        }

        ha = totalSalary*0.1;
        ma = totalSalary*0.03;
        ta = totalSalary*0.05;

        netSalary = totalSalary+ha+ma+ta;
    }

    public void viewAllTeachers() {
        for (Teacher entry : teachers) {
            entry.DisplayEntry();
        }
    }

    public Teacher InputTeachers() {
        Scanner scanner = new Scanner(System.in);
        Scanner stringscan = new Scanner(System.in);
        System.out.println("Enter the ID of the teacher: ");
        int ID = scanner.nextInt();
        System.out.println("Enter the First Name of the teacher: ");
        String firstName = stringscan.next();
        System.out.println("Enter the Last Name of the teacher: ");
        String lastName = stringscan.next();
        System.out.println("Enter the Gender of the teacher: ");
        String gender = stringscan.next();
        System.out.println("Enter the Phone Number of the teacher: ");
        Long phonenumber = stringscan.nextLong();
        System.out.println("Enter the Address of the teacher: ");
        String address = stringscan.next();
        System.out.println("1 for Computing 2 for Business \nEnter the department of the teacher: ");
        int department = scanner.nextInt();
        System.out.println("1 for Head of Faculty 2 for Coordinator 3 for Lecturer \nEnter the designation of the teacher: ");
        int designation = scanner.nextInt();
        System.out.println("Enter Number of Teaching Hours: ");
        int teachingHours = scanner.nextInt();


        return teachers = new Teacher(ID, firstName, lastName, gender, address, phonenumber, department, designation,0,teachingHours);
    }

    public int SearchID(int ID) {
        for (Teacher entry : teachers) {
            if (entry.getID() == ID) {
                return ID;
            }
        }
    }




}