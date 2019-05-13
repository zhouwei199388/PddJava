package com.zw.dao;

import com.zw.domain.Finance;
import com.zw.domain.FinanceExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface FinanceMapper {
    @Delete({
        "delete from finance",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into finance (earning, sdPriceTotal, ",
        "commissionTotal, coundageTotal, ",
        "wlPriceTotal, goodsPriceTotal)",
        "values (#{earning,jdbcType=INTEGER}, #{sdpricetotal,jdbcType=INTEGER}, ",
        "#{commissiontotal,jdbcType=INTEGER}, #{coundagetotal,jdbcType=INTEGER}, ",
        "#{wlpricetotal,jdbcType=INTEGER}, #{goodspricetotal,jdbcType=INTEGER})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(Finance record);

    @InsertProvider(type=FinanceSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insertSelective(Finance record);

    @SelectProvider(type=FinanceSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="earning", property="earning", jdbcType=JdbcType.INTEGER),
        @Result(column="sdPriceTotal", property="sdpricetotal", jdbcType=JdbcType.INTEGER),
        @Result(column="commissionTotal", property="commissiontotal", jdbcType=JdbcType.INTEGER),
        @Result(column="coundageTotal", property="coundagetotal", jdbcType=JdbcType.INTEGER),
        @Result(column="wlPriceTotal", property="wlpricetotal", jdbcType=JdbcType.INTEGER),
        @Result(column="goodsPriceTotal", property="goodspricetotal", jdbcType=JdbcType.INTEGER)
    })
    List<Finance> selectByExample(FinanceExample example);

    @Select({
        "select",
        "id, earning, sdPriceTotal, commissionTotal, coundageTotal, wlPriceTotal, goodsPriceTotal",
        "from finance",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="earning", property="earning", jdbcType=JdbcType.INTEGER),
        @Result(column="sdPriceTotal", property="sdpricetotal", jdbcType=JdbcType.INTEGER),
        @Result(column="commissionTotal", property="commissiontotal", jdbcType=JdbcType.INTEGER),
        @Result(column="coundageTotal", property="coundagetotal", jdbcType=JdbcType.INTEGER),
        @Result(column="wlPriceTotal", property="wlpricetotal", jdbcType=JdbcType.INTEGER),
        @Result(column="goodsPriceTotal", property="goodspricetotal", jdbcType=JdbcType.INTEGER)
    })
    Finance selectByPrimaryKey(Integer id);

    @UpdateProvider(type=FinanceSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Finance record, @Param("example") FinanceExample example);

    @UpdateProvider(type=FinanceSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Finance record, @Param("example") FinanceExample example);

    @UpdateProvider(type=FinanceSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Finance record);

    @Update({
        "update finance",
        "set earning = #{earning,jdbcType=INTEGER},",
          "sdPriceTotal = #{sdpricetotal,jdbcType=INTEGER},",
          "commissionTotal = #{commissiontotal,jdbcType=INTEGER},",
          "coundageTotal = #{coundagetotal,jdbcType=INTEGER},",
          "wlPriceTotal = #{wlpricetotal,jdbcType=INTEGER},",
          "goodsPriceTotal = #{goodspricetotal,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Finance record);
}