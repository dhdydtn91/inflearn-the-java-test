package me.whiteship.inflearnthejavatest;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.ValueSource;


@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
@TestInstance(TestInstance.Lifecycle.PER_METHOD)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class StudyTest {

   //테스트 순서를 드러내지 않는 이유는 단위테스트는 독립적으로 작동해서 다른 테스트에 영향을 주면 안되기 떄문에
   // 순서를 중요시 해도 안되고 순서에 의존해서는 안되지만 예외적으로 순서가 필요할 떄가 있다.
   // 시나리오 테스트 같은경우 테스트 케이스를 나눠 순서대로 실행되고 싶을때가 있을 때가 있는데 이럴때 사용하는 방법


   @Order(1)
   @Test
   @DisplayName("스터디 만들기 1")
    void create_new_study(){
       System.out.println(this);

   }
   @Order(4)
   @Test
   @DisplayName("스터디 만들기 2")
    void create_new_study_again(){
       System.out.println(this);
   }

   @Order(3)
   @Test
   @DisplayName("스터디 만들기 3")
   void create_new_study_todo(){
      System.out.println(this);
   }
   @Order(2)
   @Test
   @DisplayName("스터디 만들기 4")
   void create_new_study_not(){
      System.out.println(this);
   }

}