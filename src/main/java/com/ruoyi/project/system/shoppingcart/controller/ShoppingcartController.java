package com.ruoyi.project.system.shoppingcart.controller;

import java.util.List;
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
import com.ruoyi.project.system.shoppingcart.domain.Shoppingcart;
import com.ruoyi.project.system.shoppingcart.service.IShoppingcartService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;

/**
 * 购物车信息操作处理
 * 
 * @author ruoyi
 * @date 2019-05-30
 */
@Controller
@RequestMapping("/system/shoppingcart")
public class ShoppingcartController extends BaseController
{
    private String prefix = "system/shoppingcart";
	
	@Autowired
	private IShoppingcartService shoppingcartService;
	
	@RequiresPermissions("system:shoppingcart:view")
	@GetMapping()
	public String shoppingcart()
	{
	    return prefix + "/shoppingcart";
	}
	
	/**
	 * 查询购物车列表
	 */
	@RequiresPermissions("system:shoppingcart:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Shoppingcart shoppingcart)
	{
		startPage();
        List<Shoppingcart> list = shoppingcartService.selectShoppingcartList(shoppingcart);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出购物车列表
	 */
	@RequiresPermissions("system:shoppingcart:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Shoppingcart shoppingcart)
    {
    	List<Shoppingcart> list = shoppingcartService.selectShoppingcartList(shoppingcart);
        ExcelUtil<Shoppingcart> util = new ExcelUtil<Shoppingcart>(Shoppingcart.class);
        return util.exportExcel(list, "shoppingcart");
    }
	
	/**
	 * 新增购物车
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存购物车
	 */
	@RequiresPermissions("system:shoppingcart:add")
	@Log(title = "购物车", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(Shoppingcart shoppingcart)
	{		
		return toAjax(shoppingcartService.insertShoppingcart(shoppingcart));
	}

	/**
	 * 修改购物车
	 */
	@GetMapping("/edit/{cartId}")
	public String edit(@PathVariable("cartId") Long cartId, ModelMap mmap)
	{
		Shoppingcart shoppingcart = shoppingcartService.selectShoppingcartById(cartId);
		mmap.put("shoppingcart", shoppingcart);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存购物车
	 */
	@RequiresPermissions("system:shoppingcart:edit")
	@Log(title = "购物车", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(Shoppingcart shoppingcart)
	{		
		return toAjax(shoppingcartService.updateShoppingcart(shoppingcart));
	}
	
	/**
	 * 删除购物车
	 */
	@RequiresPermissions("system:shoppingcart:remove")
	@Log(title = "购物车", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(shoppingcartService.deleteShoppingcartByIds(ids));
	}
	
}
