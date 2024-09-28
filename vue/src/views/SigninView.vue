<script setup lang="ts"></script>

<template>
    <div class="sign-container">
        <div class="sign-bg">
            <div class="sign-logo">
                <img
                    class="img-fluid"
                    src="@/assets/static/images/logo.svg"
                    alt=""
                />
            </div>
        </div>
        <div class="sign-form">
            <h2 class="sign-title">
                Smart Invest 에 오신 것을
                <br />
                환영합니다!
            </h2>
            <form>
                <!-- <div class="input-effect">
                    <input type="text" required />
                    <label>이메일</label>
                    <span class="focus-border"></span>
                </div>
                <div class="input-effect">
                    <input type="text" required />
                    <label>비밀번호</label>
                    <span class="focus-border"></span>
                </div> -->
                <div class="mb-3">
                    <label class="text-normal text-dark form-label">
                        이메일
                    </label>
                    <input
                        type="email"
                        class="form-control"
                        placeholder="이메일을 입력하세요."
                        required
                    />
                </div>
                <div class="mb-3">
                    <label class="text-normal text-dark form-label">
                        비밀번호
                    </label>
                    <input
                        type="password"
                        class="form-control"
                        placeholder="비밀번호를 입력하세요."
                        required
                    />
                </div>
                <div class="form-check mb-3">
                    <input
                        class="form-check-input"
                        type="checkbox"
                        value=""
                        id="flexCheckDefault"
                    />
                    <label class="form-check-label" for="flexCheckDefault">
                        로그인 정보 저장
                    </label>
                </div>
                <button type="button" class="btn btn-black btn-icon">
                    로그인
                </button>
                <div class="row">
                    <div class="col">
                        <button type="button" class="btn">아이디 찾기</button>
                    </div>
                    <div class="col">
                        <button type="button" class="btn">비밀번호 찾기</button>
                    </div>
                    <div class="col">
                        <button type="button" class="btn">회원가입</button>
                    </div>
                </div>

                <hr />
                <button
                    type="button"
                    class="btn btn-kakao btn-icon"
                    onclick="location.href='/oauth2/authorization/kakao'"
                >
                    카카오로 계속하기
                </button>
                <button
                    type="button"
                    class="btn btn-naver btn-icon"
                    onclick="location.href='/oauth2/authorization/naver'"
                >
                    네이버로 계속하기
                </button>
                <button
                    type="button"
                    class="btn btn-apple btn-icon"
                    onclick="location.href='/oauth2/authorization/apple'"
                >
                    Apple로 계속하기
                </button>
                <button
                    type="button"
                    class="btn btn-google btn-icon"
                    onclick="location.href='/oauth2/authorization/google'"
                >
                    Google로 계속하기
                </button>
                <button
                    type="button"
                    class="btn btn-black btn-icon"
                    onclick="location.href='/auth/login'"
                >
                    기존 ID(이메일)로 계속하기
                </button>
                <!-- <div class="">
                    <div class="peers ai-c jc-sb fxw-nw">
                        <div class="peer">
                            <div
                                class="checkbox checkbox-circle checkbox-info peers ai-c"
                            >
                                <input
                                    type="checkbox"
                                    id="inputCall1"
                                    name="inputCheckboxesCall"
                                    class="peer"
                                />
                                <label
                                    for="inputCall1"
                                    class="peers peer-greed js-sb ai-c form-label"
                                >
                                    <span class="peer peer-greed">
                                        자동 로그인
                                    </span>
                                </label>
                            </div>
                        </div>
                        <div class="peer">
                            <button class="btn btn-primary btn-color">
                                로그인
                            </button>
                        </div>
                    </div>
                </div> -->
            </form>
        </div>
    </div>
</template>

<style scoped lang="scss">
.sign-container {
    display: flex;
    align-items: stretch;
    justify-content: flex-start;
    height: 100vh;
    max-width: 100%;
    margin: 0;
    padding: 0;
}
.sign-title {
    font-size: 2.2rem;
    font-weight: 600;
    margin-bottom: 4rem;
}
.sign-bg {
    flex: 1 1 auto;
    position: relative;
    height: 100%;
    background: url(@/assets/img/bg.jpeg) no-repeat center center;
    background-size: cover;
}
.sign-logo {
    position: absolute;
    top: 50px;
    left: 50px;
    width: 120px;
    height: 120px;
    padding: 15px;
    background-color: #fff;
    border-radius: 15px;
}
.sign-form {
    flex: 0 0 auto;
    position: relative;
    height: 100%;
    width: 100%;
    min-width: 320px;
    overflow-y: auto;
    padding: 80px 40px;
    background-color: #fff;

    @media (min-width: 768px) {
        width: 33.33333333%;
    }
}
.required,
input:required {
    content: "*";
    color: #f0295a;
}
.btn {
    display: inline-flex;
    justify-content: center;
    align-items: center;
    border-radius: 0.6rem;
    white-space: nowrap;
    font-size: 1.5rem;
}
</style>
