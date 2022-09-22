package com.qf.manage.service.Impl;
import com.qf.manage.entity.Dispensary;
import com.qf.manage.mapper.DispensaryMapper;
import com.qf.manage.service.DispensaryService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class DispensaryServiceImpl implements DispensaryService {
    @Resource
    private DispensaryMapper dispensaryMapper;
    @Override
    public List<Dispensary> selectDispensary(Integer nurseId) {
        ArrayList<Dispensary> list = new ArrayList<>();
        Dispensary dispensaries1 = dispensaryMapper.selectInfusion(nurseId);
        Dispensary dispensaries2 = dispensaryMapper.selectOral(nurseId);
        Dispensary dispensaries3 = dispensaryMapper.selectInject(nurseId);
        list.add(dispensaries1);
        list.add(dispensaries2);
        list.add(dispensaries3);
        return list;
    }
}
