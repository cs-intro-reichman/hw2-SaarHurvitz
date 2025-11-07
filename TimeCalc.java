public class TimeCalc {
    public static void main(String[] args) {

        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minutesToAdd = Integer.parseInt(args[1]);
        //creating an Integer that will be all the minutes the user had been given
        int combine = hours * 60 + minutes + minutesToAdd;
        //creating a loop that if the number passes the amount of minutes in the day it goes back 24 hours
        while (combine > 1440) {
            combine = combine - 1440;
        }

        hours = 0;
        /*after getting the minutes to less that what there is in a day
         calculating what hour it woud after adding the mnutes*/
        while (combine > 60) {
            hours++;
            combine = combine - 60;
        }
        //the number that is left would be the minutes in the hour
        minutes = combine;

        //Printing hours with leading zero if needed
        if(hours < 12) {
			System.out.print("0");
		}

		System.out.print(hours + ":");

		//Printing minutes with leading zero if needed
		if(minutes < 10) {
			System.out.print("0");
		}

		System.out.println(minutes);
    }
}
