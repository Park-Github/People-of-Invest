<script setup lang="ts">
import { onMounted, inject, ref, nextTick } from "vue";
import Breakpoints from "@/assets/js/mediaVariables";

onMounted(() => {});

// Inject the provided toggle function
const toggleSidebar = inject("toggleSidebar");

// State to track if search is active
const isSearchActive = ref(false);

// Reference for the input element
const searchInput = ref<HTMLInputElement | null>(null);

// Toggle search input visibility and focus
const toggleSearch = () => {
    isSearchActive.value = !isSearchActive.value;

    // Wait for DOM to update, then focus the input
    if (isSearchActive.value) {
        nextTick(() => {
            searchInput.value?.focus();
        });
    }
};
</script>

<template>
    <header class="header navbar">
        <div class="header-container">
            <ul class="nav-left">
                <li>
                    <a
                        href="javascript:void(0);"
                        id="sidebar-toggle"
                        class="sidebar-toggle"
                        @click="toggleSidebar"
                    >
                        <i class="ti-menu"></i>
                    </a>
                </li>
                <li class="search-box" :class="{ active: isSearchActive }">
                    <a
                        class="search-toggle no-pdd-right"
                        href="javascript:void(0);"
                        @click="toggleSearch"
                    >
                        <i class="search-icon ti-search pdd-right-10"></i>
                        <i class="search-icon-close ti-close pdd-right-10"></i>
                    </a>
                </li>
                <li
                    class="search-input"
                    :class="{ active: isSearchActive }"
                    v-show="isSearchActive"
                >
                    <input
                        class="form-control"
                        type="text"
                        placeholder="Search..."
                        ref="searchInput"
                    />
                </li>
            </ul>
            <ul class="nav-right">
                <li class="notifications dropdown">
                    <span class="counter bgc-red">3</span>
                    <a
                        href=""
                        class="dropdown-toggle no-after"
                        id="dropdownMenuButton1"
                        data-bs-toggle="dropdown"
                        aria-expanded="false"
                    >
                        <i class="ti-bell"></i>
                    </a>

                    <ul
                        class="dropdown-menu"
                        aria-labelledby="dropdownMenuButton1"
                    >
                        <li class="pX-20 pY-15 bdB">
                            <i class="ti-bell pR-10"></i>
                            <span class="fsz-sm fw-600 c-grey-900">
                                Notifications
                            </span>
                        </li>
                        <li>
                            <ul
                                class="ovY-a pos-r scrollable lis-n p-0 m-0 fsz-sm"
                            >
                                <li>
                                    <a
                                        href=""
                                        class="peers fxw-nw td-n p-20 bdB c-grey-800 cH-blue bgcH-grey-100"
                                    >
                                        <div class="peer mR-15">
                                            <img
                                                class="w-3r bdrs-50p"
                                                src="https://randomuser.me/api/portraits/men/1.jpg"
                                                alt=""
                                            />
                                        </div>
                                        <div class="peer peer-greed">
                                            <span>
                                                <span class="fw-500">
                                                    John Doe
                                                </span>
                                                <span class="c-grey-600">
                                                    liked your
                                                    <span class="text-dark">
                                                        post
                                                    </span>
                                                </span>
                                            </span>
                                            <p class="m-0">
                                                <small class="fsz-xs">
                                                    5 mins ago
                                                </small>
                                            </p>
                                        </div>
                                    </a>
                                </li>
                                <li>
                                    <a
                                        href=""
                                        class="peers fxw-nw td-n p-20 bdB c-grey-800 cH-blue bgcH-grey-100"
                                    >
                                        <div class="peer mR-15">
                                            <img
                                                class="w-3r bdrs-50p"
                                                src="https://randomuser.me/api/portraits/men/2.jpg"
                                                alt=""
                                            />
                                        </div>
                                        <div class="peer peer-greed">
                                            <span>
                                                <span class="fw-500">
                                                    Moo Doe
                                                </span>
                                                <span class="c-grey-600">
                                                    liked your
                                                    <span class="text-dark">
                                                        cover image
                                                    </span>
                                                </span>
                                            </span>
                                            <p class="m-0">
                                                <small class="fsz-xs">
                                                    7 mins ago
                                                </small>
                                            </p>
                                        </div>
                                    </a>
                                </li>
                                <li>
                                    <a
                                        href=""
                                        class="peers fxw-nw td-n p-20 bdB c-grey-800 cH-blue bgcH-grey-100"
                                    >
                                        <div class="peer mR-15">
                                            <img
                                                class="w-3r bdrs-50p"
                                                src="https://randomuser.me/api/portraits/men/3.jpg"
                                                alt=""
                                            />
                                        </div>
                                        <div class="peer peer-greed">
                                            <span>
                                                <span class="fw-500">
                                                    Lee Doe
                                                </span>
                                                <span class="c-grey-600">
                                                    commented on your
                                                    <span class="text-dark">
                                                        video
                                                    </span>
                                                </span>
                                            </span>
                                            <p class="m-0">
                                                <small class="fsz-xs">
                                                    10 mins ago
                                                </small>
                                            </p>
                                        </div>
                                    </a>
                                </li>
                            </ul>
                        </li>
                        <li class="pX-20 pY-15 ta-c bdT">
                            <span>
                                <a
                                    href=""
                                    class="c-grey-600 cH-blue fsz-sm td-n"
                                >
                                    View All Notifications
                                    <i class="ti-angle-right fsz-xs mL-10"></i>
                                </a>
                            </span>
                        </li>
                    </ul>
                </li>
                <li class="notifications dropdown">
                    <span class="counter bgc-blue">3</span>
                    <a
                        href=""
                        class="dropdown-toggle no-after"
                        data-bs-toggle="dropdown"
                    >
                        <i class="ti-email"></i>
                    </a>

                    <ul class="dropdown-menu">
                        <li class="pX-20 pY-15 bdB">
                            <i class="ti-email pR-10"></i>
                            <span class="fsz-sm fw-600 c-grey-900">Emails</span>
                        </li>
                        <li>
                            <ul
                                class="ovY-a pos-r scrollable lis-n p-0 m-0 fsz-sm"
                            >
                                <li>
                                    <a
                                        href=""
                                        class="peers fxw-nw td-n p-20 bdB c-grey-800 cH-blue bgcH-grey-100"
                                    >
                                        <div class="peer mR-15">
                                            <img
                                                class="w-3r bdrs-50p"
                                                src="https://randomuser.me/api/portraits/men/1.jpg"
                                                alt=""
                                            />
                                        </div>
                                        <div class="peer peer-greed">
                                            <div>
                                                <div
                                                    class="peers jc-sb fxw-nw mB-5"
                                                >
                                                    <div class="peer">
                                                        <p class="fw-500 mB-0">
                                                            John Doe
                                                        </p>
                                                    </div>
                                                    <div class="peer">
                                                        <small class="fsz-xs">
                                                            5 mins ago
                                                        </small>
                                                    </div>
                                                </div>
                                                <span class="c-grey-600 fsz-sm">
                                                    Want to create your own
                                                    customized data generator
                                                    for your app...
                                                </span>
                                            </div>
                                        </div>
                                    </a>
                                </li>
                                <li>
                                    <a
                                        href=""
                                        class="peers fxw-nw td-n p-20 bdB c-grey-800 cH-blue bgcH-grey-100"
                                    >
                                        <div class="peer mR-15">
                                            <img
                                                class="w-3r bdrs-50p"
                                                src="https://randomuser.me/api/portraits/men/2.jpg"
                                                alt=""
                                            />
                                        </div>
                                        <div class="peer peer-greed">
                                            <div>
                                                <div
                                                    class="peers jc-sb fxw-nw mB-5"
                                                >
                                                    <div class="peer">
                                                        <p class="fw-500 mB-0">
                                                            Moo Doe
                                                        </p>
                                                    </div>
                                                    <div class="peer">
                                                        <small class="fsz-xs">
                                                            15 mins ago
                                                        </small>
                                                    </div>
                                                </div>
                                                <span class="c-grey-600 fsz-sm">
                                                    Want to create your own
                                                    customized data generator
                                                    for your app...
                                                </span>
                                            </div>
                                        </div>
                                    </a>
                                </li>
                                <li>
                                    <a
                                        href=""
                                        class="peers fxw-nw td-n p-20 bdB c-grey-800 cH-blue bgcH-grey-100"
                                    >
                                        <div class="peer mR-15">
                                            <img
                                                class="w-3r bdrs-50p"
                                                src="https://randomuser.me/api/portraits/men/3.jpg"
                                                alt=""
                                            />
                                        </div>
                                        <div class="peer peer-greed">
                                            <div>
                                                <div
                                                    class="peers jc-sb fxw-nw mB-5"
                                                >
                                                    <div class="peer">
                                                        <p class="fw-500 mB-0">
                                                            Lee Doe
                                                        </p>
                                                    </div>
                                                    <div class="peer">
                                                        <small class="fsz-xs">
                                                            25 mins ago
                                                        </small>
                                                    </div>
                                                </div>
                                                <span class="c-grey-600 fsz-sm">
                                                    Want to create your own
                                                    customized data generator
                                                    for your app...
                                                </span>
                                            </div>
                                        </div>
                                    </a>
                                </li>
                            </ul>
                        </li>
                        <li class="pX-20 pY-15 ta-c bdT">
                            <span>
                                <a
                                    href="email.html"
                                    class="c-grey-600 cH-blue fsz-sm td-n"
                                >
                                    View All Email
                                    <i class="fs-xs ti-angle-right mL-10"></i>
                                </a>
                            </span>
                        </li>
                    </ul>
                </li>
                <li class="dropdown">
                    <a
                        href=""
                        class="dropdown-toggle no-after peers fxw-nw ai-c lh-1"
                        data-bs-toggle="dropdown"
                    >
                        <div class="peer mR-10">
                            <img
                                class="w-2r bdrs-50p"
                                src="https://randomuser.me/api/portraits/men/10.jpg"
                                alt=""
                            />
                        </div>
                        <div class="peer">
                            <span class="fsz-sm c-grey-900">John Doe</span>
                        </div>
                    </a>
                    <ul class="dropdown-menu fsz-sm">
                        <li>
                            <a
                                href=""
                                class="d-b td-n pY-5 bgcH-grey-100 c-grey-700"
                            >
                                <i class="ti-settings mR-10"></i>
                                <span>Setting</span>
                            </a>
                        </li>
                        <li>
                            <a
                                href="profile.html"
                                class="d-b td-n pY-5 bgcH-grey-100 c-grey-700"
                            >
                                <i class="ti-user mR-10"></i>
                                <span>Profile</span>
                            </a>
                        </li>
                        <li>
                            <a
                                href="email.html"
                                class="d-b td-n pY-5 bgcH-grey-100 c-grey-700"
                            >
                                <i class="ti-email mR-10"></i>
                                <span>Messages</span>
                            </a>
                        </li>
                        <li role="separator" class="divider"></li>
                        <li>
                            <a
                                href=""
                                class="d-b td-n pY-5 bgcH-grey-100 c-grey-700"
                            >
                                <i class="ti-power-off mR-10"></i>
                                <span>Logout</span>
                            </a>
                        </li>
                    </ul>
                </li>
            </ul>
        </div>
    </header>
</template>

<style scoped lang="scss">
.header {
    display: block;
    position: fixed;
    width: calc(100% - #{var(--offscreen-size)});
    margin-bottom: 0;
    padding: 0;
    background-color: #fff;
    border-bottom: 1px solid var(--border-color);
    transition: all 0.2s ease;
    z-index: 800;

    @include media-breakpoint-down(lg) {
        width: 100%;
    }

    @include media-breakpoint-between(lg, xxl) {
        width: calc(100% - #{var(--collapsed-size)});
    }

    .header-container {
        @include clearfix;

        height: var(--header-height);

        .nav-left,
        .nav-right {
            list-style: none;
            margin-bottom: 0;
            padding-left: 0;
            position: relative;

            > li {
                float: left;

                > a {
                    color: var(--text-color);
                    display: block;
                    line-height: var(--header-height);
                    min-height: var(--header-height);
                    padding: 0 15px;
                    transition: all 0.2s ease-in-out;

                    i {
                        font-size: 17px;
                    }

                    &:hover,
                    &:focus {
                        color: var(--dark-color);
                        text-decoration: none;
                    }

                    @include media-breakpoint-down(lg) {
                        padding: 0 15px;
                    }
                }
            }

            .notifications {
                position: relative;

                .counter {
                    background-color: var(--danger-color);
                    border-radius: 50px;
                    color: #fff;
                    font-size: 10px;
                    line-height: 1;
                    padding: 3px 5.5px;
                    position: absolute;
                    right: 6px;
                    top: 12px;
                }

                .dropdown-menu {
                    min-width: 350px;
                    padding: 0;

                    @include media-breakpoint-down(md) {
                        max-width: 300px;
                    }
                }
            }
        }

        .dropdown-menu {
            // display: block;
            margin: 0;
            transform-origin: top right;
            // transform: scale(0, 0);
            transition: transform 0.15s ease-out;

            .divider {
                border-bottom: 1px solid var(--border-color);
                height: 1px;
                overflow: hidden;
            }

            > li {
                > a {
                    transition: all 0.2s ease-out;
                }
            }
        }

        .show {
            .dropdown-menu {
                transform: scale(1, 1);
            }
        }

        .nav-left {
            float: left;
            margin-left: 15px;
        }

        .nav-right {
            float: right;

            .dropdown-menu {
                left: auto;
                right: 0;

                > li {
                    width: 100%;

                    > a {
                        line-height: 1.5;
                        min-height: auto;
                        padding: 10px 15px;
                    }
                }
            }
        }
    }

    .search-box {
        .search-icon-close {
            display: none;
        }

        &.active {
            .search-icon {
                display: none;
            }

            .search-icon-close {
                display: inline-block;
            }
        }
    }

    .search-input {
        // display: none;
        opacity: 0;
        transition: opacity 0.3s ease;

        &.active {
            opacity: 1;
            //   display: inline-block;
        }

        input {
            background-color: transparent;
            border: 0;
            box-shadow: none;
            font-size: 18px;
            height: 40px;
            margin-top: 12px;
            outline: none;
            padding: 5px;

            @include media-breakpoint-down(md) {
                width: 85px;
            }

            @include placeholder {
                color: hsl(var(--text-color), 20%);
                font-style: italic;
            }
        }
    }
}

.is-collapsed {
    .header {
        width: calc(100% - #{var(--collapsed-size)});

        @include media-breakpoint-down(lg) {
            width: 100%;
        }

        @include media-breakpoint-between(lg, xxl) {
            width: calc(100% - #{var(--offscreen-size)});
        }
    }
}

.is-collapsed {
    .header {
        width: calc(100% - #{var(--collapsed-size)});

        @include media-breakpoint-down(lg) {
            width: 100%;
        }

        @include media-breakpoint-between(lg, xxl) {
            width: calc(100% - #{var(--offscreen-size)});
        }
    }
}
</style>
