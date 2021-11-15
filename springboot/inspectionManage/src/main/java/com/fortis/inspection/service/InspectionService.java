package com.fortis.inspection.service;

import com.fortis.inspection.mapper.InspectionMapper;
import com.fortis.inspection.entity.SysChannelEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InspectionService {

    @Autowired
    private InspectionMapper inspectionMapper;

    public SysChannelEntity getChannel(Integer sysId){
        SysChannelEntity entity = inspectionMapper.getChannel(sysId);
        return entity;
    }

    public String getMassage(){
        return "aaaaaaaaaaaaaaa";
    }
}
