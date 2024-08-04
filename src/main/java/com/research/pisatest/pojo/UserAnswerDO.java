package com.research.pisatest.pojo;

import java.util.Date;

public class UserAnswerDO {
    private Long id;

    private String userName;

    private Integer ithAnswer;

    private Date testBegin;

    private Date testEnd;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Date getTestBegin() {
        return testBegin;
    }

    public void setTestBegin(Date testBegin) {
        this.testBegin = testBegin;
    }

    public Date getTestEnd() {
        return testEnd;
    }

    public void setTestEnd(Date testEnd) {
        this.testEnd = testEnd;
    }
}