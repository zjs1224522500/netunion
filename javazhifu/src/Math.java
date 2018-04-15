
public class Math {

	public static void main(String[] args) {
		int[] nums=new int[10];
		for(int i=0;i<nums.length;i++){
			int x=(int)(Math.random()*10);
			nums[i]=x;
		}
		for (int num:nums){
			System.out.println(num+" ");
		}
		// TODO Auto-generated method stub

	}

}
