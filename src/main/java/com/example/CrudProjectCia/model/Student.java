package com.example.CrudProjectCia.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="StudentDetails")
public class Student {


		public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getStudentname() {
		return studentname;
	}




	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}




	public String getDepartmentname() {
		return departmentname;
	}




	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}




	public String getSection() {
		return section;
	}




	public void setSection(String section) {
		this.section = section;
	}




	public long getMobile() {
		return mobile;
	}




	public void setMobile(long mobile) {
		this.mobile = mobile;
	}




	public String getMailid() {
		return mailid;
	}




	public void setMailid(String mailid) {
		this.mailid = mailid;
	}




	public String getAddress() {
		return address;
	}




	public void setAddress(String address) {
		this.address = address;
	}




		@Id
		@Column(name="id")
	    private int id;
		public Student(int id, String studentname, String departmentname, String section, long mobile, String mailid,
				String address) {
			super();
			this.id = id;
			this.studentname = studentname;
			this.departmentname = departmentname;
			this.section = section;
			this.mobile = mobile;
			this.mailid = mailid;
			this.address = address;
		}




		@Override
		public String toString() {
			return "Student [id=" + id + ", studentname=" + studentname + ", departmentname=" + departmentname
					+ ", section=" + section + ", mobile=" + mobile + ", mailid=" + mailid + ", address=" + address
					+ "]";
		}




		@Column(name="studentname")
		private String studentname;
		@Column(name="departmentname")
		private String departmentname;

		@Column(name="section")
		private String section;
		@Column(name="mobile")
		private long mobile;
		@Column(name="mailid")
		private String mailid;
		@Column(name="address")
		private String address;
		
		

		
		public Student()
		{
			
		}
}
