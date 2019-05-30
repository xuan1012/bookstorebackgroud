package com.ruoyi.project.system.address.controller;

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
import com.ruoyi.project.system.address.domain.Address;
import com.ruoyi.project.system.address.service.IAddressService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;

/**
 * 用户地址信息操作处理
 * 
 * @author ruoyi
 * @date 2019-05-30
 */
@Controller
@RequestMapping("/system/address")
public class AddressController extends BaseController
{
    private String prefix = "system/address";
	
	@Autowired
	private IAddressService addressService;
	
	@RequiresPermissions("system:address:view")
	@GetMapping()
	public String address()
	{
	    return prefix + "/address";
	}
	
	/**
	 * 查询用户地址列表
	 */
	@RequiresPermissions("system:address:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Address address)
	{
		startPage();
        List<Address> list = addressService.selectAddressList(address);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出用户地址列表
	 */
	@RequiresPermissions("system:address:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Address address)
    {
    	List<Address> list = addressService.selectAddressList(address);
        ExcelUtil<Address> util = new ExcelUtil<Address>(Address.class);
        return util.exportExcel(list, "address");
    }
	
	/**
	 * 新增用户地址
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存用户地址
	 */
	@RequiresPermissions("system:address:add")
	@Log(title = "用户地址", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(Address address)
	{		
		return toAjax(addressService.insertAddress(address));
	}

	/**
	 * 修改用户地址
	 */
	@GetMapping("/edit/{addressId}")
	public String edit(@PathVariable("addressId") Long addressId, ModelMap mmap)
	{
		Address address = addressService.selectAddressById(addressId);
		mmap.put("address", address);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存用户地址
	 */
	@RequiresPermissions("system:address:edit")
	@Log(title = "用户地址", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(Address address)
	{		
		return toAjax(addressService.updateAddress(address));
	}
	
	/**
	 * 删除用户地址
	 */
	@RequiresPermissions("system:address:remove")
	@Log(title = "用户地址", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(addressService.deleteAddressByIds(ids));
	}
	
}
