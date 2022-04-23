public class Command {

    public static void main(String[] args) {
        String s = "Command DP is a behaviral dp in which an object is used to encapsulate a method execution/trigger for possibly later excution, the object will contain target object, method and params.";
        System.out.printf("%s%n", s);
    }
}

// Start Command DP =============================================================
interface Command {
    boolean execute();
}

class Command1 implements Command {
    
    public boolean execute() {
        System.out.printf("Command %s executed%n", "1");
    }
}

// End Command DP =============================================================