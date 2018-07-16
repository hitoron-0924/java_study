class StudentCard{
    int id;
    String name;
    StudentCard(int id,String name){
        System.out.println("Called StudentCard");
        this.id = id;
        this.name = name;
    }
}

class ConstructorExample{
    public static void main(String[] args){
        StudentCard a = new StudentCard(1234,"suzuki");
        System.out.println("a.id is " + a.id);
        System.out.println("a.name is "+a.name);
    }
}
