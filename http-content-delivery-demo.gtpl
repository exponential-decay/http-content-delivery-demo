<html>
<head>
<title></title>

   <!--<script type="text/javascript">
   function selectFolder(e) {
       var theFiles = e.target.files;
       var relativePath = theFiles[0].webkitRelativePath;
       var folder = relativePath.split("/");
       alert(folder[0]);
   }
   </script>-->

   <!--<script>
   document.getElementById("filepicker").addEventListener("change", function(event) {
     let output = document.getElementById("listing");
     let files = event.target.files;

     for (let i=0; i<files.length; i++) {
       let item = document.createElement("li");
       item.innerHTML = files[i].webkitRelativePath;
       output.appendChild(item);
     };
   }, false);
   </script>-->

</head>
<body>


<input type="file" id="filepicker" name="fileList" webkitdirectory multiple />
<ul id="listing"></ul>
  


<!--code via https://developer.mozilla.org/en-US/docs/Web/API/HTMLInputElement/webkitdirectory -->

<!--TODO: Add folder data to form?-->
<!--TODO: Depth control of scanning-->

<script type='text/javascript'>//<![CDATA[

document.getElementById("filepicker").addEventListener("change", function(event) {
  let output = document.getElementById("listing");
  let files = event.target.files;

  for (let i=0; i<files.length; i++) {
    let item = document.createElement("li");
    item.innerHTML = files[i].webkitRelativePath;
    output.appendChild(item);
  };
}, false);

//]]> 

</script>

  <script>
  // tell the embed parent frame the height of the content
  if (window.parent && window.parent.parent){
    window.parent.parent.postMessage(["resultsFrame", {
      height: document.body.getBoundingClientRect().height,
      slug: "None"
    }], "*")
  }
</script>

<!--<form action="/" method="post">
   <!--<input type="file" id="FileUpload" onchange="selectFolder(event)" webkitdirectory mozdirectory msdirectory odirectory directory multiple />-->
   <!--<input name="files" type="file" id="FileUpload" webkitdirectory mozdirectory msdirectory odirectory directory multiple />-->
   
   <!--<input type="file" id="filepicker" name="fileList" webkitdirectory multiple />
   <ul id="listing"></ul>

   <input type="submit" value="test">-->
<!--</form>-->
</body>
</html>