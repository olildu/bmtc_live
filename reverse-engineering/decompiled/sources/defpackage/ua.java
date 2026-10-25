package defpackage;

import app.chalo.validationsdk.blevalidation.helper.BleValidationPrerequisitesState;
import app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid;
import app.chalo.validationsdk.blevalidation.ui.BleValidationIntent;
import app.chalo.validationsdk.blevalidation.ui.BleValidationLayoutInfo;
import app.chalo.validationsdk.blevalidation.ui.BleValidationLayoutType;
import app.chalo.validationsdk.blevalidation.ui.BleValidationState;
import app.chalo.validationsdk.blevalidation.ui.QRScreenLayoutInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ua implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19727a;
    public final /* synthetic */ BleValidationFragmentComponentAndroid b;

    public /* synthetic */ ua(BleValidationFragmentComponentAndroid bleValidationFragmentComponentAndroid, int i) {
        this.f19727a = i;
        this.b = bleValidationFragmentComponentAndroid;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f19727a) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                BleValidationFragmentComponentAndroid bleValidationFragmentComponentAndroid = this.b;
                if (zBooleanValue) {
                    bleValidationFragmentComponentAndroid.C0(new BleValidationIntent.BlePermissionsUpdatedFromFullScreenExplainerIntent(false));
                } else {
                    bleValidationFragmentComponentAndroid.C0(new BleValidationIntent.BlePermissionsUpdatedFromFullScreenExplainerIntent(true));
                }
                return Unit.f17538a;
            case 1:
                BleValidationState currentState = (BleValidationState) obj;
                Intrinsics.i(currentState, "currentState");
                BleValidationLayoutInfo bleValidationLayoutInfo = currentState.b;
                if (bleValidationLayoutInfo == null) {
                    return currentState;
                }
                QRScreenLayoutInfo qRScreenLayoutInfo = bleValidationLayoutInfo.c;
                MutableStateFlow mutableStateFlow = this.b.m.g;
                return BleValidationState.a(currentState, BleValidationLayoutType.QR_SCREEN, BleValidationLayoutInfo.a(bleValidationLayoutInfo, null, QRScreenLayoutInfo.a(qRScreenLayoutInfo, FlowKt.c(mutableStateFlow).getValue() == BleValidationPrerequisitesState.CAN_RUN_BLE_VALIDATION_OPERATION || FlowKt.c(mutableStateFlow).getValue() == BleValidationPrerequisitesState.SHOW_TAP_TO_VALIDATE_BOTTOMSHEET_TUTORIAL, null, false, 6), 3), null, null, null, false, null, false, null, null, 4092);
            default:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                BleValidationFragmentComponentAndroid bleValidationFragmentComponentAndroid2 = this.b;
                if (zBooleanValue2) {
                    bleValidationFragmentComponentAndroid2.C0(new BleValidationIntent.BlePermissionsUpdatedIntent(false));
                } else {
                    bleValidationFragmentComponentAndroid2.C0(new BleValidationIntent.BlePermissionsUpdatedIntent(true));
                }
                return Unit.f17538a;
        }
    }
}
