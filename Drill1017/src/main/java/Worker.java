import org.w3c.dom.ls.LSOutput;

public class Worker {

    public boolean isPrime (int n) {
        //if (n == 2) return true;

        for (int i=2; i<n; i++) {
            if (n%2==0) return false;
        } return true;
    }
}
