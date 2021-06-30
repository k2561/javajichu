package cn.jbit.loops2;

public class FlipFlop {
	public static void main(String[] args) {
		for(int i = 1; i<= 100; i++){
			if(i%3 == 0){
				if(i%5 == 0){//既是3的倍数又是5的倍数
					System.out.println("FlipFlop");
				}else{//只是3的倍数
					System.out.println("Flip");
				}
			}else if(i%5 == 0){//只是5的倍数
				System.out.println("Flop");
			}else{
				System.out.println(i);
			}
		}
	}
}
