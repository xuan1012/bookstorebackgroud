package com.ruoyi.project.system.myuser.controller;

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
import com.ruoyi.project.system.myuser.domain.Myuser;
import com.ruoyi.project.system.myuser.service.IMyuserService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;

/**
 * 用户信息操作处理
 * 
 * @author ruoyi
 * @date 2019-05-30
 */
@Controller
@RequestMapping("/system/myuser")
public class MyuserController extends BaseController
{
    private String prefix = "system/myuser";
	
	@Autowired
	private IMyuserService myuserService;
	
	@RequiresPermissions("system:myuser:view")
	@GetMapping()
	public String myuser()
	{
	    return prefix + "/myuser";
	}
	
	/**
	 * 查询用户列表
	 */
	@RequiresPermissions("system:myuser:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Myuser myuser)
	{
		startPage();
        List<Myuser> list = myuserService.selectMyuserList(myuser);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出用户列表
	 */
	@RequiresPermissions("system:myuser:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Myuser myuser)
    {
    	List<Myuser> list = myuserService.selectMyuserList(myuser);
        ExcelUtil<Myuser> util = new ExcelUtil<Myuser>(Myuser.class);
        return util.exportExcel(list, "myuser");
    }
	
	/**
	 * 新增用户
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存用户
	 */
	@RequiresPermissions("system:myuser:add")
	@Log(title = "用户", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(Myuser myuser)
	{		
		return toAjax(myuserService.insertMyuser(myuser));
	}

	/**
	 * 修改用户
	 */
	@GetMapping("/edit/{userId}")
	public String edit(@PathVariable("userId") Long userId, ModelMap mmap)
	{
		Myuser myuser = myuserService.selectMyuserById(userId);
		mmap.put("myuser", myuser);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存用户
	 */
	@RequiresPermissions("system:myuser:edit")
	@Log(title = "用户", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(Myuser myuser)
	{		
		return toAjax(myuserService.updateMyuser(myuser));
	}
	
	/**
	 * 删除用户
	 */
	@RequiresPermissions("system:myuser:remove")
	@Log(title = "用户", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(myuserService.deleteMyuserByIds(ids));
	}
	
}
