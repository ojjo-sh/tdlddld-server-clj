(ns server.core
  (:require
   [compojure.core :refer :all]
   [server.api.todos :refer [todo-routes]]))

(defroutes app-routes 
  (context "/api/todos" [] 
    (todo-routes)))