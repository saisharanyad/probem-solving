package upgrad.oop;

public class Report extends Student {

	private String percentage;
	private String passResult;
	
	public Report(String name,String admNo,String grade,String percentage,String passResult){
		super(name,admNo,grade);
		this.percentage = percentage;
		this.passResult = passResult;
	}

	public String getPercentage() {
		return percentage;
	}

	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}

	public String getPassResult() {
		return passResult;
	}

	public void setPassResult(String passResult) {
		this.passResult = passResult;
	}
	
	
	
}
