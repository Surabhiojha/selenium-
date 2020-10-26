package handlingPoopus;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("surabhi");
		al.add("null");
		al.add("mukta");
		al.add("kavita");
		al.add("surabhi");
		System.out.println(al);
		
		ArrayList<String>al1=new ArrayList<>(al);
		//al1.addAll(al);
		al1.add("aakash");
		al1.add("vivek");
		System.out.println(al1);

	}

}
