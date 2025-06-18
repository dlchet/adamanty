(ns adamanty.core-test
  (:require [clojure.test :refer :all]
            [adamanty.core :refer :all]))

(deftest best-current-span-test
  (testing "best-current-span"
    (is (= (best-current-span '(L L L W W L W W W L W W)) '(5 6)))
    (is (= (best-current-span '(L L W W W L W W W L L W)) '(7 10)))))