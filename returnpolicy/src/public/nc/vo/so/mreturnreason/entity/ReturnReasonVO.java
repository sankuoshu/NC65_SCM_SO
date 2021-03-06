package nc.vo.so.mreturnreason.entity;

/**
 * 功能说明: 基于SmartVO的业务VO.退货原因,1:质量退货 2:新产品退货 3:配额内正常退货 4：其它
 * 调试时可以使用nc.vo.scm.bd.SmartVODataUtils.expose()展示其数据。 Generated By CodeSeed 3.1
 * 修改记录： 修改人, 日期, 说明
 */
import nc.vo.pub.IVOMeta;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory;

public class ReturnReasonVO extends SuperVO {

  // dr
  public static final String DR = "dr";

  // 退货原因类型
  public static final String FREASONTYPE = "freasontype";

  // 集团
  public static final String PK_GROUP = "pk_group";

  // 业务单元
  public static final String PK_ORG = "pk_org";

  // 退货原因主键
  public static final String PK_RETURNREASON = "pk_returnreason";

  // 时间戳
  public static final String TS = "ts";

  // 备注
  public static final String VNOTE = "vnote";

  // 退货原因编码
  public static final String VREASONCODE = "vreasoncode";

  // 退货原因名称
  public static final String VREASONNAME = "vreasonname";

  // 退货原因名称2
  public static final String VREASONNAME2 = "vreasonname2";

  // 退货原因名称3
  public static final String VREASONNAME3 = "vreasonname3";

  // 退货原因名称4
  public static final String VREASONNAME4 = "vreasonname4";

  // 退货原因名称5
  public static final String VREASONNAME5 = "vreasonname5";

  // 退货原因名称6
  public static final String VREASONNAME6 = "vreasonname6";

  // 默认退货责任处理方式
  public static final String VRETURNMODE = "vreturnmode";

  private static final long serialVersionUID = 1L;

  public Integer getDr() {
    return (Integer) this.getAttributeValue(ReturnReasonVO.DR);
  }

  public Integer getFreasontype() {
    return (Integer) this.getAttributeValue(ReturnReasonVO.FREASONTYPE);
  }

  @Override
  public IVOMeta getMetaData() {
    IVOMeta meta = VOMetaFactory.getInstance().getVOMeta("so.returnreason");
    return meta;
  }

  public String getPk_group() {
    return (String) this.getAttributeValue(ReturnReasonVO.PK_GROUP);
  }

  public String getPk_org() {
    return (String) this.getAttributeValue(ReturnReasonVO.PK_ORG);
  }

  public String getPk_returnreason() {
    return (String) this.getAttributeValue(ReturnReasonVO.PK_RETURNREASON);
  }

  public UFDateTime getTs() {
    return (UFDateTime) this.getAttributeValue(ReturnReasonVO.TS);
  }

  public String getVnote() {
    return (String) this.getAttributeValue(ReturnReasonVO.VNOTE);
  }

  public String getVreasoncode() {
    return (String) this.getAttributeValue(ReturnReasonVO.VREASONCODE);
  }

  public String getVreasonname() {
    return (String) this.getAttributeValue(ReturnReasonVO.VREASONNAME);
  }

  public String getVreasonname2() {
    return (String) this.getAttributeValue(ReturnReasonVO.VREASONNAME2);
  }

  public String getVreasonname3() {
    return (String) this.getAttributeValue(ReturnReasonVO.VREASONNAME3);
  }

  public String getVreasonname4() {
    return (String) this.getAttributeValue(ReturnReasonVO.VREASONNAME4);
  }

  public String getVreasonname5() {
    return (String) this.getAttributeValue(ReturnReasonVO.VREASONNAME5);
  }

  public String getVreasonname6() {
    return (String) this.getAttributeValue(ReturnReasonVO.VREASONNAME6);
  }

  public String getVreturnmode() {
    return (String) this.getAttributeValue(ReturnReasonVO.VRETURNMODE);
  }

  public void setDr(Integer dr) {
    this.setAttributeValue(ReturnReasonVO.DR, dr);
  }

  public void setFreasontype(Integer freasontype) {
    this.setAttributeValue(ReturnReasonVO.FREASONTYPE, freasontype);
  }

  public void setPk_group(String pk_group) {
    this.setAttributeValue(ReturnReasonVO.PK_GROUP, pk_group);
  }

  public void setPk_org(String pk_org) {
    this.setAttributeValue(ReturnReasonVO.PK_ORG, pk_org);
  }

  public void setPk_returnreason(String pk_returnreason) {
    this.setAttributeValue(ReturnReasonVO.PK_RETURNREASON, pk_returnreason);
  }

  public void setTs(UFDateTime ts) {
    this.setAttributeValue(ReturnReasonVO.TS, ts);
  }

  public void setVnote(String vnote) {
    this.setAttributeValue(ReturnReasonVO.VNOTE, vnote);
  }

  public void setVreasoncode(String vreasoncode) {
    this.setAttributeValue(ReturnReasonVO.VREASONCODE, vreasoncode);
  }

  public void setVreasonname(String vreasonname) {
    this.setAttributeValue(ReturnReasonVO.VREASONNAME, vreasonname);
  }

  public void setVreasonname2(String vreasonname2) {
    this.setAttributeValue(ReturnReasonVO.VREASONNAME2, vreasonname2);
  }

  public void setVreasonname3(String vreasonname3) {
    this.setAttributeValue(ReturnReasonVO.VREASONNAME3, vreasonname3);
  }

  public void setVreasonname4(String vreasonname4) {
    this.setAttributeValue(ReturnReasonVO.VREASONNAME4, vreasonname4);
  }

  public void setVreasonname5(String vreasonname5) {
    this.setAttributeValue(ReturnReasonVO.VREASONNAME5, vreasonname5);
  }

  public void setVreasonname6(String vreasonname6) {
    this.setAttributeValue(ReturnReasonVO.VREASONNAME6, vreasonname6);
  }

  public void setVreturnmode(String vreturnmode) {
    this.setAttributeValue(ReturnReasonVO.VRETURNMODE, vreturnmode);
  }

}
