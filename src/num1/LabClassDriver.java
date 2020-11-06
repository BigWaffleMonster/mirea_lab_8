package num1;

public class LabClassDriver extends Exception{
    public Student findStudent(Student[] arr, String name) throws StudentNotFoundException {
        for (int i = 0; i < arr.length + 1; i++){
            if (arr[i].name == name) {
                return arr[i];
            }
        }
        throw new StudentNotFoundException("Student not found");
    }
}
