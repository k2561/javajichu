package cn.jbit.nestedloops;
import java.util.Scanner;
/**
 * ˳�����Ӣ�ĸ���
 */
public class Music {
	public static void main(String[] args) {
		String[] musics = new String[]{"Island","Ocean","Pretty","Sun"};
		String[] newMusics = new String[musics.length+1];	//��������������
		String music = "";	//�����û�����ĸ�������
		int index = musics.length;	//�����¸�������λ��
		
		//�������ǰ�Ľ��
		System.out.print("����ǰ������Ϊ��");
		for(int i = 0; i < musics.length ; i++){	
			System.out.print(musics[i]+"  ");
		}

		//������musics�е�Ԫ�ظ��Ƶ�����newMusics��
		for(int i = 0; i < musics.length; i++){
			newMusics[i] = musics[i];
		}
		
		//�����������
		Scanner input = new Scanner(System.in);
		System.out.print("\n������������ƣ�");
		music = input.nextLine();
		
		//�ҵ���Ԫ�صĲ���λ��
		for(int i = 0; i < musics.length; i++){
			if(musics[i].compareToIgnoreCase(music) > 0){
				index = i;
				break;
			}
		}
		//Ԫ�غ���
		for(int i = newMusics.length-1; i > index; i--){
			newMusics[i] = newMusics[i-1];    //index�±꿪ʼ��Ԫ�غ���һ��λ��
		}
		newMusics[index] = music;    //��Ԫ�ط���index��λ��
		
		//��������Ľ��
		System.out.print("����������Ϊ��");
		for(int i = 0; i < newMusics.length; i++){
			System.out.print(newMusics[i]+"  ");
		}
	}
}
