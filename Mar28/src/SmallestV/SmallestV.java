package SmallestV;

public class SmallestV {

	public static void main(String[]args){

		int[]num={7,18,9,2,81,16};

		if(num[0]<num[1]&&num[0]<num[2]&&num[0]<num[3]&&num[0]<num[4]&&num[0]<num[5]){

			System.out.println(num[0]);
		}

		if(num[1]<num[0]&&num[1]<num[2]&&num[1]<num[3]&&num[1]<num[4]&&num[1]<num[5]){

			System.out.println(num[1]);
		}

		if(num[2]<num[1]&&num[2]<num[0]&&num[2]<num[3]&&num[2]<num[4]&&num[2]<num[5]){

			System.out.println(num[2]);
		}

		if(num[3]<num[1]&&num[3]<num[2]&&num[3]<num[0]&&num[3]<num[4]&&num[3]<num[5]){

			System.out.println(num[3]);
		}

		if(num[4]<num[1]&&num[4]<num[2]&&num[4]<num[3]&&num[4]<num[0]&&num[4]<num[5]){

			System.out.println(num[4]);
		}

		if(num[5]<num[1]&&num[5]<num[2]&&num[5]<num[3]&&num[5]<num[4]&&num[5]<num[0]){

			System.out.println(num[5]);
		}
	}
}
