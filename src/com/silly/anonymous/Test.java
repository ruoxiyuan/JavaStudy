package com.silly.anonymous;

public class Test {

	//根据传入的不同的人的类型，调用对应的read方法
	//方案1：利用多态调用对应子类的实现
	public void getRead(Person person){
		person.read();
	}

	public static void main(String[] args) {
		//方案一
		Test test = new Test();
		Man one=new Man();
		Woman two=new Woman();
		test.getRead(one);
		test.getRead(two);	
		//方案二：不定义任何子类，使用匿名内部类完成具体的read方法实现
		test.getRead(new Person(){
			@Override
			public void read() {
				System.out.println("男生喜欢看科幻类书籍");
			}
		});
		test.getRead(new Person(){
			@Override
			public void read() {
				System.out.println("女生喜欢读言情小说");
			}
		});
	}
}
