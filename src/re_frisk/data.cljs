(ns re-frisk.data
  (:require [reagent.core :as r]))

(defonce initialized (r/atom false))
(defonce re-frame-data (r/atom {}))
