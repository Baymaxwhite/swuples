package com.school.service.impl;

import com.school.dao.impl.ResearchDaoImpl;
import com.school.entity.Research;
import com.school.service.ResearchService;
import com.school.tools.Database;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class ResearchServiceImpl implements ResearchService {
    private Database db=new Database();
    @Override
    public boolean insert(Research vo) throws Exception {
        try{
            if (new ResearchDaoImpl(db.getConn()).findById(vo.getContent())==null ){
                return new ResearchDaoImpl(db.getConn()).createData(vo);
            }
            return false;
        } catch(Exception e){
            throw e;
        } finally{
            db.close();
        }
    }

    @Override
    public Map<String, Object> listBySplit(String column, String keyWord, int currentPage, int lineSize) throws Exception {
        Map<String, Object> map = null;
        try{
            map = new HashMap<String, Object>();
            map.put("research",new ResearchDaoImpl(db.getConn()).findBySplit(column, keyWord, currentPage, lineSize));
            map.put("recordSize",new ResearchDaoImpl(db.getConn()).getAllCount(column, keyWord));
        } catch(Exception e){
            throw e;
        } finally{
            this.db.close();
        }
        return map;
    }

    @Override
    public Research getResearchAreContent(int researchAre) {
        Research research=null;
        try {
            research= new ResearchDaoImpl(db.getConn()).findByNewsAre(researchAre);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            this.db.close();
        }
        return research;

    }

    @Override
    public boolean delById(int id) throws Exception {
        if(new ResearchDaoImpl(db.getConn()).delById(id)){
            return true;
        }
        return false;
    }

}
