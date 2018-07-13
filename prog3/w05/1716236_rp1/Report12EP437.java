import java.util.*;

public class Report12EP437{ 
	public static void main(String[] args){
		//array[0~11]
		String[] month = {"1: Jan","2: Feb","3: Mar","4: Apr",
		"5: May","6: Jun","7: Jul","8: Aug","9: Sep","10: Oct","11: Nov","12: Dec"};
		System.out.println("What is number?");
		//input is scan number 
		Scanner input_num = new Scanner(System.in);
		int num = input_num.nextInt();
		if ( num > 0 && num <= 12){
			System.out.println(month[num - 1]);
		}
		else{
			System.out.println( num +" is nil month ");
		}
	}
}