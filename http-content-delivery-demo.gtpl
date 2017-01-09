<html>
<head>
   <title>File navigation HTML</title>
</head>
<body>

   <!--TODO: Add folder data to form?-->
   <!--TODO: Depth control of scanning-->

   <!--code via https://developer.mozilla.org/en-US/docs/Web/API/HTMLInputElement/webkitdirectory -->
   <P>
   <input type="file" id="filepicker" name="fileList" webkitdirectory multiple />
   <ul id="listing"></ul>
   </P>
   
   <P>
   <img src="/open-iconic-master/png/file-8x.png" height="100" width="100"/>
   </P>


   <!--Javascript-->
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

</body>
</html>