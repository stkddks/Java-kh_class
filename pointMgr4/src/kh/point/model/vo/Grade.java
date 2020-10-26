package kh.point.model.vo;

public abstract class Grade {
	private String name;
	private String grade;
	private int point;
	public Grade() {	//Alt+Shift+s -> c
		super();
		// TODO Auto-generated constructor stub
	}
	public Grade(String name, String grade, int point) { // alt+shift+s -> o
		super();
		this.name = name;
		this.grade = grade;
		this.point = point;
	}
	//getter/setter  alt+shift+s -> r
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public abstract double getBonus();
	@Override
	public String toString() {
		return getName()+"\t"+getGrade()+"\t"+getPoint()+"\t"+getBonus();
	}
}
