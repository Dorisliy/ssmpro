package cn.ssm.project.mapper;

import cn.ssm.project.pojo.AmazonImportConfigure;
import cn.ssm.project.pojo.AmazonImportConfigureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AmazonImportConfigureMapper {
    int countByExample(AmazonImportConfigureExample example);

    int deleteByExample(AmazonImportConfigureExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AmazonImportConfigure record);

    int insertSelective(AmazonImportConfigure record);

    List<AmazonImportConfigure> selectByExampleWithBLOBs(AmazonImportConfigureExample example);

    List<AmazonImportConfigure> selectByExample(AmazonImportConfigureExample example);

    AmazonImportConfigure selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AmazonImportConfigure record, @Param("example") AmazonImportConfigureExample example);

    int updateByExampleWithBLOBs(@Param("record") AmazonImportConfigure record, @Param("example") AmazonImportConfigureExample example);

    int updateByExample(@Param("record") AmazonImportConfigure record, @Param("example") AmazonImportConfigureExample example);

    int updateByPrimaryKeySelective(AmazonImportConfigure record);

    int updateByPrimaryKeyWithBLOBs(AmazonImportConfigure record);

    int updateByPrimaryKey(AmazonImportConfigure record);
}