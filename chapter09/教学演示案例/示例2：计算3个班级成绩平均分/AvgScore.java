package cn.jbit.nestedloops;
import java.util.Scanner;
/**
 * ����3���༶��ƽ����
 */
public class AvgScore {
	public static void main(String args[]){
		int[] score = new int[4];				//�ɼ�����
		int classNum = 3;						//�༶��Ŀ
		double sum = 0.0;						//�ɼ��ܺ�
		double average = 0.0;					//ƽ���ɼ�

		//ѭ������ѧԱ�ɼ�
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < classNum; i++){
			sum = 0.0f;							//�ɼ��ܺ͹�0
			System.out.println("�������" + (i+1) + "���༶�ĳɼ�");
			for(int j = 0; j < score.length; j++){
				System.out.print("��" + (j+1) + "��ѧԱ�ĳɼ���");
				score[j] = input.nextInt();
				sum = sum + score[j];			//�ɼ��ۼ�
			}
			average = sum / score.length;	//����ƽ����
			System.out.println("��" + (i+1) + "���༶����ѧԱ��ƽ�����ǣ�" + average + "\n");
		}
	}
}
