package cn.ssm.project.mapper;

import org.apache.ibatis.annotations.Param;
import cn.ssm.project.pojo.AmazonImportOrderLog;
import cn.ssm.project.pojo.AmazonOrder;
import cn.ssm.project.pojo.AmazonOrderExample;

import java.util.List;

public interface AmazonOrderMapper {
    int countByExample(AmazonOrderExample example);

    int deleteByExample(AmazonOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AmazonOrder record);

    int insertSelective(AmazonOrder record);

    List<AmazonOrder> selectByExampleWithBLOBs(AmazonOrderExample example);

    List<AmazonOrder> selectByExample(AmazonOrderExample example);

    AmazonOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AmazonOrder record, @Param("example") AmazonOrderExample example);

    int updateByExampleWithBLOBs(@Param("record") AmazonOrder record, @Param("example") AmazonOrderExample example);

    int updateByExample(@Param("record") AmazonOrder record, @Param("example") AmazonOrderExample example);

    int updateByPrimaryKeySelective(AmazonOrder record);

    int updateByPrimaryKeyWithBLOBs(AmazonOrder record);

    int updateByPrimaryKey(AmazonOrder record);

    int updateCOrderIdByAmzonOrderId(AmazonImportOrderLog record);
}