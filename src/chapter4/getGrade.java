public double getGrade(int score) {
    if(score < 0 || score > 100)
        throw new IllegalArgumentException();
        
    double grade;
    
    if(score < 60) {
        grade = 0.0;
    } else if(60 <= score && score <= 62) {
        grade = 0.7;
    } else if(63 <= score && score <= 94) {
        grade = 0.8 + (score - 63) * 0.1;
    } else {
        grade = 4.0;
    }
    
    return grade;
}
