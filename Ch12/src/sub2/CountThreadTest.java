package sub2;
/*
 * 날짜 : 2020/05/19
 * 이름 : 김보미
 * 내용 : 쓰레드 활용 실습하기 교재p576
 */ 
public class CountThreadTest {
	public static void main(String[] args) throws InterruptedException {
		
		Count count = new Count();
		
		CountThread ct1 = new CountThread(count);
		CountThread ct2 = new CountThread(count);
		CountThread ct3 = new CountThread(count);
		
		ct1.start(); //비동기방식으로 실행
		ct2.start(); //병렬실행 ,결괏값 랜덤
		ct3.start();
		
		//메인쓰레드에서 파생된 서브쓰레드의 작업이 완료된 후 다시 메인쓰레드로 합류되는것을 실행
		//start 실행이 다 끝나면 다시 메인실행으로 합류
		ct1.join();  //다른 스레드의 종료를 기다림
		ct2.join(); //ct1,ct2,ct3 start 가 동시에 실행되면서 누락되는 수가발생
		ct3.join(); //하나씩 실행시켜주기외해 실행문에 동기화 필요(Synchronized)
		
		
		//ct1.run(); run-메인쓰레드로 실행
		//ct2.run();
		//ct3.run(); 결과 값 :3000
		
		System.out.println("결과 : "+count.getNum());
	}
}
