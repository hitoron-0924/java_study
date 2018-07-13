
import java.util.Scanner;

class Rep2{
    int B_day;
    String name;
    static int counter = 2;
    void getInt(){
        System.out.println("barthday is" + this.B_day);
    }
    void getStr() {
    	System.out.println("name is" + this.name);
    }
	Rep2(int B_day, String name){
        System.out.println("times 1");
		this.B_day = B_day;
		this.name = name;
		counter++;
	}
    Rep2(int B_day){
        System.out.println("times 2");
        counter++;
    }
    Rep2(String name){
        System.out.println("times 3");
        counter++;
    }
}

public class Report22EP432{
	public static void main(String[] args) {
        Rep2 a = new Rep2(8_02);
        Rep2 b = new Rep2("tatibana naoyuki");
        Rep2 c = new Rep2(8_02, "tatibana naoyuki");
        a.getInt();
        b.getStr();
        c.getInt();
        c.getStr();
	}
}