package com.spe.testclass;
import java.util.Calendar;
import com.spe.address.Address;
import com.spe.form.Form;

public class TestClass {
	public static void main(String[] args){
		Calendar cal = Calendar.getInstance();
		cal.set(10, 02, 1995);
		Address a = new Address();
		a.setAddr1("A-32, Room no 15");
		a.setAddr2("M G complex");
		a.setAddr3("Vashi, Navi Mumbai");
		a.setPincode(400703);
		Form form = new Form();
		form.setName("Shrutika Yadav");
		form.setAddress(a);
		Form form2 = new Form("Shruti",cal,a);
		System.out.println(form.toString());
		System.out.println(form2.toString());
	}
}
