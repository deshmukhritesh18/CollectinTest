package com.bnt.demo.stu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MeritListTest {
	public static void main(String[] args) {
		List<Student> studentList = getStudentData();
		Map<College, List<Student>> admission = getMapOfAdmission(studentList);
	}
	
	public static List<Student> getStudentData() {
		List<Student> studentList = new ArrayList<Student>();

		Subject math = new Subject("math", 73, 100);
		Subject marathi = new Subject("marathi", 69, 100);
		Subject hindi = new Subject("hindi", 66, 100);
		Subject math1 = new Subject("math", 88, 100);
		Subject marathi1 = new Subject("marathi", 91, 100);
		Subject hindi1 = new Subject("hindi", 89, 100);
		Subject math2 = new Subject("math", 95, 100);
		Subject marathi2 = new Subject("marathi",98, 100);
		Subject hindi2 = new Subject("hindi", 97, 100);
		Subject math3 = new Subject("math", 62, 100);
		Subject marathi3 = new Subject("marathi", 59, 100);
		Subject hindi3 = new Subject("hindi", 55, 100);
		Subject math4 = new Subject("math", 33, 100);
		Subject marathi4 = new Subject("marathi", 34, 100);
		Subject hindi4 = new Subject("hindi", 31, 100);
		Subject math5 = new Subject("math", 45, 100);
		Subject marathi5 = new Subject("marathi", 53, 100);
		Subject hindi5 = new Subject("hindi", 51, 100);
		Subject math6 = new Subject("math", 78, 100);
		Subject marathi6 = new Subject("marathi", 81, 100);
		Subject hindi6 = new Subject("hindi", 75, 100);
		
		
		Student studentRitesh = new Student(1, "Ritesh", math1, marathi1, hindi1);
		Student studentPrateek = new Student(2, "Prateek", math, marathi, hindi);
		Student studentShivanjali = new Student(3, "Shivanjali", math2, marathi2, hindi2);
		Student studentRam = new Student(4, "Ram", math3, marathi3, hindi3);
		Student studentArpit = new Student(5, "Arpit", math4, marathi4, hindi4);
		Student studentSumit = new Student(6, "Sumit", math5, marathi5, hindi5);
		Student studentPooja = new Student(7, "Pooja", math6, marathi6, hindi6);

		studentList.add(studentPrateek);
		studentList.add(studentRitesh);
		studentList.add(studentShivanjali);
		studentList.add(studentRam);
		studentList.add(studentArpit);
		studentList.add(studentSumit);
		studentList.add(studentPooja);
		return studentList;
	} 
	
	/*
	 * protected static final List<College> getCollegeData() {
	 * 
	 * List<College> collegeList = new ArrayList<College>(); Map<String,
	 * List<Student>> admissionInfo = new HashMap<String, List<Student>>();
	 * 
	 * College coep=new College("COEP","Pune",95); College dyPatil=new
	 * College("DyPatil","Pune",85); College jspm=new College("JSPM","Pune",75);
	 * 
	 * collegeList.add(coep); collegeList.add(dyPatil); collegeList.add(jspm);
	 * //System.out.println("****************"+collegeList); return collegeList; }
	 */
	
	static int greaterThan50Student = 0;
	static int lesserthan50Student = 0;
	static int totalStudent=0;
	static double allSubjectTotalMarks=0;
	static int noOfSubject=0;

	private static Map<College, List<Student>> getMapOfAdmission(List<Student> studentList) {
		Map<College, List<Student>> admission = new HashMap<College, List<Student>>();
		List<Student> studentsMeritListA = new ArrayList<Student>();
		List<Student> studentsMeritListB = new ArrayList<Student>();
		List<Student> studentsMeritListC = new ArrayList<Student>();
		List<Student> studentsMeritListD = new ArrayList<Student>();
		List<Student> studentsMeritListE = new ArrayList<Student>();
		List<Student> studentsMeritListF = new ArrayList<Student>();
		
		College coep=new College("COEP","Pune",95);
		College dyPatil=new College("DyPatil","Pune",85);
		College jspm=new College("JSPM","Pune",75);
		College raisoni=new College("Raisoni","Pune",65);
		College otherCollege=new College("OtherCollege","Pune",35);
		College notEligible=new College("NotEligibelForAdmission",null,0);

		for (Student student : studentList) {
			Subject hindi = student.getHindi();
			Subject marathi = student.getMarathi();
			Subject math = student.getMath();
		
			
			int outOfTotalMarks = hindi.getTotalMark() + marathi.getTotalMark() + math.getTotalMark();
			noOfSubject=outOfTotalMarks/100;
			double additionOfMarks = hindi.getMark() + marathi.getMark() + math.getMark();
			double percentage = (additionOfMarks / outOfTotalMarks) * 100;
			allSubjectTotalMarks=allSubjectTotalMarks+additionOfMarks;
			totalStudent++;
			
			if (percentage>=95.00 && percentage<=100.00) {
				studentsMeritListA.add(student);
				System.out.println(student.getName()+ ": "+percentage);
				}
			if (percentage>=85.00 && percentage<95.00) {
				studentsMeritListB.add(student);
				System.out.println(student.getName()+ ": "+percentage);
				}
			if (percentage>=75.00 && percentage<85.00) {
				studentsMeritListC.add(student);
				System.out.println(student.getName()+ ": "+percentage);
				}
			if (percentage>=65.00 && percentage<75.00) {
				studentsMeritListD.add(student);
				System.out.println(student.getName()+ ": "+percentage);
				}
			if (percentage>=35.00 && percentage<65.00) {
				studentsMeritListE.add(student);
				System.out.println(student.getName()+ ": "+percentage);
				}
			if (percentage>=0.00 && percentage<35.00) {
				studentsMeritListF.add(student);
				System.out.println(student.getName()+ ": "+percentage);
				}
			admission.put(coep, studentsMeritListA);
			admission.put(dyPatil, studentsMeritListB);
			admission.put(jspm, studentsMeritListC);
			admission.put(raisoni, studentsMeritListD);
			admission.put(otherCollege, studentsMeritListE);
			admission.put(notEligible, studentsMeritListF);
		
		}
		System.out.println(admission);
		
		return admission;
	}

}
