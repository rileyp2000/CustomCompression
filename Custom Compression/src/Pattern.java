
public class Pattern {
	private String s;
	private int count;



public Pattern(String ss){
	s = ss;
	count = 0;
}

public String getPattern(){
	return s;
}

public void incrementCount(){
	count++;
}

public void reset(String ss){
	count = 0;
	s = ss;
}
}