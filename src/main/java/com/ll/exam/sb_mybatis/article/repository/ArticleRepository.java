package com.ll.exam.sb_mybatis.article.repository;

import com.ll.exam.sb_mybatis.article.dto.Article;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ArticleRepository {

    @Select("""
            <script>
            SELECT *
            FROM article
            </script>
            """)
    List<Article> getArticles();

    @Insert("""
            <script>
            INSERT INTO article
            SET createDate = NOW(),
            modifyDate = NOW(),
            subject = #{subject},
            content = #{content}
            </script>
            """)
    void write(String subject, String content);
}
