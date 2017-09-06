package cn.ssm.project.service;

import java.sql.Timestamp;

/**
 * Created by Administrator on 2017/8/29 0029.
 */

public interface ImportAmOrderService {
    String downloadAmazonOrderByOrg(Timestamp startDate, Timestamp endDate, int orgID);
}
