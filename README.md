# 카운터앱

## 기본기능 

- '+'버튼을 눌러 카운트를 증가
- '-'버튼을 눌러 카운트를 감소
- 현재 카운트 값을 화면에 표시
- 카운트 값을 0으로 리셋

## 구성요소 

- Model : 단순한 정수 값 처리
- View : '+'와 '-'버튼, 현재 카운트값을 보여주는 텍스트뷰, 리셋 버튼을 포함
- ViewModel : 카운트값을 관리하고, View로부터 받은 사용자 액션에 따라 카운트를 증가, 감소, 리셋하는 로직포함