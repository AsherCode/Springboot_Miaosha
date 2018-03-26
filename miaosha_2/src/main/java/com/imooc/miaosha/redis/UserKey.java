package com.imooc.miaosha.redis;

public class          UserKey extends BasePrefix{

	private UserKey(String prefix) {
		super(prefix);
		System.out.println(213);
	}
	public static UserKey getById = new UserKey("id");
	public static UserKey getByName = new UserKey("name");
}
