
public class Exam_02 {
	public static void main(String[] args) {
		// 1. 2 ~ n 까지 소수를 출력하고, 소수 갯수 출력
		decimal(50);

		// 2. 2진수 변환
		binary(37);

		// 2_1. 2진수 변환 반환
		String bin = binaryStr(37);
		System.out.println(bin);

		// 2_2. 2진수 변환 반환
		int[] binArr = binaryArr(37);
		for (int i = binArr.length - 1; i >= 0; i--) {
			System.out.print(binArr[i]);
		}
		System.out.println();

		// 3. 1 ~ n까지 정수를 출력(한 줄에 5개), 합을 구하여 반환
		int sum = integerTotal(100);
		System.out.println("1 ~ 100 : " + sum);

		// 4. 1 ~ n까지 정수의 합을 구하여 반환(재귀함수이용)
		int recurSum = intRecursion(10);
		System.out.println("1 ~ 10 합: " + recurSum);

		// 5. n!을 구하여 반환(재귀함수이용)
		int factSum = factorial(5);
		System.out.println("5! : " + factSum);
	}

	static void decimal(int n) {
		int i;
		int j;
		int cnt = 0;
		for (i = 2; i <= n; i++) {
			for (j = 2; j < i; j++) {
				if (i % j == 0) {
					break;
				}
			}
			if (i == j) {
				System.out.print(i + "\t");
				cnt++;
			}
		}
		System.out.println();
		System.out.println("소수의 갯수:" + cnt);
	}

	static void binary(int a) {
		int n = a;
		int cnt = 0;
		while (n != 0) {
			n = n / 2;
			cnt++;
		}
		int na[] = new int[cnt];
		int mok = a;
		for (int i = 0; i < na.length; i++) {
			na[i] = mok % 2;
			mok = mok / 2;
		}
		for (int i = na.length - 1; i >= 0; i--) {
			System.out.print(na[i]);
		}
		System.out.println();
	}

	static String binaryStr(int a) {
		String na = "";
		int mok = a;
		while (mok > 0) {
			na = mok % 2 + na;
			mok = mok / 2;
		}
		return na;
	}

	static int[] binaryArr(int a) {
		int n = a;
		int cnt = 0;
		while (n != 0) {
			n = n / 2;
			cnt++;
		}
		int binArr[] = new int[cnt];
		int mok = a;
		for (int i = 0; i < binArr.length; i++) {
			binArr[i] = mok % 2;
			mok = mok / 2;
		}
		return binArr;
	}

	static int integerTotal(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			System.out.print(i + "\t");
			if (i % 5 == 0) {
				System.out.println();
			}
			sum += i;
		}
		return sum;
	}

	static int intRecursion(int n) {
		if (n == 1) {
			return 1;
		}
		return n + intRecursion(n - 1);
	}

	static int factorial(int n) {
		if (n == 1) {
			return 1;
		}
		return n * factorial(n - 1);
	}

}
