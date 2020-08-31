package com.company;

public class Main {

	public static void main(String[] args) {

		String patientName = "Stacey Manson";
		boolean hasInsurance = false;
		double temp = 102;
		float numVisits = 5.02f;
		float copay = 35.00f;
		String nextAppt = "10/25/20";
		String contactNum = "(909)202-1908";


		System.out.println("Patient Details:");
		System.out.println("Name: " + patientName);
		System.out.println("Patient has insurance: " + hasInsurance);
		System.out.println("Body temprature: " + temp);
		System.out.println("Number of visits: " + numVisits);
		System.out.println("Your copay: " + copay);
		System.out.println("Next Appointment: " + nextAppt);
		System.out.println("Contact Number: " + contactNum);
	}
}
