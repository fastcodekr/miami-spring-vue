const {defineConfig} = require('@vue/cli-service')
module.exports = defineConfig({
    transpileDependencies: true,
    outputDir: "../src/main/resources/static",  // 빌드 타겟 디렉토리
    devServer: {
        proxy: {
            '/': {
                // '/' 로 들어오면 포트 8080(스프링 서버)로 보낸다
                target: 'http://localhost:8080',
                changeOrigin: true // cross origin 허용
            }
        },
        port: 3000,
        overlay: false // eslint 화면에 에러메시지 끄기
    }
})
