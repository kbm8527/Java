package test02;

public class NotFoundException extends Exception {

	public NotFoundException() {
		super("해당하는 숫자를 찾을 수 없습니다.");
	}
}
