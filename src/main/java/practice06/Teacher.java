package practice06;

public class Teacher extends Person{
    private int  klass;

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public String introduce(){
        if(getKlass()>0){
            return super.introduce()+" I am a Teacher. I teach Class "+this.klass+".";
        }else {
            return super.introduce()+" I am a Teacher. I teach No Class.";
        }
    }

    public int getKlass() {
        return this.klass;
    }
}
