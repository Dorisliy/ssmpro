package cn.ssm.project.mapper;

import org.apache.ibatis.annotations.Param;
import cn.ssm.project.pojo.MProduct;
import cn.ssm.project.pojo.MProductExample;
import cn.ssm.project.pojo.MProductWithBLOBs;

import java.util.List;

public interface MProductMapper {
    int countByExample(MProductExample example);

    int deleteByExample(MProductExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MProductWithBLOBs record);

    int insertSelective(MProductWithBLOBs record);

    List<MProductWithBLOBs> selectByExampleWithBLOBs(MProductExample example);

    List<MProduct> selectByExample(MProductExample example);

    MProductWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MProductWithBLOBs record, @Param("example") MProductExample example);

    int updateByExampleWithBLOBs(@Param("record") MProductWithBLOBs record, @Param("example") MProductExample example);

    int updateByExample(@Param("record") MProduct record, @Param("example") MProductExample example);

    int updateByPrimaryKeySelective(MProductWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(MProductWithBLOBs record);

    int updateByPrimaryKey(MProduct record);
}