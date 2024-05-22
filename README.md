# 🚀 "ROPA" - 2조 파이널 프로젝트

<div style="display: flex; flex-direction: column; align-items: center; justify-content: center; ">
  <div style="width: 400px; height: auto; display: flex; justify-content: center; align-items: center;">
    <img src="https://github.com/chugue/ropa-admin/assets/30003848/70af4146-2333-412b-b2fd-8eb1be45f8e7" alt="시연01" style="width: 100%; height: auto;"/>
  </div>
</div>

<br>

# 👉 코디 아이템 중개 플랫폼

---
> ### 개발기간: 2024.04.17 ~ 2024.05.22

## 배포 주소
> ####  프론트 서버 : [https://github.com/chugue/ropa-flutter-project](https://github.com/chugue/ropa-admin)<br>
> #### 백엔드 서버 : [https://github.com/chugue/ropa-admin](http://voluntain.cs.skku.edu:2223/)<br>
<br>

# 👉 개발팀 소개

---

|                                     김성훈(팀장)                                      |                                     김주혁(프론트)                                      |                                    양승호(프론트)                                     |                                     김완준(백엔드)                                     |                                     박선규(백엔드)                                      |
|:--------------------------------------------------------------------------------:|:---------------------------------------------------------------------------------:|:-------------------------------------------------------------------------------:|:--------------------------------------------------------------------------------:|:---------------------------------------------------------------------------------:|
| <img width="160px" src="https://avatars.githubusercontent.com/u/30003848?v=4" /> | <img width="160px" src="https://avatars.githubusercontent.com/u/153582123?v=4" /> | <img width="160px" src="https://avatars.githubusercontent.com/u/97007464?v=4"/> | <img width="160px" src="https://avatars.githubusercontent.com/u/81667935?v=4" /> | <img width="160px" src="https://avatars.githubusercontent.com/u/153582360?v=4" /> |
|                       [@chugue](https://github.com/chugue)                       |                    [@kjh5848](https://github.com/kjh5848)                     |                   [@LifeIsOne](https://github.com/LifeIsOne)                    |                   [@tkffkels93](https://github.com/tkffkels93)                   |                       [@p4rksk](https://github.com/p4rksk)                        |

<br>

# 👉프로젝트 소개 (핵심로직 설명)

---
> #### 로파는 의류를 판매하는 쇼핑몰 앱입니다.
> #### 브랜드는 로파 플랫폼에 입점을 하여서 상품을 등록하고
> #### 개성있는 크리에이터들은 자신의 코디를 자랑하며 보다 활용성 있게 브랜드 제품을 홍보하고,
> #### 사용자는 맘에 드는 코디를 발견하면 해당 아이템을 바로 구매 할 수 있습니다.
> #### 코디를 통해 판매된 제품은 해당 브랜드가 크리에이터와 플랫폼에게 수수료를 지불합니다.
> #### 때문에 브랜드는 홍보비를 아낄 수 있고, 크리에이터에겐 자신의 표현과 수익을 얻을 수 있는 환경을 제공합니다.


<div style="display: flex; flex-direction: row; gap: 10px;">
  <div style="width: 20%; height: 20%; ">
    <img src="https://github.com/chugue/ropa-admin/assets/30003848/be6278ad-77fc-4cc7-8d8f-f4e735ce2a2f" alt="시연01" style="width: 100%; height: auto;"/>
  </div>
  <div style="width: 80%; height: 20%; ">
    <img src="https://github.com/chugue/ropa-admin/assets/30003848/014532ae-1d72-4dcd-b99d-a6fc5dbccb51" alt="시연02" style="width: 100%; height: auto;"/>
  </div>
</div>

<br>

#  👉 Stacks

---

![Visual Studio Code](https://img.shields.io/badge/Visual%20Studio%20Code-007ACC?style=for-the-badge&logo=Visual%20Studio%20Code&logoColor=white)
![Git](https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=Git&logoColor=white)
![HTML5](https://img.shields.io/badge/html5-E34F26?style=for-the-badge&logo=html5&logoColor=white)
![BootStrap](https://img.shields.io/badge/bootstrap-7952B3?style=for-the-badge&logo=bootstrap&logoColor=white)
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
![Flutter](https://img.shields.io/badge/flutter-02569B?style=for-the-badge&logo=flutter&logoColor=white)
![AmazonAWS](https://img.shields.io/badge/amazonaws-232F3E?style=for-the-badge&logo=amazonaws&logoColor=white)
![Gradle](https://img.shields.io/badge/gradle-02303A?style=for-the-badge&logo=gradle&logoColor=white)
![Dart](https://img.shields.io/badge/dart-%230175C2.svg?style=for-the-badge&logo=dart&logoColor=white)	![Hibernate](https://img.shields.io/badge/Hibernate-59666C?style=for-the-badge&logo=Hibernate&logoColor=white)

### Communication
![Slack](https://img.shields.io/badge/Slack-4A154B?style=for-the-badge&logo=Slack&logoColor=white)
![Notion](https://img.shields.io/badge/Notion-000000?style=for-the-badge&logo=Notion&logoColor=white)

<br>

# 👉 Dependencies

---
```
dependencies {
    implementation 'org.springframework.boot:spring-boot-starter-mustache'
    implementation group: 'org.apache.commons', name: 'commons-lang3', version: '3.0'
    implementation group: 'com.auth0', name: 'java-jwt', version: '4.3.0'
    implementation 'org.springframework.boot:spring-boot-starter-validation'
    implementation 'org.springframework.boot:spring-boot-starter-aop'
    implementation 'com.google.code.gson:gson:2.10.1'
    implementation group: 'org.qlrm', name: 'qlrm', version: '4.0.1'
    implementation 'org.springframework.boot:spring-boot-starter-data-jpa'
    implementation 'org.springframework.boot:spring-boot-starter-web'
    compileOnly 'org.projectlombok:lombok'
    developmentOnly 'org.springframework.boot:spring-boot-devtools'
    runtimeOnly 'com.h2database:h2'
    runtimeOnly 'com.mysql:mysql-connector-j'
    annotationProcessor 'org.projectlombok:lombok'
    testImplementation 'org.springframework.boot:spring-boot-starter-test'
    implementation 'commons-codec:commons-codec:1.15'
}
```
<br>

# 👉 테이블 설계

---
![테이블설계](https://github.com/chugue/ropa-admin/assets/30003848/32b69b90-bf14-445d-a710-7fdb83cad700)



<br>

# 👉 프로젝트 기능 정리

---

> ### 1단계   (🟦: WEB,  🟨:APP) 
* #### 🟦 화면 구축
* #### 🟨 화면 구축
* #### 🟦 로그인 인터셉터 - 세션 기반
* #### 🟨 로그인 인터셉터 - JWT 토큰 인증
* #### 🟦 아이템 등록 구현
* #### 🟨 크리에이터 지원하기 
* #### 🟦 크리에이터 지원자 조회 / 승인
* #### 🟨 크리에이터 코디 등록
* #### 🟨 크리에이터 코디 - 아이템 연결
* #### 🟨 일반사용자 아이템 상세보기 / 구매
* #### 🟦 브랜드 수수료 지급 로직 구현

> ### 2단계   (🟦: WEB,  🟨:APP)
* #### 🟦 MultiPartFile 사진 CRUD 구현
* #### 🟨 Base64 사진 CRUD 구현
* #### 🟨 API 문서 작성 GitBook 활용
* #### 🟦 검색어 검색 구현
* #### 🟦 날짜 기간 검색 구현
* #### 🟦 Exception Handler 구현
* #### 🟦 AOP 구현 
* #### 🟨 장바구니 CRUD 구현
* #### 🟨 ImagePicker 적용
* #### 🟨 Dio 데이터 송수신 & 바인딩  
* #### 🟨 RiverPod을 활용한 MVVM패턴 적용
* #### 🟨 Splash Screen / 자동로그인 구현

> ### 3단계 (🟦: WEB,  🟨:APP)
* #### 🟦 단위 테스트 적용 
* #### 🟦 RestDoc API 문서 작성
* #### 🟦 통합 테스트
* #### 🟦 CI / CD 배포
* #### 🟨 CopyWith 적용으로 코드 가독성 향상 
* #### 🟨 CopyWith 적용으로 코드 가독성 향상
* #### 웹] MultiPartFile 사진 업로드 구현
* #### Resource Handler 구축

> ### 4단계 (🟦: WEB,  🟨:APP)
* #### 🟦 단위 테스트 적용
* #### 🟦 RestDoc API 문서 작성
* #### 🟦 통합 테스트
* #### 🟦 CI / CD 배포
* #### 웹] 로그인 / 회원 가입 구현
* #### 웹] 아이템 등록 구현
* #### 웹] MultiPartFile 사진 업로드 구현
* #### Resource Handler 구축


# 👉 API 문서 

---




## 시작 가이드
### Requirements
For building and running the application you need:

- [Node.js 14.19.3](https://nodejs.org/ca/blog/release/v14.19.3/)
- [Npm 9.2.0](https://www.npmjs.com/package/npm/v/9.2.0)
- [Strapi 3.6.6](https://www.npmjs.com/package/strapi/v/3.6.6)

### Installation
``` bash
$ git clone https://github.com/Voluntain-SKKU/Voluntain-2nd.git
$ cd Voluntain-2nd
```
#### Backend
```
$ cd strapi-backend
$ nvm use v.14.19.3
$ npm install
$ npm run develop
```

#### Frontend
```
$ cd voluntain-app
$ nvm use v.14.19.3
$ npm install 
$ npm run dev
```
---
## 화면 구성 📺
| 메인 페이지  |  소개 페이지   |
| :-------------------------------------------: | :------------: |
|  <img width="329" src="https://user-images.githubusercontent.com/50205887/208036155-a57900f7-c68a-470d-923c-ff3c296ea635.png"/> |  <img width="329" src="https://user-images.githubusercontent.com/50205887/208036645-a76cf400-85bc-4fa2-af72-86d2abf61366.png"/>|  
| 강좌 소개 페이지   |  강의 영상 페이지   |  
| <img width="329" src="https://user-images.githubusercontent.com/50205887/208038737-2b32b7d2-25f4-4949-baf5-83b5c02915a3.png"/>   |  <img width="329" src="https://user-images.githubusercontent.com/50205887/208038965-43a6318a-7b05-44bb-97c8-b08b0495fba7.png"/>     |

---
## 주요 기능 📦

### ⭐️ 강좌 선택 및 강의 영상 시청 기능
- Scratch, Python 2개 강좌 및 각 강좌마다 10개 가량의 강의 영상 제공
- 추후 지속적으로 강좌 추가 및 업로드 예정

### ⭐️ 강의 관련 및 단체에 대한 자유로운 댓글 작성 가능
- Disqus를 이용하여 강의 관련 질문이나 단체에 대한 질문 작성 가능

### ⭐️ 이어 학습하기 기능
- Cookie 기능을 이용하여 이전에 학습했던 내용 이후부터 바로 학습 가능

---
## 아키텍쳐

### 디렉토리 구조
```bash
├── README.md
├── package-lock.json
├── package.json
├── strapi-backend : 
│   ├── README.md
│   ├── api : db model, api 관련 정보 폴더
│   │   ├── about
│   │   ├── course
│   │   └── lecture
│   ├── config : 서버, 데이터베이스 관련 정보 폴더
│   │   ├── database.js
│   │   ├── env : 배포 환경(NODE_ENV = production) 일 때 설정 정보 폴더
│   │   ├── functions : 프로젝트에서 실행되는 함수 관련 정보 폴더
│   │   └── server.js
│   ├── extensions
│   │   └── users-permissions : 권한 정보
│   ├── favicon.ico
│   ├── package-lock.json
│   ├── package.json
│   └── public
│       ├── robots.txt
│       └── uploads : 강의 별 사진
└── voluntain-app : 프론트엔드
    ├── README.md
    ├── components
    │   ├── CourseCard.js
    │   ├── Footer.js
    │   ├── LectureCards.js
    │   ├── MainBanner.js : 메인 페이지에 있는 남색 배너 컴포넌트, 커뮤니티 이름과 슬로건을 포함.
    │   ├── MainCard.js
    │   ├── MainCookieCard.js
    │   ├── NavigationBar.js : 네비게이션 바 컴포넌트, _app.js에서 공통으로 전체 페이지에 포함됨.
    │   ├── RecentLecture.js
    │   └── useWindowSize.js
    ├── config
    │   └── next.config.js
    ├── lib
    │   ├── context.js
    │   └── ga
    ├── next.config.js
    ├── package-lock.json
    ├── package.json
    ├── pages
    │   ├── _app.js
    │   ├── _document.js
    │   ├── about.js
    │   ├── course
    │   ├── index.js
    │   ├── lecture
    │   ├── newcourse
    │   ├── question.js
    │   └── setting.js
    ├── public
    │   ├── favicon.ico
    │   └── logo_about.png
    └── styles
        └── Home.module.css

```

<!--
```bash
├── README.md : 리드미 파일
│
├── strapi-backend/ : 백엔드
│   ├── api/ : db model, api 관련 정보 폴더
│   │   └── [table 이름] : database table 별로 분리되는 api 폴더 (table 구조, 해당 table 관련 api 정보 저장)
│   │       ├── Config/routes.json : api 설정 파일 (api request에 따른 handler 지정)
│   │       ├── Controllers/ [table 이름].js : api controller 커스텀 파일
│   │       ├── Models : db model 관련 정보 폴더
│   │       │   ├── [table 이름].js : (사용 X) api 커스텀 파일
│   │       │   └── [table 이름].settings.json : model 정보 파일 (field 정보)
│   │       └─── Services/ course.js : (사용 X) api 커스텀 파일
│   │ 
│   ├── config/ : 서버, 데이터베이스 관련 정보 폴더
│   │   ├── Env/production : 배포 환경(NODE_ENV = production) 일 때 설정 정보 폴더
│   │   │   └── database.js : production 환경에서 database 설정 파일
│   │   ├── Functions : 프로젝트에서 실행되는 함수 관련 정보 폴더
│   │   │   │   ├── responses : (사용 X) 커스텀한 응답 저장 폴더
│   │   │   │   ├── bootstrap.js : 어플리케이션 시작 시 실행되는 코드 파일
│   │   │   │   └── cron.js : (사용 X) cron task 관련 파일
│   │   ├── database.js : 기본 개발 환경(NODE_ENV = development)에서 database 설정 파일
│   │   └── server.js : 서버 설정 정보 파일
│   │  
│   ├── extensions/
│   │   └── users-permissions/config/ : 권한 정보
│   │ 
│   └── public/
│       └── uploads/ : 강의 별 사진
│
└── voluntain-app/ : 프론트엔드
    ├── components/
    │   ├── NavigationBar.js : 네비게이션 바 컴포넌트, _app.js에서 공통으로 전체 페이지에 포함됨.
    │   ├── MainBanner.js : 메인 페이지에 있는 남색 배너 컴포넌트, 커뮤니티 이름과 슬로건을 포함.
    │   ├── RecentLecture.js : 사용자가 시청 정보(쿠키)에 따라, 현재/다음 강의를 나타내는 컴포넌트 [호출: MainCookieCard]
    │   ├── MainCookieCard.js : 상위 RecentLecture 컴포넌트에서 전달받은 props를 나타내는 레이아웃 컴포넌트.
    │   ├── MainCard.js : 현재 등록된 course 정보를 백엔드에서 받아서 카드로 나타내는 컴포넌트 [호출: CourseCard]
    │   └── CourseCard.js : 상위 MainCard 컴포넌트에서 전달받은 props를 나타내는 레이아웃 컴포넌트
    │
    ├── config/
    │   └── next.config.js
    │
    ├── lib/
    │   └── ga/
    │   │   └── index.js
    │   └── context.js
    │
    ├── pages/
    │   ├── courses/
    │   │   └── [id].js : 강의 페이지
    │   ├── _app.js : Next.js에서 전체 컴포넌트 구조를 결정, 공통 컴포넌트(navbar, footer)가 선언되도록 customizing 됨.
    │   ├── _document.js : Next.js에서 전체 html 문서의 구조를 결정, lang 속성과 meta tag가 customizing 됨.
    │   ├── about.js : 단체 소개 페이지
    │   ├── index.js : 메인 페이지
    │   ├── question.js : Q&A 페이지
    │   └── setting.js : 쿠키, 구글 애널리틱스 정보 수집 정책 페이지
    │
    ├── public/
    │   ├── favicon.ico : 네비게이션바 이미지
    │   └── logo_about.png : about 페이지 로고 이미지
    │
    └── styles/
        └── Home.module.css

```
-->