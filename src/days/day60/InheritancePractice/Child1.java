package days.day60.InheritancePractice;

public class Child1 extends Parent {


    public Child1(int a){
        super(20);
    }

    public Child1(){
        // call theother cons

      // can not use them with super() !!  this(1);
       // super();  // Parent();
        super(20);
        super.test();
        super.value =2;
    }


    public static void main(String[] args) {

        Child1 child1 = new Child1();


    }

}
