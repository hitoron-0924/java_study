class StudentCard{
  int  id;
  String  name;

  public StudentCard(int id ,String name){
    this.id = id;
    this.name = name;
  }
}



public class StudentCardExample{
  public static void main(String[] args){
    StudentCard a = new StudentCard(1234, "��؁@���Y");
    //a.id = 1234;
    //a.name = "suzuki"
    System.out.println("a��id��" + a.id);
    System.out.println("a��name��" + a.name);

  }
}
