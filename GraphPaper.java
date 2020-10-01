package pt1;

public class GraphPaper extends PaperDecorator {

	public GraphPaper(Paper c) {
		super(c);
	
	}
	public void create() {
		super.create();
		System.out.println("Graph lines added to paper");
	}
}
