public String season(int m, int d) {
    if(m < 3 || (m == 3 && d <= 15) || (m == 12 && d >= 16)) {
        return "Winter";
    } else if((3 < m && m < 6) || (m == 3 && d >= 16) || (m == 6 && d <= 15)) {
        return "Spring";
    } else if((6 < m && m < 9) || (m == 6 && d >= 16) || (m == 9 && d <= 15)) {
        return "Summer";
    } else {
        return "Fall";
    }
}
