true && true

true && false

true || false

true || true

false || true

true || false

!true

!false

!(false && false)

!(true && true)

def yes(): Boolean = {
  println("Running 'yes()")
  true
}

def no(): Boolean = {
  println("Running 'no()")
  false
}

if (yes && no) println("done")
if (no && yes) println("done") //already resulted in false so not bother with running second instance of 'yes'

if (yes || no) println("done")
if (no || yes) println("done")