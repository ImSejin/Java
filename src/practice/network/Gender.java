package practice.network;

public enum Gender {
	// objects
	MALE("����"), FEMALE("����"), GAY("����"), LESBIAN("������");
	
	private String gender;
	
	// constructor
	private Gender(String gender) {
		this.gender = gender;
	}
	
	public String convertKorean() {
		return gender;
	}
}
