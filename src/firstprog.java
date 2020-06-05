
/*
First JAVA rogram Variable declaration and calculations (integer and variables)
*/

/**/

/*JAVA Classes*/
/* "public" and "class" are java keywords
 * "public" ---> access modifier (How the class will be accessed)
 * We use the "public" access modifier to give full access
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
        /*Total of first, second, third and the complex number*/
        int totalvalue = add + extranumber;
        System.out.println("The total value is :: " + totalvalue);

    }
}


