package com.qf.manage.mapper;
import com.qf.manage.entity.Dispensary;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface DispensaryMapper {
    Dispensary selectInfusion(@Param("nurseId")Integer nurseId);

    Dispensary selectOral(@Param("nurseId") Integer nurseId);

    Dispensary selectInject(@Param("nurseId") Integer nurseId);
}