package cn.ssm.project.service.impl;

import org.springframework.stereotype.Service;
import cn.ssm.project.service.TestService;

/**
 * Created by Administrator on 2017/9/1 0001.
 */
@Service
public class TestServiceImpl implements TestService {
    @Override
    public String test() {

        return "testImpl1";
    }
}
