package xml_json.jaxb.test_jaxb;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.File;

public class JaxbWriter {
    public static void main(String[] args) throws Exception {
        Customer customer = new Customer("Alex",928,25);


        File file = new File("marshalled.xml");
        JAXBContext context = JAXBContext.newInstance(Customer.class);
        Marshaller marshaller = context.createMarshaller();

        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);

        marshaller.marshal(customer,file);
        marshaller.marshal(customer,System.out);

        }
}
