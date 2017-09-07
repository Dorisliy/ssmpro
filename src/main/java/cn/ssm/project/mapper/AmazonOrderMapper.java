package cn.ssm.project.mapper;

import cn.ssm.project.pojo.AmazonOrder;
import cn.ssm.project.pojo.AmazonOrderExample;
import cn.ssm.project.pojo.AmazonOrderWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AmazonOrderMapper {
    int countByExample(AmazonOrderExample example);

    int deleteByExample(AmazonOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AmazonOrderWithBLOBs record);

    int insertSelective(AmazonOrderWithBLOBs record);

    List<AmazonOrderWithBLOBs> selectByExampleWithBLOBs(AmazonOrderExample example);

    List<AmazonOrder> selectByExample(AmazonOrderExample example);

    AmazonOrderWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AmazonOrderWithBLOBs record, @Param("example") AmazonOrderExample example);

    int updateByExampleWithBLOBs(@Param("record") AmazonOrderWithBLOBs record, @Param("example") AmazonOrderExample example);

    int updateByExample(@Param("record") AmazonOrder record, @Param("example") AmazonOrderExample example);

    int updateByPrimaryKeySelective(AmazonOrderWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(AmazonOrderWithBLOBs record);

    int updateByPrimaryKey(AmazonOrder record);
}