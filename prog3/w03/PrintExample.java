public class PrintExample {
	public static void main(String args[]){
		int[] counts = {1,3,5,6,5,2};
		for(int point=0;point<counts.length;point++){
			System.out.print(point + ":");
			for(int numPerson = 0;numPerson<counts[point];numPerson++){
				System.out.print("*");
			}
		System.out.print("\n");
		}
	}
}