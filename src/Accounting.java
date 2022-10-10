import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Accounting {
    private List<Teacher> _teachers = new ArrayList<Teacher>();
    private List<Student> _students = new ArrayList<Student>();

    public void addTeacher(Teacher teacher)
    {
        _teachers.add(teacher);
    }

    public void updateTeacher(int ID, Teacher entry)
    {
        _teachers.replaceAll(e -> e.getID() == ID ? entry : e);
    }

    public void deleteTeacher(int Id) {
        _teachers.removeIf(entry -> entry.getID() == Id);
    }

    public void viewAllTeachers() {
        for (Teacher entry : _teachers) {
            entry.DisplayEntry();
        }
    }

    public void addTeacher() {
//        Teacher entry = new Teacher(0, "", "", "", "", 0, 0, 0, 0, 0);
//        Scanner stringscan = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the ID of the teacher: ");
        int id = scanner.nextInt();
        System.out.println("Enter the First Name of the teacher: ");
        String firstName = scanner.next();
        scanner.nextLine();
        System.out.println("Enter the Last Name of the teacher: ");
        String lastName = scanner.next();
        scanner.nextLine();
        System.out.println("Enter the Gender of the teacher [1]M|[2]F: ");
        int gender = scanner.nextInt();
        System.out.println("Enter the Phone Number of the teacher: ");
        Long phoneNo = scanner.nextLong();
        System.out.println("Enter the Address of the teacher: ");
        String address = scanner.next();
        scanner.nextLine();
        System.out.println("1 for Computing 2 for Business \nEnter the department of the teacher: ");
        int department = scanner.nextInt();
        System.out.println("[1] Head of Faculty\n[2] Coordinator\n[3] Lecturer\nEnter the designation of the teacher: ");
        int designation = scanner.nextInt();
        System.out.println("Enter Number of Teaching Hours: ");
        int teachingHours = scanner.nextInt();

        Teacher teacher = new Teacher(id, firstName, lastName, gender, address, phoneNo, department, designation, teachingHours);
        addTeacher(teacher);
//        return entry = new Teacher(ID, firstName, lastName, gender, address, phonenumber, department, designation,0,teachingHours);
    }


}
