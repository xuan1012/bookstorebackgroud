package com.ruoyi.project.system.bookmark.controller;

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
import com.ruoyi.project.system.bookmark.domain.Bookmark;
import com.ruoyi.project.system.bookmark.service.IBookmarkService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;

/**
 * 收藏夹信息操作处理
 * 
 * @author ruoyi
 * @date 2019-05-30
 */
@Controller
@RequestMapping("/system/bookmark")
public class BookmarkController extends BaseController
{
    private String prefix = "system/bookmark";
	
	@Autowired
	private IBookmarkService bookmarkService;
	
	@RequiresPermissions("system:bookmark:view")
	@GetMapping()
	public String bookmark()
	{
	    return prefix + "/bookmark";
	}
	
	/**
	 * 查询收藏夹列表
	 */
	@RequiresPermissions("system:bookmark:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Bookmark bookmark)
	{
		startPage();
        List<Bookmark> list = bookmarkService.selectBookmarkList(bookmark);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出收藏夹列表
	 */
	@RequiresPermissions("system:bookmark:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Bookmark bookmark)
    {
    	List<Bookmark> list = bookmarkService.selectBookmarkList(bookmark);
        ExcelUtil<Bookmark> util = new ExcelUtil<Bookmark>(Bookmark.class);
        return util.exportExcel(list, "bookmark");
    }
	
	/**
	 * 新增收藏夹
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存收藏夹
	 */
	@RequiresPermissions("system:bookmark:add")
	@Log(title = "收藏夹", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(Bookmark bookmark)
	{		
		return toAjax(bookmarkService.insertBookmark(bookmark));
	}

	/**
	 * 修改收藏夹
	 */
	@GetMapping("/edit/{markId}")
	public String edit(@PathVariable("markId") Long markId, ModelMap mmap)
	{
		Bookmark bookmark = bookmarkService.selectBookmarkById(markId);
		mmap.put("bookmark", bookmark);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存收藏夹
	 */
	@RequiresPermissions("system:bookmark:edit")
	@Log(title = "收藏夹", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(Bookmark bookmark)
	{		
		return toAjax(bookmarkService.updateBookmark(bookmark));
	}
	
	/**
	 * 删除收藏夹
	 */
	@RequiresPermissions("system:bookmark:remove")
	@Log(title = "收藏夹", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(bookmarkService.deleteBookmarkByIds(ids));
	}
	
}
