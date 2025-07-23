package day3.Userinput;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String name;
        
        System.out.println("Enter name:");
        name= br.readLine();
        
        int id;
        System.out.println("Enter your Id");
        id=Integer.parseInt(br.readLine());//parseInt is a static method

        float marks;
        System.out.println("Enter marks:");
        marks=Float.parseFloat(br.readLine());
        
        System.out.println("Name:"+name+"id:"+id+"marks:"+marks);
	}
}
