/* Copyright (c)2017 Rockwell Automation. All rights reserved. */
package fb.rt.student;
import fb.datatype.*;
import fb.rt.*;
import fb.rt.events.*;
/** FUNCTION_BLOCK FB_OR_3 (* Boolean OR *)
  * @author JHC
  * @version 20170224/JHC - Generated.
  */
class FB_OR extends FBFunction2 {
/** EVENT REQ */
public final EventInput REQ = new EventInput(this);
/** EVENT CNF */
public final EventOutput CNF = new EventOutput();
/** VAR IN1:BOOL */
  public BOOL IN1 = new BOOL();
/** VAR IN2:BOOL */
  public BOOL IN2 = new BOOL();
/** VAR IN3:BOOL */
  public BOOL IN3 = new BOOL();
/** Result */
  public final BOOL OUT = new BOOL();
/** The default constructor. */
public FB_OR_3(){
    super();
  }
/** {@inheritDoc}
* @param e {@inheritDoc} */
  public void serviceEvent(EventServer e){
    if (e == REQ) service_REQ();
  }
/** Services the REQ event. */
  public void service_REQ(){
  }
}
