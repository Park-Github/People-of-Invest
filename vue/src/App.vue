<script setup lang="ts">
import { RouterLink, RouterView } from "vue-router";
import HelloWorld from "./components/HelloWorld.vue";
import Sidebar from "./components/Sidebar.vue";
import Header from "./components/Header.vue";
import Footer from "./components/Footer.vue";
</script>

<template>
    <Sidebar />

    <div class="page-container">
        <Header />

        <main class="main-content bgc-grey-100">
            <HelloWorld msg="You did it!" />
            <RouterView />
        </main>

        <Footer />
    </div>
</template>

<style scoped></style>
