package com.ll.exam.sb_mybatis.app.article.dto;

import lombok.Data;

@Data
public class Article {
    private long id;
    private String subject;
    private String content;
    private long member_id;
}
