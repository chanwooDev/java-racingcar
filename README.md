# 문자열 덧셈 계산기

## 요구사항

- 쉼표(,) 또는 콜론(:)을 구분자로 가지는 문자열을 전달하는 경우 구분자를 기준으로 분리한 각 숫자의 합을 반환 (예: “” => 0, "1,2" => 3, "1,2,3" => 6, “1,2:3” => 6)
    - [x] null이나 빈 문자열인 경우 0을 반환한다 "" -> 0
    - [x] 쉼표 또는 콜론을 구분자로 분리한 각 숫자의 합을 반환 "1,2" -> 3
    - [x] 쉼표 또는 콜론을 구분자로 분리한 각 숫자의 합을 반환 "1,2:3" -> 6
- 앞의 기본 구분자(쉼표, 콜론)외에 커스텀 구분자를 지정할 수 있다. 커스텀 구분자는 문자열 앞부분의 “//”와 “\n” 사이에 위치하는 문자를 커스텀 구분자로 사용한다. 예를 들어 “//;\n1;2;3”과 같이
  값을 입력할 경우 커스텀 구분자는 세미콜론(;)이며, 결과 값은 6이 반환되어야 한다.
    - [x] “//”와 “\n” 문자 사이에 커스텀 구분자를 이용하여 계산한다. (예 : “//;\n1;2;3” => 6)
- 문자열 계산기에 숫자 이외의 값 또는 음수를 전달하는 경우 RuntimeException 예외를 throw한다.
    - [x] 음수인 경우 "-1,2,3"
    - [x] 숫자 이외 값인 경우 "a,2,3" , "//;\n^2;3;4"

# 자동차 경주 게임

## 진행 방법

* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정

* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

## 요구 사항

- 레이싱 매니저

- 자동차 이름은 쉼표(,)를 기준으로 구분하며 이름은 5자 이하만 가능하다.
    - [X] 입력 받은 자동차의 이름들을 쉼표를 분리한다.
- 각 자동차에 이름을 부여할 수 있다. 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.

- 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
    - [x] 차가 전진한다
- 사용자는 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.
- 전진하는 조건은 0에서 9 사이에서 random 값을 구한 후 random 값이 4 이상일 경우 전진하고, 3 이하의 값이면 멈춘다.
    - [X] 0에서 9 사이의 랜덤한 숫자를 반환한다.
    - [X] 4 이상일 경우 전진한다
    - [X] 3 미만일 경우 멈춘다.
- 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다. 우승자는 한 명 이상일 수 있다.
    - [X] 자동차들 중 가장 멀리 간 차들의 이름을 반환한다.
    - [X] 자동차들 중 가장 멀리 간 차들의 이름을 반환한다 다른 거리
- 자동차 목록을 관리하는 Cars 객체를 정의한다.
    - [X] 한 턴에 대해 자동차들에게 게임 실행 메시지을 했는지 확인한다.
- 레이싱 매니저
    - [X] 라운드 횟수만큼 Cars 에게 게임 수행 메세지를 전달한다.
- 콘솔 처리
    - [x] 자동차 이름 입력 받기
    - [x] 라운드 입력 받기
    - [x] 한 라운드 결과 출력하기
    - [x] 최종 우승자 출력하기

### new

- 자동차 이름은 쉼표(,)를 기준으로 구분하며 이름은 5자 이하만 가능하다.
    - [x] 자동차에 이름을 부여한다.
    - [x] 자동차 이름은 5자 이하여야한다.

    - [] 입력 받은 자동차의 이름들을 쉼표를 분리한다.
- 각 자동차에 이름을 부여할 수 있다. 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
    - [] 자동차 출력한다?
    -
- 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
    - [] 차가 전진한다
    - [] 차가 전진할 떄 차의 이동거리가 1 증가한다
- 사용자는 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.
    - [] 이동 시도는 한 번당 다같이 진행된다.
    - [] 이동 시도의 필드를 누가 가지고 있을 것인지?
- 전진하는 조건은 0에서 9 사이에서 random 값을 구한 후 random 값이 4 이상일 경우 전진하고, 3 이하의 값이면 멈춘다.
    - [X] 0에서 9 사이의 랜덤한 숫자를 반환한다.
    - [X] 4 이상일 경우 전진한다
    - [X] 3 미만일 경우 멈춘다.
    - [X] 전진한다 - 이동거리가 증가한다
    - [x] 이동거리가 더 크다
    - [] 0에서 9사이 랜덤 숫자를 반환한다
    - [] 4 이상인 경우 전진하고 3 미만일 경우 멈춘다.
- 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다. 우승자는 한 명 이상일 수 있다.
    - [] 가장 멀리간 자동차를 가져온다
    - [] 자동차들 중 가장 멀리 간 차들의 이름을 반환한다.
    - [] 자동차들 중 가장 멀리 간 차들의 이름을 반환한다 다른 거리
- 자동차 목록을 관리하는 Cars 객체를 정의한다.
    - [X] 한 턴에 대해 자동차들에게 게임 실행 메시지을 했는지 확인한다.
- 레이싱 매니저
    - [X] 라운드 횟수만큼 Cars 에게 게임 수행 메세지를 전달한다.
- 콘솔 처리
    - [x] 자동차 이름 입력 받기
    - [x] 라운드 입력 받기
    - [x] 한 라운드 결과 출력하기
    - [x] 최종 우승자 출력하기
    -
- 자동차의 이름
    - [x] 자동차에 이름을 부여한다.
    - [x] 자동차 이름은 5자 이하여야한다.
- 자동차의 거리
    - [] equals hashcode

