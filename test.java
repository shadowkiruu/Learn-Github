public class test{
    public static void main(String[] args) {
        System.out.println("hello world");
        int a = 10;
        int c = 20;
        int b = 20;
        int d = 50;
        System.out.println("hasil = "+ (a+b+c+d));
        System.out.println("hasil dari method : " + fun());
        System.out.println("branch method slesai");
        checkout();
    }
    static void checkout(){
        System.out.println("test chechout");
    }
    static int fun(){
        return 30;
    }
}