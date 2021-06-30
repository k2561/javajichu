package cn.jbit.loops2;
public class PersonCount {

	/**
	 * 计算马克思手稿中的数学题
	 */
	public static void main(String[] args) {
		int men = 0;	//男人
		int women = 0;	//女人
		int kids = 0;	//小孩
		for(;men<=10;men++){
			women = 20 - 2*men;
			kids = 30 - men - women;
			if(3*men + 2*women + kids == 50){
				System.out.println(men+"：男人" +men+ " 女人" +women+ " 小孩" +kids);
			}
		}
	}
}