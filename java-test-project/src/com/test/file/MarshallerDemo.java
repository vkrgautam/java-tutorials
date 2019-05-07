package com.test.file;

import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class MarshallerDemo {

	public static void main(String[] args) {

		try {
			JAXBContext jc = JAXBContext.newInstance(StatusResponse.class);
			GregorianCalendar c = new GregorianCalendar();
			c.setTime(new Date());
			XMLGregorianCalendar date = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);

			StatusResponse statusResponse = new StatusResponse();
			statusResponse.setFirstName("Jane");
			statusResponse.setLastName("Doe");
			statusResponse.setNickName("Jo");
			statusResponse.setSalary("200000");
			statusResponse.setJoininDdate(date);

			Marshaller marshaller = jc.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(statusResponse, System.out);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
