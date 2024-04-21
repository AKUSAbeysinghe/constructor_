public class Main1 {

    String language;

    Main1(String l){
        language =l;
        System.out.println("Language is "+language);
    }

    public static void main(String[] args) {
        Main1 m1=new Main1("Java");
        Main1 m2=new Main1("Python");
        Main1 m3=new Main1("C");
        Main1 m4=new Main1("JavaScript");
    }
}
