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
            System.out.print("Give me ");

            /*If the string contains one of the following letters
            it will print "an". if not "a". */
            if("AEFHILMNORSX".indexOf(s.charAt(i)) != -1){
               System.out.print("an ");
            }
            else{
                System.out.print("a  ");
            }
            
                System.out.println(s.charAt(i) + ": " + s.charAt(i) + "!");
            }
            
            System.out.println("What does that spell?");

            int num = Integer.parseInt(args[1]);
            //prints the String given by the user for the amount of times given by the user
            for(; num > 0; num--){
                System.out.println(s.toUpperCase() + "!!!");
            }

        }
}
