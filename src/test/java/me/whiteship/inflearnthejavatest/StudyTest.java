package me.whiteship.inflearnthejavatest;

import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.*;


@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
@TestInstance(TestInstance.Lifecycle.PER_METHOD) //이 설정으로 하면 클래스에서 하나의 인스턴스를 공유하기떄문에 @BeforeAll, @AfterforeAll 메서드를 static으로 안 만들어도됨
class StudyTest {

   int value  = 1;
   //기본적으로 테스트간의 의존성을 없애기 위해서 테스트 인스턴스는 테스트 메서드마다 다르게 생성된다
    // Junit5에서는 클래스 마다 인스턴스를 생성하게 설정 할 수 있음

   @Test
   @DisplayName("스터디 만들기 1")
    void create_new_study(){
       System.out.println(this);
       System.out.println("스터디 만들기"+value++);
   }
   @Test
   @DisplayName("스터디 만들기 2")
    void create_new_study_again(){
       System.out.println(this);
       System.out.println("스터디 만들기" + value++);
   }

}