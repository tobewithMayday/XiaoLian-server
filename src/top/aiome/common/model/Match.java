package top.aiome.common.model;

import top.aiome.common.model.base.BaseMatch;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
public class Match extends BaseMatch<Match> {
	public static final String CODE_USER_START = "1";
	public static final String CODE_GUIDER_ACCEPT = "2";
	public static final String CODE_USER_ACCEPT = "3";
	public static final String CODE_FAIL_GUIDER_REFUSE = "4";
	public static final String CODE_FAIL_USER_REFUSE = "5";
	public static final Match dao = new Match();
}