package lambda.exp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("Sujeet", 23);
		map.put("Ravi", 76);
		map.put("Suman", 79);
		map.put("Anoj", 24);
		System.out.println("Without Lambda exp");
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("Name:" + entry.getKey() + "-> " + "Value:" + entry.getValue());
		}
		System.out.println("Lamda exp");
		map.forEach((k, v) -> System.out.println("name:" + k + " ->"+"value:" + v));

	}

}
