import Diagnosis._
import Conflicts.tpf
import gapt.expr.stringInterpolationForExpressions
import gapt.expr.formula.fol.FOLTerm
import gapt.expr.formula.Formula


object Main extends App {
  
  // Practice functions 

  /**
    * Practice function 1  
    *
    * @return
    */
  def makeHittingTree2() : (List[Formula], List[FOLTerm], List[Formula]) = {

      val result = "ÄAAAAH"
      return (result)
    }

  /**
    * Practice function 2 
    *
    * @return
    */
  def makeHittingTree3() : (List[Formula], List[FOLTerm], List[Formula]) = {
    
      val result = "ÄAAAAH"
      return (result)
    }

  // _______________________________________________________________________________________________
  // Hitting set algorithm functionalities

   /**
     * Function for creating hitting trees from 
     * @return tuple consisting of
     *         1. SD:   list of formulae containing the system description
     *         2. COMP: list of terms that are the components of the system
     *         3. OBS:  list of formulae that are the observations
     */
    def makeHittingTree() : (List[Formula], List[FOLTerm], List[Formula]) = {
        val SD = List(
            and_gate,
            fof"and(a1)",
            fof"and(a2)"
        )

        val COMP = List(
            fot"a1",
            fot"a2"
        )

        val OBS = List(
            fof"in1(a1)",
            fof"in2(a1)",
            fof"-out(a1)",
            fof"in1(a2)",
            fof"in2(a2)",
            fof"-out(a2)"
        )

        return (SD, COMP, OBS)
    }

   /**
     * Function 2
     * @return tuple consisting of
     *         1. SD:   list of formulae containing the system description
     *         2. COMP: list of terms that are the components of the system
     *         3. OBS:  list of formulae that are the observations
     */
    def gatherHittingSets() : (List[Formula], List[FOLTerm], List[Formula]) = {
        val SD = List(
            and_gate,
            fof"and(a1)",
            fof"and(a2)"
        )

        val COMP = List(
            fot"a1",
            fot"a2"
        )

        val OBS = List(
            fof"in1(a1)",
            fof"in2(a1)",
            fof"-out(a1)",
            fof"in1(a2)",
            fof"in2(a2)",
            fof"-out(a2)"
        )

        return (SD, COMP, OBS)
    }

   /**
     * Function 3
     * @return tuple consisting of
     *         1. SD:   list of formulae containing the system description
     *         2. COMP: list of terms that are the components of the system
     *         3. OBS:  list of formulae that are the observations
     */
    def getDiagnoses() : (List[Formula], List[FOLTerm], List[Formula]) = {
        val SD = List(
            and_gate,
            fof"and(a1)",
            fof"and(a2)"
        )

        val COMP = List(
            fot"a1",
            fot"a2"
        )

        val OBS = List(
            fof"in1(a1)",
            fof"in2(a1)",
            fof"-out(a1)",
            fof"in1(a2)",
            fof"in2(a2)",
            fof"-out(a2)"
        )

        return (SD, COMP, OBS)
    }

   // _________________________________________________________________________________________
   // Main function 

   /**
     * Main function 
     * @return tuple consisting of
     *         1. SD:   list of formulae containing the system description
     *         2. COMP: list of terms that are the components of the system
     *         3. OBS:  list of formulae that are the observations
     */
    def hittingSetAlgorithm(): (List[Formula], List[FOLTerm], List[Formula]) = {
      val hs = List(Diagnosis.problem2()._2(0))
      
      val hitting_trees = makeHittingTree()
      val hitting_sets  = gatherHittingSets()
      val diagnoses     = getDiagnoses()

      return diagnoses 
    }

  // Try adding different elements of the set of components to this list for the problems in Diagnosis
  val hs = List(Diagnosis.problem1()._2(1))

  // Try different problems and observe what the outcomes are, also try putting different combinations of components in hs
  
  println(hs)
}
