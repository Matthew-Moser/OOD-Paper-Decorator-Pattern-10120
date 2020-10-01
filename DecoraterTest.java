package pt1;

public class DecoraterTest {

	public static void main(String[] args) {
		Paper standardPaper = new StandardPaper();
		standardPaper.create();
		System.out.println("*********");
		Paper graphPaper = new GraphPaper(new StandardPaper());
		graphPaper.create();
		System.out.println("*********");
		Paper wpk = new WPK(new StandardPaper());
		wpk.create();
	}

}
