# 개요
`투자의 민족`은 여러분의 투자에 길잡이가 되어주는 포트폴리오 관리 서비스입니다.


## 개발팀
|                                                          개발 팀장                                                          |                                                                                개발 책임                                                                                 |                                                         설계 책임                                                         |
|:-----------------------------------------------------------------------------------------------------------------------:|:--------------------------------------------------------------------------------------------------------------------------------------------------------------------:|:---------------------------------------------------------------------------------------------------------------------:|
| [<img src="https://avatars.githubusercontent.com/u/114387241?v=4" width="100"><br/>박승호](https://github.com/Park-Github) | [<img src="https://avatars.githubusercontent.com/u/9482578?s=400&u=af4fd0804974d4db05bfe120095336f530a813ac&v=4" width="100"><br/>박찬영](https://github.com/LazoYoung) | [<img src="https://avatars.githubusercontent.com/u/71866711?v=4" width="100"><br/>김태영](https://github.com/paulazzr02) |


## 개발환경 설정
### 프론트 서버
1. 로컬 환경에 `node.js v20.17+`을 설치합니다.
2. 명령 터미널에서 vue 폴더에 진입합니다: `cd vue`
3. JS 패키지를 설치합니다: `npm install`
4. vite 서버를 구동합니다: `npm run dev`

## 코드 컨벤션
프론트엔드는 ESLint + Prettier 조합으로 코드 스타일을 통일합니다.
본인 환경에서 ESLint 가 동작하도록 초기설정이 필요합니다. 아래 문단을 참고하세요.

### Jetbrains IDE
1. 프로젝트 설정을 엽니다: `Ctrl+Alt+S`
2. `Languages & Frameworks > Javascript > Code Quality Tools > ESLint`로 이동합니다.
3. `Automatic ESLint configuration` 항목을 체크합니다.
4. `Run eslint --fix on save` 항목을 체크합니다.

### Visual Studio Code
1. 확장 탭을 엽니다: `Ctrl+Shift+X`
2. `Vue - Official` 확장팩과 `ESLint` 확장팩을 설치합니다.
3. 키보드 단축키를 엽니다: `Ctrl+K Ctrl+S`
4. `File: Save without Formatting`을 검색, 우클릭하여 단축키를 삭제합니다.
5. `File: Save`을 검색, 우클릭하여 `Ctrl+S` 단축키를 할당합니다.
