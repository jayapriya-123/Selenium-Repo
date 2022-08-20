package week3.day1;

public interface Plan {

	/** this method build the buildroom with 1800 sqft with attached wardrobe for storage
	 * @author Jayapriya
	 *@param numbers ->no of bedrooms that house should have
	 */
	public void buildBedRooms(int numbers);
	/**
	 * 
	 */
	public void buildbalcony();
	/*
	 * 
	 */
	public void buildparking();
	int sqft=1800;
	String name=" Vishnu Apartment";
	String[] flats= {"s1","s2","s3","f1"};
}
