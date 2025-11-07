//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {

        public static void main(String[] args) {

                String s = args[0];
                //prints the String given by the user letter by letter
	        for(int i = 0; i < s.length(); i++){
                System.out.println("Give me " + s.charAt(i) + ": " + s.charAt(i) + "!");
            }
            
            System.out.println("What does it spell?");

            int num = Integer.parseInt(args[1]);
            //prints the String given by the user for the amount of times given by the user
            for(; num > 0; num--){
                System.out.println(s + "!");
            }

        }
}
