public class A {
   void showA(){
       System.out.println("A type");
   }
}
class B extends A{
    void showB(){
        System.out.println("B type");
    }
}
class C extends B{
    void showC(){
        System.out.println("C type");
    }

    public static void main(String[] args) {
        A ob1 = new A();
        ob1.showA();
        //ob1.showB();
        //ob1.showC():
        B ob2 = new B();
        ob2.showA();
        ob2.showB();
        //ob2.showC();
        C ob3 = new C();
        ob3.showA();
        ob3.showB();
        ob3.showC();
            }
        }