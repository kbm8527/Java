package test06;

class Rent {
	public void payment() {
		System.out.println("임대료를 받습니다.");
	}
}

class Landload extends Rent {
	public void getMoney() {
		System.out.println("건물주 입니다.");
		payment();
	}
}

public class JavaTest6 {
	public static void main(String[] args) {
		
		Landload master = new Landload();
		master.getMoney();
	}
}
