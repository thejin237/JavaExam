package ex01;

public class Person {
	private int bun;// 사번
	private String name;// 이름
	private int age;// 나이

	public Person() {
	}

	public Person(int bun, String name, int age) {
		this.bun = bun;
		this.name = name;
		this.age = age;
	}

	public int getBun() {
		return bun;
	}

	public void setBun(int bun) {
		this.bun = bun;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

//	public void setBun(int bun) {
//		this.bun=bun;
//	}
//	public String getName() {
//		return name;
//	}
	public void print() {
		System.out.println(bun + "\t" + name + "\t" + age);
	}
}
