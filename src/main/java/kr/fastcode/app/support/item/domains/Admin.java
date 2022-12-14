package kr.fastcode.app.support.item.domains;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data @Lazy @NoArgsConstructor
public class Admin {
	private int studentNo; // PK
	private int trainId;
    private String studentId;
    private String studentPw;
    private String studentName;
    private String studentImage;
    private String savedDate;
    private String editedDate;
    private String birthday;
    private String gender;
    private String phone;
    private String rollId;
    private boolean useCookie;

    public Admin(
    		int trainId,
    		String studentId, 
			String studentPw, 
			String studentName, 
			String studentImage,
			String savedDate,
			String editedDate,
			String birthday, 
			String gender) {
    	this.trainId = trainId;
    	this.studentId = studentId;
    	this.studentPw = studentPw;
    	this.studentName = studentName;
    	this.studentImage = studentImage;
    	this.savedDate = savedDate;
    	this.editedDate = editedDate;
    	this.birthday = birthday;
    	this.gender = gender;
    }
}
