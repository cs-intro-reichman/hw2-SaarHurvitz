// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    
		
		int num = Integer.parseInt(args[0]);
		double newPi = 1.0;
		double calc = 3.0;

		//calcuating the value of pi for how accurate the user had wanted it
        for(int i = 0; i < num - 1; i++){

            if(i % 2 == 0){
			    newPi = newPi - (1.0 / calc);
			} 

			else{
			   newPi = newPi + (1.0 / calc);
			} 

			calc = calc + 2.0;
		}
        
		//the value is PI/4 so we need to double it by 4
        newPi = newPi * 4.0;

		System.out.println("pi according to Java: " + Math.PI);
		System.out.print("pi, approximated:     " + newPi);

	}
}
