#include <stdio.h>

int solution(int n) {
    int answer = 0;
    while(n > 0){
        answer += n%10;
        n = (n-n%10)/10;
    }
    return answer;
}