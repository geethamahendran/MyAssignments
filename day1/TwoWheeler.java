
/*Assignment1
Create a class for TwoWheeler and declare below variables with appropriate values
int noOfWheels
short noOfMirrors
long chassisNumber
boolean isPunctured
String bikeName
double runningKM
create object for TwoWheeler and call all the variables inside main method and print the values.
*/

package week1.day1;

public class TwoWheeler {
	int noOfWheels=4;
	short noOfMirrors=2;
	long chassisNumber=12345;
	boolean isPunctured=false;
	String bikeName="JAWA";
	double runningKM=50000.0;

	public static void main(String[] args) {

		TwoWheeler twowheelerobj=new TwoWheeler();
		
		System.out.println("All Variables values:"+"\n"
				+"No of Wheels:"+twowheelerobj.noOfWheels+"\n"
				+"No of Mirrors:"+twowheelerobj.noOfMirrors+"\n"
				+"ChassisNumber:"+twowheelerobj.chassisNumber+"\n"
				+"Is Punctured:"+twowheelerobj.isPunctured+"\n"
				+"Bike Name:"+twowheelerobj.bikeName+"\n"
				+"Running KM:"+twowheelerobj.runningKM);


	}

}
