//import com.sun.swing.internal.plaf.basic.resources.basic;
class StudentCard{
    int id;
    String name;
}

class InstanceExample{
    public static void main(String[] args){
    StudentCard a = new StudentCard();
    a.id = 2134;
    a.name = "suzuki";

    StudentCard b = new StudentCard();
    b.id = 1243;
    b.name = "papa";

    System.out.println(a.id);
    
    System.out.println(b.name);
    }
}