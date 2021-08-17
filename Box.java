public class Box {
    private int length;
    private int breath;
    private int height;
    public void setDimensions(int l,int b,int h) {
        length = l;
        breath = b;
        height = h;
    }
        public void showDimensions()
    {
        System.out.println("length= " +length);
        System.out.println("breath= " +breath);
        System.out.println("height= " +height);
        }
            public static void main(String[] args) {
                Box b1 = new Box();
                b1.setDimensions(10, 15, 20);
                b1.showDimensions();
            }
        }


