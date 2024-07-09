package Recursion_Lecture_2_Questions;
public class First_Occursions_Recursion_Array_Questions {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int []arr= {1,2,3,4,5};
       // item=3;
        System.out.println(firstindex(arr,0,3));
	}
	public static int firstindex(int[]arr,int i,int item) {
		if(arr[i]==item) {
			return i;
		}
		return firstindex(arr,i+1,item);
	}
}
