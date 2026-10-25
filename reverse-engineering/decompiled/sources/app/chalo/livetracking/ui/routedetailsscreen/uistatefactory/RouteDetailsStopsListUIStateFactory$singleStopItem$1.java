package app.chalo.livetracking.ui.routedetailsscreen.uistatefactory;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.RouteDetailsStopsListUIStateFactory", f = "RouteDetailsStopsListUIStateFactory.kt", l = {195}, m = "singleStopItem", v = 1)
final class RouteDetailsStopsListUIStateFactory$singleStopItem$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    boolean Z$0;
    boolean Z$1;
    boolean Z$2;
    boolean Z$3;
    boolean Z$4;
    boolean Z$5;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RouteDetailsStopsListUIStateFactory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteDetailsStopsListUIStateFactory$singleStopItem$1(RouteDetailsStopsListUIStateFactory routeDetailsStopsListUIStateFactory, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = routeDetailsStopsListUIStateFactory;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        RouteDetailsStopsListUIStateFactory routeDetailsStopsListUIStateFactory = this.this$0;
        float f = RouteDetailsStopsListUIStateFactory.c;
        return routeDetailsStopsListUIStateFactory.d(0, null, false, false, null, false, false, null, false, false, false, null, null, null, false, false, false, false, null, this);
    }
}
