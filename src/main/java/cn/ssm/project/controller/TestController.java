package cn.ssm.project.controller;

import cn.ssm.project.bean.BaseJsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import cn.ssm.project.service.ImportAmOrderService;
import cn.ssm.project.service.ImportAmPaymentService;
import cn.ssm.project.service.TestService;

/**
 * Created by Administrator on 2017/9/1 0001.
 */
@Controller
@RequestMapping("test")
public class TestController {
    @Autowired
    private TestService testService;

    @Autowired
    private ImportAmOrderService importAmOrderService;

    @Autowired
    private ImportAmPaymentService importAmPaymentService;

    @RequestMapping("/downloadAmazonOrderByOrg")
    @ResponseBody
    public BaseJsonResult downloadAmazonOrderByOrg() {
        String s = null;
        s = testService.test();
        //s = importAmOrderService.downloadAmazonOrderByOrg(null,null,0);
        return BaseJsonResult.ok(s);
    }

    @RequestMapping("/downloadAmazonFinancialEventsByOrg")
    @ResponseBody
    public BaseJsonResult downloadAmazonFinancialEventsByOrg() {
        String s = null;
//        s = testService.test();
        s = importAmPaymentService.downloadAmazonFinancialEventsByOrg(null,null,0);
        return BaseJsonResult.ok(s);
    }
}
