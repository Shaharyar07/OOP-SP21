
public class Address {
	private int houseNo, streatNo, cityCode;
	private String city;

	public String getCity() {
		return city;
	}

	public int getHouseNo() {
		return houseNo;
	}

	public int getStreatNo() {
		return streatNo;
	}

	public int getCityCode() {
		return cityCode;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}

	public void setStreatNo(int streatNo) {
		this.streatNo = streatNo;
	}

	public void setCityCode(int cityCode) {
		this.cityCode = cityCode;
	}

	void Display() {
		System.out.println("City: " + getCity());
		System.out.println("House No: " + getHouseNo());
		System.out.println("Streat No: " + getStreatNo());
		System.out.println("City Code: " + getCityCode());

	}

}
