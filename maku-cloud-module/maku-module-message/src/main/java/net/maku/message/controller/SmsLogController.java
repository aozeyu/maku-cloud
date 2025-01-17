package net.maku.message.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import net.maku.framework.common.page.PageResult;
import net.maku.framework.common.utils.Result;
import net.maku.message.convert.SmsLogConvert;
import net.maku.message.entity.SmsLogEntity;
import net.maku.message.query.SmsLogQuery;
import net.maku.message.service.SmsLogService;
import net.maku.message.vo.SmsLogVO;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
* 短信日志
*
* @author 阿沐 babamu@126.com
*/
@RestController
@RequestMapping("sms/log")
@Tag(name="短信日志")
@AllArgsConstructor
public class SmsLogController {
    private final SmsLogService smsLogService;

    @GetMapping("page")
    @Operation(summary = "分页")
    @PreAuthorize("hasAuthority('sms:log')")
    public Result<PageResult<SmsLogVO>> page(@Valid SmsLogQuery query){
        PageResult<SmsLogVO> page = smsLogService.page(query);

        return Result.ok(page);
    }

    @GetMapping("{id}")
    @Operation(summary = "信息")
    @PreAuthorize("hasAuthority('sms:log')")
    public Result<SmsLogVO> get(@PathVariable("id") Long id){
        SmsLogEntity entity = smsLogService.getById(id);

        return Result.ok(SmsLogConvert.INSTANCE.convert(entity));
    }

}