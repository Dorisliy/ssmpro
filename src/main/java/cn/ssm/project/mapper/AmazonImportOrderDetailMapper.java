package cn.ssm.project.mapper;

import cn.ssm.project.pojo.AmazonImportOrderDetail;
import cn.ssm.project.pojo.AmazonImportOrderDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AmazonImportOrderDetailMapper {
    int countByExample(AmazonImportOrderDetailExample example);

    int deleteByExample(AmazonImportOrderDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AmazonImportOrderDetail record);

    int insertSelective(AmazonImportOrderDetail record);

    List<AmazonImportOrderDetail> selectByExample(AmazonImportOrderDetailExample example);

    AmazonImportOrderDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AmazonImportOrderDetail record, @Param("example") AmazonImportOrderDetailExample example);

    int updateByExample(@Param("record") AmazonImportOrderDetail record, @Param("example") AmazonImportOrderDetailExample example);

    int updateByPrimaryKeySelective(AmazonImportOrderDetail record);

    int updateByPrimaryKey(AmazonImportOrderDetail record);
}