//
// DON'T EDIT! This file is GENERATED by `MppJpsIncTestsGenerator` (runs by generateTests)
// from `incremental/multiplatform/multiModule/regularDependensOnMultiplatform/dependencies.txt`
//

actual fun c_platformDependentC(): String = "pJvm"
fun pJvm_platformOnly() = "pJvm"

fun pJvmTest() {
  pJvm_platformOnly()
  PJvmJavaClass().doStuff()
  c_platformIndependentC()
  c_platformDependentC()
}
