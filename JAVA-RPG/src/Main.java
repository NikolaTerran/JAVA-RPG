import java.io.*;
import java.util.*;

public class Main{
	
        int val1;
        int val2;
        int val3;
        int val4;
        int val5;
        int val6;
        int val7;
    
    
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
                Gui.flush();
                Gui.title();
                
        Main player = new Main();
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
       catch (FileNotFoundException ex) {
            try {
                FileWriter fileWriter
                        = new FileWriter(fileName);
                BufferedWriter bufferedWriter
                        = new BufferedWriter(fileWriter);
            } catch (IOException exx) {
                System.out.println(
                        "Error writing to file '"
                        + fileName + "'");
            }

        } catch (IOException ex) {
            System.out.println(
                    "Error reading file '"
                    + fileName + "'");
        }
        player.role_assign();
    }

    public void role_assign(){
        Gui.flush();
        Scanner inRole = new Scanner(System.in);
        System.out.println("Welcome to JAVA-RPG, a Zork-like game written in JAVA.");
        System.out.println("Who do you want to be?");
        System.out.println("1. Wizard");
        val1 = inRole.nextByte();
        Character player = new Character(val1);
        
    }
        
    
    
    public void load_progress() {
        
    }

}
