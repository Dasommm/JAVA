package com.tv;

public interface TV {

	int volumeUp();

	int volumeDown();

	// TV를 상속받는 SamsongTV와 IgTV를 만들자.
	// SamsongTV는 VolumeUP/Down 시 크기가 +-2씩
	// IgTV는 VolumeUp/Down시 크기가 +- 3씩 증감한다.

	// SamsongTV와 IgTV에서 Volume 이라는 field를 만들고,
	// 위의 기능을 하도록 코드를 작성하자.
	// (getter & setter 도 생성)

}
