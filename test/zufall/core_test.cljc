(ns zufall.core-test
  (:require [#?(:clj clojure.test :cljs cljs.test) :refer [deftest is testing]]
            [zufall.core :refer [rand-german-mammal]]))

(deftest german-mammal-test
  (testing "basic generation"
    (let [mammal (rand-german-mammal)]
      (is (string? mammal))
      (is (re-find #"\-" mammal)))))
