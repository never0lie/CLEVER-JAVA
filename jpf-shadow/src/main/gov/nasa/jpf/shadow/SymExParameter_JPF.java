package gov.nasa.jpf.shadow;

import java.util.HashMap;

@SuppressWarnings("serial")
public class SymExParameter_JPF {

  // neq
  public static final SymExParameter LoopUnreach2 = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "neq.loopunreach2", "LoopUnreach2", "lib", "lib(con#con)", 1, "",
      "evaluation-results/LOOP_UNREACH_2/shadow-results/", null);

  public static final SymExParameter GetSign = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "neq.getsign", "GetSign", "lib", "lib(sym)", 1, "",
      "evaluation-results/05_GETSIGN_JPF/shadow-results/", null);

  public static final SymExParameter LoopMult2 = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "neq.LoopMult2", "Loopmult2", "foo", "foo(con#con)", 1, "",
      "evaluation-results/LOOP_MULT_2_NEQ/shadow-results/", null);

  // eq
  public static final SymExParameter Add = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "eq.add", "Add", "add", "add(sym#sym)", 1, "",
      "evaluation-results/04_ADD_JPF/shadow-results/", null);

  public static final SymExParameter Const = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "eq.Const", "Const", "lib", "lib(con#con)", 1, "",
      "evaluation-results/CONST/shadow-results/", null);

  public static final SymExParameter Divide = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "eq.divide", "Divide", "divide", "divide(sym#sym)", 1, "",
      "evaluation-results/DIVIDE/shadow-results/", null);

  public static final SymExParameter Factorial_eq = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "eq.factorial", "Factorial", "factorial", "factorial(sym)", 1, "",
      "evaluation-results/FACTORIAL/shadow-results/", null);

  public static final SymExParameter IsBigger = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "jpf2019.isbigger", "IsBigger", "isBigger", "isBigger(sym#sym)", 1, "",
      "evaluation-results/04_ISBIGGER_JPF/shadow-results/", null);

  public static final SymExParameter LoopMul2 = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "jpf2019.loopmul2", "LoopMul2", "lib", "lib()", 1, "",
      "evaluation-results/05_LOOP_MUL_2_JPF/shadow-results/", null);

  // generated

  public static final SymExParameter Loopunreach355_EQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "eq.loopunreach355", "Loopunreach355", "foo", "foo(sym)", 1, "",
      "evaluation-results/Loopunreach355_EQ/shadow-results/", null);

  public static final SymExParameter Loopmult25_EQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "eq.loopmult25", "Loopmult25", "foo", "foo(sym)", 1, "",
      "evaluation-results/Loopmult25_EQ/shadow-results/", null);

  public static final SymExParameter Loopmult10_EQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "eq.LoopMult10", "Loopmult10", "foo", "foo(sym)", 1, "",
      "evaluation-results/Loopmult10_EQ/shadow-results/", null);

  public static final SymExParameter One_EQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "eq.one", "One", "yi", "yi(sym)", 1, "",
      "evaluation-results/One_EQ/shadow-results/", null);

  public static final SymExParameter Loopunreach75_EQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "eq.loopunreach75", "Loopunreach75", "foo", "foo(sym)", 1, "",
      "evaluation-results/Loopunreach75_EQ/shadow-results/", null);

  public static final SymExParameter Loopmult880_EQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "eq.loopmult880", "Loopmult880", "foo", "foo(sym)", 1, "",
      "evaluation-results/Loopmult880_EQ/shadow-results/", null);

  public static final SymExParameter Loopmult130_EQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "eq.loopmult130", "Loopmult130", "foo", "foo(sym)", 1, "",
      "evaluation-results/Loopmult130_EQ/shadow-results/", null);

  public static final SymExParameter Onebound_EQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "eq.oneBound", "Onebound", "METHODNAME", "METHOD_SIG()", 1, "",
      "evaluation-results/Onebound_EQ/shadow-results/", null);

  public static final SymExParameter Multiplebound_EQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "eq.multipleBound", "Multiplebound", "METHODNAME", "METHOD_SIG()", 1, "",
      "evaluation-results/Multiplebound_EQ/shadow-results/", null);

  public static final SymExParameter Loopmult355_EQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "eq.loopmult355", "Loopmult355", "foo", "foo(sym)", 1, "",
      "evaluation-results/Loopmult355_EQ/shadow-results/", null);

  public static final SymExParameter Loopmult550_EQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "eq.loopmult550", "Loopmult550", "foo", "foo(sym)", 1, "",
      "evaluation-results/Loopmult550_EQ/shadow-results/", null);

  public static final SymExParameter Divide_EQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "eq.divide", "Divide", "divide", "divide(sym#sym)", 1, "",
      "evaluation-results/Divide_EQ/shadow-results/", null);

  public static final SymExParameter Loopmult250_EQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "eq.loopmult250", "Loopmult250", "foo", "foo(sym)", 1, "",
      "evaluation-results/Loopmult250_EQ/shadow-results/", null);

  public static final SymExParameter Loopunreach10_EQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "eq.LoopUnreach10", "Loopunreach10", "foo", "foo(sym)", 1, "",
      "evaluation-results/Loopunreach10_EQ/shadow-results/", null);

  public static final SymExParameter Unchloop_EQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "eq.UnchLoop", "Unchloop", "METHODNAME", "METHOD_SIG()", 1, "",
      "evaluation-results/Unchloop_EQ/shadow-results/", null);

  public static final SymExParameter Loopmult705_EQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "eq.loopmult705", "Loopmult705", "foo", "foo(sym)", 1, "",
      "evaluation-results/Loopmult705_EQ/shadow-results/", null);

  public static final SymExParameter Loopmult205_EQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "eq.loopmult205", "Loopmult205", "foo", "foo(sym)", 1, "",
      "evaluation-results/Loopmult205_EQ/shadow-results/", null);

  public static final SymExParameter Loopunreach250_EQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "eq.loopunreach250", "Loopunreach250", "foo", "foo(sym)", 1, "",
      "evaluation-results/Loopunreach250_EQ/shadow-results/", null);

  public static final SymExParameter Is_prime2_EQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "eq.is_prime2", "Is_prime2", "METHODNAME", "METHOD_SIG()", 1, "",
      "evaluation-results/Is_prime2_EQ/shadow-results/", null);

  public static final SymExParameter Loopunreach15_EQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "eq.LoopUnreach15", "Loopunreach15", "foo", "foo(sym)", 1, "",
      "evaluation-results/Loopunreach15_EQ/shadow-results/", null);

  public static final SymExParameter Loopmult20_EQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "eq.LoopMult20", "Loopmult20", "foo", "foo(sym)", 1, "",
      "evaluation-results/Loopmult20_EQ/shadow-results/", null);

  public static final SymExParameter Pos_EQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "eq.pos", "Pos", "METHODNAME", "METHOD_SIG()", 1, "",
      "evaluation-results/Pos_EQ/shadow-results/", null);

  public static final SymExParameter Loopunreach550_EQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "eq.loopunreach550", "Loopunreach550", "foo", "foo(sym)", 1, "",
      "evaluation-results/Loopunreach550_EQ/shadow-results/", null);

  public static final SymExParameter Loopunreach300_EQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "eq.loopunreach300", "Loopunreach300", "foo", "foo(sym)", 1, "",
      "evaluation-results/Loopunreach300_EQ/shadow-results/", null);

  public static final SymExParameter Loopmult790_EQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "eq.loopmult790", "Loopmult790", "foo", "foo(sym)", 1, "",
      "evaluation-results/Loopmult790_EQ/shadow-results/", null);

  public static final SymExParameter Loopmult300_EQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "eq.loopmult300", "Loopmult300", "foo", "foo(sym)", 1, "",
      "evaluation-results/Loopmult300_EQ/shadow-results/", null);

  public static final SymExParameter Const_EQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "eq.Const", "Const", "lib", "lib(con#con)", 1, "",
      "evaluation-results/Const_EQ/shadow-results/", null);

  public static final SymExParameter Pos2_EQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "eq.pos2", "Pos2", "METHODNAME", "METHOD_SIG()", 1, "",
      "evaluation-results/Pos2_EQ/shadow-results/", null);

  public static final SymExParameter Loopmult55_EQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "eq.loopmult55", "Loopmult55", "foo", "foo(sym)", 1, "",
      "evaluation-results/Loopmult55_EQ/shadow-results/", null);

  public static final SymExParameter Loopmult5_EQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "eq.LoopMult5", "Loopmult5", "foo", "foo(sym)", 1, "",
      "evaluation-results/Loopmult5_EQ/shadow-results/", null);

  public static final SymExParameter Loopunreach40_EQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "eq.loopunreach40", "Loopunreach40", "foo", "foo(sym)", 1, "",
      "evaluation-results/Loopunreach40_EQ/shadow-results/", null);

  public static final SymExParameter Loopunreach415_EQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "eq.loopunreach415", "Loopunreach415", "foo", "foo(sym)", 1, "",
      "evaluation-results/Loopunreach415_EQ/shadow-results/", null);

  public static final SymExParameter Add_EQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "eq.Add", "Add", "add", "add(sym#sym)", 1, "",
      "evaluation-results/Add_EQ/shadow-results/", null);

  public static final SymExParameter Loopmult30_EQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "eq.loopmult30", "Loopmult30", "foo", "foo(sym)", 1, "",
      "evaluation-results/Loopmult30_EQ/shadow-results/", null);

  public static final SymExParameter Loopunreach5_EQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "eq.LoopUnreach5", "Loopunreach5", "foo", "foo(sym)", 1, "",
      "evaluation-results/Loopunreach5_EQ/shadow-results/", null);

  public static final SymExParameter Loopmult100_EQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "eq.loopmult100", "Loopmult100", "foo", "foo(sym)", 1, "",
      "evaluation-results/Loopmult100_EQ/shadow-results/", null);

  public static final SymExParameter Loopunreach165_EQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "eq.loopunreach165", "Loopunreach165", "foo", "foo(sym)", 1, "",
      "evaluation-results/Loopunreach165_EQ/shadow-results/", null);

  public static final SymExParameter Loopunreach880_EQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "eq.loopunreach880", "Loopunreach880", "foo", "foo(sym)", 1, "",
      "evaluation-results/Loopunreach880_EQ/shadow-results/", null);

  public static final SymExParameter Is_prime3_EQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "eq.is_prime3", "Is_prime3", "METHODNAME", "METHOD_SIG()", 1, "",
      "evaluation-results/Is_prime3_EQ/shadow-results/", null);

  public static final SymExParameter Loopmult2_EQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "eq.LoopMult2", "Loopmult2", "foo", "foo(sym#sym)", 1, "",
      "evaluation-results/Loopmult2_EQ/shadow-results/", null);

  public static final SymExParameter Loopunreach705_EQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "eq.loopunreach705", "Loopunreach705", "foo", "foo(sym)", 1, "",
      "evaluation-results/Loopunreach705_EQ/shadow-results/", null);

  public static final SymExParameter Loopunreach20_EQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "eq.LoopUnreach20", "Loopunreach20", "foo", "foo(sym)", 1, "",
      "evaluation-results/Loopunreach20_EQ/shadow-results/", null);

  public static final SymExParameter Onen2_EQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "eq.oneN2", "Onen2", "METHODNAME", "METHOD_SIG()", 1, "",
      "evaluation-results/Onen2_EQ/shadow-results/", null);

  public static final SymExParameter Getsign2_EQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "eq.getSign2", "Getsign2", "METHODNAME", "METHOD_SIG()", 1, "",
      "evaluation-results/Getsign2_EQ/shadow-results/", null);

  public static final SymExParameter Loopunreach30_EQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "eq.loopunreach30", "Loopunreach30", "foo", "foo(sym)", 1, "",
      "evaluation-results/Loopunreach30_EQ/shadow-results/", null);

  public static final SymExParameter Odd_EQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "eq.odd", "Odd", "METHODNAME", "METHOD_SIG()", 1, "",
      "evaluation-results/Odd_EQ/shadow-results/", null);

  public static final SymExParameter Pos3_EQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "eq.pos3", "Pos3", "METHODNAME", "METHOD_SIG()", 1, "",
      "evaluation-results/Pos3_EQ/shadow-results/", null);

  public static final SymExParameter Ltfivebound_EQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "eq.ltfiveBound", "Ltfivebound", "METHODNAME", "METHOD_SIG()", 1, "",
      "evaluation-results/Ltfivebound_EQ/shadow-results/", null);

  public static final SymExParameter Factorial_EQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "eq.factorial", "Factorial", "METHODNAME", "METHOD_SIG()", 1, "",
      "evaluation-results/Factorial_EQ/shadow-results/", null);

  public static final SymExParameter Loopunreach100_EQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "eq.loopunreach100", "Loopunreach100", "foo", "foo(sym)", 1, "",
      "evaluation-results/Loopunreach100_EQ/shadow-results/", null);

  public static final SymExParameter Loopmult625_EQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "eq.loopmult625", "Loopmult625", "foo", "foo(sym)", 1, "",
      "evaluation-results/Loopmult625_EQ/shadow-results/", null);

  public static final SymExParameter Fib_EQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "eq.fib", "Fib", "METHODNAME", "METHOD_SIG()", 1, "",
      "evaluation-results/Fib_EQ/shadow-results/", null);

  public static final SymExParameter Loopunreach625_EQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "eq.loopunreach625", "Loopunreach625", "foo", "foo(sym)", 1, "",
      "evaluation-results/Loopunreach625_EQ/shadow-results/", null);

  public static final SymExParameter Loopunreach25_EQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "eq.loopunreach25", "Loopunreach25", "foo", "foo(sym)", 1, "",
      "evaluation-results/Loopunreach25_EQ/shadow-results/", null);

  public static final SymExParameter Loopmult165_EQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "eq.loopmult165", "Loopmult165", "foo", "foo(sym)", 1, "",
      "evaluation-results/Loopmult165_EQ/shadow-results/", null);

  public static final SymExParameter Loopunreach55_EQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "eq.loopunreach55", "Loopunreach55", "foo", "foo(sym)", 1, "",
      "evaluation-results/Loopunreach55_EQ/shadow-results/", null);

  public static final SymExParameter Loopmult415_EQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "eq.loopmult415", "Loopmult415", "foo", "foo(sym)", 1, "",
      "evaluation-results/Loopmult415_EQ/shadow-results/", null);

  public static final SymExParameter Loopunreach790_EQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "eq.loopunreach790", "Loopunreach790", "foo", "foo(sym)", 1, "",
      "evaluation-results/Loopunreach790_EQ/shadow-results/", null);

  public static final SymExParameter Loopmult480_EQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "eq.loopmult480", "Loopmult480", "foo", "foo(sym)", 1, "",
      "evaluation-results/Loopmult480_EQ/shadow-results/", null);

  public static final SymExParameter Loopmult15_EQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "eq.LoopMult15", "Loopmult15", "foo", "foo(sym)", 1, "",
      "evaluation-results/Loopmult15_EQ/shadow-results/", null);

  public static final SymExParameter Loopunreach480_EQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "eq.loopunreach480", "Loopunreach480", "foo", "foo(sym)", 1, "",
      "evaluation-results/Loopunreach480_EQ/shadow-results/", null);

  public static final SymExParameter Loopmult40_EQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "eq.loopmult40", "Loopmult40", "foo", "foo(sym)", 1, "",
      "evaluation-results/Loopmult40_EQ/shadow-results/", null);

  public static final SymExParameter Is_prime1_EQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "eq.is_prime1", "Is_prime1", "METHODNAME", "METHOD_SIG()", 1, "",
      "evaluation-results/Is_prime1_EQ/shadow-results/", null);

  public static final SymExParameter Loopunreach205_EQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "eq.loopunreach205", "Loopunreach205", "foo", "foo(sym)", 1, "",
      "evaluation-results/Loopunreach205_EQ/shadow-results/", null);

  public static final SymExParameter Loopunreach130_EQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "eq.loopunreach130", "Loopunreach130", "foo", "foo(sym)", 1, "",
      "evaluation-results/Loopunreach130_EQ/shadow-results/", null);

  public static final SymExParameter Ltfive_EQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "eq.ltfive", "Ltfive", "METHODNAME", "METHOD_SIG()", 1, "",
      "evaluation-results/Ltfive_EQ/shadow-results/", null);

  public static final SymExParameter Multiple_EQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "eq.multiple", "Multiple", "METHODNAME", "METHOD_SIG()", 1, "",
      "evaluation-results/Multiple_EQ/shadow-results/", null);

  public static final SymExParameter Loopunreach2_EQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "eq.LoopUnreach2", "Loopunreach2", "lib", "lib(con#con)", 1, "",
      "evaluation-results/Loopunreach2_EQ/shadow-results/", null);

  public static final SymExParameter Loopmult75_EQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "eq.loopmult75", "Loopmult75", "foo", "foo(sym)", 1, "",
      "evaluation-results/Loopmult75_EQ/shadow-results/", null);

  public static final SymExParameter Loopunreach355_NEQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "neq.loopunreach355", "Loopunreach355", "foo", "foo(sym)", 1, "",
      "evaluation-results/Loopunreach355_NEQ/shadow-results/", null);

  public static final SymExParameter Loopmult25_NEQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "neq.loopmult25", "Loopmult25", "foo", "foo(sym)", 1, "",
      "evaluation-results/Loopmult25_NEQ/shadow-results/", null);

  public static final SymExParameter Loopmult10_NEQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "neq.LoopMult10", "Loopmult10", "foo", "foo(sym)", 1, "",
      "evaluation-results/Loopmult10_NEQ/shadow-results/", null);

  public static final SymExParameter Loopunreach75_NEQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "neq.loopunreach75", "Loopunreach75", "foo", "foo(sym)", 1, "",
      "evaluation-results/Loopunreach75_NEQ/shadow-results/", null);

  public static final SymExParameter Loopmult880_NEQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "neq.loopmult880", "Loopmult880", "foo", "foo(sym)", 1, "",
      "evaluation-results/Loopmult880_NEQ/shadow-results/", null);

  public static final SymExParameter Loopmult130_NEQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "neq.loopmult130", "Loopmult130", "METHODNAME", "METHOD_SIG()", 1, "",
      "evaluation-results/Loopmult130_NEQ/shadow-results/", null);

  public static final SymExParameter Loopmult355_NEQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "neq.loopmult355", "Loopmult355", "METHODNAME", "METHOD_SIG()", 1, "",
      "evaluation-results/Loopmult355_NEQ/shadow-results/", null);

  public static final SymExParameter Loopmult550_NEQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "neq.loopmult550", "Loopmult550", "METHODNAME", "METHOD_SIG()", 1, "",
      "evaluation-results/Loopmult550_NEQ/shadow-results/", null);

  public static final SymExParameter Loopmult250_NEQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "neq.loopmult250", "Loopmult250", "METHODNAME", "METHOD_SIG()", 1, "",
      "evaluation-results/Loopmult250_NEQ/shadow-results/", null);

  public static final SymExParameter Loopunreach10_NEQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "neq.LoopUnreach10", "Loopunreach10", "foo", "foo(sym)", 1, "",
      "evaluation-results/Loopunreach10_NEQ/shadow-results/", null);

  public static final SymExParameter Loopmult705_NEQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "neq.loopmult705", "Loopmult705", "METHODNAME", "METHOD_SIG()", 1, "",
      "evaluation-results/Loopmult705_NEQ/shadow-results/", null);

  public static final SymExParameter Loopmult205_NEQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "neq.loopmult205", "Loopmult205", "METHODNAME", "METHOD_SIG()", 1, "",
      "evaluation-results/Loopmult205_NEQ/shadow-results/", null);

  public static final SymExParameter Loopunreach250_NEQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "neq.loopunreach250", "Loopunreach250", "foo", "foo(sym)", 1, "",
      "evaluation-results/Loopunreach250_NEQ/shadow-results/", null);

  public static final SymExParameter Loopunreach15_NEQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "neq.LoopUnreach15", "Loopunreach15", "foo", "foo(sym)", 1, "",
      "evaluation-results/Loopunreach15_NEQ/shadow-results/", null);

  public static final SymExParameter Loopmult20_NEQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "neq.LoopMult20", "Loopmult20", "foo", "foo(sym)", 1, "",
      "evaluation-results/Loopmult20_NEQ/shadow-results/", null);

  public static final SymExParameter Loopunreach550_NEQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "neq.loopunreach550", "Loopunreach550", "foo", "foo(sym)", 1, "",
      "evaluation-results/Loopunreach550_NEQ/shadow-results/", null);

  public static final SymExParameter Loopunreach300_NEQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "neq.loopunreach300", "Loopunreach300", "foo", "foo(sym)", 1, "",
      "evaluation-results/Loopunreach300_NEQ/shadow-results/", null);

  public static final SymExParameter Loopmult790_NEQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "neq.loopmult790", "Loopmult790", "METHODNAME", "METHOD_SIG()", 1, "",
      "evaluation-results/Loopmult790_NEQ/shadow-results/", null);

  public static final SymExParameter Loopmult300_NEQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "neq.loopmult300", "Loopmult300", "METHODNAME", "METHOD_SIG()", 1, "",
      "evaluation-results/Loopmult300_NEQ/shadow-results/", null);

  public static final SymExParameter Getsign_NEQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "neq.getSign", "Getsign", "METHODNAME", "METHOD_SIG()", 1, "",
      "evaluation-results/Getsign_NEQ/shadow-results/", null);

  public static final SymExParameter Loopmult55_NEQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "neq.loopmult55", "Loopmult55", "METHODNAME", "METHOD_SIG()", 1, "",
      "evaluation-results/Loopmult55_NEQ/shadow-results/", null);

  public static final SymExParameter Loopmult5_NEQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "neq.LoopMult5", "Loopmult5", "foo", "foo(sym)", 1, "",
      "evaluation-results/Loopmult5_NEQ/shadow-results/", null);

  public static final SymExParameter Loopunreach40_NEQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "neq.loopunreach40", "Loopunreach40", "foo", "foo(sym)", 1, "",
      "evaluation-results/Loopunreach40_NEQ/shadow-results/", null);

  public static final SymExParameter Loopunreach415_NEQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "neq.loopunreach415", "Loopunreach415", "foo", "foo(sym)", 1, "",
      "evaluation-results/Loopunreach415_NEQ/shadow-results/", null);

  public static final SymExParameter Loopmult30_NEQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "neq.loopmult30", "Loopmult30", "METHODNAME", "METHOD_SIG()", 1, "",
      "evaluation-results/Loopmult30_NEQ/shadow-results/", null);

  public static final SymExParameter Loopunreach5_NEQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "neq.LoopUnreach5", "Loopunreach5", "foo", "foo(sym)", 1, "",
      "evaluation-results/Loopunreach5_NEQ/shadow-results/", null);

  public static final SymExParameter Loopmult100_NEQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "neq.loopmult100", "Loopmult100", "METHODNAME", "METHOD_SIG()", 1, "",
      "evaluation-results/Loopmult100_NEQ/shadow-results/", null);

  public static final SymExParameter Loopunreach165_NEQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "neq.loopunreach165", "Loopunreach165", "foo", "foo(sym)", 1, "",
      "evaluation-results/Loopunreach165_NEQ/shadow-results/", null);

  public static final SymExParameter Loopunreach880_NEQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "neq.loopunreach880", "Loopunreach880", "foo", "foo(sym)", 1, "",
      "evaluation-results/Loopunreach880_NEQ/shadow-results/", null);

  public static final SymExParameter Loopmult2_NEQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "neq.LoopMult2", "Loopmult2", "foo", "foo(con#con)", 1, "",
      "evaluation-results/Loopmult2_NEQ/shadow-results/", null);

  public static final SymExParameter Loopunreach705_NEQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "neq.loopunreach705", "Loopunreach705", "foo", "foo(sym)", 1, "",
      "evaluation-results/Loopunreach705_NEQ/shadow-results/", null);

  public static final SymExParameter Loopunreach20_NEQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "neq.LoopUnreach20", "Loopunreach20", "foo", "foo(sym)", 1, "",
      "evaluation-results/Loopunreach20_NEQ/shadow-results/", null);

  public static final SymExParameter Loopunreach30_NEQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "neq.loopunreach30", "Loopunreach30", "foo", "foo(sym)", 1, "",
      "evaluation-results/Loopunreach30_NEQ/shadow-results/", null);

  public static final SymExParameter Factorial_NEQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "neq.factorial", "Factorial", "METHODNAME", "METHOD_SIG()", 1, "",
      "evaluation-results/Factorial_NEQ/shadow-results/", null);

  public static final SymExParameter Loopunreach100_NEQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "neq.loopunreach100", "Loopunreach100", "foo", "foo(sym)", 1, "",
      "evaluation-results/Loopunreach100_NEQ/shadow-results/", null);

  public static final SymExParameter Loopmult625_NEQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "neq.loopmult625", "Loopmult625", "METHODNAME", "METHOD_SIG()", 1, "",
      "evaluation-results/Loopmult625_NEQ/shadow-results/", null);

  public static final SymExParameter Fib_NEQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "neq.fib", "Fib", "METHODNAME", "METHOD_SIG()", 1, "",
      "evaluation-results/Fib_NEQ/shadow-results/", null);

  public static final SymExParameter Loopunreach625_NEQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "neq.loopunreach625", "Loopunreach625", "foo", "foo(sym)", 1, "",
      "evaluation-results/Loopunreach625_NEQ/shadow-results/", null);

  public static final SymExParameter Fib2_NEQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "neq.fib2", "Fib2", "METHODNAME", "METHOD_SIG()", 1, "",
      "evaluation-results/Fib2_NEQ/shadow-results/", null);

  public static final SymExParameter Loopunreach25_NEQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "neq.loopunreach25", "Loopunreach25", "foo", "foo(sym)", 1, "",
      "evaluation-results/Loopunreach25_NEQ/shadow-results/", null);

  public static final SymExParameter Loopmult165_NEQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "neq.loopmult165", "Loopmult165", "METHODNAME", "METHOD_SIG()", 1, "",
      "evaluation-results/Loopmult165_NEQ/shadow-results/", null);

  public static final SymExParameter Loopunreach55_NEQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "neq.loopunreach55", "Loopunreach55", "foo", "foo(sym)", 1, "",
      "evaluation-results/Loopunreach55_NEQ/shadow-results/", null);

  public static final SymExParameter Loopmult415_NEQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "neq.loopmult415", "Loopmult415", "METHODNAME", "METHOD_SIG()", 1, "",
      "evaluation-results/Loopmult415_NEQ/shadow-results/", null);

  public static final SymExParameter Loopunreach790_NEQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "neq.loopunreach790", "Loopunreach790", "foo", "foo(sym)", 1, "",
      "evaluation-results/Loopunreach790_NEQ/shadow-results/", null);

  public static final SymExParameter Loopmult480_NEQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "neq.loopmult480", "Loopmult480", "METHODNAME", "METHOD_SIG()", 1, "",
      "evaluation-results/Loopmult480_NEQ/shadow-results/", null);

  public static final SymExParameter Loopmult15_NEQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "neq.LoopMult15", "Loopmult15", "foo", "foo(sym)", 1, "",
      "evaluation-results/Loopmult15_NEQ/shadow-results/", null);

  public static final SymExParameter Loopunreach480_NEQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "neq.loopunreach480", "Loopunreach480", "foo", "foo(sym)", 1, "",
      "evaluation-results/Loopunreach480_NEQ/shadow-results/", null);

  public static final SymExParameter Loopmult40_NEQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "neq.loopmult40", "Loopmult40", "METHODNAME", "METHOD_SIG()", 1, "",
      "evaluation-results/Loopmult40_NEQ/shadow-results/", null);

  public static final SymExParameter Loopunreach205_NEQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "neq.loopunreach205", "Loopunreach205", "foo", "foo(sym)", 1, "",
      "evaluation-results/Loopunreach205_NEQ/shadow-results/", null);

  public static final SymExParameter Loopunreach130_NEQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "neq.loopunreach130", "Loopunreach130", "foo", "foo(sym)", 1, "",
      "evaluation-results/Loopunreach130_NEQ/shadow-results/", null);

  public static final SymExParameter Loopunreach2_NEQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "neq.LoopUnreach2", "Loopunreach2", "lib", "lib(con#con)", 1, "",
      "evaluation-results/Loopunreach2_NEQ/shadow-results/", null);

  public static final SymExParameter Loopmult75_NEQ = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "neq.loopmult75", "Loopmult75", "METHODNAME", "METHOD_SIG()", 1, "",
      "evaluation-results/Loopmult75_NEQ/shadow-results/", null);

  // misc

  public static final SymExParameter Foo_JPF = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "jpf2019.foo", "Foo", "foo", "foo(sym)", 1, "",
      "evaluation-results/00_Foo_JPF/shadow-results/", null);

  public static final SymExParameter Joda_LocalToUTC = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "jpf2019.joda.localToUTC", "ZonedChronology", "localToUTC", "localToUTC(sym#sym)",
      1, "",
      "evaluation-results/03_Joda_LocalToUTC_JPF/shadow-results/", null);

  public static final SymExParameter Rational_abs = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "jpf2019.rational.abs", "Rational", "main", "abs(sym)", 5, "",
      "evaluation-results/01_Rational/abs/shadow-results/", null);

  public static final SymExParameter Rational_gcd = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "jpf2019.rational.gcd", "Rational", "main", "gcd(sym#sym)", 22, "",
      "evaluation-results/01_Rational/gcd/shadow-results/", new HashMap<String, String>() {
        {
          put("15", "coral");
          put("17", "coral");
          put("19", "coral");
          put("21", "coral");
        }
      });

  public static final SymExParameter Rational_simplify = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "jpf2019.rational.simplify", "Rational", "simplify", // "main",
      "gcd(sym#sym)", 27, "2_27,2_16,3_11,16_27,2_16_27",
      "evaluation-results/01_Rational/simplify/shadow-results/", new HashMap<String, String>() {
        {
          put("19", "coral");
          put("21", "coral");
          put("23", "coral");
          put("25", "coral");
        }
      });

  public static final SymExParameter WBS_update = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "jpf2019.wbs.update", "WBS", "main", "update(sym#sym#sym)", 10, "",
      "evaluation-results/02_WBS/update/shadow-results/", null);

  public static final SymExParameter WBS_launch = new SymExParameter("${jpf-shadow}/build/jpf-shadow.jar",
      "${jpf-shadow}/src/examples", "jpf2019.wbs.launch", "WBS", "main", "launch(sym#sym#sym#sym#sym#sym#sym#sym#sym)",
      10, "",
      "evaluation-results/02_WBS/launch/shadow-results/", null);

}
