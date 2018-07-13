import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Report42EP437{
	public static void main (String[] args){
		try{
			FileReader fr = new FileReader(args[0]);
			BufferedReader br = new BufferedReader(fr);

			FileWriter fw = new FileWriter(args[1]);
			BufferedWriter bw = new BufferedWriter(fw);

			String s;
			int num = 0;
			while((s = br.readLine()) != null){
				num++;	
				bw.write(String.format("%4d",num) + " : " + s + "\r\n");
			}
		br.close();
		bw.close();
		}
		catch(IOException e){
			System.out.println(e);
		}
	}
}