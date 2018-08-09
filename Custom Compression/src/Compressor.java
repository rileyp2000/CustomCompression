import java.util.ArrayList;

public class Compressor {
	private String uncompressed;
	private String compressed;
	private String key;
	
	public Compressor(String s){
		uncompressed = s;
		compressed = "";
		key = "";
	}
	
	public ArrayList<Pattern> findPattern(int len){
		ArrayList<Pattern> ret = new ArrayList<Pattern>();
		for(int i = 0; i < uncompressed.length(); i ++){
			String temp = uncompressed.substring(i, i + 3);
			checkExists(temp, ret).incrementCount();
		}
		return ret;
	}
	
	public Pattern checkExists(String s, ArrayList<Pattern> p){
		for(Pattern str : p){
			if(str.getPattern().equals(s))
				return str;
		}
		return new Pattern(s);
	}
}
