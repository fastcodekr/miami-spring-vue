package kr.fastcode.app.uss.mpe.ent;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data  @Lazy
public class Member {
	 private String mbrNo; // mbr_id
	 private String mbrLoginid;
	 private String mbrLoginpw;
	 private String mbrName;
	 private String mbNick;
	 private String mbNickDate;
	 private String mbEmail;
	 private String mbHomepage;
	 private String mbLevel;
	 private String mbSex;
	 private String mbBirth;
	 private String mbTel;
	 private String mbHp;
	 private String mbrRgdate;
	 private String mbrState;
	 private int roleId;
	 private boolean useCookie;
}
