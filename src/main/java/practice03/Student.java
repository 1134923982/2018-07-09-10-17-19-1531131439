package practice03;

public class Student extends Person{
    private int  klass;

    public Student(String name, int age) {
        super(name, age);
    }

    public Student(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public String introduce(){
        return "I am a Student. I am at Class "+this.klass+".";
    }

    public int getKlass() {
        return this.klass;
    }
}