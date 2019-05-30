 package decorator;

public class TrafficDecorator extends DisplayDecorator {

	public TrafficDecorator(Display decoratedDisplay) {
		super(decoratedDisplay);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		super.draw();
		drawTraffic();
	}
	
	private void drawTraffic() {
		System.out.println("\t교통량 표시");
	}

}
