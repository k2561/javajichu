
public class TestInsert {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a[]=new int[10];
		a[0]=10;
		a[1]=56;
		a[2]=34;
		a[3]=67;
		a[4]=89;
		System.out.println("插入前");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+"  ");
		}
		Utility util = new Utility();
		util.insertArray(a, 3, 100);
		System.out.println("\n插入后");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+"  ");
		}
	}

}
