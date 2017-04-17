package in.orangecounty;

/**
 * Created by mithun on 4/12/17.
 */
public class Hobbits {
    String name;

    public static void main(String [] args) {
        Hobbits[] h = new Hobbits[3];
        int x = 0;
        while (x < 3) {
            h[x] = new Hobbits();
            h[x].name = "bilbo";
            if (x == 1)
                h[x].name = "frodo";
            if (x == 2)
                h[x].name = "sam";
            System.out.print(h[x].name + " is a ");
            System.out.println("good Hobbit name");
            x=x+1;
        }
    }
}

