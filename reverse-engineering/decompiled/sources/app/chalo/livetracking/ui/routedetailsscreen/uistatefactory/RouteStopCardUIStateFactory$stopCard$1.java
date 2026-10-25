package app.chalo.livetracking.ui.routedetailsscreen.uistatefactory;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.eac.EACTags;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.RouteStopCardUIStateFactory", f = "RouteStopCardUIStateFactory.kt", l = {57, EACTags.DISPLAY_IMAGE}, m = "stopCard", v = 1)
final class RouteStopCardUIStateFactory$stopCard$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    boolean Z$0;
    boolean Z$1;
    boolean Z$2;
    boolean Z$3;
    boolean Z$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RouteStopCardUIStateFactory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteStopCardUIStateFactory$stopCard$1(RouteStopCardUIStateFactory routeStopCardUIStateFactory, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = routeStopCardUIStateFactory;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(null, null, false, null, false, false, false, null, this);
    }
}
