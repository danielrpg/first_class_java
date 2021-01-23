package casting;

class A {
    public void display(){
        System.out.println("Class A");
    }
}

class B extends A{
    public void display(){
        System.out.println("Class B");
    }
}

public class CastingTest {
    public static void main(String[] args) {
        A objA = new B();
        objA.display();
       // if(objA instanceof B) {
            //((B)objA).display();
        //}
    }
}
