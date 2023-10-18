package ExceptionHandling;

public class TryCatch1 {


    public static void main(String[] args) {
        int a = 6;
        int b = 0;
        int arr[] = {2,3,4,5};
        int result = 0;

        try{
            result = a/b;
        }
        catch (ArithmeticException e){
            System.out.println("Erroe : "+e);
        }
        catch (ArrayIndexOutOfBoundsException obj){
            System.out.println(obj);
        }
        catch (Exception e){
            System.out.println(e);
        }

        System.out.println(result);
    }
}
