import random

def randomSelect():
    while True:
        random_list = [random.randrange(1, 10), random.randrange(1, 10), random.randrange(1, 10)]
        if len(set(random_list)) == 3:
            break
    return random_list

def checkStrikeOrBall(pitch, com_select):
    result = {'strike': 0, 'ball' : 0}

    for i in range(3):
        if com_select[i] == pitch[i]:
            result['strike'] = result['strike'] + 1
        elif com_select[i] != pitch[i] and pitch.count(com_select[i]) ==1:
            result['ball'] = result['ball'] + 1

    return result

def game():
    pitch = randomSelect()
    com_select = randomSelect()
    result = checkStrikeOrBall(pitch, com_select)
    while result['strike'] is not 3:
        com_select = randomSelect()
        print('Please Insert 3 numbers {}'.format(com_select))

        result = checkStrikeOrBall(pitch, com_select)
        print('{} strike {} ball'.format(result['strike'], result['ball']))

game()
