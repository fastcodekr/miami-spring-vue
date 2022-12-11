package kr.fastcode.app.cmm.web;

import java.util.List;

import kr.fastcode.app.cmm.dao.WareHouseRepository;
import kr.fastcode.app.cmm.vo.ComponentVO;
import kr.fastcode.app.cmm.vo.WritingVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/dwh/wareHouse")
public class WareHouseController {
	
	final private WareHouseRepository wareHouseDAO;
	
	@GetMapping("/components")
	public ComponentVO getComponents() {
		return wareHouseDAO.getComponents();
	}
	
	@GetMapping("/mosaDap")
	public String getMosaDap() {
		return wareHouseDAO.getMosaDap();
	}
	@GetMapping("/jedo")
	public String getJedo(){
		return wareHouseDAO.getJedo();
	}
	@GetMapping("/hoonJedo")
	public String getHoonJedo(){
		return wareHouseDAO.getHoonJedo();
	}
	@GetMapping("/hoonJin")
	public String getHoonJin(){
		return wareHouseDAO.getHoonJin();
	}
	@GetMapping("footer")
	public String getFooter(){
		return wareHouseDAO.getFooter();
	}
	@GetMapping("/introduceAiAcademy")
	public String getIntroduceAiAcademy(){
		return wareHouseDAO.getIntroduceAiAcademy();
	}
	@GetMapping("/procedure")
	public List<ComponentVO> getProcedure(){
		return wareHouseDAO.getProcedure();
	}
	
	@GetMapping("/test")
	public List<WritingVO> getTest(){
		List<WritingVO> l = wareHouseDAO.getTest();
		for(int i=0; i< 5; i++) {
			System.out.println(l.get(i).toString());
		}
		return l;
	}

}
