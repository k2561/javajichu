package cn.jbit.nestedloops;
import java.util.Scanner;
/**
 * ����һ�����ƽ����
 */
public class AvgScore {
	public static void main(String args[]){
		int[] score = new int[4];		//�ɼ�����
		float sum = 0.0f;				//�ɼ��ܺ�
		float average = 0.0f;			//�ɼ�ƽ��ֵ
		
		//ѭ������ѧԱ�ɼ�
		Scanner input = new Scanner(System.in);
		System.out.println("������4λѧԱ�ĳɼ�");
		for(int i = 0; i < score.length; i++){
			System.out.print("��"+ (i+1) +"λѧԱ�ĳɼ���");
			score[i] = input.nextInt();
			sum = sum + score[i];	     //�ɼ��ۼ�
		}
		average = sum / score.length;	//����ƽ��ֵ
		System.out.println("����ѧԱ��ƽ�����ǣ�" + average);
	}
}
