package cn.ssm.project.mapper;

import cn.ssm.project.pojo.CProject;
import cn.ssm.project.pojo.CProjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CProjectMapper {
    int countByExample(CProjectExample example);

    int deleteByExample(CProjectExample example);

    int deleteByPrimaryKey(Integer cProjectId);

    int insert(CProject record);

    int insertSelective(CProject record);

    List<CProject> selectByExample(CProjectExample example);

    CProject selectByPrimaryKey(Integer cProjectId);

    int updateByExampleSelective(@Param("record") CProject record, @Param("example") CProjectExample example);

    int updateByExample(@Param("record") CProject record, @Param("example") CProjectExample example);

    int updateByPrimaryKeySelective(CProject record);

    int updateByPrimaryKey(CProject record);
}