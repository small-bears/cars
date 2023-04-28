const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot3x0bo/",
            name: "springboot3x0bo",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot3x0bo/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "致远汽车租赁系统"
        } 
    }
}
export default base
