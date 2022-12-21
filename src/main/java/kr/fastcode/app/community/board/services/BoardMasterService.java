package kr.fastcode.app.community.board.services;

import java.util.List;
import java.util.Map;


import kr.fastcode.app.community.board.domains.Blog;
import kr.fastcode.app.community.board.domains.BlogUser;
import kr.fastcode.app.community.board.domains.BoardMaster;
import kr.fastcode.app.community.board.domains.vo.BlogVO;
import kr.fastcode.app.community.board.domains.vo.BoardMasterVO;

public interface BoardMasterService {

	Map<String, Object> selectNotUsedBdMstrList(BoardMasterVO boardMasterVO);

	void deleteBBSMasterInf(BoardMaster boardMaster);

	void updateBBSMasterInf(BoardMaster boardMaster) throws Exception;

	BoardMasterVO selectBBSMasterInf(BoardMasterVO boardMasterVO) throws Exception;

	Map<String, Object> selectBBSMasterInfs(BoardMasterVO boardMasterVO);
	
	void insertBBSMasterInf(BoardMaster boardMaster) throws Exception;

	/*
	 * 블로그 관련
	 */
	Map<String, Object> selectBlogMasterInfs(BoardMasterVO boardMasterVO);
	
	String checkBlogUser(BlogVO blogVO);
	
	BlogVO checkBlogUser2(BlogVO blogVO);

	void insertBoardBlogUserRqst(BlogUser blogUser);
	
	void insertBlogMaster(Blog blog) ;
	
	BlogVO selectBlogDetail(BlogVO blogVO) throws Exception;

	List<BlogVO> selectBlogListPortlet(BlogVO blogVO) throws Exception;

	List<BoardMasterVO> selectBBSListPortlet(BoardMasterVO boardMasterVO) throws Exception;

}
