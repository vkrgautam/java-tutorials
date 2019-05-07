package com.test.file;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlRootElement(name = "staff")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "statusResponse", propOrder = {
    "firstName",
    "lastName",
    "nickName",
    "salary",
    "joininDdate"
})
public class StatusResponse {
	
	protected String firstName;
	protected String lastName;
	protected String nickName;
    protected String salary;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar joininDdate;
    
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public XMLGregorianCalendar getJoininDdate() {
		return joininDdate;
	}
	public void setJoininDdate(XMLGregorianCalendar joininDdate) {
		this.joininDdate = joininDdate;
	}

}
