    /* cordova is available under *either* the terms of the modified BSD license *or* the
    * MIT License (2008). See http://opensource.org/licenses/alphabetical for full text.
        *
        * Copyright (c) Roc Lee 2014
        * QQ:304594656 Email:y1peng@126.com
    * Copyright (c) 2014, enmuo Corporation
    */



    var exec = require("cordova/exec");

   
    var VideoPlayer = function(){
    };

    VideoPlayer.prototype.play = function(url){
        exec(null, null, "VideoPlayer", "playVideo", [url]);
    };

  
	var videoPlayer = new VideoPlayer();
	module.exports = videoPlayer;
      