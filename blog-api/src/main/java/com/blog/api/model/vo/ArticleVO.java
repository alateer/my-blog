package com.blog.api.model.vo;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.bean.copier.CopyOptions;
import com.blog.api.model.entity.ArticlePO;
import com.blog.api.model.enums.ArticleTypeEnum;
import com.blog.api.utils.TimeUtils;
import lombok.Data;

@Data
public class ArticleVO {
    private String id;
    private String author;
    private String title;
    private String content;
    private String[] tags;
    private String type;
    private String category;
    private String gmtCreate;
    private String gmtUpdate;
    private String tabloid;
    private Integer views;

    /**
     * 根据 PO 创建 VO 对象
     * @param articlePO
     * @return
     */
    public static ArticleVO fromArticlePO(ArticlePO articlePO) {
        return new Converter().convertToVO(articlePO);
    }

    private static class Converter implements IConverter<ArticlePO, ArticleVO> {
        @Override
        public ArticleVO convertToVO(ArticlePO article) {
            final ArticleVO vo = new ArticleVO();
            BeanUtil.copyProperties(article, vo, CopyOptions.create().ignoreNullValue().ignoreError());
            vo.setTags(article.getTags().split(","));
            for(ArticleTypeEnum item : ArticleTypeEnum.values()) {
                if(item.getFlags() == article.getType()) {
                    vo.setType(item.getNotes());
                }
            }
            vo.setGmtCreate(TimeUtils.formatDatetime(article.getGmtCreate()));
            vo.setGmtUpdate(TimeUtils.formatDatetime(article.getGmtUpdate()));
             return vo;
        }
    }
}
