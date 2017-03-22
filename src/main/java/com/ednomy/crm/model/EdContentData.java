package com.ednomy.crm.model;

import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

import com.ednomy.crm.util.CustomJsonDateDeserializer;
import com.ednomy.crm.util.CustomJsonDateSerializer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonInclude(Include.NON_NULL)
public class EdContentData {

	private Long id;

	private Long displayOrder;

	private String title;

	private String content;

	private String type;

	private String version;

	private String linkRef;

	private String language;

	private Long isRead;

	private Long category;

	private String role;

	private EdUser endUser;

	private EdContentCollection edContentCollection;

	private String st1;

	private String st2;

	private String st3;

	private String st4;

	private String st5;

	private String st6;

	private String st7;

	private String st8;

	private String st9;

	private String st10;
	
	private String st11;

	private String st12;

	private String st13;

	private String st14;

	private String st15;

	private String st16;

	private String st17;

	private String st18;

	private String st19;

	private String st20;

	private String lt1;

	private String lt2;

	private String lt3;

	private String lt4;

	private String lt5;

	private String lt6;

	private String lt7;

	private String lt8;

	private String lt9;

	private String lt10;
	
	private String lt11;

	private String lt12;

	private String lt13;

	private String lt14;

	private String lt15;

	private String lt16;

	private String lt17;

	private String lt18;

	private String lt19;

	private String lt20;

	private Long ln1;

	private Long ln2;

	private Long ln3;

	private Long ln4;

	private Long ln5;

	private Long ln6;

	private Long ln7;

	private Long ln8;

	private Long ln9;

	private Long ln10;

	private Double dn1;

	private Double dn2;

	private Double dn3;

	private Double dn4;

	private Double dn5;

	private Double dn6;

	private Double dn7;

	private Double dn8;

	private Double dn9;

	private Double dn10;

	private String media1;

	private String media2;

	private String media3;

	private String media4;

	private String media5;

	private String media6;

	private String media7;

	private String media8;

	private String media9;

	private String media10;
	
	private String ref1;
	
	@JsonDeserialize(using = CustomJsonDateDeserializer.class)
	@JsonSerialize(using = CustomJsonDateSerializer.class)
	private Date date1;

	@JsonDeserialize(using = CustomJsonDateDeserializer.class)
	@JsonSerialize(using = CustomJsonDateSerializer.class)
	private Date date2;

	@JsonDeserialize(using = CustomJsonDateDeserializer.class)
	@JsonSerialize(using = CustomJsonDateSerializer.class)
	private Date date3;

	@JsonDeserialize(using = CustomJsonDateDeserializer.class)
	@JsonSerialize(using = CustomJsonDateSerializer.class)
	private Date date4;

	@JsonDeserialize(using = CustomJsonDateDeserializer.class)
	@JsonSerialize(using = CustomJsonDateSerializer.class)
	private Date date5;

	@JsonDeserialize(using = CustomJsonDateDeserializer.class)
	@JsonSerialize(using = CustomJsonDateSerializer.class)
	private Date date6;

	@JsonDeserialize(using = CustomJsonDateDeserializer.class)
	@JsonSerialize(using = CustomJsonDateSerializer.class)
	private Date date7;

	@JsonDeserialize(using = CustomJsonDateDeserializer.class)
	@JsonSerialize(using = CustomJsonDateSerializer.class)
	private Date date8;

	@JsonDeserialize(using = CustomJsonDateDeserializer.class)
	@JsonSerialize(using = CustomJsonDateSerializer.class)
	private Date date9;

	@JsonDeserialize(using = CustomJsonDateDeserializer.class)
	@JsonSerialize(using = CustomJsonDateSerializer.class)
	private Date date10;

	private String category1;

	private String category2;

	private String category3;

	private String category4;

	private String category5;
	
	@JsonIgnore
	private MultipartFile multipartFile1;

	@JsonIgnore
	private MultipartFile multipartFile2;

	@JsonIgnore
	private MultipartFile multipartFile3;

	@JsonIgnore
	private MultipartFile multipartFile4;

	@JsonIgnore
	private MultipartFile multipartFile5;

	@JsonIgnore
	private MultipartFile multipartFile6;

	@JsonIgnore
	private MultipartFile multipartFile7;

	@JsonIgnore
	private MultipartFile multipartFile8;

	@JsonIgnore
	private MultipartFile multipartFile9;

	@JsonIgnore
	private MultipartFile multipartFile10;

	@JsonIgnore
	private MultipartFile contentFile;

	private String base64_1;

	private String base64_2;

	private String base64_3;

	private String base64_4;

	private String base64_5;

	private String base64_6;

	private String base64_7;

	private String base64_8;

	private String base64_9;

	private String base64_10;

	private String contentBase64;

	private String detail;
	
	private Long status1;
	
	private Long status2;
	
	private Long status3;
	
	@JsonDeserialize(using = CustomJsonDateDeserializer.class)
	@JsonSerialize(using = CustomJsonDateSerializer.class)
	private Date receivedDate = new Date();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getDisplayOrder() {
		return displayOrder;
	}

	public void setDisplayOrder(Long displayOrder) {
		this.displayOrder = displayOrder;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getLinkRef() {
		return linkRef;
	}

	public void setLinkRef(String linkRef) {
		this.linkRef = linkRef;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Long getIsRead() {
		return isRead;
	}

	public void setIsRead(Long isRead) {
		this.isRead = isRead;
	}

	public Long getCategory() {
		return category;
	}

	public void setCategory(Long category) {
		this.category = category;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public EdUser getEndUser() {
		return endUser;
	}

	public void setEndUser(EdUser endUser) {
		this.endUser = endUser;
	}

	public EdContentCollection getEdContentCollection() {
		return edContentCollection;
	}

	public void setEdContentCollection(EdContentCollection edContentCollection) {
		this.edContentCollection = edContentCollection;
	}

	public String getSt1() {
		return st1;
	}

	public void setSt1(String st1) {
		this.st1 = st1;
	}

	public String getSt2() {
		return st2;
	}

	public void setSt2(String st2) {
		this.st2 = st2;
	}

	public String getSt3() {
		return st3;
	}

	public void setSt3(String st3) {
		this.st3 = st3;
	}

	public String getSt4() {
		return st4;
	}

	public void setSt4(String st4) {
		this.st4 = st4;
	}

	public String getSt5() {
		return st5;
	}

	public void setSt5(String st5) {
		this.st5 = st5;
	}

	public String getSt6() {
		return st6;
	}

	public void setSt6(String st6) {
		this.st6 = st6;
	}

	public String getSt7() {
		return st7;
	}

	public void setSt7(String st7) {
		this.st7 = st7;
	}

	public String getSt8() {
		return st8;
	}

	public void setSt8(String st8) {
		this.st8 = st8;
	}

	public String getSt9() {
		return st9;
	}

	public void setSt9(String st9) {
		this.st9 = st9;
	}

	public String getSt10() {
		return st10;
	}

	public void setSt10(String st10) {
		this.st10 = st10;
	}

	public String getSt11() {
		return st11;
	}

	public void setSt11(String st11) {
		this.st11 = st11;
	}

	public String getSt12() {
		return st12;
	}

	public void setSt12(String st12) {
		this.st12 = st12;
	}

	public String getSt13() {
		return st13;
	}

	public void setSt13(String st13) {
		this.st13 = st13;
	}

	public String getSt14() {
		return st14;
	}

	public void setSt14(String st14) {
		this.st14 = st14;
	}

	public String getSt15() {
		return st15;
	}

	public void setSt15(String st15) {
		this.st15 = st15;
	}

	public String getSt16() {
		return st16;
	}

	public void setSt16(String st16) {
		this.st16 = st16;
	}

	public String getSt17() {
		return st17;
	}

	public void setSt17(String st17) {
		this.st17 = st17;
	}

	public String getSt18() {
		return st18;
	}

	public void setSt18(String st18) {
		this.st18 = st18;
	}

	public String getSt19() {
		return st19;
	}

	public void setSt19(String st19) {
		this.st19 = st19;
	}

	public String getSt20() {
		return st20;
	}

	public void setSt20(String st20) {
		this.st20 = st20;
	}

	public String getLt1() {
		return lt1;
	}

	public void setLt1(String lt1) {
		this.lt1 = lt1;
	}

	public String getLt2() {
		return lt2;
	}

	public void setLt2(String lt2) {
		this.lt2 = lt2;
	}

	public String getLt3() {
		return lt3;
	}

	public void setLt3(String lt3) {
		this.lt3 = lt3;
	}

	public String getLt4() {
		return lt4;
	}

	public void setLt4(String lt4) {
		this.lt4 = lt4;
	}

	public String getLt5() {
		return lt5;
	}

	public void setLt5(String lt5) {
		this.lt5 = lt5;
	}

	public String getLt6() {
		return lt6;
	}

	public void setLt6(String lt6) {
		this.lt6 = lt6;
	}

	public String getLt7() {
		return lt7;
	}

	public void setLt7(String lt7) {
		this.lt7 = lt7;
	}

	public String getLt8() {
		return lt8;
	}

	public void setLt8(String lt8) {
		this.lt8 = lt8;
	}

	public String getLt9() {
		return lt9;
	}

	public void setLt9(String lt9) {
		this.lt9 = lt9;
	}

	public String getLt10() {
		return lt10;
	}

	public void setLt10(String lt10) {
		this.lt10 = lt10;
	}

	public String getLt11() {
		return lt11;
	}

	public void setLt11(String lt11) {
		this.lt11 = lt11;
	}

	public String getLt12() {
		return lt12;
	}

	public void setLt12(String lt12) {
		this.lt12 = lt12;
	}

	public String getLt13() {
		return lt13;
	}

	public void setLt13(String lt13) {
		this.lt13 = lt13;
	}

	public String getLt14() {
		return lt14;
	}

	public void setLt14(String lt14) {
		this.lt14 = lt14;
	}

	public String getLt15() {
		return lt15;
	}

	public void setLt15(String lt15) {
		this.lt15 = lt15;
	}

	public String getLt16() {
		return lt16;
	}

	public void setLt16(String lt16) {
		this.lt16 = lt16;
	}

	public String getLt17() {
		return lt17;
	}

	public void setLt17(String lt17) {
		this.lt17 = lt17;
	}

	public String getLt18() {
		return lt18;
	}

	public void setLt18(String lt18) {
		this.lt18 = lt18;
	}

	public String getLt19() {
		return lt19;
	}

	public void setLt19(String lt19) {
		this.lt19 = lt19;
	}

	public String getLt20() {
		return lt20;
	}

	public void setLt20(String lt20) {
		this.lt20 = lt20;
	}

	public Long getLn1() {
		return ln1;
	}

	public void setLn1(Long ln1) {
		this.ln1 = ln1;
	}

	public Long getLn2() {
		return ln2;
	}

	public void setLn2(Long ln2) {
		this.ln2 = ln2;
	}

	public Long getLn3() {
		return ln3;
	}

	public void setLn3(Long ln3) {
		this.ln3 = ln3;
	}

	public Long getLn4() {
		return ln4;
	}

	public void setLn4(Long ln4) {
		this.ln4 = ln4;
	}

	public Long getLn5() {
		return ln5;
	}

	public void setLn5(Long ln5) {
		this.ln5 = ln5;
	}

	public Long getLn6() {
		return ln6;
	}

	public void setLn6(Long ln6) {
		this.ln6 = ln6;
	}

	public Long getLn7() {
		return ln7;
	}

	public void setLn7(Long ln7) {
		this.ln7 = ln7;
	}

	public Long getLn8() {
		return ln8;
	}

	public void setLn8(Long ln8) {
		this.ln8 = ln8;
	}

	public Long getLn9() {
		return ln9;
	}

	public void setLn9(Long ln9) {
		this.ln9 = ln9;
	}

	public Long getLn10() {
		return ln10;
	}

	public void setLn10(Long ln10) {
		this.ln10 = ln10;
	}

	public Double getDn1() {
		return dn1;
	}

	public void setDn1(Double dn1) {
		this.dn1 = dn1;
	}

	public Double getDn2() {
		return dn2;
	}

	public void setDn2(Double dn2) {
		this.dn2 = dn2;
	}

	public Double getDn3() {
		return dn3;
	}

	public void setDn3(Double dn3) {
		this.dn3 = dn3;
	}

	public Double getDn4() {
		return dn4;
	}

	public void setDn4(Double dn4) {
		this.dn4 = dn4;
	}

	public Double getDn5() {
		return dn5;
	}

	public void setDn5(Double dn5) {
		this.dn5 = dn5;
	}

	public Double getDn6() {
		return dn6;
	}

	public void setDn6(Double dn6) {
		this.dn6 = dn6;
	}

	public Double getDn7() {
		return dn7;
	}

	public void setDn7(Double dn7) {
		this.dn7 = dn7;
	}

	public Double getDn8() {
		return dn8;
	}

	public void setDn8(Double dn8) {
		this.dn8 = dn8;
	}

	public Double getDn9() {
		return dn9;
	}

	public void setDn9(Double dn9) {
		this.dn9 = dn9;
	}

	public Double getDn10() {
		return dn10;
	}

	public void setDn10(Double dn10) {
		this.dn10 = dn10;
	}

	public String getMedia1() {
		return media1;
	}

	public void setMedia1(String media1) {
		this.media1 = media1;
	}

	public String getMedia2() {
		return media2;
	}

	public void setMedia2(String media2) {
		this.media2 = media2;
	}

	public String getMedia3() {
		return media3;
	}

	public void setMedia3(String media3) {
		this.media3 = media3;
	}

	public String getMedia4() {
		return media4;
	}

	public void setMedia4(String media4) {
		this.media4 = media4;
	}

	public String getMedia5() {
		return media5;
	}

	public void setMedia5(String media5) {
		this.media5 = media5;
	}

	public String getMedia6() {
		return media6;
	}

	public void setMedia6(String media6) {
		this.media6 = media6;
	}

	public String getMedia7() {
		return media7;
	}

	public void setMedia7(String media7) {
		this.media7 = media7;
	}

	public String getMedia8() {
		return media8;
	}

	public void setMedia8(String media8) {
		this.media8 = media8;
	}

	public String getMedia9() {
		return media9;
	}

	public void setMedia9(String media9) {
		this.media9 = media9;
	}

	public String getMedia10() {
		return media10;
	}

	public void setMedia10(String media10) {
		this.media10 = media10;
	}

	public String getRef1() {
		return ref1;
	}

	public void setRef1(String ref1) {
		this.ref1 = ref1;
	}

	public Date getDate1() {
		return date1;
	}

	public void setDate1(Date date1) {
		this.date1 = date1;
	}

	public Date getDate2() {
		return date2;
	}

	public void setDate2(Date date2) {
		this.date2 = date2;
	}

	public Date getDate3() {
		return date3;
	}

	public void setDate3(Date date3) {
		this.date3 = date3;
	}

	public Date getDate4() {
		return date4;
	}

	public void setDate4(Date date4) {
		this.date4 = date4;
	}

	public Date getDate5() {
		return date5;
	}

	public void setDate5(Date date5) {
		this.date5 = date5;
	}

	public Date getDate6() {
		return date6;
	}

	public void setDate6(Date date6) {
		this.date6 = date6;
	}

	public Date getDate7() {
		return date7;
	}

	public void setDate7(Date date7) {
		this.date7 = date7;
	}

	public Date getDate8() {
		return date8;
	}

	public void setDate8(Date date8) {
		this.date8 = date8;
	}

	public Date getDate9() {
		return date9;
	}

	public void setDate9(Date date9) {
		this.date9 = date9;
	}

	public Date getDate10() {
		return date10;
	}

	public void setDate10(Date date10) {
		this.date10 = date10;
	}

	public String getCategory1() {
		return category1;
	}

	public void setCategory1(String category1) {
		this.category1 = category1;
	}

	public String getCategory2() {
		return category2;
	}

	public void setCategory2(String category2) {
		this.category2 = category2;
	}

	public String getCategory3() {
		return category3;
	}

	public void setCategory3(String category3) {
		this.category3 = category3;
	}

	public String getCategory4() {
		return category4;
	}

	public void setCategory4(String category4) {
		this.category4 = category4;
	}

	public String getCategory5() {
		return category5;
	}

	public void setCategory5(String category5) {
		this.category5 = category5;
	}

	public MultipartFile getMultipartFile1() {
		return multipartFile1;
	}

	public void setMultipartFile1(MultipartFile multipartFile1) {
		this.multipartFile1 = multipartFile1;
	}

	public MultipartFile getMultipartFile2() {
		return multipartFile2;
	}

	public void setMultipartFile2(MultipartFile multipartFile2) {
		this.multipartFile2 = multipartFile2;
	}

	public MultipartFile getMultipartFile3() {
		return multipartFile3;
	}

	public void setMultipartFile3(MultipartFile multipartFile3) {
		this.multipartFile3 = multipartFile3;
	}

	public MultipartFile getMultipartFile4() {
		return multipartFile4;
	}

	public void setMultipartFile4(MultipartFile multipartFile4) {
		this.multipartFile4 = multipartFile4;
	}

	public MultipartFile getMultipartFile5() {
		return multipartFile5;
	}

	public void setMultipartFile5(MultipartFile multipartFile5) {
		this.multipartFile5 = multipartFile5;
	}

	public MultipartFile getMultipartFile6() {
		return multipartFile6;
	}

	public void setMultipartFile6(MultipartFile multipartFile6) {
		this.multipartFile6 = multipartFile6;
	}

	public MultipartFile getMultipartFile7() {
		return multipartFile7;
	}

	public void setMultipartFile7(MultipartFile multipartFile7) {
		this.multipartFile7 = multipartFile7;
	}

	public MultipartFile getMultipartFile8() {
		return multipartFile8;
	}

	public void setMultipartFile8(MultipartFile multipartFile8) {
		this.multipartFile8 = multipartFile8;
	}

	public MultipartFile getMultipartFile9() {
		return multipartFile9;
	}

	public void setMultipartFile9(MultipartFile multipartFile9) {
		this.multipartFile9 = multipartFile9;
	}

	public MultipartFile getMultipartFile10() {
		return multipartFile10;
	}

	public void setMultipartFile10(MultipartFile multipartFile10) {
		this.multipartFile10 = multipartFile10;
	}

	public MultipartFile getContentFile() {
		return contentFile;
	}

	public void setContentFile(MultipartFile contentFile) {
		this.contentFile = contentFile;
	}

	public String getBase64_1() {
		return base64_1;
	}

	public void setBase64_1(String base64_1) {
		this.base64_1 = base64_1;
	}

	public String getBase64_2() {
		return base64_2;
	}

	public void setBase64_2(String base64_2) {
		this.base64_2 = base64_2;
	}

	public String getBase64_3() {
		return base64_3;
	}

	public void setBase64_3(String base64_3) {
		this.base64_3 = base64_3;
	}

	public String getBase64_4() {
		return base64_4;
	}

	public void setBase64_4(String base64_4) {
		this.base64_4 = base64_4;
	}

	public String getBase64_5() {
		return base64_5;
	}

	public void setBase64_5(String base64_5) {
		this.base64_5 = base64_5;
	}

	public String getBase64_6() {
		return base64_6;
	}

	public void setBase64_6(String base64_6) {
		this.base64_6 = base64_6;
	}

	public String getBase64_7() {
		return base64_7;
	}

	public void setBase64_7(String base64_7) {
		this.base64_7 = base64_7;
	}

	public String getBase64_8() {
		return base64_8;
	}

	public void setBase64_8(String base64_8) {
		this.base64_8 = base64_8;
	}

	public String getBase64_9() {
		return base64_9;
	}

	public void setBase64_9(String base64_9) {
		this.base64_9 = base64_9;
	}

	public String getBase64_10() {
		return base64_10;
	}

	public void setBase64_10(String base64_10) {
		this.base64_10 = base64_10;
	}

	public String getContentBase64() {
		return contentBase64;
	}

	public void setContentBase64(String contentBase64) {
		this.contentBase64 = contentBase64;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public Long getStatus1() {
		return status1;
	}

	public void setStatus1(Long status1) {
		this.status1 = status1;
	}

	public Long getStatus2() {
		return status2;
	}

	public void setStatus2(Long status2) {
		this.status2 = status2;
	}

	public Long getStatus3() {
		return status3;
	}

	public void setStatus3(Long status3) {
		this.status3 = status3;
	}

	public Date getReceivedDate() {
		return receivedDate;
	}

	public void setReceivedDate(Date receivedDate) {
		this.receivedDate = receivedDate;
	}
	
}