package com.ruoyi.project.system.comment.controller;

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
import com.ruoyi.project.system.comment.domain.Comment;
import com.ruoyi.project.system.comment.service.ICommentService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;

/**
 * 评论信息操作处理
 * 
 * @author ruoyi
 * @date 2019-05-30
 */
@Controller
@RequestMapping("/system/comment")
public class CommentController extends BaseController
{
    private String prefix = "system/comment";
	
	@Autowired
	private ICommentService commentService;
	
	@RequiresPermissions("system:comment:view")
	@GetMapping()
	public String comment()
	{
	    return prefix + "/comment";
	}
	
	/**
	 * 查询评论列表
	 */
	@RequiresPermissions("system:comment:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Comment comment)
	{
		startPage();
        List<Comment> list = commentService.selectCommentList(comment);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出评论列表
	 */
	@RequiresPermissions("system:comment:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Comment comment)
    {
    	List<Comment> list = commentService.selectCommentList(comment);
        ExcelUtil<Comment> util = new ExcelUtil<Comment>(Comment.class);
        return util.exportExcel(list, "comment");
    }
	
	/**
	 * 新增评论
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存评论
	 */
	@RequiresPermissions("system:comment:add")
	@Log(title = "评论", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(Comment comment)
	{		
		return toAjax(commentService.insertComment(comment));
	}

	/**
	 * 修改评论
	 */
	@GetMapping("/edit/{commentId}")
	public String edit(@PathVariable("commentId") Long commentId, ModelMap mmap)
	{
		Comment comment = commentService.selectCommentById(commentId);
		mmap.put("comment", comment);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存评论
	 */
	@RequiresPermissions("system:comment:edit")
	@Log(title = "评论", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(Comment comment)
	{		
		return toAjax(commentService.updateComment(comment));
	}
	
	/**
	 * 删除评论
	 */
	@RequiresPermissions("system:comment:remove")
	@Log(title = "评论", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(commentService.deleteCommentByIds(ids));
	}
	
}
