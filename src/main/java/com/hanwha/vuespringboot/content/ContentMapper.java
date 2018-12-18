package com.hanwha.vuespringboot.content;

import java.util.List;

import com.hanwha.vuespringboot.content.ContentDao;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface ContentMapper
{
    List<ContentDao> selectContentList();
}