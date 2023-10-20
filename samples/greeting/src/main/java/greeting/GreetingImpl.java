package greeting;
import io.temporal.workflow.WorkflowInterface
import io.temporal.workflow.WorkflowMethod
 @WorkflowInterface
public class GreetingImpl implements Greeting {

    @Override
   
    @WorkflowMethod
    public String greetSomeone(String name) {
        return "Hello " + name + "!";
    }
}
