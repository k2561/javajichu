package cn.jbit.loops2;

public class FlipFlop {
	public static void main(String[] args) {
		for(int i = 1; i<= 100; i++){
			if(i%3 == 0){
				if(i%5 == 0){//����3�ı�������5�ı���
					System.out.println("FlipFlop");
				}else{//ֻ��3�ı���
					System.out.println("Flip");
				}
			}else if(i%5 == 0){//ֻ��5�ı���
				System.out.println("Flop");
			}else{
				System.out.println(i);
			}
		}
	}
}
