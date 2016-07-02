import org.scalatest._
import com.example.Main._

class HelloSpec extends FlatSpec with Matchers {
  "Main" should "have tests" in {
    solve(1, 2) should be (3)
  }
}
