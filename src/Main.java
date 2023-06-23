public class Main {
    public static void main(String[] args) {
        // Pattern printing
        // for pattern printing used first param i or j or anything = 1 not 0.
        // because it is easier to print patters sometimes 0 is print with 1 row differance
        int n= 5; // this is the n number value(row)

        /*
             foe all outer loop same i = 1 , second pa param j <= n
             square = j start 1, second param  j <= n
             Increase = j start 1, second param j <= i
             Decrease = j = i, second param j <= n
         */


        // square pattern
        // first and second loop both second param is equal to n value
        for (int i = 1;i <= n;i++){
            for (int j = 1;j <= n;j ++) {
                System.out.print("* ");  // print statement print row wise
            }
            System.out.println(""); // this is for the brake line after 5 start print in a row. otherwise all stars print in a row
        }

        System.out.println("______________________________________________________"); // this is for space between tow patterns


        /*
             foe all outer loop same i = 1 , second pa param j <= n
             square = j start 1, second param  j <= n
             Increase = j start 1, second param j <= i
             Decrease = j = i, second param j <= n
         */


        // Increase triangle pattern (top to bottom star is increase)
        // as square need tow loops outer and inner
        // outer loop is same normally print n numbers
        // inner loop second param is changed by adding outer loop i value (j <= i)
        for (int i = 1;i <= n;i++){
            for (int j = 1;j <= i;j ++) {
                System.out.print("* ");  // print statement print row wise
            }
            System.out.println(""); // this is for the brake line after 5 start print in a row. otherwise all stars print in a row
        }

        System.out.println("______________________________________________________"); // this is for space between tow patterns


        /*
             foe all outer loop same i = 1 , second pa param j <= n
             square = j start 1, second param  j <= n
             Increase = j start 1, second param j <= i
             Decrease = j = i, second param j <= n
         */


        // Decrease triangle pattern (bottom to top star is increase)
        // as square need tow loops outer and inner
        // outer loop is same normally print n numbers
        // inner loop first param is changed by adding outer loop i value (j = i)
        for (int i = 1;i <= n;i++){
            for (int j = i;j <= n;j ++) {
                System.out.print("* ");  // print statement print row wise
            }
            System.out.println(""); // this is for the brake line after 5 start print in a row. otherwise all stars print in a row
        }

        System.out.println("______________________________________________________"); // this is for space between tow patterns


        /*
             foe all outer loop same i = 1 , second pa param j <= n
             square = j start 1, second param  j <= n
             Increase = j start 1, second param j <= i
             Decrease = j = i, second param j <= n
         */

        //                  *
        //                * *
        //              * * *
        //            * * * *
        //          * * * * *
        // this patten has 2 triangles first one is decreasing patter with space and increasing pattern with stars
        // because all pattern print left to right and top to bottom
        // so outer loop same as always because n number rows need to print
        // and then we have tow inner loops fist one is decrease and second one is increase
        // in these same code first inner loop or outer print statement one space is remove patten will not correctly display
        // because of that we need to print same number of characters for both print statements
        for (int i = 1;i <= n;i++){
            for (int j = i;j <= n;j ++) {
                System.out.print("  ");  // decrease
            }
            for (int j = 1;j <= i;j ++) {
                System.out.print("* ");  // increase
            }
            System.out.println(""); // this is for the brake line after 5 start print in a row. otherwise all stars print in a row
        }

        System.out.println("______________________________________________________"); // this is for space between tow patterns


        /*
             foe all outer loop same i = 1 , second pa param j <= n
             square = j start 1, second param  j <= n
             Increase = j start 1, second param j <= i
             Decrease = j = i, second param j <= n
         */

        //          * * * * *
        //            * * * *
        //              * * *
        //                * *
        //                  *
        // this patten has 2 triangles first one is increasing patter with space and decreasing pattern with stars
        // because all pattern print left to right and top to bottom
        // so outer loop same as always because n number rows need to print
        // and then we have tow inner loops fist one is increasing and second one is decreasing
        for (int i = 1;i <= n;i++){
            for (int j = 1;j <= i;j ++) {
                System.out.print("  ");  // increase
            }
            for (int j = i;j <= n;j ++) {
                System.out.print("* ");  // decrease
            }
            System.out.println(""); // this is for the brake line after 5 start print in a row. otherwise all stars print in a row
        }

        System.out.println("______________________________________________________"); // this is for space between tow patterns


        /*
             foe all outer loop same i = 1 , second pa param j <= n
             square = j start 1, second param  j <= n
             Increase = j start 1, second param j <= i
             Decrease = j = i, second param j <= n
         */

        //                  *
        //                * * *
        //              * * * * *
        //            * * * * * * *
        //          * * * * * * * * *
        for (int i = 1;i <= n;i++){
            for (int j = i;j <= n;j ++) {
                System.out.print("  ");  // decrease
            }
            for (int j = 1;j < i;j ++) {
                System.out.print("* ");  // increase (second inner loop j < n not <= only <)
            }
            for (int j = 1;j <= i;j ++) {
                System.out.print("* ");  // increase
            }
            System.out.println(""); // this is for the brake line after 5 start print in a row. otherwise all stars print in a row
        }

        System.out.println("______________________________________________________"); // this is for space between tow patterns


        /*
             foe all outer loop same i = 1 , second pa param j <= n
             square = j start 1, second param  j <= n
             Increase = j start 1, second param j <= i
             Decrease = j = i, second param j <= n
         */
        //
        //          * * * * * * * * *
        //            * * * * * * *
        //              * * * * *
        //                * * *
        //                  *

        for (int i = 1;i <= n;i++){
            for (int j = 1;j <= i;j ++) {
                System.out.print("  ");  // increase
            }
            for (int j = i;j < n;j ++) {
                System.out.print("* ");  // decrease (second inner loop j < n not <= only <)
            }
            for (int j = i;j <= n;j ++) {
                System.out.print("* ");  // decrease
            }
            System.out.println(""); // this is for the brake line after 5 start print in a row. otherwise all stars print in a row
        }

        System.out.println("______________________________________________________"); // this is for space between tow patterns


         /*
             foe all outer loop same i = 1 , second pa param j <= n
             square = j start 1, second param  j <= n
             Increase = j start 1, second param j <= i
             Decrease = j = i, second param j <= n
         */
        //
        //          *
        //        * * *
        //      * * * * *
        //    * * * * * * *
        //  * * * * * * * * *
        //    * * * * * * *
        //      * * * * *
        //        * * *
        //          *

        for (int i = 1;i < n;i++){      //  (first outer loop i < n not <= only <)
            for (int j = i;j <= n;j ++) {
                System.out.print("  ");  // decrease
            }
            for (int j = 1;j < i;j ++) {
                System.out.print("* ");  // increase (second inner loop j < n not <= only <)
            }
            for (int j = 1;j <= i;j ++) {
                System.out.print("* ");  // increase
            }
            System.out.println(""); // this is for the brake line after 5 start print in a row. otherwise all stars print in a row
        }
        for (int i = 1;i <= n;i++){
            for (int j = 1;j <= i;j ++) {
                System.out.print("  ");  // increase
            }
            for (int j = i;j < n;j ++) {
                System.out.print("* ");  // decrease (second inner loop j < n not <= only <)
            }
            for (int j = i;j <= n;j ++) {
                System.out.print("* ");  // decrease
            }
            System.out.println(""); // this is for the brake line after 5 start print in a row. otherwise all stars print in a row
        }

        System.out.println("______________________________________________________"); // this is for space between tow patterns
    }
}