(ns server.api.routes)

(defn todo-routes
  (context "/todos" []
           (GET "/" [] "All todos")
           (GET "/:todo-id" [todo-id] (str "Todo by " todo-id))))
