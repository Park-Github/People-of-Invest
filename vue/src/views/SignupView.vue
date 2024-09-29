<script setup lang="ts"></script>

<template>
    <div class="login-container">
        <div class="login-bg">
            <div class="login-logo">
                <img
                    class="img-fluid"
                    src="@/assets/img/logo.svg"
                    alt=""
                />
            </div>
        </div>

        <div class="login-form-wrap">
            <form class="login-form">
                <h2 class="login-form-header">
                    회원가입 
                </h2>
                <div class="login-form-body">
                    <h3 class="c-grey-900 mb-4">가입정보를 입력해주세요.</h3>
                    <div class="mb-3">
                        <label class="form-label required">
                            이메일
                        </label>
                        <div class="row g-2">
                            <div class="col">
                                <input
                                    type="text"
                                    class="form-control form-control-lg"
                                    placeholder="name@email.com"
                                />
                            </div>
                            <div class="col-auto">
                                <button type="button" class="btn btn-lg btn-light">인증번호 받기</button>
                            </div>
                        </div>
                    </div>
                    <div class="mb-3">
                        <label class="form-label required">
                            인증번호
                        </label>
                        <div class="row g-2">
                            <div class="col">
                                <input
                                    type="text"
                                    class="form-control form-control-lg" placeholder="인증번호를 입력해주세요." required
                                />
                            </div>
                            <div class="col-auto">
                                <button type="button" class="btn btn-lg btn-light">인증번호 입력</button>
                            </div>
                        </div>
                    </div>
                    <div class="mb-3">
                        <label class="form-label required">
                            비밀번호
                        </label>
                        <input
                            type="password"
                            class="form-control form-control-lg"
                            placeholder="비밀번호를 입력해주세요." required
                        />
                    </div>
                    <div class="mb-3">
                        <label class="form-label required">
                            비밀번호 확인
                        </label>
                        <input
                            type="password"
                            class="form-control form-control-lg"
                            placeholder="비밀번호를 확인해주세요." required
                        />
                        <div class="form-text">영문, 숫자, 특수문자 혼합 8-15 자리</div>
                    </div>
                    <div class="mb-3">
                        <label class="form-label required">
                            휴대폰번호
                        </label>
                        <div class="row g-2">
                            <div class="col">
                                <input
                                    type="text"
                                    class="form-control form-control-lg" placeholder="휴대폰번호를 입력해주세요." required
                                />
                            </div>
                            <div class="col-auto">
                                <button type="button" class="btn btn-lg btn-light">인증번호 받기</button>
                            </div>
                        </div>
                    </div>
                    <div class="mb-4">
                        <label class="form-label required">
                            인증번호
                        </label>
                        <div class="row g-2">
                            <div class="col">
                                <input
                                    type="text"
                                    class="form-control form-control-lg" placeholder="인증번호를 입력해주세요." required
                                />
                            </div>
                            <div class="col-auto">
                                <button type="button" class="btn btn-lg btn-light">인증번호 입력</button>
                            </div>
                        </div>
                    </div>
                    <div class="mb-3">
                        <button type="submit" class="btn btn-lg btn-primary w-100">가입하기</button>
                    </div>
                </div>
            </form>
        </div>
    </div>
</template>

<style scoped lang="scss">
.login-container {
    display: flex;
    align-items: stretch;
    justify-content: flex-start;
    height: 100vh;
    max-width: 100%;
    margin: 0;
    padding: 0;
}
.login-bg {
    flex: 1 1 auto;
    position: relative;
    height: 100%;
    background: url(@/assets/img/bg.jpeg) no-repeat center center;
    background-size: cover;
}

.login-logo {
    position: absolute;
    top: 50px;
    left: 50px;
    width: 120px;
    height: 120px;
    padding: 15px;
    background-color: #fff;
    border-radius: 15px;
}

.login-form-wrap {
    position: relative;
    flex: 0 0 auto;
    height: 100%;
    width: 100%;
    background-color: #fff;

    @include media-breakpoint-up(lg) {
        width: 550px;
    }
}

.login-form {
    display: flex;
    flex-direction: column;
    overflow: hidden;
    height: 100%;
    min-width: 0;
    max-width: 550px;
    margin: 0 auto;

    &-header {
        padding: 4rem 5rem 1rem;
        font-size: 2.2rem;
        font-weight: 600;
    }

    &-body {
        flex: 1 1 auto;
        overflow-y: auto;
        padding: 2rem 5rem;
    }

    &-footer {
        display: flex;
        flex-wrap: wrap;
        justify-content: center;
        align-items: center;
        gap: 0.25rem;
        padding: 0 5rem;
    }

    @include media-breakpoint-up(lg) {
        &-footer {
            gap: 0.5rem;
        }
    }
}

.form-label,
.form-check-label {
    font-size: var(--font-size);
    color: var(--body-color);
}

.form-text {
    position: relative;
    margin-top: 0.5rem;
    padding-left: 1rem;
    font-size: 0.75rem;
    color: #93959c;

    &::before {
        content: "·";
        position: absolute;
        top: 0;
        left: 0;
    }
}

</style>
