package test;

public class Testerstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a7 = "$ 8344,4.00";
		String a_7= a7.replaceAll("[^0-9 | ^\\.]", "").replaceAll(" ", "");
		//String a_7 = a7.replaceAll("^[1-9]\\d*(,\\d+)?" , "");//
		System.out.println(Double.valueOf(a_7));
	}

}
