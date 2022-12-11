package kr.fastcode.app.cmm.service;
/**
 * 공통상세코드 모델 클래스
 * @author 공통서비스 개발팀 이중호
 * @since 2009.04.01
 * @version 1.0
 * @see
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *
 *   수정일      수정자           수정내용
 *  -------    --------    ---------------------------
 *   2009.04.01  이중호          최초 생성
 *   2017.09.07	이정은		표준프레임워크 v3.7 개선(clCode 추가)
 *
 * </pre>
 */
public class CmmDetailCide {
    private static final long serialVersionUID = 1L;

    private String clCode; // 분류코드
    private String codeId; // 코드ID
    private String codeIdNm; // 코드ID명
    private String code; // 상세코드
    private String codeNm; // 상세코드명
    private String codeDc; // 상세코드설명
    private String useAt; // 사용여부
    private String frstRegisterId; // 최초등록자ID
    private String lastUpdusrId; // 최종수정자ID

}

/**
 * https://github.com/parkjungkwan/fork-egov-all-in-one/tree/main/java/egovframework/com/cmm/service
 * */
