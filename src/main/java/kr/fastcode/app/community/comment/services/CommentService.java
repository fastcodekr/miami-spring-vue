package kr.fastcode.app.community.comment.services;

import kr.fastcode.app.community.comment.domains.Comment;
import kr.fastcode.app.community.comment.domains.vo.CommentVO;

import java.util.Map;


public interface CommentService {

    public boolean canUseComment(String bbsId) throws Exception;

    Map<String, Object> selectArticleCommentList(CommentVO commentVO);

	void insertArticleComment(Comment comment) ;

	void deleteArticleComment(CommentVO commentVO);

	CommentVO selectArticleCommentDetail(CommentVO commentVO);

	void updateArticleComment(Comment comment);

}
