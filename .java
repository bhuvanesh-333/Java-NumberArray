public class day12 {

	public static void main(String[] args) {
	Scanner a=new Scanner(System.in);
	System.out.println("enter the number array");
	int  b =a.nextInt();
	int[] arr=new int [b];
	for (int i=0;i<b;i++) {
		arr[i]=i;
	}
	for(int j=0;j<arr.length;j++) {
		System.out.println(arr[j]);
	}
	

	
	}}
