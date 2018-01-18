module.exports = function(config) {
    config.set({

        basePath: '',
        frameworks: ['browserify', 'jasmine'],

        files: [
            'node_modules/angular/angular.min.js',
            'node_modules/angular-mocks/angular-mocks.js',
            'app/add/**/*'
        ],


        exclude: [
        ],

        preprocessors: {
            'Module.js': ['browserify'],
            'views/*' : ['browserify'],
            'src/**/*.js': ['browserify'],
            'test/**/*test.js': ['browserify']
        },
        exclude: [
        ],

        preprocessors: {
            'src/**/*.js': ['browserify'],
            'test/**/*.js': ['browserify']
        },

        browserify: {
            debug: true,
            transform: [ 'babelify' ]
        },

        // define reporters, port, logLevel, browsers etc.
    });
};