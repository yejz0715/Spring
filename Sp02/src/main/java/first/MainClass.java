package first;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("스프링 프레임워크 응용 소프트웨어 프로젝트입니다.");
	
		//객체부모-객체변수에 자식인스턴스 저장
        Calculator c =new CalSum();
        int result = c.cal(45, 78);
        System.out.println("45+78=> " +result);
        
        c =new CalSub();
        result = c.cal(45, 78);
        System.out.println("45-78=> " +result);
        
        c =new CalMul();
        result = c.cal(45, 78);
        System.out.println("45*78=> " +result);
        
        
	}

}
