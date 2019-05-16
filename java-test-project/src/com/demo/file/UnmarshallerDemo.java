package com.demo.file;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class UnmarshallerDemo {

	public static void main(String[] args) {
		String fileName = "staff.xml";
		jaxbXmlFileToObject(fileName);
	}

	private static void jaxbXmlFileToObject(String fileName) {
		File xmlFile = new File(fileName);
		JAXBContext jaxbContext;
		
		try {
			jaxbContext = JAXBContext.newInstance(StatusResponse.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

			StatusResponse statusResponse = (StatusResponse) jaxbUnmarshaller.unmarshal(xmlFile);

			System.out.println(statusResponse.getFirstName());
			System.out.println(statusResponse.getLastName());
			System.out.println(statusResponse.getNickName());
			System.out.println(statusResponse.getSalary());
			System.out.println(statusResponse.getJoininDdate());
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}
