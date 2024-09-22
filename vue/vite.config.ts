import { fileURLToPath, URL } from "node:url";

import { defineConfig } from "vite";
import vue from "@vitejs/plugin-vue";

import path from "path";

// https://vitejs.dev/config/
export default defineConfig({
    plugins: [vue()],
    resolve: {
        alias: {
            "@": fileURLToPath(new URL("./src", import.meta.url)),
            "~bootstrap": path.resolve(__dirname, "node_modules/bootstrap"),
        },
    },
    css: {
        devSourcemap: true,
        preprocessorOptions: {
            scss: {
                additionalData: `
                    @import "@/assets/scss/_materialColors.scss"; // material color 변수
                    @import "@/assets/scss/_variables.scss"; // 사용자 정의 변수
                    @import "@/assets/scss/_mixins.scss";   // 사용자 정의 믹스인
                    @import "bootstrap/scss/bootstrap-utilities";   // Bootstrap SCSS
                `,
            },
        },
    },
});
