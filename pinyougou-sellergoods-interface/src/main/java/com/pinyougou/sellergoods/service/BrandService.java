package com.pinyougou.sellergoods.service;
/**
 * 品牌接口
 * @author PanJtao
 *
 */
import java.util.List;
import com.pinyougou.pojo.TbBrand;
import entity.PageResult;

public interface BrandService {
    /**
     * 查詢所有
     * @return 所有結果集
     */
	List<TbBrand> findAll();

    /**
     * 分頁
     * @param pageNum 當前頁數
     * @param pageSize 每頁大小
     * @return 分頁類
     */
    PageResult findPage(int pageNum,int pageSize);

    /**
     * 分頁
     * @param tbBrand
     * @param pageNum
     * @param pageSize
     * @return
     */
    PageResult findPage(TbBrand tbBrand,int pageNum,int pageSize);

    /**
     * @param tbBrand 新增一個商品
     */
    void add(TbBrand tbBrand);

    /**
     *
     * @param id
     * @return
     */
    TbBrand findOne(long id);

    /**
     * 更新的方法
     * @param tbBrand
     */
    void update(TbBrand tbBrand);

    /**
     * 刪除
     * @param ids
     */
    void delete(Long[] ids);
}
