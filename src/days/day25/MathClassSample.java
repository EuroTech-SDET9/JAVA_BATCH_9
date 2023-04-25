package days.day25;

import days.day15.Mark;

public class MathClassSample {

    public static void main(String[] args) {


        System.out.println("Math.abs(-111) = " + Math.abs(-111));

        System.out.println("Math.ceil(2.111) = " + Math.ceil(2.111)); // rounds upward -> 3.0

        System.out.println("Math.floor(2.9999) = " + Math.floor(2.9999)); // round downward -> 2.0

        System.out.println("Math.round(2.111) = " + Math.round(2.111)); // round to the nearest int -> 2

        System.out.println("Math.round(2.666) = " + Math.round(2.666)); // round to the nearest int -> 3

        System.out.println("Math.max(100,999) = " + Math.max(100, 999));
        System.out.println("Math.min(100,999) = " + Math.min(100, 999));

        System.out.println("Math.PI = " + Math.PI);

        System.out.println("Math.random() = " + Math.random()); // 0.0 -1.0 exc  same with random.nextDouble()
    }
}
