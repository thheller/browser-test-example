(ns app.core-test
  (:require [cljs.test :as t :refer [deftest testing is]]
            [app.core :as core]))

(deftest fake-test
  (testing "fake description"
    (is (= 1 2))))