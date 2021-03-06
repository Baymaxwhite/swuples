package com.school.service;

import com.school.entity.News;

import java.util.List;
import java.util.Map;

public interface NewsService {
    /**
     * 实现增加操作
     * @param vo
     * @return
     * @throws Exception
     */
    boolean insert(News vo) throws Exception;

    public Map<String, Object> listBySplit(String column, String keyWord, int currentPage, int lineSize) throws Exception;

    News getNewsAreContent(int newsAre);
    News getNewsTitleContent(String newsTitle);

    boolean delById(int id) throws Exception;
}
