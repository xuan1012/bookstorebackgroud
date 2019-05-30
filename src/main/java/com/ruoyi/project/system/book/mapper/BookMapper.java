package com.ruoyi.project.system.book.mapper;

import com.ruoyi.project.system.book.domain.Book;
import java.util.List;	

/**
 * 书籍 数据层
 * 
 * @author ruoyi
 * @date 2019-05-30
 */
public interface BookMapper 
{
	/**
     * 查询书籍信息
     * 
     * @param bookId 书籍ID
     * @return 书籍信息
     */
	public Book selectBookById(Long bookId);
	
	/**
     * 查询书籍列表
     * 
     * @param book 书籍信息
     * @return 书籍集合
     */
	public List<Book> selectBookList(Book book);
	
	/**
     * 新增书籍
     * 
     * @param book 书籍信息
     * @return 结果
     */
	public int insertBook(Book book);
	
	/**
     * 修改书籍
     * 
     * @param book 书籍信息
     * @return 结果
     */
	public int updateBook(Book book);
	
	/**
     * 删除书籍
     * 
     * @param bookId 书籍ID
     * @return 结果
     */
	public int deleteBookById(Long bookId);
	
	/**
     * 批量删除书籍
     * 
     * @param bookIds 需要删除的数据ID
     * @return 结果
     */
	public int deleteBookByIds(String[] bookIds);
	
}