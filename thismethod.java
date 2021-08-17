public class thismethod {
    int i;
    void setValues(int x){
        i=x;
    }
    void show(){
        System.out.println(i);
    }
}
class method{
    public static void main(String[] args) {
        thismethod d = new thismethod();
        d.setValues(50);
        d.show();
    }
}
