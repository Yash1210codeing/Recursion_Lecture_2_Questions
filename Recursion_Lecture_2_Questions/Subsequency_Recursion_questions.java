package Recursion_Lecture_2_Questions;
public class Subsequency_Recursion_questions {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String ques="abc";
        PrintSubSeqnue(ques, "");
	}
	public static void PrintSubSeqnue (String ques,String ans) {
		if(ques.length()==0) {
			System.out.print(ans+" ");
			return;
		}
		char ch=ques.charAt(0);
		PrintSubSeqnue(ques.substring(1),ans);
		PrintSubSeqnue(ques.substring(1), ans+ch);
	}
}
