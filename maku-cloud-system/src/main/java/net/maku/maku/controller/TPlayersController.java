package net.maku.maku.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import net.maku.framework.common.page.PageResult;
import net.maku.framework.common.utils.Result;
import net.maku.maku.convert.TPlayersConvert;
import net.maku.maku.entity.TPlayersEntity;
import net.maku.maku.service.TPlayersService;
import net.maku.maku.query.TPlayersQuery;
import net.maku.maku.vo.TPlayersVO;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * 球员表
 *
 * @author 姚泽宇 3484766443@qq.com
 * @since 1.0.0 2022-10-30
 */
@RestController
@RequestMapping("maku/players")
@Tag(name="球员表")
@AllArgsConstructor
public class TPlayersController {
    private final TPlayersService tPlayersService;

    @GetMapping("page")
    @Operation(summary = "分页")
    public Result<PageResult<TPlayersVO>> page(@Valid TPlayersQuery query){
        PageResult<TPlayersVO> page = tPlayersService.page(query);

        return Result.ok(page);
    }

    @GetMapping("{id}")
    @Operation(summary = "信息")
    public Result<TPlayersVO> get(@PathVariable("id") Long id){
        TPlayersEntity entity = tPlayersService.getById(id);

        return Result.ok(TPlayersConvert.INSTANCE.convert(entity));
    }

    @PostMapping
    @Operation(summary = "保存")
    public Result<String> save(@RequestBody TPlayersVO vo){
        tPlayersService.save(vo);

        return Result.ok();
    }

    @PutMapping
    @Operation(summary = "修改")
    public Result<String> update(@RequestBody @Valid TPlayersVO vo){
        tPlayersService.update(vo);

        return Result.ok();
    }

    @DeleteMapping
    @Operation(summary = "删除")
    //去掉对饮的权限
    public Result<String> delete(@RequestBody List<Long> idList){
        tPlayersService.delete(idList);

        return Result.ok();
    }
}