package com.sky.mapper;

import com.sky.entity.ShoppingCart;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface ShoppingCartMapper {

    List<ShoppingCart> list(ShoppingCart shoppingCart);

    @Update("update shopping_cart set number = #{number} where id = #{id}")
    void updateNumberById(ShoppingCart shoppingCart);

    @Insert("insert into shopping_cart(name, user_id, setmeal_id, dish_flavor, number, amount, imgae, create_time)" +
            "values (#{name}, #{userId}, #{setmealId}, #{dishFlavor}, #{number}, #{amount}, #{imgae}, #{createTime}) ")
    void insert(ShoppingCart shoppingCart);
}
