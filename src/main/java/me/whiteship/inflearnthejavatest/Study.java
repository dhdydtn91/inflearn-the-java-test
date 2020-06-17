package me.whiteship.inflearnthejavatest;

public class Study {

    public StudyStatus status = StudyStatus.DRAFT;

    int limit ;

    String name;

    public Study(int limit){
        if(limit < 0 ){
            throw new IllegalArgumentException("limit은 0보다 커야한다.");
        }
        this.limit = limit;
    }

    public StudyStatus getStatus() {
        return this.status;
    }

    public int getLimit() {
        return limit;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Study{" +
                "status=" + status +
                ", limit=" + limit +
                ", name='" + name + '\'' +
                '}';
    }
}
