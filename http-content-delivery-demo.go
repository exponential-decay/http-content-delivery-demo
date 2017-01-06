package main

import (
   //"os"
    "html/template"
    "log"
    "net/http"
    //"strings"
    //"time"
)

func filedownload(w http.ResponseWriter, r *http.Request) {
   log.Println("Method:", r.Method) //get request method
   if r.Method == "GET" {

      log.Println("here in GET")

      log.Println("path", r.URL.Path)
      t, _ := template.ParseFiles("http-content-delivery-demo.gtpl")
      t.Execute(w, nil)
   } else {

      log.Println("here in POST")

      r.ParseForm()

      // logic part of log in
      log.Println("Form: ", r.Form)

      files := r.Form["files"]

      log.Println(files)

      for k, v := range files {
        log.Println("ross", k, v, "\n")
      }

      log.Println(w.Header())
    }
}

func main() {
   log.Println("Server listening on port 2040.")
   http.HandleFunc("/", filedownload) // setting router rule
   err := http.ListenAndServe(":2040", nil) // setting listening port
   if err != nil {
      log.Fatal("ListenAndServe: ", err)
   }
}