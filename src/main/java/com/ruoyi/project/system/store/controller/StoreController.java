package com.ruoyi.project.system.store.controller;

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
import com.ruoyi.project.system.store.domain.Store;
import com.ruoyi.project.system.store.service.IStoreService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;

/**
 * 商家信息操作处理
 * 
 * @author ruoyi
 * @date 2019-05-30
 */
@Controller
@RequestMapping("/system/store")
public class StoreController extends BaseController
{
    private String prefix = "system/store";
	
	@Autowired
	private IStoreService storeService;
	
	@RequiresPermissions("system:store:view")
	@GetMapping()
	public String store()
	{
	    return prefix + "/store";
	}
	
	/**
	 * 查询商家列表
	 */
	@RequiresPermissions("system:store:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Store store)
	{
		startPage();
        List<Store> list = storeService.selectStoreList(store);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出商家列表
	 */
	@RequiresPermissions("system:store:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Store store)
    {
    	List<Store> list = storeService.selectStoreList(store);
        ExcelUtil<Store> util = new ExcelUtil<Store>(Store.class);
        return util.exportExcel(list, "store");
    }
	
	/**
	 * 新增商家
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存商家
	 */
	@RequiresPermissions("system:store:add")
	@Log(title = "商家", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(Store store)
	{		
		return toAjax(storeService.insertStore(store));
	}

	/**
	 * 修改商家
	 */
	@GetMapping("/edit/{storeId}")
	public String edit(@PathVariable("storeId") Integer storeId, ModelMap mmap)
	{
		Store store = storeService.selectStoreById(storeId);
		mmap.put("store", store);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存商家
	 */
	@RequiresPermissions("system:store:edit")
	@Log(title = "商家", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(Store store)
	{		
		return toAjax(storeService.updateStore(store));
	}
	
	/**
	 * 删除商家
	 */
	@RequiresPermissions("system:store:remove")
	@Log(title = "商家", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(storeService.deleteStoreByIds(ids));
	}
	
}
