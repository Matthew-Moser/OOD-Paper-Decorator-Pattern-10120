package pt1;

public class WPK extends PaperDecorator {

	public WPK(Paper c) {
		super(c);
		// TODO Auto-generated constructor stub
	}
	public void create() {
		super.create();
		System.out.println("Lettering lines have been added." + "These are great for teaching children how to write!");
	}
}
