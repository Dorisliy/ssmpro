package cn.ssm.project.service.impl;

import cn.ssm.project.mapper.ToFbafeeRuleMapper;
import cn.ssm.project.pojo.ToFbafeeRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.ssm.project.service.TestService;

/**
 * Created by Administrator on 2017/9/1 0001.
 */
@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private ToFbafeeRuleMapper toFbafeeRuleMapper;


    @Override
    public String test() {

        return "testImpl1";
    }

    @Override
    public ToFbafeeRule testto() {
        ToFbafeeRule toFbafeeRule = toFbafeeRuleMapper.selectByPrimaryKey(2);
        return toFbafeeRule;
    }

}
