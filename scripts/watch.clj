(require '[cljs.build.api :as b])

(b/watch (b/inputs "test" "src")
  {:main 'httpurr.test.runner
   :target :nodejs
   :output-to "out/tests.js"
   :output-dir "out"
   :pretty-print true
   :optimizations :none
   :language-in  :ecmascript5
   :language-out :ecmascript5
   :verbose true})
