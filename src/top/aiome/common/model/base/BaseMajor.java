package top.aiome.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseMajor<M extends BaseMajor<M>> extends Model<M> implements IBean {

	public void setScid(java.lang.Long scid) {
		set("scid", scid);
	}

	public java.lang.Long getScid() {
		return get("scid");
	}

	public void setName(java.lang.String name) {
		set("name", name);
	}

	public java.lang.String getName() {
		return get("name");
	}

	public void setCollegeID(java.lang.Integer collegeID) {
		set("collegeID", collegeID);
	}

	public java.lang.Integer getCollegeID() {
		return get("collegeID");
	}

}
