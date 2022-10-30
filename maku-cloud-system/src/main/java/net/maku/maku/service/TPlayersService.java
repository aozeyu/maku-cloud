package net.maku.maku.service;

import net.maku.framework.common.page.PageResult;
import net.maku.framework.mybatis.service.BaseService;
import net.maku.maku.vo.TPlayersVO;
import net.maku.maku.query.TPlayersQuery;
import net.maku.maku.entity.TPlayersEntity;

import java.util.List;

/**
 * 球员表
 *
 * @author 姚泽宇 3484766443@qq.com
 * @since 1.0.0 2022-10-30
 */
public interface TPlayersService extends BaseService<TPlayersEntity> {

    PageResult<TPlayersVO> page(TPlayersQuery query);

    void save(TPlayersVO vo);

    void update(TPlayersVO vo);

    void delete(List<Long> idList);
}