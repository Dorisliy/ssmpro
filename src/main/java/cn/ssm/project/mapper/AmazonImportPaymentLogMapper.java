package cn.ssm.project.mapper;

import cn.ssm.project.pojo.AmazonImportPaymentLog;
import cn.ssm.project.pojo.AmazonImportPaymentLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AmazonImportPaymentLogMapper {
    int countByExample(AmazonImportPaymentLogExample example);

    int deleteByExample(AmazonImportPaymentLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AmazonImportPaymentLog record);

    int insertSelective(AmazonImportPaymentLog record);

    List<AmazonImportPaymentLog> selectByExample(AmazonImportPaymentLogExample example);

    AmazonImportPaymentLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AmazonImportPaymentLog record, @Param("example") AmazonImportPaymentLogExample example);

    int updateByExample(@Param("record") AmazonImportPaymentLog record, @Param("example") AmazonImportPaymentLogExample example);

    int updateByPrimaryKeySelective(AmazonImportPaymentLog record);

    int updateByPrimaryKey(AmazonImportPaymentLog record);
}