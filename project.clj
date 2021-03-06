(defproject clojure-accumulo/clojure-accumulo "0.1.0-SNAPSHOT"
  :description "Clojure bindings for Apache Accumulo"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.apache.thrift/libthrift "0.9.0"]
                 [org.apache.hadoop/hadoop-core "1.2.0"
                  :exclusions [ant/ant
                               junit/junit
                               org.mortbay.jetty/jetty
                               org.mortbay.jetty/jetty-util
                               org.mortbay.jetty/jsp-2.1
                               org.mortbay.jetty/jsp-api-2.1
                               org.mortbay.jetty/servlet-api-2.5
                               tomcat/jasper-compiler
                               tomcat/jasper-runtime]]
                 [org.apache.zookeeper/zookeeper "3.4.5"
                   :exclusions [com.sun.jmx/jmxri
                                com.sun.jdmk/jmxtools
                                javax.jms/jms
                                jline/jline]]
                 [org.apache.accumulo/accumulo-core "1.5.0"
                  :exclusions [jline/jline
                               junit/junit]]
                 ])
