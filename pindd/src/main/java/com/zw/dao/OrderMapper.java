package com.zw.dao;

import com.zw.domain.Order;
import com.zw.domain.OrderExample;
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

public interface OrderMapper {
    @Delete({
        "delete from pdd_order",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into pdd_order (orderNumber, spec, ",
        "nickname, name, ",
        "number, goodsAmount, ",
        "goodPrice, commission, ",
        "poundage, wlPrice, ",
        "isSd, favoriteStatus, ",
        "sc_status, payTime, ",
        "scTime)",
        "values (#{ordernumber,jdbcType=VARCHAR}, #{spec,jdbcType=VARCHAR}, ",
        "#{nickname,jdbcType=VARCHAR}, #{name,jdbcType=VARCHAR}, ",
        "#{number,jdbcType=INTEGER}, #{goodsamount,jdbcType=INTEGER}, ",
        "#{goodprice,jdbcType=INTEGER}, #{commission,jdbcType=INTEGER}, ",
        "#{poundage,jdbcType=INTEGER}, #{wlprice,jdbcType=INTEGER}, ",
        "#{issd,jdbcType=INTEGER}, #{favoritestatus,jdbcType=INTEGER}, ",
        "#{scStatus,jdbcType=INTEGER}, #{paytime,jdbcType=BIGINT}, ",
        "#{sctime,jdbcType=BIGINT})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(Order record);

    @InsertProvider(type=OrderSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insertSelective(Order record);

    @SelectProvider(type=OrderSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="orderNumber", property="ordernumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="spec", property="spec", jdbcType=JdbcType.VARCHAR),
        @Result(column="nickname", property="nickname", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="number", property="number", jdbcType=JdbcType.INTEGER),
        @Result(column="goodsAmount", property="goodsamount", jdbcType=JdbcType.INTEGER),
        @Result(column="goodPrice", property="goodprice", jdbcType=JdbcType.INTEGER),
        @Result(column="commission", property="commission", jdbcType=JdbcType.INTEGER),
        @Result(column="poundage", property="poundage", jdbcType=JdbcType.INTEGER),
        @Result(column="wlPrice", property="wlprice", jdbcType=JdbcType.INTEGER),
        @Result(column="isSd", property="issd", jdbcType=JdbcType.INTEGER),
        @Result(column="favoriteStatus", property="favoritestatus", jdbcType=JdbcType.INTEGER),
        @Result(column="sc_status", property="scStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="payTime", property="paytime", jdbcType=JdbcType.BIGINT),
        @Result(column="scTime", property="sctime", jdbcType=JdbcType.BIGINT)
    })
    List<Order> selectByExample(OrderExample example);

    @Select({
        "select",
        "id, orderNumber, spec, nickname, name, number, goodsAmount, goodPrice, commission, ",
        "poundage, wlPrice, isSd, favoriteStatus, sc_status, payTime, scTime",
        "from pdd_order",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="orderNumber", property="ordernumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="spec", property="spec", jdbcType=JdbcType.VARCHAR),
        @Result(column="nickname", property="nickname", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="number", property="number", jdbcType=JdbcType.INTEGER),
        @Result(column="goodsAmount", property="goodsamount", jdbcType=JdbcType.INTEGER),
        @Result(column="goodPrice", property="goodprice", jdbcType=JdbcType.INTEGER),
        @Result(column="commission", property="commission", jdbcType=JdbcType.INTEGER),
        @Result(column="poundage", property="poundage", jdbcType=JdbcType.INTEGER),
        @Result(column="wlPrice", property="wlprice", jdbcType=JdbcType.INTEGER),
        @Result(column="isSd", property="issd", jdbcType=JdbcType.INTEGER),
        @Result(column="favoriteStatus", property="favoritestatus", jdbcType=JdbcType.INTEGER),
        @Result(column="sc_status", property="scStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="payTime", property="paytime", jdbcType=JdbcType.BIGINT),
        @Result(column="scTime", property="sctime", jdbcType=JdbcType.BIGINT)
    })
    Order selectByPrimaryKey(Integer id);

    @UpdateProvider(type=OrderSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Order record, @Param("example") OrderExample example);

    @UpdateProvider(type=OrderSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Order record, @Param("example") OrderExample example);

    @UpdateProvider(type=OrderSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Order record);

    @Update({
        "update pdd_order",
        "set orderNumber = #{ordernumber,jdbcType=VARCHAR},",
          "spec = #{spec,jdbcType=VARCHAR},",
          "nickname = #{nickname,jdbcType=VARCHAR},",
          "name = #{name,jdbcType=VARCHAR},",
          "number = #{number,jdbcType=INTEGER},",
          "goodsAmount = #{goodsamount,jdbcType=INTEGER},",
          "goodPrice = #{goodprice,jdbcType=INTEGER},",
          "commission = #{commission,jdbcType=INTEGER},",
          "poundage = #{poundage,jdbcType=INTEGER},",
          "wlPrice = #{wlprice,jdbcType=INTEGER},",
          "isSd = #{issd,jdbcType=INTEGER},",
          "favoriteStatus = #{favoritestatus,jdbcType=INTEGER},",
          "sc_status = #{scStatus,jdbcType=INTEGER},",
          "payTime = #{paytime,jdbcType=BIGINT},",
          "scTime = #{sctime,jdbcType=BIGINT}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Order record);
}