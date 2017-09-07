package cn.ssm.project.mapper;

import cn.ssm.project.pojo.AmazonPayment;
import cn.ssm.project.pojo.AmazonPaymentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AmazonPaymentMapper {
    int countByExample(AmazonPaymentExample example);

    int deleteByExample(AmazonPaymentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AmazonPayment record);

    int insertSelective(AmazonPayment record);

    List<AmazonPayment> selectByExample(AmazonPaymentExample example);

    AmazonPayment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AmazonPayment record, @Param("example") AmazonPaymentExample example);

    int updateByExample(@Param("record") AmazonPayment record, @Param("example") AmazonPaymentExample example);

    int updateByPrimaryKeySelective(AmazonPayment record);

    int updateByPrimaryKey(AmazonPayment record);
}