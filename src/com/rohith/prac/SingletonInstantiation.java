/**
 * Created by rohith on 8/21/17.
 */
public class SingletonInstantiation {

    public static void main(String args[]) {
        SingletonPatternTest SingletonInstanceOne = SingletonPatternTest.getInstance();
        SingletonPatternTest SingletonInstanceTwo = SingletonPatternTest.getInstance();
        /*SingletonPatternTest SingletonInstanceThree = new SingletonPatternTest();
         ---The above commented line would have created a new object which is different from the other 2,
        if the constructor in the singleton class was protected and not private as both these classes are in the same package*/


        System.out.println("First instance: " + SingletonInstanceOne);
        System.out.println("Second instance: " + SingletonInstanceTwo);


    }
}
