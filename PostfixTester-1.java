import java.util.EmptyStackException;
import java.util.Scanner;
public class PostfixTester {

	public static void main(String[] args) throws Exception {
		/**  
		 * Reads and evaluates multiple postfix expressions.  
		 */ 
			String expression, again = "";      
			int result;  
			Scanner in = new Scanner(System.in); 
			PostfixEvaluator evaluator = new PostfixEvaluator();
			System.out.println("Postfix Expression Evaluator - N. Hoang\n");
			do { 
				try {
				
				
				System.out.println("Post-fix expression: ");
				expression = in.nextLine(); 
				result = evaluator.evaluate(expression); 
				System.out.println("Result = " + result);    
				System.out.println();           
				} 
				catch (TooManyOperandsException e) {
					System.out.println(e.getMessage());
				}
				catch (EmptyStackException e) {
					System.out.println("ERROR: Insufficient Operands");
				}
				System.out.print("Evaluate another expression [Y/N]? ");   
				again = in.nextLine();   
				System.out.println();  
			}
			while (again.equalsIgnoreCase("y"));     
		in.close();
		
	}

}


