package kr.fastcode.app.cop.bbs.ent;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;


import lombok.Data;

@Component
@Data  @Lazy
public class Board {
	private int artNo;

    /**
     * @Class Name  : Board.java
     * @Description : 게시물에 대한 데이터 처리 모델
     * @Modification Information
     *
     *     수정일         수정자                   수정내용
     *     -------          --------        ---------------------------
     *   2009.03.06       이삼섭                  최초 생성
     *
     * @author 공통 서비스 개발팀 이삼섭
     * @since 2009. 02. 13
     * @version 1.0
     * @see
     *
     */
    private String atchFileId; // 게시물 첨부파일 아이디
    private String bbsId = ""; // 게시판 아이디
    private String frstRegisterId = ""; // 최초등록자 아이디
    private String frstRegisterPnttm = ""; // 최초등록시점
    private String lastUpdusrId = ""; // 최종수정자 아이디
    private String lastUpdusrPnttm = ""; // 최종수정시점
    private String ntceBgnde = ""; // 게시시작일
    private String ntceEndde = ""; // 게시종료일
    private String ntcrId = ""; // 게시자 아이디
    private String ntcrNm = ""; // 게시자명
    private String nttCn = ""; // 게시물 내용
    private long nttId = 0L; // 게시물 아이디
    private long nttNo = 0L; // 게시물 번호
    private String nttSj = ""; // 게시물 제목
    private String parnts = "0"; // 부모글번호
    private String password = ""; // 패스워드
    private int inqireCo = 0; // 조회수
    private String replyAt = ""; // 답장여부
    private String replyLc = "0"; // 답장위치
    private long sortOrdr = 0L; // 정렬순서
    private String useAt = ""; // 사용여부
    private String ntceEnddeView = ""; // 게시 종료일
    private String ntceBgndeView = ""; // 게시 시작일
    private String noticeAt = ""; // 공지사항 여부
    private String secretAt = ""; // 비밀글 여부
    private String sjBoldAt = ""; // 제목 Bold 여부
    private String blogAt = ""; // 블로그 게시판 여부
    private String blogId = ""; // 블로그 ID
}
