package days.day18;

public class BreakStatement {

    public static void main(String[] args) {


        int number = 0;
        int sum = 0;

        while (number < 5) {
            number++;
            sum += number;
            if (sum > 6){
                break;
            //    System.out.println(" HI "); unreachable statement!! cause compilation error!!
            }
            System.out.println("END OF THE " + number + ". ITERATION");
            System.out.println("mid-sum = " + sum);
            System.out.println(" ///////////////////// ");
        }

        System.out.println("sum = " + sum);
        System.out.println("number = " + number);



        while (true){  // infinitive loop!!
            System.out.println(" Welcome infinitive loop!! ");
            System.out.println(" Oopss there is a BREAK! ");
            break;
//            System.out.println(" END OF THE LOOP!");
        }

        // unnecessary break usages
        for (int i = 1; i <= 5; i++) {  // change continuation condition to 3 !!
            System.out.println(" Hello LOOPs");
            if(i==3) {
                break;
//                System.out.println(" Statement 1 ");
//                System.out.println(" Statement 2 ");
//                System.out.println(" Statement 3 ");
            }
        }





    }
}
