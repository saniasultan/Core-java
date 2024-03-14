package oops;

import java.util.Scanner;

class CityInfo{
	String city_name;
private	int city_id;
	static int count;
	String country_name;
CityInfo(int count,String cname,int  city_id,String country_name){
	count++;
	this.country_name=country_name;
	this.city_name=cname;
	this.city_id=count;
}
void display() {
	System.out.println(city_id+"\t"+city_name+"\t\t"+country_name);
}


}
public class Arrayofobjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter how many cities and countries you want to enter");
byte n=s.nextByte();
CityInfo[]c=new CityInfo[n];
for(byte i=0;i<n;i++) {
	System.out.println("enter"+(i+1)+"city name and country name");
	c[i]=new CityInfo(i, s.next(),i, s.next());
	System.out.println("city_id\tcity_name\tcountrynamne\t");
}

for(byte i=0;i<n;i++) {
	c[i].display();
}
	}

}
