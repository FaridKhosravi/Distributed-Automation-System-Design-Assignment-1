/* Copyright (c)2017 Rockwell Automation. All rights reserved. */
package fb.rt.math;
import fb.datatype.*;
import fb.rt.*;
import fb.rt.events.*;
/** FUNCTION_BLOCK ASSEMBLE
  * @author JHC
  * @version 20170216/JHC - Generated.
  */
class FB_AND extends FBFunction2 {
/** EVENT REQ */
public final EventInput REQ = new EventInput(this);
/** EVENT CNF */
public final EventOutput CNF = new EventOutput();
/** VAR IN1:ANY */
  public ANY IN1 = new ANYImpl();
/** VAR IN2:ANY */
  public ANY IN2 = new ANYImpl();
/** Result */
  public final ANY OUT = new ANYImpl();
/** The default constructor. */
public ASSEMBLE(){
    super();
  }
/** {@inheritDoc}
* @param e {@inheritDoc} */
  public void serviceEvent(EventServer e){
    if (e == REQ) service_REQ();
  }
/** Services the REQ event. */
  public void service_REQ(){
    alg_REQ();

  }
  /** ALGORITHM REQ IN JAVA*/
public void alg_REQ(){

}
}
