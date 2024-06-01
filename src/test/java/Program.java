import java.sql.SQLOutput;
import java.time.LocalDate;

import static java.lang.Boolean.FALSE;

public class Program {
    public static void main(String[] args) {
        // 1. Account
        Account account = new Account();
        account.id = 1;
        account.email = "doituong1@test.com";
        account.fullName = "ĐỐI TƯỢNG 1";
        System.out.println("1. Tên của tôi là: " + account.fullName);

        // 2. Answer
        Answer answer = new Answer();
        answer.id = 1;
        answer.content = "answer 1";
        answer.isCorrect = FALSE;
        System.out.println("2. answer content = " + answer.content);

        // 3. Category Question
        CategoryQuestion categoryQuestion = new CategoryQuestion();
        categoryQuestion.id = 1;
        categoryQuestion.name = "category question";
        System.out.println("3. categoryQuestion.name = " + categoryQuestion.name);

        // 4. Department
        Department department = new Department();
        department.id = 1;
        department.name = "department 1";
        System.out.println("4. department = " + department.name);

        // 5. Exam
        Exam exam = new Exam();
        exam.id = 1;
        exam.code = "Đề 1";
        System.out.println("5. exam.code = " + exam.code);

        // 6. Exam Question
        ExamQuestion examQuestion = new ExamQuestion();
        examQuestion.id = 1;
        examQuestion.questionid = 1;
        System.out.println("6. examQuestion.questionid = " + examQuestion.questionid);

        // 7. Group
        Group group = new Group();
        group.id = 1;
        group.name = "group 1";
        System.out.println("7. group = " + group.name);

        // 8. Group Account
        GroupAccount groupAccount = new GroupAccount();
        groupAccount.accountId = 1;
        groupAccount.joinedDate = LocalDate.of(2024, 06, 01);
        groupAccount.groupId = 1;
        System.out.println("8. groupAccount = " + groupAccount.accountId);

        // 9. Position
        Position position = new Position();
        position.id = 1;
        position.name = "position 1";
        System.out.println("9. position.name = " + position.name);

        // 10. Question
        Question question = new Question();
        question.id = 1;
        question.content = "question 1";
        question.createdDate = LocalDate.of(2024, 06, 02);
        System.out.println("10. question.content = " + question.content);

        // 11. Type Question
        TypeQuestion typeQuestion = new TypeQuestion();
        typeQuestion.id = 1;
        typeQuestion.name = "type question";
        System.out.println("11. typeQuestion.name = " + typeQuestion.name);
    }
}
