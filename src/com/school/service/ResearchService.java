package com.school.service;

import com.school.entity.Research;

import java.util.Map;

public interface ResearchService {
    boolean insert(Research vo) throws Exception;

    public Map<String, Object> listBySplit(String column, String keyWord, int currentPage, int lineSize) throws Exception;

    Research getResearchAreContent(int researchAre);

    boolean delById(int id) throws Exception;
}
