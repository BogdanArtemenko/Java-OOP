package com;

public class Voenkomat {
	private String voenkomatNumber;
	private String city;

	public Voenkomat(String voenkomatNumber, String city) {
		super();
		this.voenkomatNumber = voenkomatNumber;
		this.city = city;
	}

	public Voenkomat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getVoenkomatNumber() {
		return voenkomatNumber;
	}

	public void setVoenkomatNumber(String voenkomatNumber) {
		this.voenkomatNumber = voenkomatNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Voenkomat [voenkomatNumber=" + voenkomatNumber + ", City=" + city + "]";
	}

	public void checkGroup(Group group) {

		System.out.println("New soldiers from group  " + group.getNumber());
		if (!group.getSoldiers().isEmpty()) {
			System.out.println(group.getSoldiers());
		} else {
			System.out.println("NO valid guys :(");
		}
	}

}
