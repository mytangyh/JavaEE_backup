package lab8;

public class Chinese implements Human {
	private Language lan;

	@Override
	public void speak() {
		// TODO Auto-generated method stub
System.out.println(lan.kind());
	}

	public void setLan(Language lan) {
		this.lan = lan;
	}

}
