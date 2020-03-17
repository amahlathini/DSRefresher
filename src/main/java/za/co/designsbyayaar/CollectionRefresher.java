package za.co.designsbyayaar;

import java.util.Stack;

public class CollectionRefresher {

    Stack<String> books;

    public Stack bookStack(){
        books = new Stack<String>();
        books.push("A Song of Ice & Fire");
        books.push("2666");
        books.push("All About Love");
        books.push("Desert Solitaire");
        books.push("Geek Love");
        books.clear();
        books.push("Men's Search of Meaning");
        books.push("To Kill A Mocking Bird");
        books.push("Thembisa noMakhaya");

        return books;
    }

}
