import de.heikoseeberger.sbtheader.HeaderPlugin.autoImport.{HeaderLicense, headerLicense}
import sbt.Keys.{developers, homepage, _}
import sbt.librarymanagement.Developer
import sbt.url

object Settings {
  private object Owner {
    val id       = "fsanaulla"
    val fullName = "Faiaz Sanaulla"
    val email    = "fayaz.sanaulla@gmail.com"
    val github   = "https://github.com/fsanaulla"
  }

  val base = Seq(
    homepage := Some(url("https://github.com/fsanaulla/spark-http-rdd")),
    startYear := Some(2021),
    headerLicense := Some(HeaderLicense.ALv2("2021", Owner.fullName)),
    developers += Developer(
      id = Owner.id,
      name = Owner.fullName,
      email = Owner.email,
      url = url(Owner.github)
    )
  )
}