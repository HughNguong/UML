package Vehicle;

import java.util.Scanner;
import License.truckLicense;
import src.main;

/**
 * @author Tuan Nguyen
 * @version 1.0
 * @created 26-Nov-2018 5:27:45 PM
 */
public class truck extends vehicle {

	public truckLicense m_truckLicense;
	
	public truck(){
		setVehicleID(main.truckID);
		main.truckID++;
		setLicense(2);
		setAvailibility(true);
		
		System.out.println("Truck info:\n- "+getVehicleID()+"\n- "+getLicense()+"\n- "+isAvailibility()+"\n");
	}

	public void finalize() throws Throwable {
		super.finalize();
	}
}//end truck