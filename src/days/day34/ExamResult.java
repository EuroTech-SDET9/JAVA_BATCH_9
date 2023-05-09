package days.day34;

public class ExamResult {

    public static void main(String[] args) {

        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

        char[][] answersDynamic = {
                {'A', 'B', ' ', ' ', ' ', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', ' ', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', ' ', 'C', 'E', 'E', 'A', 'D'},
                {' ', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', ' ', ' ', ' ', ' '},
                {'B', 'B', 'A', 'C', 'C', ' ', ' ', ' ', 'A', 'D'},
                {'E', 'B', ' ', ' ', ' ', 'D', 'E', 'E', 'A', 'D'}};
        
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        calculateExamResults(answers,keys);

        calculateExamResultsDynamic(answersDynamic,keys);



    }


    public static void calculateExamResults(char[][]answers , char[]key){

        for (int i = 0; i < answers.length; i++) {  // outer loop - to check each student -> answers.length  -> i is student number
            int count=0;
            for (int j = 0; j < answers[i].length; j++) { // inner loop - to check each question 1 by 1 . j is question number
                if(key[j] == answers[i][j]){
                    count++;
                }
            }
            System.out.println("Student "+(i+1)+ "'s correct count is " + count);
        }
        
    }

    public static void calculateExamResultsDynamic(char[][]answers , char[]key){

        for (int i = 0; i < answers.length; i++) {  // outer loop - to check each student -> answers.length  -> i is student number
            int countTrue=0;
            int countBlank=0;
            for (int j = 0; j < answers[i].length; j++) { // inner loop - to check each question 1 by 1 . j is question number
                if(key[j] == answers[i][j]){
                    countTrue++;
                } else if(answers[i][j] == ' '){
                    countBlank++;
                }
            }
            System.out.println("Student "+(i+1)+ "'s correct count is " + countTrue + ", false count is " + (key.length - countTrue - countBlank) + ", blank count is "+ countBlank);
        }

    }
}
