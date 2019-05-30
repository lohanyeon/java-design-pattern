package decorator;

public class CrossingDecorator extends DisplayDecorator {

	public CrossingDecorator(Display decoratedDisplay) {
		super(decoratedDisplay);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		super.draw();
		drawCrossing();
	}

	private void drawCrossing() {
		System.out.println("\t교차로 표시");
	}

}
