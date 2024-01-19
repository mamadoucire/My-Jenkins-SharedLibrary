def call(Map config = [:]){
  sh "echo ${config.name}. Today is ${config.dayOfWeek}."
}
