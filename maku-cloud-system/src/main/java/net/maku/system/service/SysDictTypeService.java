package net.maku.system.service;

import net.maku.framework.common.page.PageResult;
import net.maku.framework.mybatis.service.BaseService;
import net.maku.system.entity.SysDictTypeEntity;
import net.maku.system.query.SysDictTypeQuery;
import net.maku.system.vo.SysDictTypeVO;
import net.maku.system.vo.SysDictVO;

import java.util.List;

/**
 * 数据字典
 *
 * @author 阿沐 babamu@126.com
 */
public interface SysDictTypeService extends BaseService<SysDictTypeEntity> {

    PageResult<SysDictTypeVO> page(SysDictTypeQuery query);

    void save(SysDictTypeVO vo);

    void update(SysDictTypeVO vo);

    void delete(List<Long> idList);

    /**
     * 获取动态SQL数据
     */
    List<SysDictVO.DictData> getDictSql(Long id);

    /**
     * 获取全部字典列表
     */
    List<SysDictVO> getDictList();

}