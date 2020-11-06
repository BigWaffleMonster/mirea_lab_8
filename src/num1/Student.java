package num1;

public class Student{
    int mark;
    String name;
    public Student(){
        name = "";
        mark = 0;
    }
    public String getName(){
        return name;
    }
    public int getMark(){return mark;}

    public void setName(String name) throws EmptyStringException {
        if(name == "")
            throw new EmptyStringException("Name is empty");
        this.name = name;
    }
    public void setMark(int mark){
        this.mark = mark;
    }
}
