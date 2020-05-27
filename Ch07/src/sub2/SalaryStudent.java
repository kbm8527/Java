package sub2;

public class SalaryStudent extends Student {

	private String company;

	public SalaryStudent(String name, int age, String school, String major, String company) {
		super(name, age, school, major);
		this.company = company;
	}
	
	public void hello() {
		super.hello();
		System.out.println(company+"회사에 다닙니다.");
	}
}
