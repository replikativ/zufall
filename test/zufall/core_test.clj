(ns zufall.core-test
  (:require [clojure.test :refer :all]
            [zufall.core :refer :all]))

(deftest german-mammal-test
  (testing "basic generation"
    (let [mammal (rand-german-mammal)]
      (is (string? mammal))
      (is (re-find #"\-" mammal)))))
