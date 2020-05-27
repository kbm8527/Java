package Test10;
/*
 * 날짜 : 2020/05/07
 * 이름 : 김보미
 * 내용 : 자바 자료구조 큐(Queue)연습문제
 */
public class JavaTest10 {
	
	static int QUEUE_SIZE = 10;
	static int queue[] = new int[QUEUE_SIZE];
	static int front = 0, rear = 0;
	
	public static void main(String[] args) {
		
		insert(100);
		insert(200);
		insert(300);
		
		System.out.println(delete());
		System.out.println(delete());
		System.out.println(delete());
		System.out.println(delete());
	}
	public static void insert(int data) {
		if(rear == QUEUE_SIZE) {
			System.out.println("더 이상 데이터를 저장 할 수 없습니다.");
		}
		queue[rear++] = data;
	}
	public static int delete() {
		if(front == QUEUE_SIZE) {
			System.out.println("데이터가 없습니다.");
			return 0;
		}
		return queue[front++];
	}
}
