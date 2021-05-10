package com.company;

public class Atan {

    public static double atanInvInt(int x) {
        // Returns the arc tangent of an inverse integer
        /* Terminates once the remaining amount reaches zero or the denominator reaches 2101.
        If the former happens, the accuracy should be determined by the number format used, such as double.
        If the latter happens, the result should be off by at most one from the correct nearest value
                    in the seventh decimal place, if allowed by the accuracy of the number format used.
        */
        int xSquare = x*x;
        double result = ((double)1)/x;
        double term = ((double)1)/x;
        int divisor = 1;
        double midResult;
        while ((term > 0)) {
            term = term / xSquare;
            divisor += 2;
            midResult = result - term/divisor;
            term = term /xSquare;
            divisor += 2;
            result = midResult + term/divisor;
            if (divisor >= 2101) {
                return ((result + midResult) / 2);
            }
        }
        return result;
    }

}
