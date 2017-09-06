package cn.ssm.project.service;

import java.sql.Timestamp;

/**
 * Created by Administrator on 2017/9/1 0001.
 */
public interface ImportAmPaymentService {
    String downloadAmazonFinancialEventsByOrg(Timestamp startDate, Timestamp endDate, int orgID);
}
