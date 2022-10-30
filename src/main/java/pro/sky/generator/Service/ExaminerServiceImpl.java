package pro.sky.generator.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pro.sky.generator.Interface.ExaminerService;
import pro.sky.generator.Interface.QuestionService;
import pro.sky.generator.Model.Question;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Service
public class ExaminerServiceImpl {

    @Autowired
    private QuestionService questionService;

//    Collection<Question> questions = new HashSet<>(Set.of(
//            questionService.getRandomQuestion(1);
//    ));

//    @Override
//    public Collection<Question> getQuestions(int amount) {
//              questiosService.getQuestions().get(questionService.getRandomQuestion(amout))
//    };


}
