package com.hwua.mapper;

import com.hwua.domain.Chapel;
import com.hwua.domain.ChapelOV;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface ChapelMapper {

    @Select("select * from chapel")
    List<Chapel> selectAllChanel();

    @Select("select * from chapel where id=#{id}")
    ChapelOV selectChanelOVByPrimaryKey(int id);
}
