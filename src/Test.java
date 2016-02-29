
import java.util.Random;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		testClass test = new testClass();
		
		test.setName("Chad"); 
		
		Random r = new Random();
		int number;
		
		number = r.nextInt(6) + 1;
		
		System.out.println("User Id: " + number);
		
		

	}

}
