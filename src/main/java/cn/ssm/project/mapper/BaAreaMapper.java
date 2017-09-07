package cn.ssm.project.mapper;

import cn.ssm.project.pojo.BaArea;
import cn.ssm.project.pojo.BaAreaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaAreaMapper {
    int countByExample(BaAreaExample example);

    int deleteByExample(BaAreaExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BaArea record);

    int insertSelective(BaArea record);

    List<BaArea> selectByExample(BaAreaExample example);

    BaArea selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BaArea record, @Param("example") BaAreaExample example);

    int updateByExample(@Param("record") BaArea record, @Param("example") BaAreaExample example);

    int updateByPrimaryKeySelective(BaArea record);

    int updateByPrimaryKey(BaArea record);
}