package net.maku.maku.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import java.io.Serializable;
import net.maku.framework.common.utils.DateUtils;
import java.math.BigDecimal;

/**
 * 球员表
 *
 * @author 姚泽宇 3484766443@qq.com
 * @since 1.0.0 2022-10-30
 */
@Data
@Schema(description = "球员表")
public class TPlayersVO implements Serializable {
    private static final long serialVersionUID = 1L;

    @Schema(description = "球员姓名")
    private String name;

    @Schema(description = "球员id")
    private Integer id;

    @Schema(description = "球员年龄")
    private Integer age;

    @Schema(description = "球员薪资")
    private BigDecimal salary;

    @Schema(description = "合同期限")
    private Integer contperiod;

    @Schema(description = "球员头像")
    private String image;

    @Schema(description = "球员状态 0->健康 1->受伤 2->良好")
    private String status;


}