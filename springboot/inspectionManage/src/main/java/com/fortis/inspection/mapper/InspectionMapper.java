package com.fortis.inspection.mapper;

import com.fortis.inspection.entity.SysChannelEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface InspectionMapper {

    SysChannelEntity getChannel(@Param("sysId")Integer sysId);

}
