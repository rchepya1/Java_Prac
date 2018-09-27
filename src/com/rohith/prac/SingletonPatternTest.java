/**
 * Created by rohith on 8/21/17.
 */
public class SingletonPatternTest {
    //Serialization - If the Singleton class implements java.io.Serializable, the instances can be serialized and deserialized which might have multiple signleton instances

    private static SingletonPatternTest singletonPatternTestObject = null;
    // Or a less complex way : public final static SingletonPatternTest getInstance = new SingletonPatternTest();

    private SingletonPatternTest() {  // To compromise instantiation by external classes
        // This can be "protected SingletonPatternTest() {}" if we want the instance creation to be available at package level and not public level
    }

    public static SingletonPatternTest getInstance() {
        if (singletonPatternTestObject == null) {
            singletonPatternTestObject = new SingletonPatternTest();

            //Because of the above lines this is not thread safe (though it's only an edge case)
            //as we can start one thread, provide a delay and start another thread to instantiate 2 objects.
            //This can be made thread-safe by synchronizing the getInstance() method using Synchronized key word. (Decreases performance significantly)
            //Or, for a little enhanced performance, instead of synchronizing the entire method, we can add a condition before creating the object as synchronized(SingletonPatternTestObject.class).

        }
        return singletonPatternTestObject;
    }
}
