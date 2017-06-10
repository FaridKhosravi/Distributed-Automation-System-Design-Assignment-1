/* Copyright (c)2017 Rockwell Automation. All rights reserved. */
package fb.rt.student;
import fb.datatype.*;
import fb.rt.*;
import fb.rt.events.*;
import fb.rt.mva.*;
/** FUNCTION_BLOCK STYLE_AND (* Composite Function Block Type *)
  * @author JHC
  * @version 20170216/JHC - Generated.
  */
public class STYLE_AND extends fb.rt.FBInstance {
/** Normal Execution Request */
public final EventOutput REQ = new EventOutput();
/** Execution Confirmation */
public final EventOutput CNF = new EventOutput();
/** FB DLY:E_DELAY */
  protected E_DELAY DLY = new E_DELAY() ;
/** VAR FIRST_CNV:VSTYLE */
  public VSTYLE FIRST_CNV = new VSTYLE();
/** VAR SECOND_CNV:VSTYLE */
  public VSTYLE SECOND_CNV = new VSTYLE();
/** VAR NEW_STYLE:BOOL */
  public final BOOL NEW_STYLE = new BOOL();
/** The default constructor. */
public STYLE_AND(){
    super();
  }
/** start the FB instances. */
public void start( ){
    super.start();
  DLY.start();
}
/** stop the FB instances. */
public void stop( ){
    super.stop();
  DLY.stop();
}
/** kill the FB instances. */
public void kill( ){
    super.kill();
  DLY.kill();
}
/** reset the FB instances. */
public void reset( ){
    super.reset();
  DLY.reset();
}
/** {@inheritDoc}
 * @param fbName {@inheritDoc}
 * @param r {@inheritDoc}
 * @throws FBRManagementException {@inheritDoc} */
  public void initialize(String fbName, Resource r)
  throws FBRManagementException{
    super.initialize(fbName,r);
    DLY.initialize("DLY",r);
}
}
