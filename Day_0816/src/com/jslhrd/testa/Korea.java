package com.jslhrd.testa;

//접근제어(private, default, protected, public)
/* - private: 상속 안됨
 * - default: 같은 패키지 내에서 호출 가능
 * - protected: 같은 패키지 내 또는 다른 패키지의 상속된 클래스에서만 호출 가능
 * - public: 접근제한없이 호출 가능
*/
public class Korea {
	int score = 100;
	protected int val = 200;
}
