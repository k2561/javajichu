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
	
	/**
	 * ʾ��3���޸�ѧԱ����
	 * @param oldName������
	 * @param newName������
	 */
	public boolean editName(String oldName,String newName){
		boolean find = false;  // �Ƿ��ҵ����޸ĳɹ���ʶ
		
		// ѭ�����飬�ҵ�����ΪoldName��Ԫ�أ��޸�ΪnewName
		for(int i=0;i<names.length;i++){
			if(names[i].equals(oldName)){
				names[i] = newName;
				find=true;
				break;
			}
		}
		return find;
	}
}
