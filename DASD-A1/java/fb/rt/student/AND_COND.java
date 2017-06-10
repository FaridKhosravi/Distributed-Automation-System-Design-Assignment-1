/* Copyright (c)2017 Rockwell Automation. All rights reserved. */
package fb.rt.student;
import fb.datatype.*;
import fb.rt.*;
import fb.rt.events.*;
import fb.rt.math.*;
/** FUNCTION_BLOCK AND_COND (* Composite Function Block Type *)
  * @author JHC
  * @version 20170219/JHC - Generated.
  */
public class AND_COND extends fb.rt.FBInstance {
/** Normal Execution Request */
public final EventOutput REQ = new EventOutput();
/** Execution Confirmation */
public final EventOutput CNF = new EventOutput();
/** FB PERMIT:E_PERMIT */
  protected E_PERMIT PERMIT = new E_PERMIT() ;
/** FB AND:FB_AND */
  protected FB_AND AND = new FB_AND() ;
/** FB AND1:FB_AND */
  protected FB_AND AND1 = new FB_AND() ;
/** FB AND2:FB_AND */
  protected FB_AND AND2 = new FB_AND() ;
/** VAR PREV_CNV_ON:BOOL */
  public BOOL PREV_CNV_ON = new BOOL();
/** VAR PREV_CNV_END:BOOL */
  public BOOL PREV_CNV_END = new BOOL();
/** VAR CURRENT_CNV_ON:BOOL */
  public BOOL CURRENT_CNV_ON = new BOOL();
/** VAR COND_1:BOOL */
  public BOOL COND_1 = new BOOL();
/** The default constructor. */
public AND_COND(){
    super();
    AND.CNF.connectTo(AND1.REQ);
    AND1.CNF.connectTo(AND2.REQ);
    REQ.connectTo(AND.REQ);
    AND2.CNF.connectTo(PERMIT.EI);
    PERMIT.EO.connectTo(CNF);
    AND.connectIVNoException("IN1",PREV_CNV_ON);
    AND.connectIVNoException("IN2",PREV_CNV_END);
    AND1.connectIVNoException("IN1",AND.ovNamedNoException("OUT"));
    AND1.connectIVNoException("IN2",CURRENT_CNV_ON);
    AND2.connectIVNoException("IN1",AND1.ovNamedNoException("OUT"));
    AND2.connectIVNoException("IN2",COND_1);
    PERMIT.connectIVNoException("PERMIT",AND2.ovNamedNoException("OUT"));
  }
	/**
 * {@inheritDoc}
 * @param newVar {@inheritDoc}
 */
@Override
protected void connectInternal(ANY newVar) {
  if(newVar == PREV_CNV_ON)
    AND.connectIVNoException("IN1",PREV_CNV_ON);
  if(newVar == PREV_CNV_END)
    AND.connectIVNoException("IN2",PREV_CNV_END);
  if(newVar == CURRENT_CNV_ON)
    AND1.connectIVNoException("IN2",CURRENT_CNV_ON);
  if(newVar == COND_1)
    AND2.connectIVNoException("IN2",COND_1);
}
/** start the FB instances. */
public void start( ){
    super.start();
  PERMIT.start();
  AND.start();
  AND1.start();
  AND2.start();
}
/** stop the FB instances. */
public void stop( ){
    super.stop();
  PERMIT.stop();
  AND.stop();
  AND1.stop();
  AND2.stop();
}
/** kill the FB instances. */
public void kill( ){
    super.kill();
  PERMIT.kill();
  AND.kill();
  AND1.kill();
  AND2.kill();
}
/** reset the FB instances. */
public void reset( ){
    super.reset();
  PERMIT.reset();
  AND.reset();
  AND1.reset();
  AND2.reset();
}
/** {@inheritDoc}
 * @param fbName {@inheritDoc}
 * @param r {@inheritDoc}
 * @throws FBRManagementException {@inheritDoc} */
  public void initialize(String fbName, Resource r)
  throws FBRManagementException{
    super.initialize(fbName,r);
    PERMIT.initialize("PERMIT",r);
    AND.initialize("AND",r);
    AND1.initialize("AND1",r);
    AND2.initialize("AND2",r);
}
}
