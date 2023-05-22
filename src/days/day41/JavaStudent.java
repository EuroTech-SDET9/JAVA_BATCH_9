package days.day41;

public class JavaStudent {
    // fields--> name  age  gender javaHours
    // create 2 different constructors, in one of them initialize all the fields
    //make 3 of them(name,age,gender) private, create getter methods for them
    // methods--->studying (increase value of the javaHours), studentInfo make a sentence by using properties and print it ,
    // add atleast 2 more methods......

    //create JavaStudentTest class create 3 different objects and call the methods

    // find the prime numbers between 50-100
    private String studentName;
    private int age;
    private char gender;
    int javaHours;
    double javaGrades;
    double seleniumGrades;
    double averageOfGrades;

    JavaStudent() {

    }

    JavaStudent(String studentName, int age, char gender, int javaHours) {
        this.studentName = studentName;
        this.age = age;
        this.gender = gender;
        this.javaHours = javaHours;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public String getStudentName() {
        return studentName;
    }

    public void studying(int hour) {
        this.javaHours = javaHours + hour;

    }

    @Override
    public String toString() {
        return "JavaStudent{" +
                "studentName='" + studentName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", javaHours=" + javaHours +
                ", javaGrades=" + javaGrades +
                ", seleniumGrades=" + seleniumGrades +
                '}';
    }

    public void getAverageOfGrades() {
        averageOfGrades = (javaGrades + seleniumGrades) / 2;
    }

    public void results() {
        System.out.println("averageOfGrades = " + averageOfGrades);
        if (averageOfGrades > 90) {
            System.out.println("perfect!!!!!");
        } else if (averageOfGrades > 70) {// averageOfGrade<90 && averageOfGrades > 70
            System.out.println("goood!!!!");
        } else if (averageOfGrades > 50) {
            System.out.println("not bad");
        } else {
            System.out.println("you need to study more.....");
        }
    }
}
