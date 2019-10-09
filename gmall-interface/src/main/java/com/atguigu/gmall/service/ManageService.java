package com.atguigu.gmall.service;

import com.atguigu.gmall.bean.*;

import java.util.List;

public interface ManageService {
    /**
     * 查询所有一级分类数据
     * @return
     */
    List<BaseCatalog1> getCatalog1();

    /**
     * 根据一级分类Id 查询二级分类数据
     * @param catalog1Id
     * @return
     */
    List<BaseCatalog2> getCatalog2(String catalog1Id);


    /**
     *  根据二级分类Id 查询三级分类数据
     * @param catalog2Id
     * @return
     */
    List<BaseCatalog3> getCatalog3(String catalog2Id);


    // http://localhost:8082/attrInfoList?catalog3Id=61
    /**
     * 通过三级分类Id 查询平台属性
     * @param catalog3Id
     * @return
     */
    List<BaseAttrInfo> getAttrInfoList(String catalog3Id);

    // 自己制作vo attrName, List--attrValueName; --- 直接使用BaseAttrInfo
    // 保存需要什么返回值？
    // 括号中的参数，实际就是从页面传递过来的数据！【传递对象接收前台的数据】

    /**
     * 保存平台属性-平台属性值
     * @param baseAttrInfo
     */
    void saveBaseAttrInfo(BaseAttrInfo baseAttrInfo);


    /**
     * 根据平台属性值Id {attrId=baseAttrInfo.Id} 查询平台属性值集合
     * @param attrId
     * @return
     */
    List<BaseAttrValue> getAttrValueList(String attrId);

    /**
     * 根据平台属性id 获取平台属性对象
     * @param attrId
     * @return
     */
    BaseAttrInfo getBaseAttrInfo(String attrId);
}
