package ha.csteam.boardingwindow;

import java.time.LocalDateTime;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class FlightInfo implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private String boardingStartTime;
	private String boardingCloseTime;
	private java.lang.String origin;
	private java.lang.String destination;
	private java.lang.String aircraftType;
	private String ETD;

	private int startTimeMinutes;

	private int closeTimeMinutes;

	private java.lang.String route;

	public FlightInfo() {
	}

	public void setThis(FlightInfo info) {
		this.boardingStartTime = info.getBoardingStartTime();
		this.boardingCloseTime = info.getBoardingCloseTime();
	}

	public FlightInfo getThis() {
		return this;
	}

	public java.lang.String getOrigin() {
		return this.origin;
	}

	public void setOrigin(java.lang.String origin) {
		this.origin = origin;
	}

	public java.lang.String getDestination() {
		return this.destination;
	}

	public void setDestination(java.lang.String destination) {
		this.destination = destination;
	}

	public java.lang.String getAircraftType() {
		return this.aircraftType;
	}

	public void setAircraftType(java.lang.String aircraftType) {
		this.aircraftType = aircraftType;
	}

	public int getStartTimeMinutes() {
		return this.startTimeMinutes;
	}

	public void setStartTimeMinutes(int startTimeMinutes) {
		this.startTimeMinutes = startTimeMinutes;
	}

	public int getCloseTimeMinutes() {
		return this.closeTimeMinutes;
	}

	public void setCloseTimeMinutes(int closeTimeMinutes) {
		this.closeTimeMinutes = closeTimeMinutes;
	}

	public java.lang.String getRoute() {
		return this.route;
	}

	public void setRoute(java.lang.String route) {
		this.route = route;
	}

	public java.lang.String getBoardingStartTime() {
		return this.boardingStartTime;
	}

	public void setBoardingStartTime(java.lang.String boardingStartTime) {
		this.boardingStartTime = boardingStartTime;
	}

	public java.lang.String getBoardingCloseTime() {
		return this.boardingCloseTime;
	}

	public void setBoardingCloseTime(java.lang.String boardingCloseTime) {
		this.boardingCloseTime = boardingCloseTime;
	}

	public java.lang.String getETD() {
		return this.ETD;
	}

	public void setETD(java.lang.String ETD) {
		this.ETD = ETD;
	}

	public FlightInfo(java.lang.String boardingStartTime,
			java.lang.String boardingCloseTime, java.lang.String origin,
			java.lang.String destination, java.lang.String aircraftType,
			java.lang.String ETD, int startTimeMinutes, int closeTimeMinutes,
			java.lang.String route) {
		this.boardingStartTime = boardingStartTime;
		this.boardingCloseTime = boardingCloseTime;
		this.origin = origin;
		this.destination = destination;
		this.aircraftType = aircraftType;
		this.ETD = ETD;
		this.startTimeMinutes = startTimeMinutes;
		this.closeTimeMinutes = closeTimeMinutes;
		this.route = route;
	}
}