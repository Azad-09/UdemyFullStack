package org.easy;

import java.util.Map;
import java.util.TreeMap;

class Code implements Comparable<Code>{
	private String sectionNo;
	private String lectureNo;
	
	public Code(String sectionNo, String lectureNo) {
		this.lectureNo = lectureNo;
		this.sectionNo = sectionNo;
	}
	
	public String getSectionNo() {
		return sectionNo;
	}
	
	public String getLectureNo() {
		return lectureNo;
	}
	
	@Override
	public String toString() {
		return "Section Number: " + getSectionNo() + " Lecture Number: " + getLectureNo();
	}

	@Override
	public int compareTo(Code obj) {
		String code1 = sectionNo.concat(lectureNo);
		String code2 = obj.getSectionNo() + obj.getLectureNo();
		
		return code1.compareTo(code2);
	}

	
}

public class App {

	public static void main(String[] args) {
//		Class Code in place of Key
		Map<Code, String> lectures = new TreeMap<Code, String>();
		lectures.put(new Code("S01", "L02"), "Generics");
		lectures.put(new Code("S01", "L07"), "File under Java");
		lectures.put(new Code("S03", "L04"), "Netwok Programming");
		lectures.put(new Code("S02", "L02"), "OOPS");
		lectures.put(new Code("S01", "L05"), "Method");
		lectures.put(new Code("S01", "L02"), "Expression");

		/*
		 * for(Map.Entry<Code,String> entry : lectures.entrySet()) {
		 * System.out.println("Details: " + entry.getKey() + " Topics: " +
		 * entry.getValue()); }
		 */
		
		Code code = null;
		for(Map.Entry<Code, String> entry : lectures.entrySet()) {
			
			if(entry.getValue().equals("OOPS")) {
				code = entry.getKey();
			}
		}
		
		System.out.println("The key for value \"OOPS\": " + code);
		
//		In order to know the value we can use the get() and we can get the value putting the key
		System.out.println(lectures.get(new Code("S01", "L02")));
		
		
		
		
		
	}

}
