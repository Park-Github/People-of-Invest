/* eslint-env node */
require("@rushstack/eslint-patch/modern-module-resolution");

module.exports = {
    root: true,
    extends: [
        "plugin:vue/vue3-essential",
        "eslint:recommended",
        "@vue/eslint-config-typescript",
        "@vue/eslint-config-prettier/skip-formatting"
    ],
    parserOptions: {
        ecmaVersion: "latest"
    },
    rules: {
        // "prettier/prettier": [
        //     "warn",
        //     {
        //         semi: true,
        //         tabWidth: 4,
        //         quoteProps: "consistent",
        //         trailingComma: "es5",
        //     },
        // ],
        "indent": ["warn", 4],
        "vue/multi-word-component-names": "off",
        "vue/new-line-between-multi-line-property": "off",
        "vue/multiline-ternary": "off",
        "vue/max-lines-per-block": "off",
        "vue/max-attributes-per-line": [
            "warn",
            {
                "singleline": {
                    "max": 3
                }
            }
        ],
        "vue/no-empty-component-block": "warn",
        "vue/no-unused-vars": "warn",
        "vue/no-unused-components": "warn",
        "vue/no-use-v-if-with-v-for": "warn",
        "vue/no-useless-template-attributes": "warn",
        "vue/multiline-html-element-content-newline": "warn",
        "vue/html-closing-bracket-newline": "warn",
        "vue/html-self-closing": "warn"
    }
};
