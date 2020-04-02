package com.tv;

public class SamsongTV implements TV {

	private int volume;
	
	@Override
	public int volumeUp() {
		// volume +-2
		volume += 2;
		System.out.println("볼륨을 높입니다.");
		return volume;
	}

	@Override
	public int volumeDown() {
		volume -= 2;
		System.out.println("볼륨을 줄입니다.");
		return volume;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
	}

}
