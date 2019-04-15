package com.itheima.dao;

import com.itheima.domin.item;
import org.apache.ibatis.annotations.Select;

public interface itemInt {
    @Select("select * from items where id = #{id}")
    item find(int id);
}
