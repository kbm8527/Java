package sub3;
/*
 * 날짜 : 2020/05/13
 * 이름 : 김보미
 * 내용 : 인터페이스 실습하기
 */
public class InterfaceTest3 {
	public static void main(String[] args) {
		//인터페이스 역할 : 객체간의 결합도를 낮추는 역할
		Bulb bulb = new Bulb();
		Socket socket = new Cable(bulb);
		
		socket.switchOn();
		socket.switchOff();
	}
}
