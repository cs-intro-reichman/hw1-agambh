// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int ascend=Integer.parseInt(args[0]);
		int a=(int)(Math.random()*ascend);
		int b=(int)(Math.random()*ascend);
		int c=(int)(Math.random()*ascend);
		int max=Math.max(a,Math.max(b,c));
		int min=Math.min(a,Math.min(b,c));
		int mid=-1;

        //הלולאות בודקות מה האיבר האמצעי ולוקחות בחשבון מצב של שני איברים זהים
		while (((a!=max && a!=min) || a==b || a==c ) && mid==-1) {
			mid=a;
		}
		while (((b!=max && b!=min) || b==c ) && mid==-1) {
			mid=b;
		}
		while ((c!=max && c!=min) && mid==-1) {
			mid=c;
		}
		System.out.println(a + " " + b + " " + c);
		System.out.println(min+ " " + mid + " " + max);
	}
}
