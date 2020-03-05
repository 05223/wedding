package com.hwua.service.impl;

import com.hwua.domain.Chapel;
import com.hwua.mapper.ChapelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChapelService implements com.hwua.service.ChapelService {

    @Autowired
    private ChapelMapper chapelMapper;

    @Override
    public List<Chapel> getAllChapel() {
        List<Chapel> chapels = chapelMapper.selectAllChanel();
        return chapels;
    }
}
