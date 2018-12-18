package com.silly.tel;

public interface IFather {
	void say();
	default void connection(){
		System.out.println("IFatherÖÐµÄconnection");
	}
}
