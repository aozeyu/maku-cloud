package net.maku.maku.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import com.baomidou.mybatisplus.annotation.*;
import java.math.BigDecimal;

/**
 * 球员表
 *
 * @author 姚泽宇 3484766443@qq.com
 * @since 1.0.0 2022-10-30
 */

@Data
@TableName("t_players")
public class TPlayersEntity {
    /**
     * 球员姓名
     */
    private String name;

    /**
     * 球员id
     */
    @TableId
    private Integer id;

    /**
     * 球员年龄
     */
    private Integer age;

    /**
     * 球员薪资
     */
    private BigDecimal salary;

    /**
     * 合同期限
     */
    private Integer contperiod;

    /**
     * 球员头像
     */
    private String image;

    /**
     * 球员状态 0->健康 1->受伤 2->良好
     */
    private String status;

}