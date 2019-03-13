package com.school.service.impl;


import com.school.dao.impl.AdminDaoImpl;
import com.school.dao.impl.NewsDaoImpl;
import com.school.entity.News;
import com.school.service.NewsService;
import com.school.tools.Database;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NewsServiceImpl implements NewsService {
    private Database db=new Database();
    /**
     * 实现增加操作
     *
     * @param vo
     * @return
     * @throws Exception
     */
    @Override
    public boolean insert(News vo) throws Exception {
        try{
            if (new NewsDaoImpl(db.getConn()).findById(vo.getContent())==null ){
                return new NewsDaoImpl(db.getConn()).createData(vo);
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
            map.put("news",new NewsDaoImpl(db.getConn()).findBySplit(column, keyWord, currentPage, lineSize));
            map.put("recordSize",new NewsDaoImpl(db.getConn()).getAllCount(column, keyWord));
        } catch(Exception e){
            throw e;
        } finally{
            this.db.close();
        }
        return map;
    }

    @Override
    public News getNewsAreContent(int newsAre) {
        News news=null;
        try {
            news= new NewsDaoImpl(db.getConn()).findByNewsAre(newsAre);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            this.db.close();
        }
        return news;

    }

    @Override
    public News getNewsTitleContent(String newsTitle) {
        News news=null;
        try {
            news= new NewsDaoImpl(db.getConn()).findByNewsTitle(newsTitle);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            this.db.close();
        }
        return news;
    }

    @Override
    public boolean delById(int id) throws Exception {
        if(new NewsDaoImpl(db.getConn()).delById(id)){
            return true;
        }
        return false;
    }


}
