import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {


        List<Book> books= new ArrayList<>();
        books.add(new Book("Book 1",120,"Author 1",1996));
        books.add(new Book("Book 2",220,"Author 2",1997));
        books.add(new Book("Book 3",320,"Author 3",1998));
        books.add(new Book("Book 4",420,"Author 4",1999));
        books.add(new Book("Book 5",520,"Author 5",2000));
        books.add(new Book("Book 6",620,"Author 6",1986));
        books.add(new Book("Book 7",720,"Author 7",1987));
        books.add(new Book("Book 8",820,"Author 8",1988));
        books.add(new Book("Book 9",920,"Author 9",1989));
        books.add(new Book("Book 10",1120,"Author 10",1990));

        Map<String,String> bookMap=new HashMap<>();
        books.stream().forEach(book -> bookMap.put(book.getBookName(),book.getAuthorName()));
        for (String s:bookMap.keySet()){
            System.out.println("Book Name: "+s+" Auther Name: "+bookMap.get(s));
        }
        System.out.println("----------------------------------------------------");
        List<Book> listBook=books.stream().filter(book ->
                book.getPageName()>100).collect(Collectors.toList());
        listBook.stream().forEach(book ->
                System.out.printf("Book: %-25s Page Number: %-5d Author: %-20s Date: %-4d\n",
                        book.getBookName(),
                        book.getPageName(),
                        book.getAuthorName(),
                        book.getReleaseDate()));

        System.out.println();

        long count=books.stream().count();
        System.out.println("Number of Books: "+count);

    }
}
