package num1;

public class LabClass {
    public void SortStudent(Student[] arr){
        int l = arr.length;
        for(int i = 0; i < l; i++)
            for(int j = i; j < l; j++) {
                if (arr[i].mark < arr[j].mark) {
                    Student t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
    }
}
