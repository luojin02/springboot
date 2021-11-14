package com.fortis.inspection.dao;

import com.fortis.inspection.entity.SysChannelEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface InspectionDao {

    SysChannelEntity getChannel(@Param("sysId")Integer sysId);

}
