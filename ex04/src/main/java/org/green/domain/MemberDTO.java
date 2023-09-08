package org.green.domain;

import java.util.Date;

import lombok.Data;

@Data
public class MemberDTO {
	private int mno;
	private String name;
	private String id;
	private String pass;
	private String address;
	private String phone;
	private String day;
}
