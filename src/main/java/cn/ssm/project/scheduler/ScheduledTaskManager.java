package cn.ssm.project.scheduler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import cn.ssm.project.service.ImportAmOrderService;
import cn.ssm.project.service.ImportAmPaymentService;

import java.util.Date;

/**
 * Created by Administrator on 2017/9/4 0004.
 */
@Component
//@PropertySource("classpath:properties/quartz.properties")
public class ScheduledTaskManager {
    @Autowired
    private ImportAmOrderService importAmOrderService;
    @Autowired
    private ImportAmPaymentService importAmPaymentService;

    /**
     * cron表达式：* * * * * *（共6位，使用空格隔开，具体如下）
     * cron表达式：*(秒0-59) *(分钟0-59) *(小时0-23) *(日期1-31) *(月份1-12或是JAN-DEC) *(星期1-7或是SUN-SAT)
     */

    /*
    * 每天凌晨2点执行
    * */
//    @Scheduled(cron = "0/5 * * * * ?")
    @Scheduled(cron = "0 0 2 * * ?")
    public void downloadAmazonOrderByOrg() {
        System.out.println("ScheduledTaskManager----------downloadAmazonOrderByOrg-----------------" + new Date());
//        importAmOrderService.downloadAmazonOrderByOrg(null,null,0);
    }

    /*
    * 每天凌晨4点执行
    * */
//    @Scheduled(cron = "0/5 * * * * ?")
    @Scheduled(cron = "0 0 4 * * ?")
    public void downloadAmazonFinancialEventsByOrg() {
        System.out.println("ScheduledTaskManager----------downloadAmazonFinancialEventsByOrg-----------------" + new Date());
        //importAmPaymentService.downloadAmazonFinancialEventsByOrg(null,null,0);
    }
}
