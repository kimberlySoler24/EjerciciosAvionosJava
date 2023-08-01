package code.otrosEjercicios.objetos;

public class TimeToSeconds {
	
	private String date;
	
	public TimeToSeconds(String date) {
		this.date = date;
	}
	
	public String date() {
		return this.date;
	}
	
	private final int SECONDS_IN_A_MINUTE = 60;
	private final int MINUTES_IN_A_HOUR = 60;
	private final int SECONDS_IN_A_HOUR = SECONDS_IN_A_MINUTE * MINUTES_IN_A_HOUR;
	
	public int timeToSeconds () {
		var foundT = date.indexOf("T");
			var time = foundT != -1 ? date.substring(foundT + 1) : date;
			var firstPoint = time.indexOf(":");
			var secondPoint = time.indexOf(":", firstPoint + 1);
			var hour = Integer.parseInt(time.substring(0, firstPoint));
			var minutes = Integer.parseInt(time.substring(firstPoint + 1, secondPoint));
			var seconds = Integer.parseInt(time.substring(secondPoint + 1));
		return  hour*SECONDS_IN_A_HOUR + minutes*MINUTES_IN_A_HOUR + seconds;
	}
	
}
