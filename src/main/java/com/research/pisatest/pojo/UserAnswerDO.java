package com.research.pisatest.pojo;

import java.time.LocalDateTime;

public class UserAnswerDO {
    private Long id;

    private String userName;

    private Integer ithAnswer;

    private LocalDateTime testBegin;

    private LocalDateTime testEnd;

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

    public LocalDateTime getTestBegin() {
        return testBegin;
    }

    public void setTestBegin(LocalDateTime testBegin) {
        this.testBegin = testBegin;
    }

    public LocalDateTime getTestEnd() {
        return testEnd;
    }

    public void setTestEnd(LocalDateTime testEnd) {
        this.testEnd = testEnd;
    }
}