var gulp = require("gulp");

gulp.task("watch", function() {

    gulp.watch("./app/html/index.html").on("change")

});