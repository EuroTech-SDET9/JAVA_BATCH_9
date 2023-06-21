package days.day60.InheritancePractice;

public class Child2 extends Parent{

    int num;

    int value;

    public Child2(){
        super(333);
    }

    public void setValue(int value){
     //   this.value=value;
        super.value = value;
    }


}
