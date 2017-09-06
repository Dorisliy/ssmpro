package cn.ssm.project.mapper;

import org.apache.ibatis.annotations.Param;
import cn.ssm.project.pojo.AmazonImportOrderLog;
import cn.ssm.project.pojo.AmazonImportOrderLogExample;

import java.util.List;

public interface AmazonImportOrderLogMapper {
    int countByExample(AmazonImportOrderLogExample example);

    int deleteByExample(AmazonImportOrderLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AmazonImportOrderLog record);

    int insertSelective(AmazonImportOrderLog record);

    List<AmazonImportOrderLog> selectByExample(AmazonImportOrderLogExample example);

    AmazonImportOrderLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AmazonImportOrderLog record, @Param("example") AmazonImportOrderLogExample example);

    int updateByExample(@Param("record") AmazonImportOrderLog record, @Param("example") AmazonImportOrderLogExample example);

    int updateByPrimaryKeySelective(AmazonImportOrderLog record);

    int updateByPrimaryKey(AmazonImportOrderLog record);
}