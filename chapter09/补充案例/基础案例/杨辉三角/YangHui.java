/**
 * 构造和输出杨辉三角
 * @author 北大青鸟
 *
 */
public class YangHui {
	public static void main(String[] args) {
		int a[][] = new int[6][6];
		//为第一列和对角线元素赋值，均为1
		for(int i=0;i<6;i++){
			for(int j=0;j<=i;j++){
				if(j==0 ||i ==j)
					a[i][j]=1;
			}
		}
		//为非第一列和对角线元素赋值
		for(int i=1;i<6;i++){
			for(int j=1;j<i;j++){
				a[i][j] = a[i-1][j]+a[i-1][j-1];
			}
		}
		//输出杨辉三角
		for(int i=0;i<6;i++){
			for(int j=0;j<=i;j++){
			System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
	}

}
