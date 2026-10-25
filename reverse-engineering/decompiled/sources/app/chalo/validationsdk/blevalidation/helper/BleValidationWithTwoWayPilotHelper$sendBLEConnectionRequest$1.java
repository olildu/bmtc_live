package app.chalo.validationsdk.blevalidation.helper;

import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.validationsdk.blevalidation.helper.BleValidationWithTwoWayPilotHelper", f = "BleValidationWithTwoWayPilotHelper.kt", l = {173, 171, 179, 182, 187, 184, 193, ComposerKt.providerValuesKey, ComposerKt.providerKey, 210}, m = "sendBLEConnectionRequest", v = 1)
final class BleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BleValidationWithTwoWayPilotHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BleValidationWithTwoWayPilotHelper$sendBLEConnectionRequest$1(BleValidationWithTwoWayPilotHelper bleValidationWithTwoWayPilotHelper, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bleValidationWithTwoWayPilotHelper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.e(null, null, null, this);
    }
}
