package com.object.datagate.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.object.datagate.dao.AssetDao;
import com.object.datagate.model.Asset;

@Repository("assetDao")
public class AssetDaoImpl extends JdbcDaoSupport implements AssetDao {

    @Autowired
    protected DataSource dataSource;

    @Override
    public List<Asset> findAll() {
    	 String sql = "Select d.* from Asset d ";
    	 
         // queryForList(String sql, Class<T> elementType)
         List<Asset> list = this.getJdbcTemplate().queryForList(sql, Asset.class);
  
         return list;
    }
}

