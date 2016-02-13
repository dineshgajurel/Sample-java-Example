package enumtest;

public enum Day {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
	public static Day getDay(String s) {
		for (Day value : values()) {
			if (value.name().equals(s)) {
				return value;
			}
		}
		return null;
	}
}
