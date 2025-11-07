// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {

		int hailstone = Integer.parseInt(args[0]);
		String verOrCon = args[1];
		int sequences = hailstone;
		int num = 0;
		//counts the amount of actions until it reached 1
        int actions = 1;

		//prints the option of 1 that will alays happen
		System.out.println("1 4 2 1 (4)");
		//creating a hailstone suqeunce out of any numeric number
		for(int i = 2; i <= hailstone; i++){

		num = i;

	//with sequence output
	if(verOrCon.equals("v")){
		while (num != 1) {
			if(num % 2 == 0){
				System.out.print(num + " ");
               num = num / 2;
			   
			}
			else{
				System.out.print(num + " ");
				num = num * 3 + 1;
			}

			actions++;

		}

		//prints 1 at the end
        System.out.print(1 + " ");
        //prints the amount of actions
		System.out.println("(" + (actions) + ")");

	}
    //without sequence output
	else if(verOrCon.equals("c")){
		while (num != 1) {
			if(num % 2 == 0){
               num = num / 2;
			}
			else{
				num = num * 3 + 1;
			}

		}

	}

	//reset the amount of actions for the next loop
	 actions = 1;

	}

		 System.out.println("Every one of the first " + sequences 
		                  + " hailstone sequences reached 1.");

	}
}
