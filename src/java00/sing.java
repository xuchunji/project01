package java00;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class sing {
	public static void main(String[] args) {
		HashMap<String, String> singMap = new HashMap<String, String>();
		singMap.put("마끼아또","카라멜");
		singMap.put("라떼","바닐라");
		singMap.put("무적","천하");
		singMap.put("빛갈","우유");

	Iterator<String> iter = singMap.keySet().iterator();
	Scanner scan = new Scanner(System.in);
	while(iter.hasNext()) {
		String key = iter.next();
		String article = singMap.get(key);
		System.out.println("땡땡땡땡:"+ article);
		System.out.println("무엇?");
		String answer = scan.nextLine();
		if(answer.equals(key)) {
			System.out.println("정답");
		}else {
			System.out.println("오답");
		}
	}
		scan.close();

	}

}
