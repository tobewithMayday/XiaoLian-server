package top.aiome.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseMatch<M extends BaseMatch<M>> extends Model<M> implements IBean {

	public void setMatchId(java.lang.String matchId) {
		set("matchId", matchId);
	}

	public java.lang.String getMatchId() {
		return get("matchId");
	}

	public void setGuiderId(java.lang.String guiderId) {
		set("guiderId", guiderId);
	}

	public java.lang.String getGuiderId() {
		return get("guiderId");
	}

	public void setUserId(java.lang.String userId) {
		set("userId", userId);
	}

	public java.lang.String getUserId() {
		return get("userId");
	}

	public void setFlag(java.lang.Boolean flag) {
		set("flag", flag);
	}

	public java.lang.Boolean getFlag() {
		return get("flag");
	}

	public void setCurrent(java.lang.String current) {
		set("current", current);
	}

	public java.lang.String getCurrent() {
		return get("current");
	}

	public void setTime(java.util.Date time) {
		set("time", time);
	}

	public java.util.Date getTime() {
		return get("time");
	}

	public void setRemark(java.lang.String remark) {
		set("remark", remark);
	}

	public java.lang.String getRemark() {
		return get("remark");
	}

	public void setTravelId(java.lang.String travelId) {
		set("travelId", travelId);
	}

	public java.lang.String getTravelId() {
		return get("travelId");
	}

	public void setSchoolId(java.lang.String schoolId) {
		set("schoolId", schoolId);
	}

	public java.lang.String getSchoolId() {
		return get("schoolId");
	}

}
