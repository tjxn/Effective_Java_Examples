/**
 * Created by Trevor Jackson on 02-Jan-2017.
 */
public class Unnecessary_Object_Creation_Boxed_Primitive {

    public static void sumOfAllintValues() {
        Long sum = 0L;
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
