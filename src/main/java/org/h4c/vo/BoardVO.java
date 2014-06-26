package org.h4c.vo;

import java.util.Date;

//CREATE TABLE `mysample`.`tbl_board` (
//		  `bno` INT NOT NULL AUTO_INCREMENT,
//		  `gno` INT NOT NULL,
//		  `writer` VARCHAR(2000) NOT NULL,
//		  `title` VARCHAR(2000) NOT NULL,
//		  `content` VARCHAR(2000) NOT NULL,
//		  `regDate` TIMESTAMP NOT NULL DEFAULT current_timestamp,
//		  `hits` INT NOT NULL DEFAULT 0,
//		  `reseq` INT NOT NULL DEFAULT 1,
//		  `depth` INT NOT NULL DEFAULT 0,
//		  PRIMARY KEY (`bno`));

public class BoardVO {

	private int bno;
	private int gno;
	private String writer;
	private String title;
	private String content;
	private int totalCnt;

	private Date regDate;
	private int hits;
	private int reseq;
	private int depth;
<<<<<<< HEAD
	private int totalCnt;
	
	public int getTotalCnt() {
		return totalCnt;
	}
	public void setTotalCnt(int totalCnt) {
		this.totalCnt = totalCnt;
	}
=======

>>>>>>> FETCH_HEAD
	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public int getGno() {
		return gno;
	}

	public void setGno(int gno) {
		this.gno = gno;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public int getHits() {
		return hits;
	}

	public void setHits(int hits) {
		this.hits = hits;
	}

	public int getReseq() {
		return reseq;
	}

	public void setReseq(int reseq) {
		this.reseq = reseq;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	public int getTotalCnt() {
		return totalCnt;
	}

	public void setTotalCnt(int totalCnt) {
		this.totalCnt = totalCnt;
	}

	@Override
	public String toString() {
		return "BoardVO [bno=" + bno + ", gno=" + gno + ", writer=" + writer
				+ ", title=" + title + ", content=" + content + ", regDate="
				+ regDate + ", hits=" + hits + ", reseq=" + reseq + ", depth="
				+ depth + ", totalCnt=" + totalCnt + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bno;
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		result = prime * result + depth;
		result = prime * result + gno;
		result = prime * result + hits;
		result = prime * result + ((regDate == null) ? 0 : regDate.hashCode());
		result = prime * result + reseq;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((writer == null) ? 0 : writer.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BoardVO other = (BoardVO) obj;
		if (bno != other.bno)
			return false;
		if (content == null) {
			if (other.content != null)
				return false;
		} else if (!content.equals(other.content))
			return false;
		if (depth != other.depth)
			return false;
		if (gno != other.gno)
			return false;
		if (hits != other.hits)
			return false;
		if (regDate == null) {
			if (other.regDate != null)
				return false;
		} else if (!regDate.equals(other.regDate))
			return false;
		if (reseq != other.reseq)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (writer == null) {
			if (other.writer != null)
				return false;
		} else if (!writer.equals(other.writer))
			return false;
		return true;
	}

}
