package net.maku.maku.query;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import net.maku.framework.common.query.Query;

import java.math.BigDecimal;

/**
 * 球员表查询
 *
 * @author 姚泽宇 3484766443@qq.com
 * @since 1.0.0 2022-10-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Schema(description = "球员表查询")
public class TPlayersQuery extends Query {
}