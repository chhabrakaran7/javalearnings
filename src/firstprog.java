
/*First JAVA rogram Variable declaration and calculations (integer and variables)*/

/*JAVA Classes*/
/*
 1. "public" and "class" are java keywords
 2. "public" ---> access modifier (How the class will be accessed)
 3. We use the "public" access modifier to give full access
 */

public class firstprog {
    /*METHOD declaration*/
    public static void main(String[] args) {
        /*CODE BLOCK*/
        System.out.println("Hello Karan Chhabra");
        /*Declaration statement*/
        int myFirstnumber = 5;
        int mySecondnumber = 12;
        int myThirdnumber = 6;
        int extranumber = 20;
        System.out.println("myFirstnumber = " + myFirstnumber);
        System.out.println("mySecondnumber = " + mySecondnumber);
        System.out.println("myThirdnumber = " + myThirdnumber);
        System.out.println("extranumber = " + extranumber);
        int add = myFirstnumber + mySecondnumber + myThirdnumber;
        System.out.println("Sum of three numbers = " + add);
        /*Total of first, second, third and the extra number*/
        int totalvalue = add + extranumber;
        System.out.println("The total value is :: " + totalvalue);
    }
}


