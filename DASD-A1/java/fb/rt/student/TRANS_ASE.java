/* Copyright (c)2017 Rockwell Automation. All rights reserved. */
package fb.rt.student;
import fb.datatype.*;
import fb.rt.*;
import fb.rt.events.*;
import fb.rt.math.*;
/** FUNCTION_BLOCK TRANS_ASE (* Composite Function Block Type *)
  * @author JHC
  * @version 20170219/JHC - Generated.
  */
public class TRANS_ASE extends fb.rt.FBInstance {
/** Normal Execution Request */
public final EventOutput REQ = new EventOutput();
/** Execution Confirmation */
public final EventOutput CNF = new EventOutput();
/** FB AND:FB_AND */
  protected FB_AND AND = new FB_AND() ;
/** FB AND1:FB_AND */
  protected FB_AND AND1 = new FB_AND() ;
/** FB AND2:FB_AND */
  protected FB_AND AND2 = new FB_AND() ;
/** FB AND3:FB_AND */
  protected FB_AND AND3 = new FB_AND() ;
/** FB PERMIT:E_PERMIT */
  protected E_PERMIT PERMIT = new E_PERMIT() ;
/** VAR PREV1_CNV_ON:BOOL */
  public BOOL PREV1_CNV_ON = new BOOL();
/** VAR PREV2_CNV_ON:BOOL */
  public BOOL PREV2_CNV_ON = new BOOL();
/** VAR PREV1_CNV_END:BOOL */
  public BOOL PREV1_CNV_END = new BOOL();
/** VAR PREV2_CNV_END:BOOL */
  public BOOL PREV2_CNV_END = new BOOL();
/** VAR CURRENT_CNV_ON:BOOL */
  public BOOL CURRENT_CNV_ON = new BOOL();
/** The default constructor. */
public TRANS_ASE(){
    super();
    AND.CNF.connectTo(AND1.REQ);
    AND1.CNF.connectTo(AND2.REQ);
    AND2.CNF.connectTo(AND3.REQ);
    AND3.CNF.connectTo(PERMIT.EI);
    PERMIT.EO.connectTo(CNF);
    REQ.connectTo(AND.REQ);
    AND.connectIVNoException("IN1",PREV1_CNV_ON);
    AND.connectIVNoException("IN2",PREV2_CNV_ON);
    AND1.connectIVNoException("IN1",AND.ovNamedNoException("OUT"));
    AND1.connectIVNoException("IN2",PREV1_CNV_END);
    AND2.connectIVNoException("IN1",AND1.ovNamedNoException("OUT"));
    AND2.connectIVNoException("IN2",PREV2_CNV_END);
    AND3.connectIVNoException("IN1",AND2.ovNamedNoException("OUT"));
    AND3.connectIVNoException("IN2",CURRENT_CNV_ON);
    PERMIT.connectIVNoException("PERMIT",AND3.ovNamedNoException("OUT"));
  }
	/**
 * {@inheritDoc}
 * @param newVar {@inheritDoc}
 */
@Override
protected void connectInternal(ANY newVar) {
  if(newVar == PREV1_CNV_ON)
    AND.connectIVNoException("IN1",PREV1_CNV_ON);
  if(newVar == PREV2_CNV_ON)
    AND.connectIVNoException("IN2",PREV2_CNV_ON);
  if(newVar == PREV1_CNV_END)
    AND1.connectIVNoException("IN2",PREV1_CNV_END);
  if(newVar == PREV2_CNV_END)
    AND2.connectIVNoException("IN2",PREV2_CNV_END);
  if(newVar == CURRENT_CNV_ON)
    AND3.connectIVNoException("IN2",CURRENT_CNV_ON);
}
/** start the FB instances. */
public void start( ){
    super.start();
  AND.start();
  AND1.start();
  AND2.start();
  AND3.start();
  PERMIT.start();
}
/** stop the FB instances. */
public void stop( ){
    super.stop();
  AND.stop();
  AND1.stop();
  AND2.stop();
  AND3.stop();
  PERMIT.stop();
}
/** kill the FB instances. */
public void kill( ){
    super.kill();
  AND.kill();
  AND1.kill();
  AND2.kill();
  AND3.kill();
  PERMIT.kill();
}
/** reset the FB instances. */
public void reset( ){
    super.reset();
  AND.reset();
  AND1.reset();
  AND2.reset();
  AND3.reset();
  PERMIT.reset();
}
/** {@inheritDoc}
 * @param fbName {@inheritDoc}
 * @param r {@inheritDoc}
 * @throws FBRManagementException {@inheritDoc} */
  public void initialize(String fbName, Resource r)
  throws FBRManagementException{
    super.initialize(fbName,r);
    AND.initialize("AND",r);
    AND1.initialize("AND1",r);
    AND2.initialize("AND2",r);
    AND3.initialize("AND3",r);
    PERMIT.initialize("PERMIT",r);
}
}
