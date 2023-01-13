https://start.spring.io/
접속 후 Dependencies : SpringWeb, DevTools, Lombok, Thymeleaf, JPA, MariaDB를 추가 후 generate

vscode templates 폴더에 index.html 생성 후 뼈대작업

com에 /controller 패키지 추가 / controller 클래스 생성

콘트롤러에 @Controller 어노테이션과 index 선언 

class 안에 @GetMapping 어노테이션과 index 선언 후 return값을 html에 맞게 입력
http://localhost:8080/ 사이트 확인

static 폴더 안에 해당 링크의 css파일 생성 후 내용 기입 / 정적 경로라서 바로 접근 가능

템플릿 폴더에 fragments 폴더 추가 / common.html을 추가 후 내용 기입

상단의 고정바를 여러 페이지에 동시에 노출하기 위해 thymeleaf 문법으로 추가 / 자세한 문법은 docs 참고

게시판 생성을 위해 controller 패키지에 BoardController 클래스 추가
@Controller 어노테이션 추가 후 이번에는 경로 지정까지 @RequestMapping("/board") 추가
BoardController 클래스 안에 @GetMapping("/list") 어노테이션 추가, list 선언 안에 리턴값으로 "board/list"; 추가
경로 지정을 해줬으므로 board.html을 templates / board폴더에 추가

#게시판 기능

MariaDB 다운
데이터베이스 새로 생성 / mydb 이름 설정 / 사람아이콘 클릭 후 루트계정으로 사용자 추가 / 이름 암호 눌고 객체 추가 후 전체 체크 저장
현재 커넥션 해제 후 세션 추가로 생성한 계정 연결
mydb 우클릭 / 새로생성 테이블 / 이름은 board / 코멘트는 게시판 /
하단 이름은 id(하나의 row의 유일한 값이도미, 우클릭 새인덱스 프라이머리로 설정)
데이터 유형은 자바는 longtype이므로 그에 해당하는 BIGINT
title 추가(제목) / 데이터 유형은 varchar, 기본값이 null이라면 오토로 변경 / content 추가 / 데이터 유형은 길 수 있기 때문에 TEXT로 저장

JAP
만든 게시판 기능을 자바와 연동하기 위해서 사용하는 orm(오브젝트 릴레이셔널 매핑)기술 : 객체 관계형 매핑 = 클래스만 정의하면 사용할 수 있음
이런 기본값을 구현한 것은 하이버네이트이기 때문에 하이버네이트로 진행

데이터 소스 설정
https://springframework.guru/configuring-spring-boot-for-mariadb/
mariadb spring boot 검색하면 상위에 블로그등에 나옴
복사 후 템플릿 폴더 / application.properties에 설정
1 db이름 / 2 유저네임 /3 비번 / 4 클래스 추가했으므로 패스 / 5번은 테스트시 위험하므로 삭제

보드 테이블 연동 com 


