public class Magic {
  /* A small program that performs a mathematical magic trick where 
  3 will always be printed to console.
  Author: Hamzah 
  Date: 10/20/2020
  */
	public static void main(String[] args) {

int myNumber = 5;
// myNumber is the original number
int stepOne = myNumber * myNumber; 

int stepTwo = stepOne + myNumber;

int stepThree = stepTwo / myNumber;

int stepFour = stepThree + 17;

int stepFive = stepFour - myNumber;

int stepSix = stepFive / 6;

System.out.println(stepSix);

	}
}
