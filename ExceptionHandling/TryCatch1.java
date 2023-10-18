package ExceptionHandling;

public class TryCatch1 {


    public static void main(String[] args) {
        int a = 6;
        int b = 0;
        int result = 0;

        try{
            result = a/b;
        }
        catch (Exception e){
            System.out.println("Erroe : "+e);
        }
        System.out.println(result);
    }
}
