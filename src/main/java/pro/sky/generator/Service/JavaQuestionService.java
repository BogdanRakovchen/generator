package pro.sky.generator.Service;


import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pro.sky.generator.Interface.QuestionService;
import pro.sky.generator.Model.Question;

import java.util.*;

@Service
public class JavaQuestionService implements QuestionService {

    Collection<Question> questions = new HashSet<>(Set.of());



    @Override
    public Collection<Question> addQuestion(String question, String answer) {
        questions.add(new Question(question, answer));
        return questions;
    };

//    @Override
//    public Collection<String> getQuestion(String question) {
//        return questions;
//    };
//
//    @Override
//    public Boolean deleteQuestion(String question) {
//       return questions.remove(question);
//
//    };

    public void getRandomQuestion(int amount) {

        new Random().nextInt(amount);
    }



}
