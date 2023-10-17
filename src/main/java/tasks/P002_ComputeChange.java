package tasks;

public class P002_ComputeChange {



    /*
    Develop a program that computes the breakdown of an amount into the smallest possible number of dollars, quarters, dimes, nickels, and pennies.
     */

    public static void main(String[] args) {

    String res=    changeCents(165);
        System.out.println(res);
    }

    private static String changeCents(int cents) {
        int dollars = convertCentToDolar(cents);
        int quarters = convertCentToQuarter(cents % 100);
        int dimes = convertCentToDime(cents % 100 % 25);
        int pennies = convertCentToPenny(cents % 100 % 25 % 10);

        String dollar="dollars";
        String quarter="quarters";
        String dime="dimes";
        String penny="pennies";

        if (dollars<=1)
            dollar="dollar";

        if (quarters<=1)
            quarter="quarter";



        if (dimes<=1)
            dime="dime";


        if (pennies<=1)
            penny="penny";

      return  dollars+ " " +  dollar+" " +
              quarters + " " + quarter+" " +
              dimes +" "+ dime +" " +
              pennies+ " "+penny;


    }


    private static int convertCentToDolar(int cent) {
        return cent / 100;
    }
    private static int convertCentToQuarter(int cent) {
    return     cent/25;
    }

    private static int convertCentToDime(int cent) {
        return  cent/10;
    }

    private static int convertCentToPenny(int cent) {
        return cent/5;
    }






}
