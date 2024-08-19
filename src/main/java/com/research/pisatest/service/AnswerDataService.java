package com.research.pisatest.service;


import com.research.pisatest.entity.AnswerData;

import java.util.List;

public interface AnswerDataService {

    List<AnswerData> getAnswerData(String htmlName);
}
