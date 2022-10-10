
public class Person
{
	public int _id, _gender;
	public String _firstName, _lastName, _address;
	public long _phoneNo;

	public Person(int ID, String firstName, String lastName, int gender, String address, long phoneNumber)
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

	public int getGender(){
		return _gender;
	}

	public String getAddress() {
		return _address;
	}

	public long getPhoneNumber() {
		return _phoneNo;
	}

	public void setID(int ID) {
		this._id = ID;
	}

	public void setFirstName(String firstName) {
		_firstName = firstName;
	}

	public void setLastName(String lastName) {
		_lastName = lastName;
	}

	public void setGender(int gender){
		_gender = gender;
	}

	public void setAddress(String address) {
		_address = address;
	}

	public void setPhoneNumber(long phoneNumber) {
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
	public void GenerateID(){

	}
}

