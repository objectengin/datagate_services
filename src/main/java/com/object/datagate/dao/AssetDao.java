package com.object.datagate.dao;

import java.util.List;

import com.object.datagate.model.Asset;
/**
 * interface Asset 
 * @author bouchentouf_n
 *
 */
public interface AssetDao {

	List<Asset> findAll();

}
