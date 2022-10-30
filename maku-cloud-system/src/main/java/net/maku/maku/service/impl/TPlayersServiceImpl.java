package net.maku.maku.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import lombok.AllArgsConstructor;
import net.maku.framework.common.page.PageResult;
import net.maku.framework.mybatis.service.impl.BaseServiceImpl;
import net.maku.maku.convert.TPlayersConvert;
import net.maku.maku.entity.TPlayersEntity;
import net.maku.maku.query.TPlayersQuery;
import net.maku.maku.vo.TPlayersVO;
import net.maku.maku.dao.TPlayersDao;
import net.maku.maku.service.TPlayersService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 球员表
 *
 * @author 姚泽宇 3484766443@qq.com
 * @since 1.0.0 2022-10-30
 */
@Service
@AllArgsConstructor
public class TPlayersServiceImpl extends BaseServiceImpl<TPlayersDao, TPlayersEntity> implements TPlayersService {

    @Override
    public PageResult<TPlayersVO> page(TPlayersQuery query) {
        IPage<TPlayersEntity> page = baseMapper.selectPage(getPage(query), getWrapper(query));

        return new PageResult<>(TPlayersConvert.INSTANCE.convertList(page.getRecords()), page.getTotal());
    }

    private LambdaQueryWrapper<TPlayersEntity> getWrapper(TPlayersQuery query){
        LambdaQueryWrapper<TPlayersEntity> wrapper = Wrappers.lambdaQuery();

        return wrapper;
    }

    @Override
    public void save(TPlayersVO vo) {
        TPlayersEntity entity = TPlayersConvert.INSTANCE.convert(vo);

        baseMapper.insert(entity);
    }

    @Override
    public void update(TPlayersVO vo) {
        TPlayersEntity entity = TPlayersConvert.INSTANCE.convert(vo);

        updateById(entity);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(List<Long> idList) {
        removeByIds(idList);
    }

}