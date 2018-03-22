import scala.concurrent.duration.Duration
import scala.concurrent.{Await, Future}
import scala.concurrent.ExecutionContext.Implicits.global

val future: Future[Int] = Future {
  // some long running operation
  1
}


Seq(1,2,3)
  .map(x => x*2)

Await.result(Future(5)
  .map(x => x*2), Duration.Inf)

Future(5).flatMap(x => asyncDouble(x))

def asyncDouble(x: Int): Future[Int] = {
  Future(x*2)
}

def callAuth(): Future[String]= {
  Future.successful("Auth OK")
}

def callUserDetails(x: String)= {
  Future.successful("User Exists")
}

def writeUserToMongo(x: String) = {
  Future.successful("Write successful")
}

callAuth()
  .flatMap((x => callUserDetails(x)))
  .flatMap(userDetailsResponse => writeUserToMongo(userDetailsResponse))

val res = Future(throw new Exception("Something went wrng"))
Thread.sleep(100)
res

Future.failed(new Exception("Something broke")).recover {
  case e: Exception => e.getMessage + "again"
}

