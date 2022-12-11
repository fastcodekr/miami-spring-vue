package kr.fastcode.app.cop.bbs.ent;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;


import lombok.Data;

@Component
@Data  @Lazy
public class Article {
	private int artNo;
}
