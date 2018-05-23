package xml_json.jaxb.books;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@XmlRootElement(name="catalog")
public class Catalog {

    @XmlElement(name="book") //на основе каждого эелемента book создаётся xml-файл
    private List<Book> books = new ArrayList<Book>();

    public void add(Book book) {
        books.add(book);
    }

    @Override
    public String toString() {
        return Arrays.deepToString(books.toArray());
    }
}
