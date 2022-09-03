package com.github.liuyueyi.forum.service.user.service;

import com.github.liueyueyi.forum.api.model.vo.user.dto.ArticleFootCountDTO;

/**
 * 计数统计相关
 *
 * @author YiHui
 * @date 2022/9/2
 */
public interface CountService {
    /**
     * 根据文章ID查询文章计数
     *
     * @param articleId
     * @return
     */
    ArticleFootCountDTO queryArticleCountInfoByArticleId(Long articleId);


    /**
     * 查询做的总阅读相关计数（当前返回评论数）
     *
     * @param userId
     * @return
     */
    ArticleFootCountDTO queryArticleCountInfoByUserId(Long userId);

    /**
     * 获取评论点赞数量
     *
     * @param commentId
     * @return
     */
    Long queryCommentPraiseCount(Long commentId);
}
