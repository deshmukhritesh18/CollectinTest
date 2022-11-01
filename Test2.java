package com.bnt.demo.stu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test2 {
	public static void main(String[] args) {
		// System.out.println(getStudentData());
		List<Student> studentList = getStudentData();
		Map<String, List<Student>> mapStudent = getMapOfStudent(studentList);
	}

	private static List<Student> getStudentData() {
		List<Student> studentList = new ArrayList<Student>();

		Subject math = new Subject("math", 75, 100);
		Subject marathi = new Subject("marathi", 70, 100);
		Subject hindi = new Subject("hindi", 69, 100);
		
		Subject math1 = new Subject("math", 45, 100);
		Subject marathi1 = new Subject("marathi", 50, 100);
		Subject hindi1 = new Subject("hindi", 51, 100);
		
		Subject math2 = new Subject("math", 55, 100);
		Subject marathi2 = new Subject("marathi", 69, 100);
		Subject hindi2 = new Subject("hindi", 71, 100);
		
		Subject math3 = new Subject("math", 50, 100);
		Subject marathi3 = new Subject("marathi", 45, 100);
		Subject hindi3 = new Subject("hindi", 44, 100);
		
		Subject math4 = new Subject("math", 88, 100);
		Subject marathi4 = new Subject("marathi", 79, 100);
		Subject hindi4 = new Subject("hindi", 81, 100);
		
		Student studentRitesh = new Student(1, "Ritesh", math1, marathi1, hindi1);
		Student studentPrateek = new Student(2, "Prateek", math, marathi, hindi);
		Student studentShivanjali = new Student(3, "Shivanjali", math2, marathi2, hindi2);
		Student studentRahul = new Student(4, "Rahul", math3, marathi3, hindi3);
		Student studentRam = new Student(5, "Ram", math4, marathi4, hindi4);
		
		studentList.add(studentPrateek);
		studentList.add(studentRitesh);
		studentList.add(studentShivanjali);
		studentList.add(studentRahul);
		studentList.add(studentRam);
		
		return studentList;
	}
	static int greaterThan50Student = 0;
	static int lesserthan50Student = 0;
	static int totalStudent=0;

	private static Map<String, List<Student>> getMapOfStudent(List<Student> studentList) {
		Map<String, List<Student>> studentMap = new HashMap<String, List<Student>>();
		Map<String, List<Student>> result = new HashMap<String, List<Student>>();
		List<Student> studentLesser50 = new ArrayList<Student>();
		List<Student> studentGreter50 = new ArrayList<Student>();

		for (Student student : studentList) {
			Subject hindi = student.getHindi();
			Subject marathi = student.getMarathi();
			Subject math = student.getMath();
		
			
			int outOfTotalMarks = hindi.getTotalMark() + marathi.getTotalMark() + math.getTotalMark();
			float additionOfMarks = hindi.getMark() + marathi.getMark() + math.getMark();
			float percentage = (additionOfMarks / outOfTotalMarks) * 100;
			totalStudent++;
	

			// write percentage logic here and split into studentlistLessThen50percent &
						// studentlistGreaterThen50percent
			
			if (percentage < 50f) {
				studentLesser50.add(student);
				lesserthan50Student++;
				
				
			} else {
				studentGreter50.add(student);
				greaterThan50Student++;
			}
			result.put("Less Than 50 Percentage", studentLesser50);
			result.put("Greater Than 50 Percentage", studentGreter50);
			
			System.out.println("student name : " + student.getName());
			System.out.print("Hindi mark : " + hindi.getMark());
			System.out.print("marathi mark : " + marathi.getMark());
			System.out.print("math mark : " + math.getMark());
			System.out.println();
			System.out.println("You got " + additionOfMarks + " out of " + outOfTotalMarks);
			System.out.printf("%.2f", percentage);
			System.out.print("%");
			System.out.println();
			System.out.println("---------------------------------------------");
		}
		System.out.println(result);
		System.out.println(greaterThan50Student + " out of "+totalStudent+" students get greater than 50%");
		System.out.println(lesserthan50Student + " out of "+totalStudent+" students get lesser than 50%");
		System.out.println("Total Number of Students :" +totalStudent);
		System.out.println("Total Number of Subjects :");
		System.out.println("Total Mark Obtained by Students :");
		System.out.println("Total Subject Mark : 100 × 3 (No. Of Subject) × 10 (Number of Students)");
		System.out.println("Total Percentage Obtained : (Step 3)÷(Step 4) × 100");

		return studentMap;
	}

}
