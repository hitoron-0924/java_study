class StudentCard{
    int id;
    String name;
    StudentCard(){
        System.out.println("Called null StudentCard");
        this.id = 0;
        this.name = "YET";
    }
    StudentCard(String name){
        System.out.println("Called of name StudentCard");
        this.id = 0;
        this.name = name;
    }
    StudentCard(String name, int id){
        System.out.println("Called null StudentCard");
        this.id = id;
        this.name = name;
    }
}

class ConstructorOverloadExample{
    public static void main(String[] args){

        StudentCard a = new StudentCard();
        System.out.println("a.id is " + a.id);
        System.out.println("a.name is "+a.name);
        
        StudentCard b = new StudentCard("suzuki");
        System.out.println("b.id is " + b.id);
        System.out.println("b.name is "+b.name);
        
        StudentCard c = new StudentCard("suzuki",1234);
        System.out.println("c.id is " + c.id);
        System.out.println("c.name is " + c.name);
    }
}
