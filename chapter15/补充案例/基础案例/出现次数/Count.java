
public class Count {

	public static void main(String[] args) {
		String s = "��Щ��һ���ˣ���Ҳ������Ҳ�ߣ��й��ᣬ�й���,"
				+ "���ǵü����ô���氮���Żᶮ�����į����ף������������������С�"
				+ "����һ��һ���ߣ���Щ���Ӳ����У�һ�仰��һ���ӣ�һ���飬һ���ơ�"
				+ "���Ѳ����µ�����һ��������ᶮ�������ˣ�����ʹ����Ҫ�ߣ������ҡ�";
		int count = 0;
		do {
			int index = s.indexOf("����");
			if (index != -1) {
				count++;
				s = s.substring(index + 2);
			} else {
				break;
			}
		} while (s.length() >= 2);
		System.out.println(count);
	}
}
