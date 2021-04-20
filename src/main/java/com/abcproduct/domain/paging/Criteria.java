package com.abcproduct.domain.paging;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Criteria {

	/** 現在のページ番号 */
	private int currentPageNo;

	/** ページごとに出力するデータ数 */
	private int recordsPerPage;

	/** ページサイズ*/
	private int pageSize;

	/** 検索キーワード*/
	private String searchKeyword;

	/** 検索タイプ*/
	private String searchType;

	public Criteria() {
		this.currentPageNo = 1;
		this.recordsPerPage = 5;
		this.pageSize = 3;
	}

	public int getStartPage() {
		return (currentPageNo - 1) * recordsPerPage;
	}
}
