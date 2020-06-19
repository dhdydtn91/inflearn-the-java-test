package me.whiteship.inflearnthejavatest;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;


@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class StudyTest {
   //@RepeatedTest 반복 횟수와 반복 테스트 이름을 설정 할 수 있다.
   // value = 반복할 횟수  currentRepetition = 현재 반복 횟수 totalRepetitions = 총 반복해야할 횟수
   // repetitionInfo 타입의 인자를 받을 수 있다.
   @DisplayName("스터디 만들기")
   @RepeatedTest(value = 10 ,name ="{displayName}, {currentRepetition}/{totalRepetitions}")
   void repeatTest(RepetitionInfo repetitionInfo){
      System.out.println("test"+repetitionInfo.getCurrentRepetition() + "/" + repetitionInfo.getTotalRepetitions());
   }

   //@ParameterizedTest 테스트에 여러 다른 매개변수를 대입해가며 반복 실행한다.
   // name = 테스트의 이름을 지정할 수있다.
   // @ValueSource 테스트에서 사용할 매개변수를 지정
   @DisplayName("스터디 만들기")
   @ParameterizedTest(name = "{index} {displayName} message={0}")
   @ValueSource(strings = {"날씨가","많이","추워지고","있네요"})
   @EmptySource //E
   @NullSource
   @NullAndEmptySource
   void parameterizedTest(String message) {
      System.out.println(message);
   }


}