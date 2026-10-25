package app.chalo.home.ui.regularbus;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.ui.regularbus.RegularBusComponent$startGeoSpatialDataPolling$3", f = "RegularBusComponent.kt", l = {1793}, m = "emit", v = 1)
final class RegularBusComponent$startGeoSpatialDataPolling$3$emit$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RegularBusComponent$startGeoSpatialDataPolling$3<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegularBusComponent$startGeoSpatialDataPolling$3$emit$1(RegularBusComponent$startGeoSpatialDataPolling$3 regularBusComponent$startGeoSpatialDataPolling$3, Continuation continuation) {
        super(continuation);
        this.this$0 = regularBusComponent$startGeoSpatialDataPolling$3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
