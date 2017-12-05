import java.util.Scanner;
import java.io.*;
public class Main{
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);		
		Gui.title();
		
        String fileName = in.next();
        String line = null;

        try {
            FileReader fileReader = 
                new FileReader(fileName);
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);
            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }   

            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
			
			
			
			
            
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'"); }                 
	
	
	}

	public void input_process(){
		
	}

}
