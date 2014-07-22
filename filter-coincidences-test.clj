;; -----------------------------------------------------------------------
;; Clojure
(defn filter-coincidences [coll1 coll2]
  (mapcat (fn [x] (if (some #(= % x) coll2) (list x) nil)) coll1))
 
 
(filter-coincidences '("Ivanov Ivan" "Petrov Petr" "Sidorov Sider") 
					 '("Alexander Alexandrov" "Ivanov Ivan" "Pavel Pavlov"))
==> ("Ivanov Ivan")
	
	
	
;; ------------------------------------------------------------------------
;; Common Lisp
(defun filter-coincidences (lst1 lst2)
	(mapcan #'(lambda (x) (if (member x lst2) (list x) nil)) lst1))
	
	
(filter-coincidences '("Ivanov Ivan" "Petrov Petr" "Sidorov Sider") 
					 '("Alexander Alexandrov" "Ivanov Ivan" "Pavel Pavlov"))
==> ("Ivanov Ivan")
