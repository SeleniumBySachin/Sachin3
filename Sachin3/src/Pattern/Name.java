package Pattern;

public class Name {
	public static void main(String[] args) throws Exception {
		int n = 5;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				if (i == 0 && j > 0 || i == 4 && j < 4 || i == 2 || j == 0 && i > 0 && i < 2
						|| j == 4 && i > 2 && i < 4) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
				Thread.sleep(8);

			}
			System.out.print("   ");

			for (int j = 0; j < n; j++) {

				if (j == 0 && i > 0 || j == 4 && i > 0 || i == 2 || i == 0 && j > 0 && j < 4) {
					System.out.print("* ");
					Thread.sleep(4);
				} else {
					System.out.print("  ");
				}

			}
			System.out.print("   ");

			for (int j = 0; j < n; j++) {

				if (j == 0 && i > 0 && i < 4 || i == 0 && j > 0 || i == 4 && j > 0) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
				Thread.sleep(8);
			}
			System.out.print("   ");
			for (int j = 0; j < n; j++) {

				if (i == 2 || j == 0 || j == 4) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
				Thread.sleep(8);
			}
			System.out.print("   ");
			for (int j = 0; j < n; j++) {

				if (i == 0 || i == 4 || j == n / 2) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
				Thread.sleep(8);
			}
			System.out.print("  ");

			for (int j = 0; j < n; j++) {

				if (j == 0 || j == n - 1 || i == j) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
				Thread.sleep(8);
			}

			System.out.println();
		}
	}

}
