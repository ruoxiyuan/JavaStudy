package com.silly.people;

public class Person {
	String name = "���";
	public static int age = 22;

	public Object getHeart(){
		//�����ڲ��ࣺ����ʹ���κη������η�������ʹ��static����
		class Heart {
			String name = "СС";
			//���Ա����ʹ�÷������η���������ʹ��static����
			public final int age = 12;
			
			public String beat(){
				new Person().eat();
				return name + Person.age + "������������";
			}
		}
		return new Heart().beat();
	}
	public void eat(){
		System.out.println("�˻�Զ���");
	}
	
	
	
	/*public static class Heart {
		String name = "СС";
		public static int age = 12;
		public String beat(){
			//2.��̬�ڲ����У�ֻ��ֱ�ӷ����ⲿ��ľ�̬��Ա�������Ҫ���÷Ǿ�̬��Ա������ͨ������ʵ��
			//ֱ�ӷ���eat()�ᱨ��
			new Person().eat();
			//��Ա��������ֱ�ӷ����ڲ����еķǾ�̬��Ա�;�̬��Ա
			String str = name + age + "�������������";
			//4.�����ⲿ���еķǾ�̬��Ա��ͬ����̬��Ա
			return new Person().name + Person.age + "������������";
		}
	}*/
	
	
	
	
	
	
/*	//2.�������η��������⣬����Ϊprivate��ֻ���ڴ��ⲿ���д���ʵ��
	 class Heart {
		String name = "СС";
		public String beat(){
			//3.ͬ�������������ȷ��ʵ����ڲ����е�name
			String str = name + "������������";
			//4.�����ⲿ���е�ͬ������
			str = Person.this.name + "������������";
			//�����ⲿ���е�ͬ������
			Person.this.eat();
			return str;
		}
		//ͬ������
		public void eat(){
			System.out.println("�Զ���");
		}
	}*/
	
}
