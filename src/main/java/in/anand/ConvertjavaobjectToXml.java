package in.anand;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import com.sun.xml.internal.ws.util.Pool.Marshaller;

public class ConvertjavaobjectToXml {
	
	public static void main(String[] args) throws JAXBException
	{
	Book book = new Book();
	book.setBookId(101);
	book.setBookName("spring");
	book.setBookprice(7800.89);
	
	JAXBContext context = JAXBContext.newInstance(Book.class);

	javax.xml.bind.Marshaller marshaller = context.createMarshaller();

	marshaller.marshal(book, System.out);
	
	}

}
