def solution(a, b):
    answer = 0

    if a < b :
        startIndex = a
        endIndex = b + 1
    else :
        startIndex = b
        endIndex = a + 1

    for x in range(startIndex, endIndex):
        answer += x

    return answer
