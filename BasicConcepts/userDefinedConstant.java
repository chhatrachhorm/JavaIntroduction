/*
 * User-Defined constant
 * Static Block
 */
public class userDefinedConstant {
	public static final int X;
	public static final String SCHOOL;
	static{
		X = 1;
		SCHOOL = "KIT";
	}
	public static void main(String[] args) {
		int[][] myArr = {{1, 2, 3},{4},{5, 6, 7, 10}, {8, 6, 7}};
		System.out.println(myArr[0][2]);
		myArr[0][2] = 42;
		System.out.println(myArr[2][3]);
		System.out.println(X);
		System.out.println(SCHOOL);
	}
}
