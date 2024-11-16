package com.pavanclasses.Strings;

public class StringBuilder1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuilder sb = new StringBuilder("abc Software Solutions");

int i = sb.length();

System.out.println(i);

StringBuilder sb1 = new StringBuilder("abc");
StringBuilder sb2 =sb1.append("def");
StringBuilder sb3 = sb2.append("ghi");


System.out.println(sb2);


StringBuilder reverse = sb3.reverse();

System.out.println(reverse);



StringBuilder sb4 = sb3.insert(8, "Praveen");

System.out.println(sb4);


StringBuilder sb5 = sb2.delete(2, 4);

System.out.println(sb5);





	}

}
