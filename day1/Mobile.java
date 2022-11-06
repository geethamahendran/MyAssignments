
/*Assignment2
Create a class for Mobile and declare below variables with appropriate values
String mobileBrandName
char mobileLogo
short noOfMobilePiece
int modelNumber
long mobileImeiNumber
float mobilePrice
boolean isDamaged
create object for Mobile and call all the variables inside main method and print the values.*/

package week1.day1;

public class Mobile {

	String mobileBrandName="LG";
	char mobileLogo='G';
	short noOfMobilePiece=100;
	int modelNumber=1683;
	long mobileImeiNumber=5446556;
	float mobilePrice=250000.0f;
	boolean isDamaged=false;

	public static void main(String[] args) {

		Mobile mobj=new Mobile();

		System.out.println("All Variables values:"+"\n"
				+"mobileBrandName:"+mobj.mobileBrandName+"\n"
				+"mobileLogo:"+mobj.mobileLogo+"\n"
				+"noOfMobilePiece:"+mobj.noOfMobilePiece+"\n"
				+"modelNumbe:"+mobj.modelNumber+"\n"
				+"mobileImeiNumber:"+mobj.mobileImeiNumber+"\n"
				+"mobilePrice:"+mobj.mobilePrice+"\n"
				+"isDamaged:"+mobj.isDamaged);





	}

}
