import java.util.Scanner;
import java.io.*;

public class Read_Seperate_URLs {

	public static void main(String[] args) throws IOException{
		String link;
		Scanner Text_Scan, link_Scan;
		
		Text_Scan = new Scanner(new File("url.txt"));
		
		while(Text_Scan.hasNext()) {
			link = Text_Scan.nextLine();
			System.out.println("URL:"+link);
			
			link_Scan= new Scanner(link);
			link_Scan.useDelimiter("/");
			
			while (link_Scan.hasNext())
				System.out.println("  "+link_Scan.next());
			
			System.out.println("");
		}
	}
}
