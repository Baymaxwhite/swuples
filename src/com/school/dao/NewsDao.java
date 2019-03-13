package com.school.dao;

import com.school.entity.News;

import java.sql.SQLException;
import java.util.List;

public interface NewsDao extends BaseDao<String, News> {
    News findByNewsAre(int newsAre) throws SQLException;
    News findByNewsTitle(String newsTitle) throws SQLException;
}
