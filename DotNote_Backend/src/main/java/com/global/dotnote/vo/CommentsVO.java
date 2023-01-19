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
public class CommentsVO {
	
	private int comment_no;
	private String user_id;
	private int board_no;
	private String comment_content;
	private Timestamp comment_date;
	private Timestamp comment_modify;
	private int comment_private;
	
}
