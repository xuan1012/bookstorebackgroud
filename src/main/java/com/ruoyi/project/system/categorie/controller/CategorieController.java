package com.ruoyi.project.system.categorie.controller;

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
import com.ruoyi.project.system.categorie.domain.Categorie;
import com.ruoyi.project.system.categorie.service.ICategorieService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;

/**
 * 分类信息操作处理
 * 
 * @author ruoyi
 * @date 2019-05-30
 */
@Controller
@RequestMapping("/system/categorie")
public class CategorieController extends BaseController
{
    private String prefix = "system/categorie";
	
	@Autowired
	private ICategorieService categorieService;
	
	@RequiresPermissions("system:categorie:view")
	@GetMapping()
	public String categorie()
	{
	    return prefix + "/categorie";
	}
	
	/**
	 * 查询分类列表
	 */
	@RequiresPermissions("system:categorie:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Categorie categorie)
	{
		startPage();
        List<Categorie> list = categorieService.selectCategorieList(categorie);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出分类列表
	 */
	@RequiresPermissions("system:categorie:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Categorie categorie)
    {
    	List<Categorie> list = categorieService.selectCategorieList(categorie);
        ExcelUtil<Categorie> util = new ExcelUtil<Categorie>(Categorie.class);
        return util.exportExcel(list, "categorie");
    }
	
	/**
	 * 新增分类
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存分类
	 */
	@RequiresPermissions("system:categorie:add")
	@Log(title = "分类", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(Categorie categorie)
	{		
		return toAjax(categorieService.insertCategorie(categorie));
	}

	/**
	 * 修改分类
	 */
	@GetMapping("/edit/{categoriesId}")
	public String edit(@PathVariable("categoriesId") Long categoriesId, ModelMap mmap)
	{
		Categorie categorie = categorieService.selectCategorieById(categoriesId);
		mmap.put("categorie", categorie);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存分类
	 */
	@RequiresPermissions("system:categorie:edit")
	@Log(title = "分类", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(Categorie categorie)
	{		
		return toAjax(categorieService.updateCategorie(categorie));
	}
	
	/**
	 * 删除分类
	 */
	@RequiresPermissions("system:categorie:remove")
	@Log(title = "分类", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(categorieService.deleteCategorieByIds(ids));
	}
	
}
