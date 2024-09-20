<script setup lang="ts">
import Sidebar from "@/components/layout/Sidebar.vue";
import Header from "@/components/layout/Header.vue";
import Footer from "@/components/layout/Footer.vue";
</script>

<template>
    <Sidebar />

    <div class="page-container">
        <Header />
        <main class="main-content bgc-grey-100">
            <slot />
        </main>
        <Footer />
    </div>
</template>

<style scoped></style>
