package cn.jbit.classandobject;
/**
 * 
 * ʵ��ѧ����Ϣ�Ĺ��� 
 *
 */
public class StudentsBiz {
	String[] names = new String[30];  // ѧԱ��������
	
	/**
	 * ʾ��1������ѧ������
	 * @param nameҪ���ӵ�����
	 */
	public void addName(String name){
		for(int i =0;i<names.length;i++){
			if(names[i]==null){
				names[i]=name;
				break;
			}
		}
	}
	/**
	 * ��ʾ�����ѧ������
	 */
	public void showNames(){
		System.out.println("����ѧ���б�");
		for(int i =0;i<names.length;i++){
			if(names[i]!=null){
				System.out.print(names[i]+"\t");
			}
		}
		System.out.println();
	}
}
