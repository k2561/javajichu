package cn.jbit.nestedloops;
import java.util.Scanner;
/**
 * continue�ϵ���ʾ������ɼ�85�����ϵ�ѧԱ����
 * 
 */
public class AvgScore {
	public static void main(String[] args) {
		int[] score = new int[4];				//�ɼ�����
		int classnum = 3;						//�༶��Ŀ
		double sum = 0.0;						//�ɼ��ܺ�
		double average = 0.0;					//ƽ���ɼ�
		int count = 0;							//��¼85������ѧԱ����
		
		//ѭ������ѧԱ�ɼ�
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < classnum; i++){
			System.out.println("�������" + (i+1) + "���༶�ĳɼ�");
			for(int j = 0; j < score.length; j++){
				System.out.print("��" + (j+1) + "��ѧԱ�ĳɼ���");
				score[j] = input.nextInt();
				if(score[j] < 85){	//�ɼ�С��85������������ѭ��
					continue;
				}
				sum = sum + score[j];			//�ɼ�85�����ϲŽ����ۼ�
				count++;
			}		
		}
		average = sum / count;					//���гɼ�85�����ϵ�ѧԱ��ƽ����
		System.out.println("���гɼ�85�����ϵ�ѧԱ��ƽ����Ϊ��" + average);
	}
}