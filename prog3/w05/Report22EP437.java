import java.util.Scanner;

class Rep2{
    int num;
    String name;
    static int counter = 0;
    void getInt(){
        System.out.println("StudentNumber is " + this.num);
    }
    void getStr() {
    	System.out.println("name is " + this.name);
    }
	
    Rep2(String name){
        counter++;
        System.out.println("Rep_1 counter is " + counter);
    }
    Rep2(int num){
        counter++;
        System.out.println("Rep_2 counter is " + counter);
    }
    Rep2(int num, String name){
		this.num = num;
		this.name = name;
        counter++;
        System.out.println("Rep_3 counter is " + counter);
	}
}

public class Report22EP437{
	public static void main(String[] args) {
        int StudentNumber = 1716236;
        String name = "nakamura";
        
        Rep2 counter_1 = new Rep2(name);
        Rep2 counter_2 = new Rep2(StudentNumber);
        Rep2 counter_3 = new Rep2(StudentNumber,name);
        
        counter_1.getInt();
        counter_2.getStr();
        counter_3.getInt();
        counter_3.getStr();
	}
}