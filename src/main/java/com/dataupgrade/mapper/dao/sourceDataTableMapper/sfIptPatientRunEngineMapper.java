package com.dataupgrade.mapper.dao.sourceDataTableMapper;

import com.dataupgrade.bean.sourceDataTable.sfIptPatientRunEngine;

public interface sfIptPatientRunEngineMapper {
    int deleteByPrimaryKey(Long id);

    int insert(sfIptPatientRunEngine record);

    int insertSelective(sfIptPatientRunEngine record);

    sfIptPatientRunEngine selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(sfIptPatientRunEngine record);

    int updateByPrimaryKey(sfIptPatientRunEngine record);
}