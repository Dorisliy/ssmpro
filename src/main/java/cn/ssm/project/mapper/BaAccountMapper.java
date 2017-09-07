package cn.ssm.project.mapper;

import cn.ssm.project.pojo.BaAccount;
import cn.ssm.project.pojo.BaAccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaAccountMapper {
    int countByExample(BaAccountExample example);

    int deleteByExample(BaAccountExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BaAccount record);

    int insertSelective(BaAccount record);

    List<BaAccount> selectByExample(BaAccountExample example);

    BaAccount selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BaAccount record, @Param("example") BaAccountExample example);

    int updateByExample(@Param("record") BaAccount record, @Param("example") BaAccountExample example);

    int updateByPrimaryKeySelective(BaAccount record);

    int updateByPrimaryKey(BaAccount record);
}