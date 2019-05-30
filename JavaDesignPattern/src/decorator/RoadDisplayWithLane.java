package decorator;

public class RoadDisplayWithLane extends RoadDisplay {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		super.draw();
		drawLane();
	}

	private void drawLane() {
		System.out.println("차선 표시");
	}

}
