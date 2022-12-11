package kr.fastcode.app.cmm.dao;
import java.util.List;
import java.util.Map;

import kr.fastcode.app.cmm.vo.ComponentVO;
import kr.fastcode.app.cmm.vo.WritingVO;
import org.springframework.stereotype.Repository;
@Repository
public interface WareHouseRepository extends CrudRepository<ComponentVO> {
	public void create(String query);
	public void drop(String query);
	public void truncate(String query);
	public ComponentVO getComponents();
	public String getMosaDap();
	public String getJedo();
	public String getHoonJedo();
	public String getHoonJin();
	public String getFooter();
	public String getWelcomeAiAcademy();
	public String getIntroduceAiAcademy();
	public List<ComponentVO> getProcedure();
	public List<WritingVO> getTest();
	public List<WritingVO> existTable();
	public Map<?,?> showCreateTable(String param);
	public void dropTable(String param);
	public void createNewTable(String param);
}
