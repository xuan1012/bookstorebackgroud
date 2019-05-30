package com.ruoyi.project.system.administrator.controller;

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
import com.ruoyi.project.system.administrator.domain.Administrator;
import com.ruoyi.project.system.administrator.service.IAdministratorService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;

/**
 * 员信息操作处理
 * 
 * @author ruoyi
 * @date 2019-05-30
 */
@Controller
@RequestMapping("/system/administrator")
public class AdministratorController extends BaseController
{
    private String prefix = "system/administrator";
	
	@Autowired
	private IAdministratorService administratorService;
	
	@RequiresPermissions("system:administrator:view")
	@GetMapping()
	public String administrator()
	{
	    return prefix + "/administrator";
	}
	
	/**
	 * 查询员列表
	 */
	@RequiresPermissions("system:administrator:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Administrator administrator)
	{
		startPage();
        List<Administrator> list = administratorService.selectAdministratorList(administrator);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出员列表
	 */
	@RequiresPermissions("system:administrator:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Administrator administrator)
    {
    	List<Administrator> list = administratorService.selectAdministratorList(administrator);
        ExcelUtil<Administrator> util = new ExcelUtil<Administrator>(Administrator.class);
        return util.exportExcel(list, "administrator");
    }
	
	/**
	 * 新增员
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存员
	 */
	@RequiresPermissions("system:administrator:add")
	@Log(title = "管理员", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(Administrator administrator)
	{		
		return toAjax(administratorService.insertAdministrator(administrator));
	}

	/**
	 * 修改员
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Long id, ModelMap mmap)
	{
		Administrator administrator = administratorService.selectAdministratorById(id);
		mmap.put("administrator", administrator);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存员
	 */
	@RequiresPermissions("system:administrator:edit")
	@Log(title = "管理员", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(Administrator administrator)
	{		
		return toAjax(administratorService.updateAdministrator(administrator));
	}
	
	/**
	 * 删除员
	 */
	@RequiresPermissions("system:administrator:remove")
	@Log(title = "管理员", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(administratorService.deleteAdministratorByIds(ids));
	}
	
}
