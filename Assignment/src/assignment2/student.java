package assignment2;

import java.util.ArrayList;

public class student {
 public int id;
 public String firstname;
 public String secondname;
 public int mark; 
 public ArrayList <Course> courses=new ArrayList<>();
 

public student(int id,String firstname, String secondname,int mark,ArrayList <Course> courses) {
	this.id=id;
	this.firstname=firstname;
	this.secondname=secondname;
	this.mark=mark;
	this.courses=courses;
  
  	

}
public int getid() {
    return id;
}
public void setid(int id) {
    this.id = id;
}
public String getfirstname() {
    return firstname;
}

public void setfirstname(String firstname) {
    this.firstname = firstname;
}
public String getsecondname() {
    return secondname;
}

public void setsecondname(String secondname) {
    this.secondname = secondname;
}
public int getmark() {
    return mark;
}

public void setmark(int mark) {
    this.mark = mark;
}

public void setcourse(String namecourse) {
	Course x=new Course(namecourse);
	courses.add(x);
	;
}

}