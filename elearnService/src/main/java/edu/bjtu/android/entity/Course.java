package edu.bjtu.android.entity;

import java.io.Serializable;
import java.util.Date;

public class Course implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column course.id
	 * @mbg.generated
	 */
	private String id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column course.name
	 * @mbg.generated
	 */
	private String name;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column course.code
	 * @mbg.generated
	 */
	private String code;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column course.category_id
	 * @mbg.generated
	 */
	private String categoryId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column course.description
	 * @mbg.generated
	 */
	private String description;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column course.price
	 * @mbg.generated
	 */
	private String price;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column course.status
	 * @mbg.generated
	 */
	private String status;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column course.open_date
	 * @mbg.generated
	 */
	private Date openDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column course.last_update_on
	 * @mbg.generated
	 */
	private Date lastUpdateOn;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column course.level
	 * @mbg.generated
	 */
	private String level;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column course.shared
	 * @mbg.generated
	 */
	private String shared;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column course.shared_url
	 * @mbg.generated
	 */
	private String sharedUrl;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column course.avatar
	 * @mbg.generated
	 */
	private String avatar;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column course.big_avatar
	 * @mbg.generated
	 */
	private String bigAvatar;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column course.certification
	 * @mbg.generated
	 */
	private String certification;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column course.certification_duration
	 * @mbg.generated
	 */
	private String certificationDuration;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table course
	 * @mbg.generated
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column course.id
	 * @return  the value of course.id
	 * @mbg.generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column course.id
	 * @param id  the value for course.id
	 * @mbg.generated
	 */
	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column course.name
	 * @return  the value of course.name
	 * @mbg.generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column course.name
	 * @param name  the value for course.name
	 * @mbg.generated
	 */
	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column course.code
	 * @return  the value of course.code
	 * @mbg.generated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column course.code
	 * @param code  the value for course.code
	 * @mbg.generated
	 */
	public void setCode(String code) {
		this.code = code == null ? null : code.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column course.category_id
	 * @return  the value of course.category_id
	 * @mbg.generated
	 */
	public String getCategoryId() {
		return categoryId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column course.category_id
	 * @param categoryId  the value for course.category_id
	 * @mbg.generated
	 */
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId == null ? null : categoryId.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column course.description
	 * @return  the value of course.description
	 * @mbg.generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column course.description
	 * @param description  the value for course.description
	 * @mbg.generated
	 */
	public void setDescription(String description) {
		this.description = description == null ? null : description.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column course.price
	 * @return  the value of course.price
	 * @mbg.generated
	 */
	public String getPrice() {
		return price;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column course.price
	 * @param price  the value for course.price
	 * @mbg.generated
	 */
	public void setPrice(String price) {
		this.price = price == null ? null : price.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column course.status
	 * @return  the value of course.status
	 * @mbg.generated
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column course.status
	 * @param status  the value for course.status
	 * @mbg.generated
	 */
	public void setStatus(String status) {
		this.status = status == null ? null : status.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column course.open_date
	 * @return  the value of course.open_date
	 * @mbg.generated
	 */
	public Date getOpenDate() {
		return openDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column course.open_date
	 * @param openDate  the value for course.open_date
	 * @mbg.generated
	 */
	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column course.last_update_on
	 * @return  the value of course.last_update_on
	 * @mbg.generated
	 */
	public Date getLastUpdateOn() {
		return lastUpdateOn;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column course.last_update_on
	 * @param lastUpdateOn  the value for course.last_update_on
	 * @mbg.generated
	 */
	public void setLastUpdateOn(Date lastUpdateOn) {
		this.lastUpdateOn = lastUpdateOn;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column course.level
	 * @return  the value of course.level
	 * @mbg.generated
	 */
	public String getLevel() {
		return level;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column course.level
	 * @param level  the value for course.level
	 * @mbg.generated
	 */
	public void setLevel(String level) {
		this.level = level == null ? null : level.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column course.shared
	 * @return  the value of course.shared
	 * @mbg.generated
	 */
	public String getShared() {
		return shared;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column course.shared
	 * @param shared  the value for course.shared
	 * @mbg.generated
	 */
	public void setShared(String shared) {
		this.shared = shared == null ? null : shared.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column course.shared_url
	 * @return  the value of course.shared_url
	 * @mbg.generated
	 */
	public String getSharedUrl() {
		return sharedUrl;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column course.shared_url
	 * @param sharedUrl  the value for course.shared_url
	 * @mbg.generated
	 */
	public void setSharedUrl(String sharedUrl) {
		this.sharedUrl = sharedUrl == null ? null : sharedUrl.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column course.avatar
	 * @return  the value of course.avatar
	 * @mbg.generated
	 */
	public String getAvatar() {
		return avatar;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column course.avatar
	 * @param avatar  the value for course.avatar
	 * @mbg.generated
	 */
	public void setAvatar(String avatar) {
		this.avatar = avatar == null ? null : avatar.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column course.big_avatar
	 * @return  the value of course.big_avatar
	 * @mbg.generated
	 */
	public String getBigAvatar() {
		return bigAvatar;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column course.big_avatar
	 * @param bigAvatar  the value for course.big_avatar
	 * @mbg.generated
	 */
	public void setBigAvatar(String bigAvatar) {
		this.bigAvatar = bigAvatar == null ? null : bigAvatar.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column course.certification
	 * @return  the value of course.certification
	 * @mbg.generated
	 */
	public String getCertification() {
		return certification;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column course.certification
	 * @param certification  the value for course.certification
	 * @mbg.generated
	 */
	public void setCertification(String certification) {
		this.certification = certification == null ? null : certification.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column course.certification_duration
	 * @return  the value of course.certification_duration
	 * @mbg.generated
	 */
	public String getCertificationDuration() {
		return certificationDuration;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column course.certification_duration
	 * @param certificationDuration  the value for course.certification_duration
	 * @mbg.generated
	 */
	public void setCertificationDuration(String certificationDuration) {
		this.certificationDuration = certificationDuration == null ? null : certificationDuration.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table course
	 * @mbg.generated
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", id=").append(id);
		sb.append(", name=").append(name);
		sb.append(", code=").append(code);
		sb.append(", categoryId=").append(categoryId);
		sb.append(", description=").append(description);
		sb.append(", price=").append(price);
		sb.append(", status=").append(status);
		sb.append(", openDate=").append(openDate);
		sb.append(", lastUpdateOn=").append(lastUpdateOn);
		sb.append(", level=").append(level);
		sb.append(", shared=").append(shared);
		sb.append(", sharedUrl=").append(sharedUrl);
		sb.append(", avatar=").append(avatar);
		sb.append(", bigAvatar=").append(bigAvatar);
		sb.append(", certification=").append(certification);
		sb.append(", certificationDuration=").append(certificationDuration);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}
}