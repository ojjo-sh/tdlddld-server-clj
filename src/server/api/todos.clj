(ns server.api.todos
  (:require [ring.util.response :refer [response]]
            [compojure.core :refer :all]))

(defn get-all-todos 
  "Gets all todos"
  [request]
  (response "Baby"))

(defn create-todos 
  "Creates a todo."
  [request]
  (response "Create"))

(defn update-todos 
  "Update a todo."
  [id]
  (response (str "Update " id)))

(defn delete-todos
  "Delete a todo"
  [id]
  (response (str "Delete " id)))

(defn todo-routes []
  (routes
    (GET "/" [] (get-all-todos))
    (POST "/" request (create-todos request))
    (PUT "/:id" [id] (update-todos id))
    (DELETE "/:id" [id] (delete-todos id))))