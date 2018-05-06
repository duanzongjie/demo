package com.example.demo.mapper;


import com.example.demo.model.Document;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DocumentMapper {

    @Select("select * from document_info")
    List<Document> getAllDocument();

    @Select("select * from document_info where document_id=#{documentId}")
    Document getDocumentById(@Param("documentId") int documentId);

    @Insert("insert into document_info (document_id,title,file_name,user_id,create_date,remarks) values(#{document_id}," +
            "#{title},#{file_name},#{user_id},to_date(#{create_date},'YYYY/MM/DD HH24:mi:ss'),#{remarks})")
    int addDocument(Document document);

    @Delete("delete from document_info where document_id=#{documentId}")
    int delDocument(@Param("documentId") int documentId);

}
