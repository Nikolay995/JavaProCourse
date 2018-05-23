package xml_json.xml_generate;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class XML_Generator {
    public static void main(String[] args) {
        try{
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document document = db.newDocument();

            Element rootElement = document.createElement("catalog");
            document.appendChild(rootElement);

            Element book1 = document.createElement("book1");
            rootElement.appendChild(book1);

            Element author1 = document.createElement("author");
            author1.setTextContent("Author_1");
            book1.appendChild(author1);

            Element year1 = document.createElement("year");
            year1.setTextContent("1999");
            book1.appendChild(year1);

            Element book2 = document.createElement("book2");
            rootElement.appendChild(book2);

            Element author2 = document.createElement("author");
            author2.setTextContent("Author_2");
            book2.appendChild(author2);
            //save
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer tr = tf.newTransformer();
            DOMSource src = new DOMSource(document);
            StreamResult res = new StreamResult(new File("output.xml"));

            tr.transform(src,res);

        } catch (ParserConfigurationException | TransformerException e) {
            e.printStackTrace();
        }

    }

}
