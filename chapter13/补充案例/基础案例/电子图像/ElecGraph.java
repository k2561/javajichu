import java.util.*;

public class ElecGraph {
	/**
	 * ������ֵĵ���ͼ��
	 * @param i ����
	 * @return ���ֶ�Ӧ��ͼ��
	 */
	public String getGraph(int i) {
		String graph = "";
		if (i != 1 && i != 4) {
			graph = graph + " _";
		}
		if (i == 4 || i == 5 || i == 6 || i == 8 || i == 9) {
			graph = graph + "\n|";
		} else {
			graph = graph + "\n ";
		}
		if (i != 1 && i != 7) {
			graph = graph + "_";
		} else {
			graph = graph + " ";
		}
		if (i != 5 && i != 6) {
			graph = graph + "|";
		}

		if (i == 2 || i == 6 || i == 8) {
			graph = graph + "\n|";
		} else {
			graph = graph + "\n ";
		}
		if (i != 1 && i != 4 && i != 7) {
			graph = graph + "_";
		} else {
			graph = graph + " ";
		}
		if (i != 2) {
			graph = graph + "|";
		}
		return graph;
	}

	public static void main(String[] args) {
		ElecGraph ng = new ElecGraph();
		Scanner input = new Scanner(System.in);
		System.out.print("������һ�����֣� ");
		int num = input.nextInt();
		System.out.println("����ͼ���ǣ� ");
		System.out.println(ng.getGraph(num));

	}
}
