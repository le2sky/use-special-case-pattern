# 레거시를 special case 패턴을 이용해서 리팩토링 해보기

## 개선 방법

> LegacyStack -> Stack으로 이름 변경 후 개선 진행

### stack 인터페이스 추출
1. 기존 레거시에서 인터페이스 추출
2. 원본 클래스의 이름 변경 및 가능한 경우 인터페이스 사용 체크
3. 기존  Stack을 BoundedStack으로 변경
4. 인터페이스 이름 Stack으로 유지
5. 추출 메서드 선택 후 리팩토링


### zero stack 생성
1. BoundedStack의 make 함수에서 capacity가 0인 경우 익명 클래스 반환
2. 구현한 익명 클래스를 내부 클래스로 추출 (익명을 내부로 변환 F6)
3. 내부를 상위 클래스로 이동

