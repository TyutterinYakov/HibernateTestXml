package entity;

public class Address {

	private Long adId;
	private String country;
	private String city;
	private String street;
	private String postCode;
	
	public Address() {
		
	}



	public Long getAdId() {
		return adId;
	}



	public void setAdId(Long adId) {
		this.adId = adId;
	}



	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	@Override
	public String toString() {
		
		return adId+" "+country+" "+city+" "+street+" "+postCode;
	}
	
	
	
	
}
