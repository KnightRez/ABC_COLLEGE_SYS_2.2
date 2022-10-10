
public class Person
{
	public int ID;
	public String firstName, lastName, gender, address;
	public long phoneNumber;

	public Person(int ID, String firstName, String lastName, String gender, String address, long phoneNumber)
	{
		this.ID = ID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	public int getID() {
		return ID;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getGender(){
		return gender;
	}

	public String getAddress() {
		return address;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setGender(String gender){
		this.gender = gender;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}



	public void DisplayPerson(){
		System.out.println("ID: " + ID);
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);
		System.out.println("Gender: " + gender);
		System.out.println("Address: " + address);
		System.out.println("Phone Number: " + phoneNumber);
	}
	public void GenerateID(){

	}
}

