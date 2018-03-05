package com.dataupgrade.bean.sourceDataTable;

import java.util.Date;

public class sfIptPatientRunEngine {
    private Long id;

    private Integer zoneId;

    private Date keyDate;

    private Date updateTime;

    private Date receiveTime;

    private String doctorId;

    private String doctorName;

    private String inDeptId;

    private String inDeptName;

    private String patientId;

    private String eventNo;

    private Integer urgentFlag;

    private Date checkTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getZoneId() {
        return zoneId;
    }

    public void setZoneId(Integer zoneId) {
        this.zoneId = zoneId;
    }

    public Date getKeyDate() {
        return keyDate;
    }

    public void setKeyDate(Date keyDate) {
        this.keyDate = keyDate;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getInDeptId() {
        return inDeptId;
    }

    public void setInDeptId(String inDeptId) {
        this.inDeptId = inDeptId;
    }

    public String getInDeptName() {
        return inDeptName;
    }

    public void setInDeptName(String inDeptName) {
        this.inDeptName = inDeptName;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getEventNo() {
        return eventNo;
    }

    public void setEventNo(String eventNo) {
        this.eventNo = eventNo;
    }

    public Integer getUrgentFlag() {
        return urgentFlag;
    }

    public void setUrgentFlag(Integer urgentFlag) {
        this.urgentFlag = urgentFlag;
    }

    public Date getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }
}