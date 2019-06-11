package com.ruoyi.project.system.orderbuy.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ruoyi.project.system.orderbuy.mapper.OrderbuyMapper;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.project.system.orderbuy.domain.Orderbuy;
import com.ruoyi.project.system.orderbuy.service.IOrderbuyService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;

import javax.annotation.Resource;

/**
 * 订单信息操作处理
 *
 * @author ruoyi
 * @date 2019-06-11
 */
@Controller
@RequestMapping("/system/orderbuy")
public class OrderbuyController extends BaseController {
    private String prefix = "system/orderbuy";

    @Autowired
    private IOrderbuyService orderbuyService;
    @Resource
    OrderbuyMapper orderbuyMapper;

    @RequiresPermissions("system:orderbuy:view")
    @GetMapping()
    public String orderbuy() {
        return prefix + "/orderbuy";
    }


    @RequestMapping("/fahuo")
    @ResponseBody
    public Map<String, Object> fahuo(Long orderId) {
        Orderbuy orderbuy = orderbuyMapper.selectOrderbuyById(orderId);
        orderbuy.setState("待收货");
        orderbuyMapper.updateOrderbuy(orderbuy);
        return new HashMap<>(1);
    }

    /**
     * 查询订单列表
     */
    @RequiresPermissions("system:orderbuy:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Orderbuy orderbuy) {
        startPage();
        List<Orderbuy> list = orderbuyService.selectOrderbuyList(orderbuy);
        return getDataTable(list);
    }


    /**
     * 导出订单列表
     */
    @RequiresPermissions("system:orderbuy:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Orderbuy orderbuy) {
        List<Orderbuy> list = orderbuyService.selectOrderbuyList(orderbuy);
        ExcelUtil<Orderbuy> util = new ExcelUtil<Orderbuy>(Orderbuy.class);
        return util.exportExcel(list, "orderbuy");
    }

    /**
     * 新增订单
     */
    @GetMapping("/add")
    public String add() {
        return prefix + "/add";
    }

    /**
     * 新增保存订单
     */
    @RequiresPermissions("system:orderbuy:add")
    @Log(title = "订单", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Orderbuy orderbuy) {
        return toAjax(orderbuyService.insertOrderbuy(orderbuy));
    }

    /**
     * 修改订单
     */
    @GetMapping("/edit/{orderId}")
    public String edit(@PathVariable("orderId") Long orderId, ModelMap mmap) {
        Orderbuy orderbuy = orderbuyService.selectOrderbuyById(orderId);
        mmap.put("orderbuy", orderbuy);
        return prefix + "/edit";
    }

    /**
     * 修改保存订单
     */
    @RequiresPermissions("system:orderbuy:edit")
    @Log(title = "订单", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Orderbuy orderbuy) {
        return toAjax(orderbuyService.updateOrderbuy(orderbuy));
    }

    /**
     * 删除订单
     */
    @RequiresPermissions("system:orderbuy:remove")
    @Log(title = "订单", businessType = BusinessType.DELETE)
    @PostMapping("/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(orderbuyService.deleteOrderbuyByIds(ids));
    }

}
