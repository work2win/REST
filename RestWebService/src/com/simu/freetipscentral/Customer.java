package com.simu.freetipscentral;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name="customer")

public class Customer {
	
		public String custID;
		public String name;
		public String email;
		
		@XmlElement(required=true)
		public String getCustID() {
			return custID;
		}
		public void setCustID(String custID) {
			this.custID = custID;
		}
		@XmlElement(required=true)
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		@XmlElement(required=true)
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		
}
