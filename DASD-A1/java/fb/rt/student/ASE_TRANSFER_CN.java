/* Copyright (c)2017 Rockwell Automation. All rights reserved. */
package fb.rt.student;
import fb.datatype.*;
import fb.rt.*;
import fb.rt.events.*;
import fb.rt.math.*;
/** FUNCTION_BLOCK ASE_TRANSFER_CN (* Composite Function Block Type *)
  * @author JHC
  * @version 20170219/JHC - Generated.
  */
public class ASE_TRANSFER_CN extends fb.rt.FBInstance {
/** Normal Execution Request */
public final EventOutput REQ = new EventOutput();
/** Execution Confirmation */
public final EventOutput CNF = new EventOutput();
/** FB AND1:FB_AND */
  protected FB_AND AND1 = new FB_AND() ;
/** FB AND2:FB_AND */
  protected FB_AND AND2 = new FB_AND() ;
/** FB AND3:FB_AND */
  protected FB_AND AND3 = new FB_AND() ;
/** FB AND4:FB_AND */
  protected FB_AND AND4 = new FB_AND() ;
/** FB PERMIT:E_PERMIT */
  protected E_PERMIT PERMIT = new E_PERMIT() ;
/** VAR CNV_PREV1_ON:BOOL */
  public BOOL CNV_PREV1_ON = new BOOL();
/** VAR CNV_PREV2_ON:BOOL */
  public BOOL CNV_PREV2_ON = new BOOL();
/** VAR CNV_PREV1_END:BOOL */
  public BOOL CNV_PREV1_END = new BOOL();
/** VAR CNV_PREV2_END:BOOL */
  public BOOL CNV_PREV2_END = new BOOL();
/** VAR CNV_CURRENT_ON:BOOL */
  public BOOL CNV_CURRENT_ON = new BOOL();
/** The default constructor. */
public ASE_TRANSFER_CN(){
    super();
    REQ.connectTo(AND1.REQ);
    AND1.CNF.connectTo(AND2.REQ);
    AND2.CNF.connectTo(AND3.REQ);
    REQ.connectTo(AND1.REQ);
    AND1.CNF.connectTo(AND2.REQ);
    AND2.CNF.connectTo(AND3.REQ);
    AND3.CNF.connectTo(AND4.REQ);
    AND4.CNF.connectTo(PERMIT.EI);
    PERMIT.EO.connectTo(CNF);
    AND2.connectIVNoException("IN1",AND1.ovNamedNoException("OUT"));
    AND3.connectIVNoException("IN1",AND2.ovNamedNoException("OUT"));
    AND1.connectIVNoException("IN1",CNV_PREV1_ON);
    AND1.connectIVNoException("IN2",CNV_PREV1_ON);
    AND2.connectIVNoException("IN2",CNV_PREV1_END);
    AND3.connectIVNoException("IN2",CNV_PREV2_END);
    AND2.connectIVNoException("IN1",AND1.ovNamedNoException("OUT"));
    AND3.connectIVNoException("IN1",AND2.ovNamedNoException("OUT"));
    AND1.connectIVNoException("IN1",CNV_PREV1_ON);
    AND1.connectIVNoException("IN2",CNV_PREV1_ON);
    AND2.connectIVNoException("IN2",CNV_PREV1_END);
    AND3.connectIVNoException("IN2",CNV_PREV2_END);
    AND4.connectIVNoException("IN1",AND3.ovNamedNoException("OUT"));
    PERMIT.connectIVNoException("PERMIT",AND4.ovNamedNoException("OUT"));
    AND4.connectIVNoException("IN2",CNV_CURRENT_ON);
  }
	/**
 * {@inheritDoc}
 * @param newVar {@inheritDoc}
 */
@Override
protected void connectInternal(ANY newVar) {
  if(newVar == CNV_PREV1_ON)
    AND1.connectIVNoException("IN1",CNV_PREV1_ON);
  if(newVar == CNV_PREV1_ON)
    AND1.connectIVNoException("IN2",CNV_PREV1_ON);
  if(newVar == CNV_PREV1_END)
    AND2.connectIVNoException("IN2",CNV_PREV1_END);
  if(newVar == CNV_PREV2_END)
    AND3.connectIVNoException("IN2",CNV_PREV2_END);
  if(newVar == CNV_PREV1_ON)
    AND1.connectIVNoException("IN1",CNV_PREV1_ON);
  if(newVar == CNV_PREV1_ON)
    AND1.connectIVNoException("IN2",CNV_PREV1_ON);
  if(newVar == CNV_PREV1_END)
    AND2.connectIVNoException("IN2",CNV_PREV1_END);
  if(newVar == CNV_PREV2_END)
    AND3.connectIVNoException("IN2",CNV_PREV2_END);
  if(newVar == CNV_CURRENT_ON)
    AND4.connectIVNoException("IN2",CNV_CURRENT_ON);
}
/** start the FB instances. */
public void start( ){
    super.start();
  AND1.start();
  AND2.start();
  AND3.start();
  AND4.start();
  PERMIT.start();
}
/** stop the FB instances. */
public void stop( ){
    super.stop();
  AND1.stop();
  AND2.stop();
  AND3.stop();
  AND4.stop();
  PERMIT.stop();
}
/** kill the FB instances. */
public void kill( ){
    super.kill();
  AND1.kill();
  AND2.kill();
  AND3.kill();
  AND4.kill();
  PERMIT.kill();
}
/** reset the FB instances. */
public void reset( ){
    super.reset();
  AND1.reset();
  AND2.reset();
  AND3.reset();
  AND4.reset();
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
    AND3.initialize("AND3",r);
    AND4.initialize("AND4",r);
    PERMIT.initialize("PERMIT",r);
}
}
