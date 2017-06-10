/* Copyright (c)2017 Rockwell Automation. All rights reserved. */
package fb.rt.student;
import fb.datatype.*;
import fb.rt.*;
import fb.rt.events.*;
import fb.rt.math.*;
/** FUNCTION_BLOCK CNV_TRANSFER (* Composite Function Block Type *)
  * @author JHC
  * @version 20170213/JHC - Generated.
  */
public class CNV_TRANSFER extends fb.rt.FBInstance {
/** Normal Execution Request */
public final EventOutput REQ = new EventOutput();
/** Execution Confirmation */
public final EventOutput CNF = new EventOutput();
/** FB AND1:FB_AND */
  protected FB_AND AND1 = new FB_AND() ;
/** FB AND2:FB_AND */
  protected FB_AND AND2 = new FB_AND() ;
/** FB PERMIT:E_PERMIT */
  protected E_PERMIT PERMIT = new E_PERMIT() ;
/** VAR PREV_CNV_ON:BOOL */
  public BOOL PREV_CNV_ON = new BOOL();
/** VAR NEXT_CNV_ON:BOOL */
  public BOOL NEXT_CNV_ON = new BOOL();
/** VAR PREV_CNV_END:BOOL */
  public BOOL PREV_CNV_END = new BOOL();
/** The default constructor. */
public CNV_TRANSFER(){
    super();
    AND1.CNF.connectTo(AND2.REQ);
    REQ.connectTo(AND1.REQ);
    AND2.CNF.connectTo(PERMIT.EI);
    PERMIT.EO.connectTo(CNF);
    AND2.connectIVNoException("IN1",AND1.ovNamedNoException("OUT"));
    AND1.connectIVNoException("IN1",PREV_CNV_ON);
    AND1.connectIVNoException("IN2",NEXT_CNV_ON);
    AND2.connectIVNoException("IN2",PREV_CNV_END);
    PERMIT.connectIVNoException("PERMIT",AND2.ovNamedNoException("OUT"));
  }
	/**
 * {@inheritDoc}
 * @param newVar {@inheritDoc}
 */
@Override
protected void connectInternal(ANY newVar) {
  if(newVar == PREV_CNV_ON)
    AND1.connectIVNoException("IN1",PREV_CNV_ON);
  if(newVar == NEXT_CNV_ON)
    AND1.connectIVNoException("IN2",NEXT_CNV_ON);
  if(newVar == PREV_CNV_END)
    AND2.connectIVNoException("IN2",PREV_CNV_END);
}
/** start the FB instances. */
public void start( ){
    super.start();
  AND1.start();
  AND2.start();
  PERMIT.start();
}
/** stop the FB instances. */
public void stop( ){
    super.stop();
  AND1.stop();
  AND2.stop();
  PERMIT.stop();
}
/** kill the FB instances. */
public void kill( ){
    super.kill();
  AND1.kill();
  AND2.kill();
  PERMIT.kill();
}
/** reset the FB instances. */
public void reset( ){
    super.reset();
  AND1.reset();
  AND2.reset();
  PERMIT.reset();
}
/** {@inheritDoc}
 * @param fbName {@inheritDoc}
 * @param r {@inheritDoc}
 * @throws FBRManagementException {@inheritDoc} */
  public void initialize(String fbName, Resource r)
  throws FBRManagementException{
    super.initialize(fbName,r);
    AND1.initialize("AND1",r);
    AND2.initialize("AND2",r);
    PERMIT.initialize("PERMIT",r);
}
}
