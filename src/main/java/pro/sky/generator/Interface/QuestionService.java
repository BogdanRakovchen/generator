package pro.sky.generator.Interface;

import pro.sky.generator.Model.Question;

import java.util.Collection;

public interface QuestionService {
    Collection<Question> addQuestion(String question, String answer);
//    Collection<Question> getQuestion(String question);
//    Boolean deleteQuestion(String question);
void getRandomQuestion(int amount);
}
