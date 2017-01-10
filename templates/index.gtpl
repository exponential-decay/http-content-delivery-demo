{{define "body"}}

   <div class="wrap">
      <!--Some sort of header for the tool...-->
      <p>
         <h2>
            <img src="static/icons/open-iconic-master/svg/box.svg" height="25" width="25"/>
            &nbsp;Triage v0.0.1-Beta&nbsp;
            <img src="static/icons/open-iconic-master/svg/box.svg" height="25" width="25"/>
         </h2>
         A tool to look at groups of files in any given folder... hopefully... 
      </p>

      <!--TODO: Add folder data to form?-->
      <!--TODO: Depth control of scanning-->

      <!--code via https://developer.mozilla.org/en-US/docs/Web/API/HTMLInputElement/webkitdirectory -->
      <P>
      <input type="file" id="filepicker" name="fileList" webkitdirectory multiple />
      <ul id="listing"></ul>
      </P>
      
      <P>
         <img class="ico" src="static/icons/open-iconic-master/svg/file.svg"/>
         <img class="ico" src="static/icons/open-iconic-master/svg/folder.svg"/>
         <img class="ico" src="static/icons/open-iconic-master/svg/file.svg"/>
         <img class="ico" src="static/icons/open-iconic-master/svg/folder.svg"/>
         <img class="ico" src="static/icons/open-iconic-master/svg/file.svg"/>
         <img class="ico" src="static/icons/open-iconic-master/svg/folder.svg"/>
         <img class="ico" src="static/icons/open-iconic-master/svg/file.svg"/>
         <img class="ico" src="static/icons/open-iconic-master/svg/folder.svg"/>
         <img class="ico" src="static/icons/open-iconic-master/svg/file.svg"/>
         <img class="ico" src="static/icons/open-iconic-master/svg/folder.svg"/>
         <img class="ico" src="static/icons/open-iconic-master/svg/file.svg"/>
         <img class="ico" src="static/icons/open-iconic-master/svg/folder.svg"/>
         <img class="ico" src="static/icons/open-iconic-master/svg/file.svg"/>
         <img class="ico" src="static/icons/open-iconic-master/svg/folder.svg"/>
         <img class="ico" src="static/icons/open-iconic-master/svg/file.svg"/>
         <img class="ico" src="static/icons/open-iconic-master/svg/folder.svg"/>
         <img class="ico" src="static/icons/open-iconic-master/svg/file.svg"/>
         <img class="ico" src="static/icons/open-iconic-master/svg/folder.svg"/>
         <img class="ico" src="static/icons/open-iconic-master/svg/file.svg"/>
         <img class="ico" src="static/icons/open-iconic-master/svg/folder.svg"/>
         <img class="ico" src="static/icons/open-iconic-master/svg/file.svg"/>
         <img class="ico" src="static/icons/open-iconic-master/svg/folder.svg"/>
         <img class="ico" src="static/icons/open-iconic-master/svg/file.svg"/>
         <img class="ico" src="static/icons/open-iconic-master/svg/folder.svg"/>
         <img class="ico" src="static/icons/open-iconic-master/svg/file.svg"/>
         <img class="ico" src="static/icons/open-iconic-master/svg/folder.svg"/>
         <img class="ico" src="static/icons/open-iconic-master/svg/file.svg"/>
         <img class="ico" src="static/icons/open-iconic-master/svg/folder.svg"/>
         <img class="ico" src="static/icons/open-iconic-master/svg/file.svg"/>
         <img class="ico" src="static/icons/open-iconic-master/svg/folder.svg"/>
      </P>
   </div>

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

{{end}}