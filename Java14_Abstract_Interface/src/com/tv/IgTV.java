package com.tv;

public class IgTV implements TV {

	public int volume;
	
	@Override
	public int volumeUp() {
		// volume +-3
		volume += 3;
		System.out.println("볼륨을 높입니다.");
		return volume;
	}

	@Override
	public int volumeDown() {
		volume -= 3;
		System.out.println("볼륨을 내립니다.");
		return volume;
	}

	public int getVolume() {
		return volume;
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
	}
}
