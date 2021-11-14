package com.fortis.inspection.service;

import com.fortis.inspection.dao.InspectionDao;
import com.fortis.inspection.entity.SysChannelEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InspectionService {

    @Autowired
    private InspectionDao inspectionDao;

    public SysChannelEntity getChannel(Integer sysId){
        SysChannelEntity entity = inspectionDao.getChannel(sysId);
        return entity;
    }

}
