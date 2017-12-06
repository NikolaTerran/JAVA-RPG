import java.util.Scanner;
public class Character{

	private String name;
	private String role;
	private String race;
	private String alignment;
	private String gender;

	private int str;
	private int dex;
	private int cons;
	private int intel;
	private int wis;
	private int cha;
        
        private static int int_max = 75;
        
        public Character(){}

	public Character(int x){		
		
		switch(x){
			case 1: role = "wizard";
					break;
			
		
		}
                initialize(role);
	}

	private void initialize(String x){
            if(role.equals("wizard")){
                
                int input;
                Scanner assign = new Scanner(System.in);
                System.out.println("Please assign your strength attribute point.");
                
                str = Exception(assign.nextByte(),18,int_max);
                System.out.println("Please assign your dexterity attribute point.");
                dex = Exception(assign.nextByte(),18,int_max);
                System.out.println("Please assign your constitution attribute point.");
                cons = Exception(assign.nextByte(),16,int_max);
                System.out.println("Please assign your intelligence attribute point.");
                intel = Exception(assign.nextByte(),20,int_max);
                System.out.println("Please assign your wisdom attribute point.");
                wis = Exception(assign.nextByte(),20,int_max);
                System.out.println("Please assign your charisma attribute point.");
                cha = Exception(assign.nextByte(),18,int_max);
                        } 
	}
        
        private int Exception(int input, int expect, int sub){
            while(true)
                {if(input > expect){
                    Scanner in = new Scanner(System.in);
                 System.out.println("Your input value is larger than expected.");
                 System.out.println("Please re-enter your input.");
                    input = in.nextByte();
                 
            }
                else if(sub - input < 0){
                 System.out.println("Your don't have enough stats, try again.");
                }
            else{   sub = sub - input;
                            System.out.println(sub);
                    return input;}}
        }           
}


YOOOOOO
CAN YOU PLEASE CONTRIBUTE TO THE REPOSITORY HOLMES TOLD US TO MAKE:

RPG_PERIOD7_TEAM10

WE REALLY NEED UR HELP






































