/* Copyright (c)2017 Holobloc Inc. All rights reserved. */
package fb.rt.student;
import fb.datatype.*;
import fb.rt.*;
import fb.rt.events.*;
/** FUNCTION_BLOCK CNV_SENSOR (* Basic Function Block Type *)
  * @author JHC
  * @version 20170222/JHC - Generated.
  */
public class CNV_SENSOR extends fb.rt.FBInstance {
/** Normal Execution Request */
public final EventInput REQ = new EventInput(this);
/** Execution Confirmation */
public final EventOutput CNF = new EventOutput();
/** Input event qualifier */
  public UINT POS = new UINT();
/** Output event qualifier */
  public final BOOL SEN = new BOOL();
/** The default constructor. */
public CNV_SENSOR(){
    super();
  }
/** The index (0) of state START. */
public static final int index_START = 0;
/** The actions to take upon entering state START. */
private void state_START(){
	eccState = index_START;
	serviceEvent(null);}
/** The index (1) of state POS. */
public static final int index_POS = 1;
/** The actions to take upon entering state POS. */
private void state_POS(){
	eccState = index_POS;
	alg_REQ();
	CNF.serviceEvent(this);
	serviceEvent(null);}
/** {@inheritDoc}
* @param e {@inheritDoc} */
  public void serviceEvent(EventServer e){
	switch(eccState){
		case index_START:
if ((e == REQ)) state_POS();
			return;
		case index_POS:
if (true) state_START();
			return;
	}
  }
  /** ALGORITHM REQ IN ST*/
public void alg_REQ(){
if( (POS.value >= 70) && (POS.value < 90) ){
	SEN.value = true;
}else{
	SEN.value = false;
}
}
}
