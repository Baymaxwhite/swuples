package com.school.dao.impl;

import com.school.dao.ResearchDao;
import com.school.entity.Research;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

public class ResearchDaoImpl extends BaseDaoImpl implements ResearchDao {
    public ResearchDaoImpl(Connection conn) {
        super(conn);
    }

    @Override
    public Research findByNewsAre(int researchAre) throws SQLException {
        Research research=new Research();
        String sql="select * from research where researchArea=?";
        ResultSet rst=super.executeQuery(sql,researchAre);
        if(rst.next()){
            research.setResearchId(rst.getInt(1));
            research.setContent(rst.getString(2));
            research.setAuthor(rst.getString(3));
            research.setPublishdate(rst.getDate(4));
            research.setIsBackground(rst.getShort(5));
            research.setResearchImage(rst.getString(6));
            research.setResearchTitle(rst.getString(7));
            research.setResearchArea(rst.getInt(8));
            research.setResearchType(rst.getString(9));
        }
        return research;
    }

    @Override
    public boolean delById(int id) throws Exception {
        String sql ="delete from research where researchId=?";
        int rel=super.executeUpdate(sql,id);
        return rel>0;
    }

    /**
     * 实现数据增加操作
     *
     * @param vo 表示要执行操作的对象
     * @return 成功返回 true，失败返回 false
     * @throws SQLException
     */
    @Override
    public boolean createData(Research vo) throws SQLException {
        String sql = "insert into research (content,author,publishdate,isBackground,researchImage,researchTitle,researchArea,researchType) values(?,?,?,?,?,?,?,?)";
        int rel=super.executeUpdate(sql,vo.getContent(),vo.getAuthor(),new Timestamp(new Date().getTime()),vo.getIsBackground(),vo.getResearchImage(),vo.getResearchTitle(),vo.getResearchArea(),vo.getResearchType());
        return rel > 0;
    }

    /**
     * 实现数据更新操作
     *
     * @param vo 表示要执行更新的对象
     * @return 成功返回 true，失败返回 false
     * @throws SQLException
     */
    @Override
    public boolean updateData(Research vo) throws SQLException {
        return false;
    }

    /**
     * 实现数据批量删除
     *
     * @param ids 表示要执行删除的数据集合
     * @return 成功返回 true，失败返回 false
     * @throws SQLException
     */
    @Override
    public boolean removeData(Set<?> ids) throws SQLException {
        return false;
    }

    /**
     * 根据用户提供的id执行查询
     *
     * @param id 表示要查询的id
     * @return 查询成功返回该数据行的记录，失败返回null
     * @throws SQLException
     */
    @Override
    public Research findById(String id) throws SQLException {
        Research vo = null;
        String sql = "select researchId,content,author,publishdate,isBackground,researchImage,researchTitle,researchArea,researchType from research where researchTitle=?";
        ResultSet rs = super.executeQuery(sql,id);
        if(rs.next()){
            vo = new Research();
            vo.setResearchId(rs.getInt(1));
            vo.setContent(rs.getString(2));
            vo.setAuthor(rs.getString(3));
            vo.setPublishdate(rs.getDate(4));
            vo.setIsBackground(rs.getShort(5));
            vo.setResearchImage(rs.getString(6));
            vo.setResearchTitle(rs.getString(7));
            vo.setResearchArea(rs.getInt(8));
            vo.setResearchType(rs.getString(9));
        }
        return vo;
    }

    /**
     * 实现数据全部查询
     *
     * @return 成功返回全部数据，失败返回null
     * @throws SQLException
     */
    @Override
    public List<Research> findAll() throws SQLException {
        return null;
    }

    /**
     * 实现数据分页操作
     *
     * @param column      表示要执行查询的列
     * @param keyWord     表示查询关键字
     * @param currentPage 表示当前页
     * @param lineSize    表示每页显示记录数
     * @return 查询成功返回满足条件的数据，失败返回null
     * @throws SQLException
     */
    @Override
    public List<Research> findBySplit(String column, String keyWord, Integer currentPage, Integer lineSize) throws SQLException {
        List<Research> research=new ArrayList<Research>();
        String sql= "select * from research where "+column+" like ?"
                + " order by researchId limit ?,?";
        ResultSet rst=super.executeQuery(sql, "%" + keyWord + "%", (currentPage - 1)*lineSize,lineSize);
        while (rst.next()){
            Research researchs=new Research();
            researchs.setResearchId(rst.getInt(1));
            researchs.setContent(rst.getString(2));
            researchs.setAuthor(rst.getString(3));
            researchs.setPublishdate(rst.getDate(4));
            researchs.setIsBackground(rst.getShort(5));
            researchs.setResearchImage(rst.getString(6));
            researchs.setResearchTitle(rst.getString(7));
            researchs.setResearchArea(rst.getInt(8));
            researchs.setResearchType(rst.getString(9));
            research.add(researchs);
        }
        return research;
    }

    /**
     * 实现数据量统计操作
     *
     * @param column  表示要查询的列
     * @param keyWord 表示查询关键字
     * @return 成功返回数据量，失败返回0
     * @throws SQLException
     */
    @Override
    public Integer getAllCount(String column, String keyWord) throws SQLException {
        String sql = "select count(researchType) num from research where ? like ?";
        ResultSet rst=super.executeQuery(sql, column,"%" + keyWord + "%");
        if(rst.next()){
            return rst.getInt("num");
        }
        return 0;
    }
}
