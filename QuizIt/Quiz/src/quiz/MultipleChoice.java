package quiz;
import java.util.*;
public class MultipleChoice implements Question{
	
	// Multiple choice question, choices should be fairly important 
	// TODO: Think about how choices should be stored: 
	// i.e. the actual answer choice "Blue is a color" or the letter choice i.e. "A" or "B"
	// TODO: Decide if choices should be included in Question, Answer, or not at all 
	private List<String> choices;
	private String question; 
	private Answer answer; 
	private int questionId; 
	
	public MultipleChoice(String question, Answer answer, List<String> choices, int questionId) {
		this.question = question; 
		this.answer = answer; 
		this.choices = choices; 
		this.questionId = questionId; 
	}
	
	public Answer getAnswer() {
		return answer; 
	}
	
	//TODO: Decide if responses should be case-sensitive
	public boolean checkAnswer(Answer userResponse) {
		// Check if userResponse is in choices  
		String urStr = userResponse.toString(); 
		if(choices.contains(urStr)) {
			if(answer.toString().equals(urStr)) {
				return true; 
			}
		}
		return false; 
	}
	
	//Temporary implementation
	public boolean checkAnswer(String userResponse) {
		String lowercaseResponse = userResponse.toLowerCase();
		String lowercaseAnswer = answer.toString().toLowerCase();
		if (lowercaseAnswer.equals(lowercaseResponse)) {
			return true; 
		}
		return false; 
	}
	
	//Override of toString
	public String toString() {
		return question; 
	}
	
	public int getId() {
		return questionId; 
	}
	
}
