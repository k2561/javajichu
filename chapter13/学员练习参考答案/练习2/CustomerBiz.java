package cn.jbit.classandobject;

/**
 * �ϻ��׶�1��2��ʵ�ֿͻ�������ʾ����� 
 *
 */
public class CustomerBiz {
	String[] names = new String[30];  // ��������	
	
	/**
	 * ��������
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
	 * ��ʾ����
	 */
	public void showNames(){
		System.out.println("**************************");
		System.out.println("\t�ͻ������б�");
		System.out.println("**************************");
		for(int i =0;i<names.length;i++){
			if(names[i]!=null){
				System.out.print(names[i]+"\t");
			}
		}
		System.out.println();
	}
	/**
	 * �׶�2������
	 * @param nameҪ���ҵ�����
	 * @return �Ƿ��ҵ�
	 */
	public boolean search(String name){
		boolean find = false;  // �����Ƿ��ҵ�
		int i=0;
		while(names[i] != null){
			if(names[i].equals(name)){
				find = true;  // �ҵ���]
				break;
			}
			i++;
		}
		return find;
	}	
}
