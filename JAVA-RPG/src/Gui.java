public class Gui{
	
	public static void title(){
		System.out.println("Welcome to Java-DND.");
		System.out.println("What is your name?");
	}
        
        public static void flush(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
