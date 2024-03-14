package inheritance;
class Car{
	String e_no;
	byte seating_capacity;
	Car(String e_no,byte seating_capacity){
		this.e_no=e_no;
		this.seating_capacity= seating_capacity;
	}
	void displayCarinfo() {
		System.out.print(e_no+" "+seating_capacity+" ");
	}
}
class Tata extends Car{
float average;
String fuel_type;
String model;


	Tata(String e_no, byte seating_capacity,float average,String fuel_type,String model) {
		super(e_no, seating_capacity);
		this.average=average;
		this.fuel_type=fuel_type;
		this.model=model;
		
	}
	void displaytatainfo(){
		System.out.print(average+" "+fuel_type+" "+model+" ");
	}
}
class carmodel extends Tata{
String colour;
double price;
	carmodel(String e_no, byte seating_capacity, float average, String fuel_type, String model,String colour,double price) {
		super(e_no, seating_capacity, average, fuel_type, model);
		this.colour=colour;
		this.price=price;
	}
	void displaycarmodel() {
		System.out.print(colour+" "+price+" ");
	}
}


public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
carmodel c=new carmodel("e123f",(byte)4,20f,"diesel","tata suvs","black",600000);
c.displayCarinfo();
c.displaytatainfo();
c.displaycarmodel();
	}

}
