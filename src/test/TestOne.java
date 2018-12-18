package test;

interface One{
	static int x=11;
}

interface Two{
	final int x=22;
}

class Three{
	public int x=33;
}

public class TestOne extends Three implements One,Two{
	
	public void test(){
		System.out.println(One.x);
	}
	
	public static void main(String[] args) {
		new TestOne().test();
	}
}
