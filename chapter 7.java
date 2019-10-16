
class DriverExam {

  	

  
  	//declare and intiliaze variables
  	private int totalCorrect = 0;
  	private int totalIncorrect = 0;
  	private int passingScore = 15;
  	private int[] questionsMissed = new int[20];
  	private char[] studentAnswers;
  
  	char[] answers = {'B', 'D', 'A', 'A', 'C', 'A', 'B', 'A', 'C', 'D', 'B', 'C', 'D', 'A', 'D', 'C', 'C', 'B', 'D', 'A'};
  
    	//constructor with 
  	//@param student answers array
  	public DriverExam(char[] studentAnswers)
    {
      this.studentAnswers = studentAnswers;
    }
  	
  
  /** method to calculate total amount of correct answers
  @param studentAnswers
  @return total correct answers
  */
   public int totalCorrect(char[] studentAnswers)
   {
     for(int i = 0; i<answers.length; i++)
     {
       if(answers[i] == studentAnswers[i])
       {
         totalCorrect = totalCorrect + 1;
       }
     }
     return totalCorrect;
   }
  
    /** method to calculate total amount of Incorrect answers
  @param studentAnswers
  @return totalIncorrect answers
  */
  public int totalIncorrect(char[] studentAnswers)
  {
     for(int i = 0; i<answers.length; i++)
     {
       if(answers[i] != studentAnswers[i])
       {
         totalIncorrect = totalIncorrect + 1;
       }
     }
     return totalIncorrect;
  }
  
    /** method to calculate if the student passed the exam
  @param studentAnswers
  @return boolean of passed
  */
  public void passed(char[] studentAnswers)
  {
    
    
    totalCorrect = totalCorrect(studentAnswers);
    if(totalCorrect > 15 ){
     System.out.println("You passed");
    }
    System.out.println("You did not pass");
  }
  



	public int[] questionsMissed(char[] studentAnswers)
    {
      int questionsIndex = 0;
      for(int i = 0; i<studentAnswers.length; i++){
        if(studentAnswers[i] != answers[i]){
          questionsMissed[questionsIndex] = i +1;
          questionsIndex++;
        }
      }
      return questionsMissed;
    }
  
  
  
  }


import java.util.*;


class Main {
  public static void main(String[] args) {
    
    int totalCorrect = 0;
  	int totalIncorrect = 0;
  	int passingScore = 15;
  	int[] questionsMissed;
    char[] studentAnswers = new char[20];
    char[] answers = {'B', 'D', 'A', 'A', 'C', 'A', 'B', 'A', 'C', 'D', 'B', 'C', 'D', 'A', 'D', 'C', 'C', 'B', 'D', 'A'};
    
    
    Scanner scanner = new Scanner(System.in);
    
    for(int i = 1; i < studentAnswers.length; i++){
      System.out.println("What are the student answers for the driver exam");
      studentAnswers[i] = Character.toUpperCase(scanner.next().charAt(0));
    }
    
    
    DriverExam driverExam = new DriverExam(studentAnswers);
    
    System.out.println("total Correct: " + driverExam.totalCorrect(studentAnswers));
    System.out.println("total Incorrect: " + driverExam.totalIncorrect(studentAnswers));
    driverExam.passed(studentAnswers);
    System.out.println("Questions Missed: " + driverExam.questionsMissed(studentAnswers));
    
  }
}
