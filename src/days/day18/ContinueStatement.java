package days.day18;

public class ContinueStatement {

    public static void main(String[] args) {

        // itar  --> for loop
        // iter --> for each
        for (int i = 1; i <= 10; i++) {
            if (i == 7) {
                continue;
            }
            System.out.println("number: " + i);
        }

// Don't want to see multiply any number with 3  : 1 X 3 or 2 X 3 or 3 X 3 etc...
        System.out.println(" \n//////////////////////\n");
        for (int x= 1 ; x<=5 ; x++){

            for (int y= 1 ; y<=5 ; y++){
                if(y==3){
                    continue;
                }
                System.out.println(x + " X " + y + " = " + (x*y));
            }
        }

        System.out.println(" \n//////////////////////\n");
// Don't want to see multiply number 3  : 3 X 1 or 3 X 2 or 3 X 3 etc...
        for (int x= 1 ; x<=5 ; x++){
            if(x==3){
                continue;
            }
            for (int y= 1 ; y<=5 ; y++){
                System.out.println(x + " X " + y + " = " + (x*y));
            }
        }

        System.out.println(" \n//////////////////////\n");
// Don't want to see multiply with number 3 in anywhere  : 1 X 3 or 2 X 3 or 3 X 1 or 3 X 2 or 3 X 3 etc...
        int count1= 0;
        for (int x= 1 ; x<=5 ; x++){
            if(x==3){
                continue;
            }
            for (int y= 1 ; y<=5 ; y++){
                ++count1;
                if(y==3){
                    continue;
                }
              System.out.println(x + " X " + y + " = " + (x*y));
            }
        }

        System.out.println("count1 = " + count1);

        System.out.println(" \n//////////////////////\n");
        // OR but cause extra iteration !!!
        int count2= 0;
        for (int x= 1 ; x<=5 ; x++){
            for (int y= 1 ; y<=5 ; y++){
                ++count2;
                if(x==3 || y==3){
                    continue;
                }
             System.out.println(x + " X " + y + " = " + (x*y));
            }
        }

        System.out.println("count2 = " + count2);

        // ctrl + /  select multiple line !!


        System.out.println(" \n///////////// LABEL STATEMENT  /////////\n");

        // without label statement --> X * Y  ->  1 X 3 or 2 X 3 or 3 X 3 or 4 X 3 etc...
        // with  label statement --> X * Y  ->


      label1:for (int x= 1 ; x<=5 ; x++){
              for (int y= 1 ; y<=5 ; y++){
                if(y==3){
                    continue label1;
                }
                System.out.println(x + " X " + y + " = " + (x*y));
            }
        }


        OUTER_LOOP:  // PAGE !!! When find Samir, then skip to next page
        for (int x = 1; x <= 75; x++) {
            System.out.println(" Click page " + x);

            INNER_LOOP: for (int y = 1; y <= 10; y++) {   // EACH LINE!!
                System.out.println(" Check" + x + ". line: ");
                String getName = "RandomName"; // this value should come by selenium method dynamically
                if (getName.equals("Samir")) {// .equals like ==
                    System.out.println("Get the Samir's data and done verification for test!");
                    continue OUTER_LOOP;
                }
            }
        }


    }
}
