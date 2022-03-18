public class test{
    public static void main(String[] args) {
        System.out.println("hello world");
        int a = 10;
        int b = 20;
        System.out.println("hasil = "+ (a+b));
        System.out.println("hasil dari method : " + fun());
        System.out.println("branch method slesai");
    }

    static int fun(){
        return 30;
    }
}