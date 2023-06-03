package incident;

import java.util.regex.Pattern;

class Accident {
	private static int lastId = 0;
	private int id;
    private String date;
    private String typeOfAccident;
    private String natureOfAccident;
    private String causeOfAccident;
    private String timeReported;
    private String responseTime;
    private String timeArrived;
    private String shiftTime;
    private String day;
    private String plaza;
    private String exactLocation;
    private String locationBetweenNB;
    private String locationBetweenSB;
    private String laneOccupied;
    private String vehicle;
    private String plateNumber;
    private String driverName;
    private String driverAge;
    private String driverLicenseNumber;
    private String minorCasualty;
    private String majorCasualty;
    private int numberOfInjuries;
    private int numberOfFatal;
    private String dtpToVehicle;
    private String dtpToTplex;
    private String otherDetails;
    private String week;
    
    
    
    public Accident() {
        this.id = ++lastId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
    	// Date validation logic
        if (date == null || !Pattern.matches("\\d{2}-\\d{2}-\\d{4}", date)) {
            throw new IllegalArgumentException("Invalid date format. Date must be in the format mm-dd-yyyy.");
        }
        this.date = date;
    }

    public String getTypeOfAccident() {
        return typeOfAccident;
    }

    public void setTypeOfAccident(String typeOfAccident) {
        this.typeOfAccident = typeOfAccident;
    }

    public String getNatureOfAccident() {
        return natureOfAccident;
    }

    public void setNatureOfAccident(String natureOfAccident) {
        this.natureOfAccident = natureOfAccident;
    }

    public String getCauseOfAccident() {
        return causeOfAccident;
    }

    public void setCauseOfAccident(String causeOfAccident) {
        this.causeOfAccident = causeOfAccident;
    }

    public String getTimeReported() {
        return timeReported;
    }

    public void setTimeReported(String timeReported) {
        this.timeReported = timeReported;
    }

    public String getResponseTime() {
        return responseTime;
    }

    public void setResponseTime(String responseTime) {
        this.responseTime = responseTime;
    }

    public String getTimeArrived() {
        return timeArrived;
    }

    public void setTimeArrived(String timeArrived) {
        this.timeArrived = timeArrived;
    }

    public String getShiftTime() {
        return shiftTime;
    }

    public void setShiftTime(String shiftTime) {
        this.shiftTime = shiftTime;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getPlaza() {
        return plaza;
    }

    public void setPlaza(String plaza) {
        this.plaza = plaza;
    }

    public String getExactLocation() {
        return exactLocation;
    }

    public void setExactLocation(String exactLocation) {
        this.exactLocation = exactLocation;
    }

    public String getLocationBetweenNB() {
        return locationBetweenNB;
    }

    public void setLocationBetweenNB(String locationBetweenNB) {
        this.locationBetweenNB = locationBetweenNB;
    }

    public String getLocationBetweenSB() {
        return locationBetweenSB;
    }

    public void setLocationBetweenSB(String locationBetweenSB) {
        this.locationBetweenSB = locationBetweenSB;
    }

    public String getLaneOccupied() {
        return laneOccupied;
    }

    public void setLaneOccupied(String laneOccupied) {
        this.laneOccupied = laneOccupied;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }


    public String getDriverAge() {
        return driverAge;
    }

    public void setDriverAge(String driverAge) {
        this.driverAge = driverAge;
    }

    public String getDriverLicenseNumber() {
        return driverLicenseNumber;
    }

    public void setDriverLicenseNumber(String driverLicenseNumber) {
        this.driverLicenseNumber = driverLicenseNumber;
    }

    public String getMinorCasualty() {
        return minorCasualty;
    }

    public void setMinorCasualty(String minorCasualty) {
        this.minorCasualty = minorCasualty;
    }

    public String getMajorCasualty() {
        return majorCasualty;
    }

    public void setMajorCasualty(String majorCasualty) {
        this.majorCasualty = majorCasualty;
    }

    public int getNumberOfInjuries() {
        return numberOfInjuries;
    }

    public void setNumberOfInjuries(int numberOfInjuries) {
        // Number of injuries validation logic
        if (numberOfInjuries < 0) {
            throw new IllegalArgumentException("Invalid number of injuries. Number must be non-negative.");
        }
        this.numberOfInjuries = numberOfInjuries;
    }


    public int getNumberOfFatal() {
        return numberOfFatal;
    }

    public void setNumberOfFatal(int numberOfFatal) {
        this.numberOfFatal = numberOfFatal;
    }

    public String getDtpToVehicle() {
        return dtpToVehicle;
    }

    public void setDtpToVehicle(String dtpToVehicle) {
        this.dtpToVehicle = dtpToVehicle;
    }

    public String getDtpToTplex() {
        return dtpToTplex;
    }

    public void setDtpToTplex(String dtpToTplex) {
        this.dtpToTplex = dtpToTplex;
    }

    public String getOtherDetails() {
        return otherDetails;
    }

    public void setOtherDetails(String otherDetails) {
        this.otherDetails = otherDetails;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }
}
