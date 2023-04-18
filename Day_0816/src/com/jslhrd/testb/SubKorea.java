package com.jslhrd.testb;

import com.jslhrd.testa.Korea;

public class SubKorea extends Korea {
	int val = 1000;

	void test() {
		System.out.println("val = " + val);// protected
		System.out.println("val = " + super.val);
	}

}
