class Student{
    String name;
    int age;
    void init(){
        this.name="Sarita";
        this.age=23;
    }
    void print(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(){
        this.init();
        this.print();
    }
}

public class Pattern {
    public static void main(String[] args) {
        Student a=new Student();
    }
}
