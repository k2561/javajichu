package cn.jbit.nestedloops;
import java.util.Scanner;
/**
 * 顺序插入英文歌曲
 */
public class Music {
	public static void main(String[] args) {
		String[] musics = new String[]{"Island","Ocean","Pretty","Sun"};
		String[] newMusics = new String[musics.length+1];	//插入歌曲后的数组
		String music = "";	//保存用户输入的歌曲名称
		int index = musics.length;	//保存新歌曲插入位置
		
		//输出插入前的结果
		System.out.print("插入前的数组为：");
		for(int i = 0; i < musics.length ; i++){	
			System.out.print(musics[i]+"  ");
		}

		//将数组musics中的元素复制到数组newMusics中
		for(int i = 0; i < musics.length; i++){
			newMusics[i] = musics[i];
		}
		
		//输入歌曲名称
		Scanner input = new Scanner(System.in);
		System.out.print("\n请输入歌曲名称：");
		music = input.nextLine();
		
		//找到新元素的插入位置
		for(int i = 0; i < musics.length; i++){
			if(musics[i].compareToIgnoreCase(music) > 0){
				index = i;
				break;
			}
		}
		//元素后移
		for(int i = newMusics.length-1; i > index; i--){
			newMusics[i] = newMusics[i-1];    //index下标开始的元素后移一个位置
		}
		newMusics[index] = music;    //新元素放在index的位置
		
		//输出插入后的结果
		System.out.print("插入后的数组为：");
		for(int i = 0; i < newMusics.length; i++){
			System.out.print(newMusics[i]+"  ");
		}
	}
}
