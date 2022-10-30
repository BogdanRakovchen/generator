package pro.sky.generator.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pro.sky.generator.Model.Question;
import pro.sky.generator.Service.JavaQuestionService;

import java.util.Collection;

@RestController
@RequestMapping("/exam/java")
public class JavaQuestionController {

    @Autowired
    private JavaQuestionService javaQuestionService;


    @PostMapping("/add")
    public Collection<Question> addQuestion(@RequestParam String question,
                                            @RequestParam String answer) {
        return javaQuestionService.addQuestion(question, answer);
    }

//    @GetMapping("/")
//    public Collection<String> getQuestion(@RequestParam String question) {
//        return javaQuestionService.getQuestion(question);
//    }
//
//    @DeleteMapping("/remove")
//    public Boolean deleteQuestion(@RequestParam String question) {
//        return javaQuestionService.deleteQuestion(question);
//    }



}
