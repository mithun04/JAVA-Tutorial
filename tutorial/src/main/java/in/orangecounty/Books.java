package in.orangecounty;

/**
 * Created by mithun on 4/11/17.
 */
class Book {
    String title;
    String author;
}
public class Books {
    public static void main(String [] args){
        Book [] myBooks = new Book[3];
        myBooks[0] = new Book();
        myBooks[1] = new Book();
        myBooks[2] = new Book();
        int x=0;
        myBooks[0].title = "The Grapes of Java";
        myBooks[1].title = "The Java Gatsby";
        myBooks[2].title = "The Java CookBook";
        myBooks[0].author = "bob";
        myBooks[1].author = "sue";
        myBooks[2].author = "ian";

        while (x<3) {
            System.out.println(myBooks[x].title);
            System.out.println("by");
            System.out.println(myBooks[x].author);
            x=x+1;
        }
    }
}

