/* Copyright (c)2017 Rockwell Automation. All rights reserved. */
package fb.rt.student;
import fb.datatype.*;
import fb.rt.*;
import fb.rt.events.*;
import fb.rt.math.*;
/** FUNCTION_BLOCK REJECTION_COND (* Composite Function Block Type *)
  * @author JHC
  * @version 20170216/JHC - Generated.
  */
public class REJECTION_COND extends fb.rt.FBInstance {
/** Normal Execution Request */
public final EventOutput REQ = new EventOutput();
/** Execution Confirmation */
public final EventOutput CNF = new EventOutput();
/** FB NOT:FB_NOT */
  protected FB_NOT NOT = new FB_NOT() ;
/** FB AND:FB_AND */
  protected FB_AND AND = new FB_AND() ;
/** FB PERMIT:E_PERMIT */
  protected E_PERMIT PERMIT = new E_PERMIT() ;
/** VAR REJECT_PB:BOOL */
  public BOOL REJECT_PB = new BOOL();
/** VAR CNV5_END:BOOL */
  public BOOL CNV5_END = new BOOL();
/** The default constructor. */
public REJECTION_COND(){
    super();
    REQ.connectTo(NOT.REQ);
    NOT.CNF.connectTo(AND.REQ);
    AND.CNF.connectTo(PERMIT.EI);
    NOT.connectIVNoException("IN",REJECT_PB);
    AND.connectIVNoException("IN1",NOT.ovNamedNoException("OUT"));
    AND.connectIVNoException("IN2",CNV5_END);
    PERMIT.connectIVNoException("PERMIT",AND.ovNamedNoException("OUT"));
  }
	/**
 * {@inheritDoc}
 * @param newVar {@inheritDoc}
 */
@Override
protected void connectInternal(ANY newVar) {
  if(newVar == REJECT_PB)
    NOT.connectIVNoException("IN",REJECT_PB);
  if(newVar == CNV5_END)
    AND.connectIVNoException("IN2",CNV5_END);
}
/** start the FB instances. */
public void start( ){
    super.start();
  NOT.start();
  AND.start();
  PERMIT.start();
}
/** stop the FB instances. */
public void stop( ){
    super.stop();
  NOT.stop();
  AND.stop();
  PERMIT.stop();
}
/** kill the FB instances. */
public void kill( ){
    super.kill();
  NOT.kill();
  AND.kill();
  PERMIT.kill();
}
/** reset the FB instances. */
public void reset( ){
    super.reset();
  NOT.reset();
  AND.reset();
  PERMIT.reset();
}
/** {@inheritDoc}
 * @param fbName {@inheritDoc}
 * @param r {@inheritDoc}
 * @throws FBRManagementException {@inheritDoc} */
  public void initialize(String fbName, Resource r)
  throws FBRManagementException{
    super.initialize(fbName,r);
    NOT.initialize("NOT",r);
    AND.initialize("AND",r);
    PERMIT.initialize("PERMIT",r);
}
}
