//A program to illustrate procedural programming using java
public class PROCEDURAL{
	public static void main(String[] args){
	//
	int[] scores = {10,20,30};//array holding scores
	int total = getTotal(scores);//variable holding the result the total function
	
	double avg = total/(double)scores.length;//calculates the average and casts to type touble
	printTotal(avg);// displays the result
		
	}
//Fetch total function
static int getTotal(int[] scores){
	int sum = 0;
	for(int s : scores)sum += s;
	return sum;
	
	}

//Print result function
static void printTotal(double avg){
	System.out.println(avg >= 50? "PASS : " + avg : "FAIL : " + avg);
	}
}

