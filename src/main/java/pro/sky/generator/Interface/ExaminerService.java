package pro.sky.generator.Interface;

import pro.sky.generator.Model.Question;

import java.util.Collection;

public interface ExaminerService {

    Collection<Question> getQuestions(int amount);
}
