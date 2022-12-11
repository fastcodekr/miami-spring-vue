package kr.fastcode.app.cop.cmt.service;

import kr.fastcode.app.cop.cmt.ent.Comment;
import kr.fastcode.app.cop.cmt.vo.CommentVO;

import java.util.Map;


public interface ArticleCommentService {

    public boolean canUseComment(String bbsId) throws Exception;

    Map<String, Object> selectArticleCommentList(CommentVO commentVO);

	void insertArticleComment(Comment comment) ;

	void deleteArticleComment(CommentVO commentVO);

	CommentVO selectArticleCommentDetail(CommentVO commentVO);

	void updateArticleComment(Comment comment);

}
