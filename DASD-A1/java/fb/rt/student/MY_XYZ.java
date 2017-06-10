/* Copyright (c)2017 Holobloc Inc. All rights reserved. */
package fb.rt.student; import fb.rt.math.*;
import fb.datatype.*;
import fb.rt.*;
import fb.rt.events.*;
/** FUNCTION_BLOCK MY_XYZ (* Compute X^2-Y^2 in Java *)
  * @author JHC
  * @version 20170208/JHC - Generated.
  */
public class MY_XYZ extends fb.rt.FBInstance {
/** EVENT REQ */
public final EventInput REQ = new EventInput(this);
/** EVENT XYZ:EVENT */
public final EventInput XYZ = new EventInput(this);
/** EVENT CNF */
public final EventOutput CNF = new EventOutput();
/** EVENT CNF2:EVENT */
public final EventOutput CNF2 = new EventOutput();
/** VAR X:REAL */
  public REAL X = new REAL();
/** VAR Y:REAL */
  public REAL Y = new REAL();
/** VAR Z:REAL */
  public REAL Z = new REAL();
/** VAR OUT:REAL */
  public final REAL OUT = new REAL();
/** VAR OUT2:REAL */
  public final REAL OUT2 = new REAL();
/** The default constructor. */
public MY_XYZ(){
    super();
  }
/** The index (0) of state START. */
public static final int index_START = 0;
/** The actions to take upon entering state START. */
private void state_START(){
	eccState = index_START;
	serviceEvent(null);}
/** The index (1) of state REQ. */
public static final int index_REQ = 1;
/** The actions to take upon entering state REQ. */
private void state_REQ(){
	eccState = index_REQ;
	alg_REQ();
	CNF.serviceEvent(this);
	serviceEvent(null);}
/** The index (2) of state XYZ. */
public static final int index_XYZ = 2;
/** The actions to take upon entering state XYZ. */
private void state_XYZ(){
	eccState = index_XYZ;
	alg_XYZ();
	CNF2.serviceEvent(this);
	serviceEvent(null);}
/** {@inheritDoc}
* @param e {@inheritDoc} */
  public void serviceEvent(EventServer e){
	switch(eccState){
		case index_START:
if ((e == REQ)) state_REQ();
else if (true) state_XYZ();
			return;
		case index_REQ:
if (true) state_START();
			return;
		case index_XYZ:
if (true) state_START();
			return;
	}
  }
  /** ALGORITHM REQ IN Java*/
public void alg_REQ(){
OUT.value = (X.value+Y.value);
}
  /** ALGORITHM XYZ IN Java*/
public void alg_XYZ(){
OUT2.value = X.value + Y.value + Z.value;
}
}
