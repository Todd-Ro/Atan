package com.company;

/* Thanks to https://www.cygnus-software.com/misc/pidigits.htm for explaining the general calculation method
credited to John Machin.
 */

public class Main {

    public static void main(String[] args) {

        double oneFifthAtan = Atan.atanInvInt(5);
        System.out.println(oneFifthAtan); // Should be .19739556

        double oneHalfAtan = Atan.atanInvInt(2);
        System.out.println(oneHalfAtan); // Should be .46364761

        double oneAtan = Atan.atanInvInt(1);
        System.out.println(oneAtan); // Should be .78539816; Should require the divisor limit to stop

        double twoThirtyNineAtan = Atan.atanInvInt(239);
        System.out.println(twoThirtyNineAtan);

        double pi = 16 * oneFifthAtan - 4 * twoThirtyNineAtan;
        System.out.println(pi); // pi = 3.1415926535897932...
    }
}
