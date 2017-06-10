/* Copyright (c)2017 Holobloc Inc. All rights reserved. */
package fb.rt.student; import fb.rt.math.*;
import fb.datatype.*;
import fb.rt.*;
import fb.rt.events.*;
/** FUNCTION_BLOCK X2Y2_J (* Compute X^2-Y^2 in Java *)
  * @author JHC
  * @version 20170208/JHC - Generated.
  */
public class X2Y2_J extends SimpleFB {
/** VAR X:REAL */
  public REAL X = new REAL();
/** VAR Y:REAL */
  public REAL Y = new REAL();
/** VAR OUT:REAL */
  public final REAL OUT = new REAL();
/** The default constructor. */
public X2Y2_J(){
    super();
  }
/** {@inheritDoc}
* @param e {@inheritDoc} */
public void serviceEvent(EventServer e){
OUT.value = (X.value-Y.value)*(X.value+Y.value);
      CNF.serviceEvent(this);
}
}
