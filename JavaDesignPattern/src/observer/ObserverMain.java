package observer;

import observer.DataSheetView;
import observer.MinMaxView;
import observer.Observer;
import observer.ScoreRecord;

public class ObserverMain {
	
	public static void main(String[] args) {
		ScoreRecord scoreRecord = new ScoreRecord();
		
		DataSheetView dataSheetView = new DataSheetView(scoreRecord, 5);
		MinMaxView minMaxView = new MinMaxView(scoreRecord);

		scoreRecord.attach(dataSheetView);
		scoreRecord.attach(minMaxView);

		for (int index = 1; index <= 5; index ++) {
			int score = index * 10;
			System.out.println("Adding " + score);
			
			scoreRecord.addScore(score);
		}
	}

}
