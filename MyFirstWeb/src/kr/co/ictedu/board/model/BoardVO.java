package kr.co.ictedu.board.model;

import java.sql.Timestamp;

public class BoardVO {
	
	private int bId;
	private String bName;
	private String bTitle;
	private String bContent;
	// Timestamp는 시분 초 까지 표기 , Date는 년월일 만 표기
	private Timestamp bDate;
	private int bHit;
	// 생성자 , setter/getter,toString 생성시
	// Alt+Shift+s 혹은 우클릭하여 만들기
	
	// 아무것도 안 받는 생성자
	public BoardVO() {
	}
	
	// 모든요소를 다 받는 생성자
	public BoardVO(int bId, String bName, String bTitle, String bContent, Timestamp bDate, int bHit) {
		super();
		this.bId = bId;
		this.bName = bName;
		this.bTitle = bTitle;
		this.bContent = bContent;
		this.bDate = bDate;
		this.bHit = bHit;
	}
	
	// Generate Getters/Setters
	public int getbId() {
		return bId;
	}
	public void setbId(int bId) {
		this.bId = bId;
	}
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public String getbTitle() {
		return bTitle;
	}
	public void setbTitle(String bTitle) {
		this.bTitle = bTitle;
	}
	public String getbContent() {
		return bContent;
	}
	public void setbContent(String bContent) {
		this.bContent = bContent;
	}
	public Timestamp getbDate() {
		return bDate;
	}
	public void setbDate(Timestamp bDate) {
		this.bDate = bDate;
	}
	public int getbHit() {
		return bHit;
	}
	public void setbHit(int bHit) {
		this.bHit = bHit;
	}

	@Override
	public String toString() {
		return "BoardVO [bId=" + bId + ", bName=" + bName + ", bTitle=" + bTitle + ", bContent=" + bContent + ", bDate="
				+ bDate + ", bHit=" + bHit + "]";
	}
	
	

}
