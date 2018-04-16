/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.example.demo.demain;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Administrator
 */
@Entity
@Table(name = "dna_diction_bak")
public class DnaDictionBak implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "dictionId")
    private Integer dictionId;
    @Column(name = "parentCode")
    private String parentCode;
    @Column(name = "code")
    private String code;
    @Column(name = "codeNo")
    private String codeNo;
    @Column(name = "value")
    private String value;
    @Column(name = "remark")
    private String remark;
    @Column(name = "code_old")
    private String code_old="";
    @Column(name = "applyer")
    private String applyer = "";  // ������
    @Column(name = "apply_date")
    private String apply_date = ""; //�������� yyyy-MM-dd hh:mm:ss
    @Column(name = "approver", length = 20) //����Ա
    private String approver;
    @Column(name = "approve_date", length = 30) //�������
    private String approve_date;
    @Column(name = "approve_state") //����״̬ Diction_Appr_State.1st:һ����ˣ�Diction_Appr_State.Rej1st��1��������أ� Diction_Appr_State.Pass�����ͨ��
    private String approve_state;
    @Column(name = "approve_remark") //������ע
    private String approve_remark;
    
    public DnaDictionBak() {
    }

    public DnaDictionBak(Integer dictionId) {
        this.dictionId = dictionId;
    }

    public Integer getDictionId() {
        return dictionId;
    }

    public void setDictionId(Integer dictionId) {
        this.dictionId = dictionId;
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCodeNo() {
        return codeNo;
    }

    public void setCodeNo(String codeNo) {
        this.codeNo = codeNo;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

	public String getCode_old() {
		return code_old;
	}

	public void setCode_old(String code_old) {
		this.code_old = code_old;
	}

	public String getApplyer() {
		return applyer;
	}

	public void setApplyer(String applyer) {
		this.applyer = applyer;
	}

	public String getApply_date() {
		return apply_date;
	}

	public void setApply_date(String apply_date) {
		this.apply_date = apply_date;
	}

	public String getApprover() {
		return approver;
	}

	public void setApprover(String approver) {
		this.approver = approver;
	}

	public String getApprove_date() {
		return approve_date;
	}

	public void setApprove_date(String approve_date) {
		this.approve_date = approve_date;
	}

	public String getApprove_state() {
		return approve_state;
	}

	public void setApprove_state(String approve_state) {
		this.approve_state = approve_state;
	}

	public String getApprove_remark() {
		return approve_remark;
	}

	public void setApprove_remark(String approve_remark) {
		this.approve_remark = approve_remark;
	}

    
}
