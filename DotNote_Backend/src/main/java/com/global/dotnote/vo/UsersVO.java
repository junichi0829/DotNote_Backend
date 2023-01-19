package com.global.dotnote.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UsersVO {

	private String user_id;
	private String user_password;
	private String user_sex;
	private String user_birth;
	private String user_name;
	private String user_nickname;
	
}
