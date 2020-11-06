package num1;
import java.util.Scanner;
public class LabClassUI {
    public static void main(String[] args) throws EmptyStringException {
        Scanner in = new Scanner(System.in);
        int number_of_students = in.nextInt();
        Student[] students = new Student[number_of_students];
        for (int i = 0; i < number_of_students; i++) {
            int Mark = in.nextInt();
            students[i].setMark(Mark);
            String name = in.nextLine();
            students[i].setName(name);
        }
        LabClass a = null;
        a.SortStudent(students);
    }
}

