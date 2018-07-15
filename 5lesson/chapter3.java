class StudentCard{
    int id;
    String name;
}

class InstanceExample2{
    public static void main(String[] args){
        StudentCard a = new StudentCard();
        StudentCard b = new StudentCard();
        StudentCard c = b;
        a.id = 1234;
        a.name = "tarou";
        b.id = 4321;
        b.name = "hoge";
        System.out.println("StudentCard a is " + a.id + a.name);
        System.out.println("StudentCard b is " + b.id + b.name);
        System.out.println("StudentCard c is " + c.id + c.name);

        c.id = 9087;
        c.name = "papa";

        System.out.println("StudentCard a is " + a.id + a.name);
        System.out.println("StudentCard b is " + b.id + b.name);
        System.out.println("StudentCard c is " + c.id + c.name);
    }
}

class InstanceArrayExample{
    public static void main(String[] args){
        StudentCard[] cards = new StudentCard[3];
        cards[0] = new StudentCard();
        cards[0].id = 4567;
        cards[0].name = "suzuki";
        cards[1] = new StudentCard();
        cards[1].id = 3987;
        cards[1].name = "tanaka";
        cards[2] = new StudentCard();
        cards[2].id = 1698;
        cards[2].name = "imada";
        for(int i = 0;i < 3; i++){
            System.out.println("cards[" + i + "] is " + cards[i].id + " and " + cards[i].name);
        }
    }
}

class NullExample{
    public static void main (String[] args){
        StudentCard[] cards = new StudentCard[3];
        cards[1] = new StudentCard();
        cards[1].id = 9862;
        cards[1].name = "kakama";
        
        for(int i = 0;i < 3;i++){
            if(cards[i] == null){
                System.out.println("cards["+i+"] is null");
            } else {
                System.out.println("cards[" + i + "] is " + cards[i].id + " and " + cards[i].name);
            }
        }
    }
}

class ReferenceExample{
    static void printCardInfo(StudentCard card){
        System.out.println("student number is "+ card.id);
        System.out.println("student name is "+ card.name);
    }
    static void clearCardInfo(StudentCard card){
        card.id = 0;
        card.name = "null";
    }
    public static void main(String[] args){
        StudentCard a = new StudentCard();
        a.id = 8655;
        a.name = "nana";
        printCardInfo(a);
        clearCardInfo(a);
        printCardInfo(a);
    }
}