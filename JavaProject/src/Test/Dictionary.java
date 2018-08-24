package Test;

public class Dictionary {
	String words[]=new String[5];
	String meaning[]= new String[5];
	int Map[]= new int[5];

	public boolean contains(String[] array,String item) {
		for(String ite:array) {
			if(ite==null) {}
			else {
				if(item.equals(ite)) {
					return true;
				}
			}
		}
		return false;
	}
	
	public int IndexOf(String arr[],String word) {
		int index=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i].equals(word)) {
				index=i;
				break;
			}
		}
		return index;		
	}
	
	public String Add(String word,String meaning,int i) {
		int map;
		if(contains(this.words,word)) {
			return "Exists";
		}
		else {
			this.words[i]=word;
			this.meaning[i]=meaning;
		}
		return "Added";
	}
	
	public String getMeaning(String word) {
		String m;
		if(!contains(this.words,word)) {
			return "Not in dictionary";
		}
		else {
			int mean_index=IndexOf(this.words,word);
			return this.meaning[mean_index];
		}
	}
}
