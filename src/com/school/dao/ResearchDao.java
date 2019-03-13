package com.school.dao;



import com.school.entity.Research;

import java.sql.SQLException;

public interface ResearchDao extends BaseDao<String, Research> {
    Research findByNewsAre(int researchAre) throws SQLException;
    public  boolean delById(int id) throws Exception;
}
