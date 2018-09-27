/**
 * Created by rohith on 8/23/17.
 */
import java.lang.reflect.Field;

public class Test {

    /* 
public static void main(String args[]) {


        String xyz = new String();
        //xyz.append("dfg");
        //System.out.println(xyz.toString().length());

        Boolean x = (xyz == null);
        System.out.println(x);
        //1360875712
    }
 */
 
 
 public static void main(String... args) {

      System.out.println("Hello World");

  }



  static {

      try {

          Field value = String.class.getDeclaredField("value");

          value.setAccessible(true);

          value.set("Hello World", value.get("G'Day Mate."));

      } catch (Exception e) {

          throw new AssertionError(e);

      }

  }
}
