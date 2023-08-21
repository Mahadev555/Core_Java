import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter");
        String str = br.readLine();
        System.out.println(str);



        //convert into integer

        int inte = Integer.parseInt(br.readLine());
        System.out.println(inte);
    }
}
