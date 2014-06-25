/**
 * Created by seonjeong on 2014-06-12.
 */


function PageMaker(config) {
    this.config = config;
    this.config.perpage = config.perpage?config.perpage:10;
    this.config.displaynum = config.diplaynum?config.diplaynum:10
}

PageMaker.prototype.makePage = function($target, fn){

    console.log("makePage");
//    console.log(this.config.pageno);
//    console.log(this.config.totalCnt);
//    console.log(this.config);

    //if paageno = 5, totalcnt = 80
    
    //시작번호
    var startPageNum = (Math.floor((this.config.pageno - 1) / this.config.displaynum)) * 10 + 1;
    
    //진짜 끝번호
    var lastPageNum  = Math.ceil(this.config.totalCnt / this.config.perpage);
    
    // 끝번호
    var endPageNum = startPageNum + this.config.perpage -1;
   
    console.log("startPageNum: "+startPageNum);
    console.log("endPageNum: "+endPageNum);
    console.log("lastPageNum: "+lastPageNum);
    
    if(endPageNum > lastPageNum){
    	endPageNum = lastPageNum;
    }
    
    var str = "<ul class = 'pagination'>";

    for(var i = startPageNum; i <= endPageNum; i++){
    	if (startPageNum > 10 && i == startPageNum) {
    		str += "<li><a data-page="+(startPageNum-1)+"> <<</a> </li>";
    	}
        str += "<li><a data-page="+i+">" + i + "</a></li>";
    }
	   if(lastPageNum > endPageNum){
	       str += "<li><a data-page="+(endPageNum+1)+"> >></a> </li>";
	   }else{
		   
	   }
   str += "</ul>";

   $target.html(str);
    

    $target.find("ul").click(function(event){
        event.preventDefault();
        var targetPageNo = $(event.target).data("page");
        fn(targetPageNo)
    });

}