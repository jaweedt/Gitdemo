package second;

import first.parentclass;

public class Secondparent extends parentclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Secondparent sp = new Secondparent();
		parentclass pc = new parentclass();
		sp.getData();
		int b = sp.a;
		System.out.println("this is second");
		System.out.println("this is the third line");
		System.out.println("fourth line");
	}

}
