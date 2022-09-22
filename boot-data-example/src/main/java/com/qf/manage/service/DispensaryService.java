package com.qf.manage.service;


import com.qf.manage.entity.Dispensary;

import java.util.List;

public interface DispensaryService {
    List<Dispensary> selectDispensary(Integer nurseId);
}
