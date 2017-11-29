import java.util.Scanner;
public class Role{

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
        
        public Role(){}

	public Role(int x, int y, int z, int a){		
		
		switch(x){
			case 1: role = "wizard";
					break;
			
		}
		switch(y){
			case 1: race = "human";
					break;
		}
		switch(z){
			case 1: alignment = "lawful";
					break;
		}
		switch(z){
			case 1: gender = "male";
					break;
		}
                initialize(race);



	}

	private void initialize(String race){
            if(race.equals("human")){
                int int_max = 75;
                Scanner assign = new Scanner(System.in);
                System.out.println("Please assign your strength attribute point.");
                str = Exception(assign.nextByte(),18);
                System.out.println("Please assign your dexterity attribute point.");
                dex = Exception(assign.nextByte(),18);
                System.out.println("Please assign your constitution attribute point.");
                cons = Exception(assign.nextByte(),18);
                System.out.println("Please assign your intelligence attribute point.");
                intel = Exception(assign.nextByte(),18);
                System.out.println("Please assign your wisdom attribute point.");
                wis = Exception(assign.nextByte(),18);
                System.out.println("Please assign your charisma attribute point.");
                cha = Exception(assign.nextByte(),18);
                        } 
	}
        
        private int Exception(int input, int expect){
            while(true)
                {if(input > expect){
                    Scanner in = new Scanner(System.in);
                 System.out.println("Your input value is larger than expected.");
                 System.out.println("Please re-enter your input.");
                    input = in.nextByte();
                 
            }
            else{return input;}}
        }           
}







































