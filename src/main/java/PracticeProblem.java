public class PracticeProblem {

	public static void main(String args[]) {

		

	}
	public static void bubbleSortString(String[] strings){
		boolean swapped=true;
		for(int i=0; i<strings.length-1 && swapped;i++){
			swapped=false;
			for (int j=0;j<strings.length-i-1; j++){
				if(strings[j].toLowerCase().compareTo(strings[j+1].toLowerCase())>0){
					swapped=true;
					String temp=strings[j];
					strings[j]=strings[j+1];
					strings[j+1]=temp;
					
				}
			}
		}
	}

}
