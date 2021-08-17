public class Super{
    int a= 10;
}
class b extends Super{
    int a = 20;
    void show(int a){
        System.out.println(a);
    }
    public static void main(String[] args) {
        b ob = new b();
        ob.show(50);

    }

}
