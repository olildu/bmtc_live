package app.chalo.network.logging;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.network.logging.ChaloInternalNetworkInspectorKt", f = "ChaloInternalNetworkInspector.kt", l = {78, 83, 90, 105, 115, WebSocketProtocol.PAYLOAD_SHORT, 141}, m = "logAndProceed", v = 1)
final class ChaloInternalNetworkInspectorKt$logAndProceed$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ChaloInternalNetworkInspectorKt.a(null, null, null, this);
    }
}
