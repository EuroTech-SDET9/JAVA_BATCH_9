package days.day30;

public class StrTest {

    public static void main(String[] args) {
        String actualData = "1-16 of 65 results for";
        String expectedData = "650"; // this data will come with DB query
        if (actualData.contains(expectedData)) {
            System.out.println(" TEST PASSED!! ");
        } else {
            System.out.println(" TEST FAILED!!");
        }


        String verifyValue= actualData.substring(actualData.indexOf("f")+2,actualData.indexOf("r")-1);

        System.out.println("verifyValue = " + verifyValue);






    }
}
