package me.whiteship.inflearnthejavatest;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class StudyTest {

    @Test
    @DisplayName("스터디 만들기")
    void create_new_study() {          //junit 4 에서는 public이여야됨
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> new Study(-10));
        assertEquals("limit은 0보다 커야한다.",exception.getMessage());
    }

    @BeforeEach //각각의 테스트가 실행된 이전에 실행
    void beforeEach(){
        System.out.println("beforeEach");
    }
    @AfterEach
    void afterEach(){ //각각의 테스트가 실행된 이후에 실행행
        System.out.println("aterEach");
    }
}