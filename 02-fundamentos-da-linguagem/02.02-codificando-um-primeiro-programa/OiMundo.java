public class OiMundo {

	public static void main(String[] args){
		
		String OiMundo = "Oi Mundo! ";

		
		if(args.length >= 0){
			
			for(String item : args){
				System.out.println(OiMundo + item);		
			}				
			
		}
	}
}