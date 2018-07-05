import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

class MyThread extends Thread {
	public void run() {
		LocalTime d = LocalTime.now();
		DateTimeFormatter df1 = DateTimeFormatter.ofPattern("HH:mm:ss");
		String s = df1.format(d);
		Random r = new Random();
		int num = r.nextInt(8)+2;
		try {
			Thread.sleep(num * 1000);
		} catch(InterruptedException e) {
			System.out.println(e);
		}
		LocalTime d1 = LocalTime.now();
		String s1 = df1.format(d1);
		System.out.println(Thread.currentThread().getId()+" start "+s+" wait "+num+" end "+s1);
	}
}
class Report32EP437 {
	public static void main(String[] args) {
		MyThread[] mythread = new MyThread[30];
		for(int i = 0; i < 30; i++) {
			mythread[i] = new MyThread();
			mythread[i].start();
		}
		for (int i = 0; i < 30; i++) {
			try{
				mythread[i].join();
			} catch(InterruptedException e) {
				System.out.println(e);
			}
		}
		System.out.println("Program end");
	}
}
