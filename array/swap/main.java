public class main{
    static void swap(int a, int b){
        System.out.println("values before swap");
        System.out.println("a = "+a);
        System.out.println("b = "+b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("values after swap");
        System.out.println("a = "+a);   
        System.out.println("b = "+b);
    }

    public static void main(String[] args){
        int a = 10;
        int b = 20;
        swap(a, b);
    }
}