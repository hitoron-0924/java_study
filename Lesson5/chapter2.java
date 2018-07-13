class StudentCard{
    int id;
    String name;
}

class InstanceExample{
    public static void main(String[] args){
        StudentCard a = new StudentCard();
        a.id = 1234;
        a.name = "Taro";

        StudentCard b = new StudentCard();
        b.id = 6543;
        b.name = "nakamura";

        System.out.println("a.id is " + a.id);
        System.out.println("a.name is "+ a.name);
        System.out.println("b.id is " + b.id);
        System.out.println("b.name is " + b.name);
    }
}

class InstanceExample2{
    public static void main(String[] args){
        StudentCard a = new StudentCard();
        StudentCard b = new StudentCard();
        StudentCard c = b;
        a.id = 1234;
        a.name = "Taro";
        b.id = 6543;
        b.name = "nakamura";

        System.out.println("a.id is " + a.id);
        System.out.println("a.name is "+ a.name);
        System.out.println("b.id is " + b.id);
        System.out.println("b.name is " + b.name);
        System.out.println("c.id is " + c.id);
        System.out.println("c.name is " + c.name);

        c.id = 9876;
        c.name = "megumi";

        System.out.println("a.id is " + a.id);
        System.out.println("a.name is "+ a.name);
        System.out.println("b.id is " + b.id);
        System.out.println("b.name is " + b.name);
        System.out.println("c.id is " + c.id);
        System.out.println("c.name is " + c.name);

    
    }
}



class NullExample{
    public static void main(String[] args){
        StudentCard[] cards = new StudentCard[3];
        cards[1] = new StudentCard();
        cards[1].id = 1234;
        cards[1].name = "Taro";

        for(int i=0;i<3;i++){
            if(cards[i] == null){
                System.out.println("cards["+i+"] is NULL");
            }else{
                System.out.println("cards["+i+"].id is " + cards[i].id);
                System.out.println("cards["+i+"].names is " + cards[i].name);

            }
        }
    }
}