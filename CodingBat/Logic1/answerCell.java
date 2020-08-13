package CodingBat.Logic1;

public class answerCell {
	//Your cell phone rings. Return true if you should answer it. 
	//Normally you answer, except in the morning you only answer if it is your mom calling. 
	//In all cases, if you are asleep, you do not answer.

	//answerCell(false, false, false) → true
	//answerCell(false, false, true) → false
	//answerCell(true, false, false) → false

	public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
	if ((isAsleep) || (isMorning))
		return false;
	if ((isMom) && !(isMorning) || !(isAsleep))
		return true;
	return false;
	}
	
	public static void main(String[] args) {
	answerCell t = new answerCell();
	t.answerCell(false, false, false);
    t.answerCell(false, false, true);
    t.answerCell(true, false, false);
    System.out.println(t.answerCell(false, false, false));
    System.out.println(t.answerCell(false, false, true));
    System.out.println(t.answerCell(true, false, false));
}}

//}
