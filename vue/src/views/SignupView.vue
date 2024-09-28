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
                <div class="login-form-body">
                    <h4 class="fw-300 c-grey-900 mb-4">회원가입</h4>
                    <div class="mb-3">
                        <label class="form-label required">
                            이메일
                        </label>
                        <input
                            type="text"
                            class="form-control"
                            placeholder="name@email.com"
                        />
                    </div>
                    <div class="mb-3">
                        <label class="form-label required">
                            인증번호
                        </label>
                        <input
                            type="number"
                            class="form-control" required
                        />
                    </div>
                    <div class="mb-3">
                        <label class="form-label required">
                            비밀번호
                        </label>
                        <input
                            type="password"
                            class="form-control"
                            placeholder="비밀번호" required
                        />
                    </div>
                    <div class="mb-3">
                        <label class="form-label required">
                            비밀번호 확인
                        </label>
                        <input
                            type="password"
                            class="form-control"
                            placeholder="비밀번호 확인" required
                        />
                    </div>
                    <div class="mb-3">
                        <button type="submit" class="btn btn-primary w-100" disabled>가입하기</button>
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
        width: 500px;
    }
}

.login-form {
    display: flex;
    flex-direction: column;
    min-width: 0;
    max-width: 550px;
    margin: 2rem auto;

    &-header {
        padding: 3rem 5rem;
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
</style>
