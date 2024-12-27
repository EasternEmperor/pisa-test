package com.research.pisatest.pojo;

import java.time.LocalDateTime;

public class FlowerGardenDataDO {
    private Long id;

    private String htmlName;

    private String userName;

    private Integer ithAnswer;

    private String event;

    private String eventType;

    private LocalDateTime eventStartTime;

    private Integer eventNumber;

    private String topSetting;

    private String centralSetting;

    private String bottomSetting;

    private String lastSetting;

    private String tempValue;

    private String waterValue;

    private String fertilizerValue;

    private String diagramState;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHtmlName() {
        return htmlName;
    }

    public void setHtmlName(String htmlName) {
        this.htmlName = htmlName == null ? null : htmlName.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Integer getIthAnswer() {
        return ithAnswer;
    }

    public void setIthAnswer(Integer ithAnswer) {
        this.ithAnswer = ithAnswer;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event == null ? null : event.trim();
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType == null ? null : eventType.trim();
    }

    public LocalDateTime getEventStartTime() {
        return eventStartTime;
    }

    public void setEventStartTime(LocalDateTime eventStartTime) {
        this.eventStartTime = eventStartTime;
    }

    public Integer getEventNumber() {
        return eventNumber;
    }

    public void setEventNumber(Integer eventNumber) {
        this.eventNumber = eventNumber;
    }

    public String getTopSetting() {
        return topSetting;
    }

    public void setTopSetting(String topSetting) {
        this.topSetting = topSetting == null ? null : topSetting.trim();
    }

    public String getCentralSetting() {
        return centralSetting;
    }

    public void setCentralSetting(String centralSetting) {
        this.centralSetting = centralSetting == null ? null : centralSetting.trim();
    }

    public String getBottomSetting() {
        return bottomSetting;
    }

    public void setBottomSetting(String bottomSetting) {
        this.bottomSetting = bottomSetting == null ? null : bottomSetting.trim();
    }

    public String getLastSetting() {
        return lastSetting;
    }

    public void setLastSetting(String lastSetting) {
        this.lastSetting = lastSetting == null ? null : lastSetting.trim();
    }

    public String getTempValue() {
        return tempValue;
    }

    public void setTempValue(String tempValue) {
        this.tempValue = tempValue == null ? null : tempValue.trim();
    }

    public String getWaterValue() {
        return waterValue;
    }

    public void setWaterValue(String waterValue) {
        this.waterValue = waterValue == null ? null : waterValue.trim();
    }

    public String getFertilizerValue() {
        return fertilizerValue;
    }

    public void setFertilizerValue(String fertilizerValue) {
        this.fertilizerValue = fertilizerValue == null ? null : fertilizerValue.trim();
    }

    public String getDiagramState() {
        return diagramState;
    }

    public void setDiagramState(String diagramState) {
        this.diagramState = diagramState == null ? null : diagramState.trim();
    }
}