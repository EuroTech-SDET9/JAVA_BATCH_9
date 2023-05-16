package days.day38;

public class Sample {

    int id;
    String name;


    public Sample(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void test(int id) {
//      number=2;
        id = 2;
        this.id = id;
    }

    public static void main(String[] args) {
//        Sample obj = new Sample(); ERROR because there is a paramt cons! java will not create default one!!!
//        System.out.println("obj.id = " + obj.id);

//        String test;
//
//        test.length();

        Sample obj;

       // obj.test(2);

    }
}



