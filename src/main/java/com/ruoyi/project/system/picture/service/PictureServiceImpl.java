package com.ruoyi.project.system.picture.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.system.picture.mapper.PictureMapper;
import com.ruoyi.project.system.picture.domain.Picture;
import com.ruoyi.project.system.picture.service.IPictureService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 图片 服务层实现
 * 
 * @author ruoyi
 * @date 2019-05-30
 */
@Service
public class PictureServiceImpl implements IPictureService 
{
	@Autowired
	private PictureMapper pictureMapper;

	/**
     * 查询图片信息
     * 
     * @param pictureId 图片ID
     * @return 图片信息
     */
    @Override
	public Picture selectPictureById(Integer pictureId)
	{
	    return pictureMapper.selectPictureById(pictureId);
	}
	
	/**
     * 查询图片列表
     * 
     * @param picture 图片信息
     * @return 图片集合
     */
	@Override
	public List<Picture> selectPictureList(Picture picture)
	{
	    return pictureMapper.selectPictureList(picture);
	}
	
    /**
     * 新增图片
     * 
     * @param picture 图片信息
     * @return 结果
     */
	@Override
	public int insertPicture(Picture picture)
	{
	    return pictureMapper.insertPicture(picture);
	}
	
	/**
     * 修改图片
     * 
     * @param picture 图片信息
     * @return 结果
     */
	@Override
	public int updatePicture(Picture picture)
	{
	    return pictureMapper.updatePicture(picture);
	}

	/**
     * 删除图片对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deletePictureByIds(String ids)
	{
		return pictureMapper.deletePictureByIds(Convert.toStrArray(ids));
	}
	
}
