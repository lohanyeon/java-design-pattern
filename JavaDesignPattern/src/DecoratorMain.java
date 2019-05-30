import decorator.CrossingDecorator;
import decorator.Display;
import decorator.LaneDecorator;
import decorator.RoadDisplay;
import decorator.RoadDisplayWithLane;
import decorator.TrafficDecorator;

public class DecoratorMain {

	public static void main(String[] args) {
		/*
		 * RoadDisplay roadDisplay = new RoadDisplay(); roadDisplay.draw();
		 * 
		 * RoadDisplay roadWithLane = new RoadDisplayWithLane(); roadWithLane.draw();
		 */

		/*
		 * Display road = new RoadDisplay(); road.draw();
		 * 
		 * Display roadWithLane = new LaneDecorator(new RoadDisplay());
		 * roadWithLane.draw();
		 * 
		 * Display roadWithTraffic = new TrafficDecorator(new RoadDisplay());
		 * roadWithTraffic.draw();
		 */

		Display roadWithLaneAndTraffic =
				new TrafficDecorator(
				new CrossingDecorator(
				new LaneDecorator(
				new RoadDisplay())));
		roadWithLaneAndTraffic.draw();
	}

}
