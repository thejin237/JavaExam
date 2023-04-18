package ex01;

public class PersonExam {

	public static void main(String[] args) {
		Person p = new Person();
		p.print();
		/*
		 * p.bun=10; p.name="aaaa"; p.age=30;
		 */
		Person p2 = new Person(1, "bbb", 30);
		p2.print();
		// p2.bun=2;
		p2.setBun(5);
		p2.print();
//		String n = p2.getName();
//		System.out.println(n);
		p2.setName("BBB");
		p2.setBun(33);
		p2.print();

		System.out.println(p2.getBun() + "\t" + p2.getName() + "\t" + p2.getAge());
	}
}
