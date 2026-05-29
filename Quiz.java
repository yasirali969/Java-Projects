import java.util.Scanner;
public class Question{
	private String Questions;
	private String [] Option;
	private String CorrectAnswer;

			Question(String Questions,String []option,String CorrectAnswer){
				this.Questions=Questions;
				this.Option=option;
				this.CorrectAnswer=CorrectAnswer;
			}

		

		String  getQuestion(){
			return Questions;
		}

		String[] getOptions(){
			return Option;
		}
		
		String getCorrectAnswer(){
			return CorrectAnswer;
		}

}


class Player{
	private String PlayerName;
	private int score;

			Player(String PlayerName){
				this.PlayerName=PlayerName;
				this.score=score;
			}

			void increaseScore(){
				score++;
			}

			int getScore(){
				return score;
			}

			String getName(){
				return PlayerName;
			}

			


}


class Main{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);

		Question []quiz = new Question[3];
		quiz[0]= new Question("Q1:What is the Capital of Pakistan",
					new String[]{"1) Islamabad","2) Karachi","3) Lahore" , "4) Quetta"},"Islamabad");

		quiz[1]= new Question("Q2: What is the chemical symbol for Gold?",
					new String[]{"1) Gd", "2) Au", "3) Ag", "4) Fe"},"Au");
		
		quiz[2]= new Question("Q3: Who is known as the father of computers?",
					new String[]{"1) Charles Babbage", "2) Alan Turing", "3) Bill Gates", "4) Steve Jobs"},"Charles Babbage");

		
// ==================================================================================

	System.out.println("==================== Player =========================");
			
			System.out.println("Enter the PlayerName :");
			String name=s.nextLine();
			Player P1=new Player(name);


			for(int i=0;i<3;i++){
			
			System.out.println("====== Question :"+(i+1)+"=======");

			System.out.println(quiz[i].getQuestion());
		    String []Op=quiz[i].getOptions();
		    for(int j=0;j<Op.length;j++){
		       System.out.println(Op[j]);

			}

		    System.out.println("Enter the Answer :");
			String ans=s.nextLine();

			if(ans.equalsIgnoreCase(quiz[i].getCorrectAnswer())){
				System.out.println("Correct Answer!");
				P1.increaseScore();
			}
			else{
			System.out.println("Wrong Answer!");
				System.out.println("Correct Answer! :"+quiz[i].getCorrectAnswer());

			}
}

		   System.out.println("====Result====");
		   System.out.println("PlayerName :"+P1.getName());
		   System.out.println("Total Score ="+P1.getScore()+"/3");

	}





}