public class ChainOfReponsibility {

    public static void main(String[] args) {
        String s = "Chain of reponsibility is a ds that enables a request to be passed to a series of handlers, a handle my either handle or pass it on. to the next handle";
        System.out.printf("%s%n", s);

        Middleware h2 = new Handler1(null);

        Middleware h1 = new Handler2(h2);

        h1.check("cleo@gmail.com", "Password");

    }
}

abstract class Middleware {

    public Middleware(Middleware next) {
        this.next = next;
    }

    public boolean checkNext(String email, String password) {
        if (next == null) true;
        return next.check(email, password);
    }

    public abstract boolean check(String email, String password);

} 


class Handler1 extends Middleware {
    public boolean check(String email, String password) {
         System.out.println("Supplied email and password check");
        return email! = null && password != null;
    }
}

class Handler2 extends Middleware {
    public boolean check(String email, String password) {
        System.out.println("Correct email and password check");
        return email! = null && password != null;
    }
}
