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
    StudentCard a = new StudentCard(1234, "—é–Ø@‘¾˜Y");
    //a.id = 1234;
    //a.name = "suzuki"
    System.out.println("a‚Ìid‚Í" + a.id);
    System.out.println("a‚Ìname‚Í" + a.name);

  }
}
