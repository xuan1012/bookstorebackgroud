package com.ruoyi.project.system.verification.controller;

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
import com.ruoyi.project.system.verification.domain.Verification;
import com.ruoyi.project.system.verification.service.IVerificationService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;

/**
 * 验证码信息操作处理
 * 
 * @author ruoyi
 * @date 2019-05-30
 */
@Controller
@RequestMapping("/system/verification")
public class VerificationController extends BaseController
{
    private String prefix = "system/verification";
	
	@Autowired
	private IVerificationService verificationService;
	
	@RequiresPermissions("system:verification:view")
	@GetMapping()
	public String verification()
	{
	    return prefix + "/verification";
	}
	
	/**
	 * 查询验证码列表
	 */
	@RequiresPermissions("system:verification:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Verification verification)
	{
		startPage();
        List<Verification> list = verificationService.selectVerificationList(verification);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出验证码列表
	 */
	@RequiresPermissions("system:verification:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Verification verification)
    {
    	List<Verification> list = verificationService.selectVerificationList(verification);
        ExcelUtil<Verification> util = new ExcelUtil<Verification>(Verification.class);
        return util.exportExcel(list, "verification");
    }
	
	/**
	 * 新增验证码
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存验证码
	 */
	@RequiresPermissions("system:verification:add")
	@Log(title = "验证码", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(Verification verification)
	{		
		return toAjax(verificationService.insertVerification(verification));
	}

	/**
	 * 修改验证码
	 */
	@GetMapping("/edit/{verificationId}")
	public String edit(@PathVariable("verificationId") Integer verificationId, ModelMap mmap)
	{
		Verification verification = verificationService.selectVerificationById(verificationId);
		mmap.put("verification", verification);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存验证码
	 */
	@RequiresPermissions("system:verification:edit")
	@Log(title = "验证码", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(Verification verification)
	{		
		return toAjax(verificationService.updateVerification(verification));
	}
	
	/**
	 * 删除验证码
	 */
	@RequiresPermissions("system:verification:remove")
	@Log(title = "验证码", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(verificationService.deleteVerificationByIds(ids));
	}
	
}
