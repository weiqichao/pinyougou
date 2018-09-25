package com.pinyougou.manager.dao;

import com.pinyougou.manager.pojo.TbBrand;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ManagerMapper {

    /**
     * 查询全部
     * @return
     */
    @Select("select id,name,first_char from tb_brand")
    List<TbBrand> findAll();


}
