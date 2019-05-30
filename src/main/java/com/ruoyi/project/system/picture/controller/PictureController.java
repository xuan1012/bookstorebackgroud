package com.ruoyi.project.system.picture.controller;

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
import com.ruoyi.project.system.picture.domain.Picture;
import com.ruoyi.project.system.picture.service.IPictureService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;

/**
 * 图片信息操作处理
 * 
 * @author ruoyi
 * @date 2019-05-30
 */
@Controller
@RequestMapping("/system/picture")
public class PictureController extends BaseController
{
    private String prefix = "system/picture";
	
	@Autowired
	private IPictureService pictureService;
	
	@RequiresPermissions("system:picture:view")
	@GetMapping()
	public String picture()
	{
	    return prefix + "/picture";
	}
	
	/**
	 * 查询图片列表
	 */
	@RequiresPermissions("system:picture:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Picture picture)
	{
		startPage();
        List<Picture> list = pictureService.selectPictureList(picture);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出图片列表
	 */
	@RequiresPermissions("system:picture:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Picture picture)
    {
    	List<Picture> list = pictureService.selectPictureList(picture);
        ExcelUtil<Picture> util = new ExcelUtil<Picture>(Picture.class);
        return util.exportExcel(list, "picture");
    }
	
	/**
	 * 新增图片
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存图片
	 */
	@RequiresPermissions("system:picture:add")
	@Log(title = "图片", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(Picture picture)
	{		
		return toAjax(pictureService.insertPicture(picture));
	}

	/**
	 * 修改图片
	 */
	@GetMapping("/edit/{pictureId}")
	public String edit(@PathVariable("pictureId") Integer pictureId, ModelMap mmap)
	{
		Picture picture = pictureService.selectPictureById(pictureId);
		mmap.put("picture", picture);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存图片
	 */
	@RequiresPermissions("system:picture:edit")
	@Log(title = "图片", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(Picture picture)
	{		
		return toAjax(pictureService.updatePicture(picture));
	}
	
	/**
	 * 删除图片
	 */
	@RequiresPermissions("system:picture:remove")
	@Log(title = "图片", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(pictureService.deletePictureByIds(ids));
	}
	
}
