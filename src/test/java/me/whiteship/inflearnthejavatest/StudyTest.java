package me.whiteship.inflearnthejavatest;

import jdk.jfr.Enabled;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;

import java.time.Duration;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class StudyTest {

    @Test
    @DisplayName("스터디 만들기")
//    @EnabledOnOs({OS.MAC, OS.LINUX}) //OS환경에 따라 테스트를 실행 시킬 수 있음.
//    @EnabledOnJre(JRE.JAVA_11) //  JRE버전에 따라 테스트를 실행 시킬 수 있음.
//    @EnabledIfEnvironmentVariable(named = "TEST_ENV", matches="LOCAL")
    void create_new_study() {          //junit 4 에서는 public이여야됨
        String test_env = System.getenv("TEST_ENV");
//        System.out.println(test_env);
//        assumeTrue("LOCAL".equalsIgnoreCase(test_env));  //환경변수 TEST_ENV가 LOCAL이면 실행
        assumingThat("LOCAL".equalsIgnoreCase(test_env), () -> {
            System.out.println("local");
            Study actual = new Study(100);
            assertThat(actual.getLimit()).isGreaterThan(0);
        });
        assumingThat("LOCAL".equalsIgnoreCase(test_env), () -> {
            System.out.println("yongsoo");
            Study actual = new Study(10);
            assertThat(actual.getLimit()).isGreaterThan(0);
        });



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