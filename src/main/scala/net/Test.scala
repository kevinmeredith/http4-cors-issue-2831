package net

import org.http4s._
import EntityEncoder.stringEncoder
import cats.effect._
import org.http4s.dsl.Http4sDsl
import org.http4s.server.blaze.BlazeServerBuilder
import org.http4s.server.middleware.CORS
import scala.language.higherKinds

object Test extends IOApp {

  private def httpApp[F[_]](
    implicit F : Sync[F]
  ): HttpApp[F] = {
    object dsl extends Http4sDsl[F]
    import dsl._
    val x: HttpApp[F] = HttpApp {
      case _ => Ok(s"hello world")
    }

    CORS.apply(
      http = x,
      config = CORS.DefaultCORSConfig.copy(anyOrigin = false)
    )
  }

  override def run(args: List[String]): IO[ExitCode] =
    BlazeServerBuilder[IO]
      .withHttpApp(httpApp[IO])
      .serve
      .compile
      .drain
      .map(_ => ExitCode.Success)

}