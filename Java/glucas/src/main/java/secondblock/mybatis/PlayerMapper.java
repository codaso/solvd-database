package com.lucas.solvd.secondblock.mybatis;

import com.lucas.solvd.secondblock.models.Player;
import org.apache.ibatis.annotations.Select;

public interface PlayerMapper {
    @Select("SELECT * FROM Player WHERE id = #{id}")
    Player selectPlayer(int id);
}
