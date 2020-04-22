package p0409;

import java.util.Scanner;

public class SortedStudentGradeSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String[] name = new String[3];
		// String[] list = {"num", "kor", "eng", "math", "total"};
		// int[][] score = new int[3][5];
		// float[] avg = new float[3];
		// Scanner sc = new Scanner(System.in);
		//
		//
		// for (int i = 0; i < name.length; i++) {
		// System.out.print("name:");
		// name[i] = sc.next();
		// for (int j = 0; j < list.length-1; j++) {
		// System.out.print(list[j] + ":");
		// score[i][j] = sc.nextInt();
		// }
		//
		// for (int j = 1; j < list.length-1; j++) {
		// score[i][list.length-1] += score[i][j];
		// }
		//
		// avg[i] = (float)score[i][list.length-1] / (list.length - 2);
		// }
		//
		// for (int i = 0; i < name.length; i++) {
		// System.out.println("name:" + name[i] + "'s Grade");
		// for (int j = 0; j < list.length; j++) {
		// System.out.print(list[j] + ":");
		// System.out.println(score[i][j]);
		// }
		// System.out.println("avg:" + avg[i]);
		// }

		String[] name = new String[3];
		int[][] score = new int[3][5];
		float[] avg = new float[3];
		String[] title = { "name", "num", "kor", "eng", "math", "total", "avg" };
		Scanner sc = new Scanner(System.in);
		int cnt = 0;

		for (int i = 0; i < name.length; i++) {
			cnt = 0;
			System.out.print(title[cnt++] + ":");
			name[i] = sc.next();
			for (int j = 0; j < score[i].length - 1; j++) {
				System.out.print(title[cnt++] + ":");
				score[i][j] = sc.nextInt();
				if (j != 0) {
					score[i][score[i].length - 1] += score[i][j];
				}
			}
			avg[i] = (float) score[i][score[i].length - 1] / (score[i].length - 2);
		}

		for (int i = 0; i < avg.length - 1; i++) {
			for (int j = 0; j < avg.length - 1 - i; j++) {
				int[] tmp_score;
				float tmp_avg;
				String tmp_name;
				
				if (avg[j] < avg[j+1]) {
					tmp_name = name[j];
					tmp_score = score[j];
					tmp_avg = avg[j];
					
					name[j] = name[j+1];
					score[j] = score[j+1];
					avg[j] = avg[j+1];
					
					name[j+1] = tmp_name;
					score[j+1] = tmp_score;
					avg[j+1] = tmp_avg;
				}
			}
		}

		for (int i = 0; i < title.length; i++) {
			System.out.print(title[i] + "\t");
		}

		System.out.println();

		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i] + "\t");
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.println(avg[i]);
		}
		
		sc.close();
	}

}
