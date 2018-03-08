package strings.demo;

public class Person {
	private String name;
	private int age;

	public Person(String name, int age) {

		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {
		Person p = new Person("Sujeet", 30);
		String greeting = "Hello";
		p.addOneAndPrint(greeting);

	}

	public void addOneAndPrint(String param) {
		int addValue = 1;
		this.age = this.age + addValue;
		System.out.println(param +   "!" +  this);
	}

	public String toString() {
		return name  + "you are now" +  age;

	}

}
