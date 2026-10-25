package app.chalo.validationsdk.blevalidation.helper;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.validationsdk.blevalidation.helper.BleValidationWithTwoWayPilotHelper", f = "BleValidationWithTwoWayPilotHelper.kt", l = {FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION, 109, 117, 121, WebSocketProtocol.PAYLOAD_SHORT, 123, 132, 142, 140, 149}, m = "startActiveModeBroadcast", v = 1)
final class BleValidationWithTwoWayPilotHelper$startActiveModeBroadcast$1 extends ContinuationImpl {
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
    public BleValidationWithTwoWayPilotHelper$startActiveModeBroadcast$1(BleValidationWithTwoWayPilotHelper bleValidationWithTwoWayPilotHelper, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bleValidationWithTwoWayPilotHelper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.f(null, null, null, this);
    }
}
