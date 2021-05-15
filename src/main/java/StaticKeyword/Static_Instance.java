package StaticKeyword;
class Marks{
    int english = 80;
    int maths = 90;
    public static int salary = 20000;
    public static String name = "bindu";
}
//Instance Methods
class Name{
    String name = " ";
    public String firstName(String name){
        return name;
    }
}
class Result{
    String res = " ";
    public String examResult(String examres){
        return examres;
    }

}
//Static Methods
class Age{
    int age;
    public static int studentAge(int age){
        return age;
    }
}
class MarriedStatus{
    boolean status;
    public static boolean getMarried(boolean status){
        return status;
    }

}
public class Static_Instance {
    public static void main(String args[]){
        Marks marks = new Marks();  // Calling instance variables in static Methods.
        System.out.println("Instance Variables : " +marks.english +" "+marks.maths);
        System.out.println("Static Variables : "+Marks.name +" "+Marks.salary);
        Name name = new Name();
        System.out.println(name.firstName("Instance Method1 : "+"Bindu Vankayalapati"));
        Result result = new Result();
        System.out.println(result.examResult("Instance Method2 : "+"pass"));
        System.out.println("Static Method1 : " + Age.studentAge( 20));
        System.out.println("Static Method2 : " +MarriedStatus.getMarried(true));
    }

}
