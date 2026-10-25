package app.chalo.busesaroundyou;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.busesaroundyou.BusesAroundYouComponent", f = "BusesAroundYouComponent.kt", l = {388}, m = "getFreshMarkersList", v = 1)
final class BusesAroundYouComponent$getFreshMarkersList$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    boolean Z$0;
    boolean Z$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BusesAroundYouComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BusesAroundYouComponent$getFreshMarkersList$1(BusesAroundYouComponent busesAroundYouComponent, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = busesAroundYouComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return BusesAroundYouComponent.F0(this.this$0, null, null, null, this);
    }
}
