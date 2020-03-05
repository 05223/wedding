package com.hwua.service.impl;

import com.hwua.domain.ChapelOV;
import com.hwua.mapper.ChapelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MyChapelOVService implements com.hwua.service.MyChapelOVService {

    @Autowired
    private ChapelMapper chapelMapper;


    @Override
    public ChapelOV getChapelOVByPrimaryKey(int id) {
        ChapelOV chapelOV = chapelMapper.selectChanelOVByPrimaryKey(id);
        return chapelOV;
    }
}
