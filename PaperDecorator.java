package pt1;

public class PaperDecorator implements Paper {
	protected Paper paper;
	public PaperDecorator(Paper c) {
		this.paper=c;
	}
	@Override
	public void create() {
		this.paper.create();
		
	}

}
