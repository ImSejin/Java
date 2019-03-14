package practice.network;

public enum Gender {
	// objects
	MALE("남자"), FEMALE("여자"), GAY("게이"), LESBIAN("레즈비언");
	
	private String gender;
	
	// constructor
	private Gender(String gender) {
		this.gender = gender;
	}
	
	public String convertKorean() {
		return gender;
	}
}
