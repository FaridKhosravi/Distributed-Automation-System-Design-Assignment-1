/* Copyright (c)2017 Holobloc Inc. All rights reserved. */
package fb.rt.hmi;
import fb.datatype.*;
import fb.rt.*;
import fb.rt.events.*;
/** FUNCTION_BLOCK OUT_ANY_TEST (* Data output to TextField *)
  * @author JHC
  * @version 20170220/JHC - Generated.
  */
public class OUT_ANY_TEST extends fb.rt.FBInstance {
/** Initialization */
public final EventInput INIT = new EventInput(this);
/** Request */
public final EventInput REQ = new EventInput(this);
/** Initialization Confirm */
public final EventOutput INITO = new EventOutput();
/** Service Confirmation */
public final EventOutput CNF = new EventOutput();
/** Input event qualifier */
  public BOOL QI = new BOOL("true");
/** Output value to convert */
  public ANY IN = new ANYImpl();
/** TextField width in chars */
  public UINT W = new UINT("10");
/** Data type name */
  public WSTRING TYPE = new WSTRING("\"ANY\"");
/** Initial value */
  public WSTRING IVAL = new WSTRING();
/** Output event qualifier */
  public final BOOL QO = new BOOL();
/** The default constructor. */
public OUT_ANY_TEST(){
    super();
  }
/** {@inheritDoc}
* @param e {@inheritDoc} */
  public void serviceEvent(EventServer e){
    if (e == INIT) service_INIT();
    else if (e == REQ) service_REQ();
  }
/** Services the INIT event. */
  public void service_INIT(){
  }
/** Services the REQ event. */
  public void service_REQ(){
  }
}
