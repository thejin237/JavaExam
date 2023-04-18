
public class Exam_02_sol_0802 {

	static void decimal(int num) {
		int cnt = 0;
		for (int i = 2; i <= num; i++) {
			for (int j = 2; j <= i; j++) {
				if (i % j == 0) {
					if (i == j) {
						System.out.print(i + "\t");
						cnt++;
						if (cnt % 10 == 0) {
							System.out.println();
						}
						break;
					} else {
						break;
					}
				}
			}
		}
		System.out.println();
		System.out.println("소수의 갯수:" + cnt);
	}

	public static void binary(int dec) {
		String bin = "";
		int temp = dec;
		while (temp != 0) {
			int na = temp % 2;
			bin = na + bin;
			temp /= 2;
		}
		System.out.println("10진수 " + dec + "는 2진수" + bin);
	}

	public static String binaryStr(int dec) {
		String bin = "";
		int temp = dec; // 10진수 보관용
		int cnt = 0;
		while (temp != 0) {
			int na = temp % 2;
			bin = na + bin;
			temp /= 2;
		}
		return bin;
	}

	public static int[] binaryArr(int dec) {
		int[] bin = new int[10];
		int temp = dec;// 10진수 보관용
		int cnt = 0;
		while (temp != 0) {
			int na = temp % 2;
			bin[cnt] = na;
			temp /= 2;
			cnt++;
		}
		return bin;
	}

	public static int integerTotal(int num) {
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		return sum;
	}

	public static int intRecursion(int num) {
		if (num == 1) {
			return 1;
		}
		return num + intRecursion(num - 1);// 5+4+3+2+1
	}

	public static int factorial(int num) {
		if (num == 1) {
			return 1;
		}
		return num * factorial(num - 1);// 5*4*3*2*1
	}

	public static void main(String[] args) {

		decimal(50);

		binary(37);

		String bin = binaryStr(37);
		System.out.println("10진수 37는 2진수" + bin);

		int[] binArr = binaryArr(37);
		System.out.print("10진수 37는 2진수");
		for (int i = binArr.length - 1; i >= 0; i--) {
			System.out.print(binArr[i] + " ");
		}
		System.out.println();

		int sum = integerTotal(100);
		System.out.println("1 ~ 100 합 : " + sum);

		int facSum = factorial(5);
		System.out.println("5! : " + facSum);
	}

}
