package com.tjoeun.shareAreaTest;

//	연산 결과를 출력하는 클래스, 실행 시간이 짧은 스레드
public class PrintThread extends Thread {

//	공유 영역으로 사용할 클래스 객체를 필드로 선언한다.
	ShareArea shareArea;
	
	public PrintThread() {
		
	}
	public PrintThread(ShareArea shareArea) {
		this.shareArea = shareArea;
	}
	
	public ShareArea getShareArea() {
		return shareArea;
	}
	public void setShareArea(ShareArea shareArea) {
		this.shareArea = shareArea;
	}
	
	@Override
	public void run() {
		
//		CalculatorThread에서 계산된 원주율을 출력한다. => 실행 시간이 짧다.
		/*
//		CalculatorThread의 실행이 끝날 때(shareArea.ready에 true가 저장될 때) 까지 대기시킨다.
		System.out.print("헉... 헉... 열심히 계산중...");
		while (!shareArea.ready) {
//			스레드가 너무 빠르게 실행되면 정상적인 처리가 되지 않기 때문에 sleep() 메소드로
//			주기적으로 프로그램을 멈춰야 한다.
			try {
				System.out.print(".");
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		*/
//		위의 주석으로 처리한 부분은 스레드 사이에 불필요한 작업 전환이 이루어진다.
		
//		얼음(wait), 땡(notify, notifyAll)을 이용해서 스레드를 대기시킨다.
//		wait() 메소드로 CalculatorThread의 실행이 끝날 때 까지 대기시킨다.
//		wait() 메소드는 현재 스레드를 다른 쓰레드에서 깨울때까지 일시 정지시킨다.
//		wait() 메소드로 일시 정지된 스레드는 다른 스레드에서 notify(), notifyAll() 메소드를 
//		실행해서 깨울 수 있다.
//		notify() 메소드는 wait() 메소드로 일시 정지된 임의의 스레드를 깨운다.
//		notifyAll() 메소드는 wait() 메소드로 일시 정지된 모든 스레드를 깨운다.
//		wait(), notify(), notifyAll() 메소드는 모두 동기화(synchronized) 블록 내부에 코딩해야 한다.
		
//		동기화 블록
		synchronized (shareArea) {
			try {
				shareArea.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("원주율: " + shareArea.result);
		
	}
	
}


























