package cn.jbit.nestedloops;
import java.util.Scanner;
/**
 * continue�ϵ���ʾ������ɼ�85�����ϵ�ѧԱ����
 * 
 */
public class ContinueDemo {
	public static void main(String[] args) {
		int[] score = new int[4];				//�ɼ�����
		int classnum = 3;						//�༶��Ŀ
		double sum = 0.0;						//�ɼ��ܺ�
		double average = 0.0;					//ƽ���ɼ�
		
		int count = 0;							//��¼85������ѧԱ����
		
		//ѭ������ѧԱ�ɼ�
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < classnum; i++){
			sum = 0.0f;							//�ɼ��ܺ͹�0
			System.out.println("�������" + (i+1) + "���༶�ĳɼ�");
			for(int j = 0; j < score.length; j++){
				System.out.print("��" + (j+1) + "��ѧԱ�ĳɼ���");
				score[j] = input.nextInt();
				sum = sum + score[j];			//�ɼ��ۼ�
				
				if(score[j] < 85){	//�ɼ�С��85������������ѭ��
					continue;
				}
				count++;
			}
			average = sum / score.length;
			System.out.println("��" + (i+1) + "���༶����ѧԱ��ƽ�����ǣ�" + average + "\n");
		}
		System.out.println("�ɼ�85�����ϵ�ѧԱ������" + count + "��");
	}
}
