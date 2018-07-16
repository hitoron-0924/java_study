class StudentCard{
    int id;
    String name;
    StudentCard(int id,String name){
        this.id = id;
        this.name = name;
    }
    void printInfo(){
        System.out.println("Student id is "+this.id);
        System.out.println("Student number is "+ this.name);
    }
}

class InstanceNMEthodExample{
    public static void main(String[] args){
        StudentCard a = new StudentCard(2398,"nakamura");
        StudentCard b = new StudentCard(1111,"hatake");
        a.printInfo();
        b.printInfo();

    }
}