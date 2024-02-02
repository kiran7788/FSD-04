package FSD1.basics;

public class loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {8,5,6,9,22,48};
		int total=0;
		Arith arith = new Arith();
		for (int i = 0; i<arr.length; i++) {
			System.out.println(i+" : "+arr[i]);
			total = arthi.add(total, arr[i]);
		}
		System.out.println("Total :" + total);
			
	}

}