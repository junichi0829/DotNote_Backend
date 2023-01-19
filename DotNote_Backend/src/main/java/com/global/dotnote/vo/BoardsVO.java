package com.global.dotnote.vo;

import java.sql.Timestamp;

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
public class BoardsVO {

	private int board_no;
	private int category_no;
	private String user_id;
	private String board_title;
	private String board_contents;
	private Timestamp board_created;
	private Timestamp board_modified;
	private String board_picture;
	private int board_price;
	
}
