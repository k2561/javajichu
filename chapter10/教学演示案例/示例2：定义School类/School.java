package cn.jbit.classandobject;

public class School {
	String schoolName;		//��������
	int classNumber;		//������Ŀ
	int labNumber;			//������Ŀ
	
	//���山���������ĵķ���
	public void showCenter(){
		System.out.println(schoolName + "��ѵѧԱ\n" + "�䱸��" 
			+ classNumber + "��" + labNumber + "��");
	}
}
