package net.maku.maku.dao;

import net.maku.framework.mybatis.dao.BaseDao;
import net.maku.maku.entity.TPlayersEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 球员表
 *
 * @author 姚泽宇 3484766443@qq.com
 * @since 1.0.0 2022-10-30
 */
@Mapper
public interface TPlayersDao extends BaseDao<TPlayersEntity> {

}