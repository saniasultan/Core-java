package oops;

public class PersonInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Person p=new Person("sania",21,"Goa");
p.display();
Person p1=new Person() ;

p1.setAge(21);
p1.setName("abc");
System.out.println(p1.getAge());
System.out.println(p1.getName());
p1.setCity("south Goa");
System.out.println(p1.getCity());



	}

}
class Person{
	public String getName() {
		
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	String name;
	int age;
	String city;
	Person(){
		System.out.println("default constructor");
	}
	Person(String nm,int age,String ct){
	this.name=nm;
	this.age=age;
	city=ct;
		
		System.out.println("parametarised constructor");
	}
	void display(){
		System.out.println(name+" "+age+" "+city);
	}
}
