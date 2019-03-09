package com.school.dao;

import com.school.entity.News;

import java.sql.SQLException;

public interface NewsDao extends BaseDao<String, News> {
    News findByNewsAre(int newsAre) throws SQLException;

}
