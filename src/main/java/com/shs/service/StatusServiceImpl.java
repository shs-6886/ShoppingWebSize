package com.shs.service;


import com.shs.dao.StatusDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author shs
 * @create 2019-11-21-17:19
 */
@Service
public class StatusServiceImpl {
    @Resource
    private StatusDao sd;

    public List<Status> selectAll() {
        return sd.selectAll();
    }

    public Status selectOne(int status_id) {
        return sd.selectOne(status_id);
    }

    public int insert(Status status) {
        return sd.insert(status);
    }

    public int update(Status status) {
        return sd.update(status);
    }

    public int delete(int status_id) {
        return sd.delete(status_id);
    }

}
