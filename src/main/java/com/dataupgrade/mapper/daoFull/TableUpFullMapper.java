package com.dataupgrade.mapper.daoFull;

import org.apache.ibatis.annotations.Param;

public interface TableUpFullMapper {
    void  insertTable(@Param(value = "sql") String sql);
}
