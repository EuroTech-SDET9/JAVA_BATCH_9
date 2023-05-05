package days.day31;

public class ForEachLoop {

    public static void main(String[] args) {
        String[] cars = {"Honda", "BMW", "KIA"};

        //itar
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        // iter  FOREACH LOOP!!
        for (String car : cars) {   //   for ( DataType identName : DataContainer)
            System.out.println( car);
        }

        int[] numbers= {33,22,-11,22,-33,2255,-55};

        for (int number : numbers) {
            System.out.print(number + " ");
        }

        for (int number : numbers) {
            if(number>=0){
                System.out.println(number + " is positive!");
            } else{
                System.out.println(number + " is negative!");
            }
        }

    }
}
