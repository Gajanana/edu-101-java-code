package greeting;
 //@WorkflowInterface
public class GreetingImpl implements Greeting {

    @Override
   
   // @WorkflowMethod
    public String greetSomeone(String name) {
        return "Hello " + name + "!";
    }
}
