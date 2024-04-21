public class index {

    int x;
    int y;

    index(){
        x=5;
        y=10;

    }

    public static void main(String[] args) {

        index i=new index();
        System.out.println("The value is "+((i.x)+(i.y)));
    }

}
