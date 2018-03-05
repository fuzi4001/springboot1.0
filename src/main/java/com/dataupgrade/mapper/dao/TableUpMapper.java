package com.dataupgrade.mapper.dao;

import org.apache.ibatis.annotations.Param;

public interface TableUpMapper {
    void  insertTable(@Param(value = "sql") String sql);
}
