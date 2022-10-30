package net.maku.maku.convert;

import net.maku.maku.entity.TPlayersEntity;
import net.maku.maku.vo.TPlayersVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * 球员表
 *
 * @author 姚泽宇 3484766443@qq.com
 * @since 1.0.0 2022-10-30
 */
@Mapper
public interface TPlayersConvert {
    TPlayersConvert INSTANCE = Mappers.getMapper(TPlayersConvert.class);

    TPlayersEntity convert(TPlayersVO vo);

    TPlayersVO convert(TPlayersEntity entity);

    List<TPlayersVO> convertList(List<TPlayersEntity> list);

}