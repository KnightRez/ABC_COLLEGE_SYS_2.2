import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;
public class Person
{
	public int _id;
	public String _firstName, _lastName, _address, _phoneNo, _gender;

	public Person(int ID, String firstName, String lastName, String gender, String address, String phoneNumber)
	{
		_id = ID;
		_firstName = firstName;
		_lastName = lastName;
		_gender = gender;
		_address = address;
		_phoneNo = phoneNumber;
	}

	public int getID() {
		return _id;
	}

	public String getFirstName() {
		return _firstName;
	}

	public String getLastName() {
		return _lastName;
	}
	
	public String getGender() { return _gender; }

	public String getAddress() {
		return _address;
	}

	public String getPhoneNumber() {
		return _phoneNo;
	}

	public void setID(int ID) { this._id = ID; }

	public void setFirstName(String firstName) {
		_firstName = firstName;
	}

	public void setLastName(String lastName) {
		_lastName = lastName;
	}

	public void setGender(String gender){
		_gender = gender;
	}

	public void setAddress(String address) {
		_address = address;
	}

	public void setPhoneNumber(String phoneNumber) {
		_phoneNo = phoneNumber;
	}

	public void DisplayPerson(){
		System.out.println("ID: " + _id);
		System.out.println("First Name: " + _firstName);
		System.out.println("Last Name: " + _lastName);
		System.out.println("Gender: " + _gender);
		System.out.println("Address: " + _address);
		System.out.println("Phone Number: " + _phoneNo);
	}
	/**
	 * Generate Unique ID
	 */
	//set current year as prefix
	Date d = new Date();
	int year = d.getYear() + 1900;
	private static AtomicLong idCounter = new AtomicLong();
	public static String createID() { return String.valueOf(idCounter.getAndIncrement()); }

	public void generateID()
	{
		String prefixID = String.valueOf(year);
		String suffixID = createID();
		String generatedID = prefixID + suffixID;
		this._id = Integer.parseInt(generatedID);
	}

}

