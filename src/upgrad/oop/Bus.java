package upgrad.oop;

public class Bus extends Student{
	private String routeNumber;
	private String bg;
	
	public Bus(String name,String admNo,String grade,String routeNumber,String bg){
		super(name,admNo,grade);
		this.routeNumber = routeNumber;
		this.bg = bg;
	}

	public String getRouteNumber() {
		return routeNumber;
	}

	public void setRouteNumber(String routeNumber) {
		this.routeNumber = routeNumber;
	}

	public String getBg() {
		return bg;
	}

	public void setBg(String bg) {
		this.bg = bg;
	}
	
	
}
