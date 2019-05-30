package com.ruoyi.project.system.book.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.system.book.mapper.BookMapper;
import com.ruoyi.project.system.book.domain.Book;
import com.ruoyi.project.system.book.service.IBookService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 书籍 服务层实现
 * 
 * @author ruoyi
 * @date 2019-05-30
 */
@Service
public class BookServiceImpl implements IBookService 
{
	@Autowired
	private BookMapper bookMapper;

	/**
     * 查询书籍信息
     * 
     * @param bookId 书籍ID
     * @return 书籍信息
     */
    @Override
	public Book selectBookById(Long bookId)
	{
	    return bookMapper.selectBookById(bookId);
	}
	
	/**
     * 查询书籍列表
     * 
     * @param book 书籍信息
     * @return 书籍集合
     */
	@Override
	public List<Book> selectBookList(Book book)
	{
	    return bookMapper.selectBookList(book);
	}
	
    /**
     * 新增书籍
     * 
     * @param book 书籍信息
     * @return 结果
     */
	@Override
	public int insertBook(Book book)
	{
	    return bookMapper.insertBook(book);
	}
	
	/**
     * 修改书籍
     * 
     * @param book 书籍信息
     * @return 结果
     */
	@Override
	public int updateBook(Book book)
	{
	    return bookMapper.updateBook(book);
	}

	/**
     * 删除书籍对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteBookByIds(String ids)
	{
		return bookMapper.deleteBookByIds(Convert.toStrArray(ids));
	}
	
}
