object Dependencies {
  // The spark version
  val targetSparkVersion = sys.props.getOrElse("spark.version", "2.4.4")
  val targetTensorFlowVersion = "1.14.0"
}
