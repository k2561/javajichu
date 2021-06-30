package cn.jbit.classandobject;

public class TestSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StudentsBiz st = new StudentsBiz();
		String[] namesbysort  = new String[30];
		st.inputNames();
		namesbysort =st.getNames();
		System.out.println("****≈≈–Ú∫Û****");
		for(int i =0;i<namesbysort .length;i++){
			if(namesbysort [i]!=null){
				System.out.print(namesbysort [i]+"\t");
			}
		}
	}
}
