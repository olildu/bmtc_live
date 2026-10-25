package app.chalo.instantticket.ui.routeselection;

import app.chalo.network.config.ChaloJson;
import app.chalo.productbooking.common.data.models.app.ProductBookingRouteDetails;
import app.chalo.productbooking.common.data.models.app.ProductBookingStopDetails;
import app.chalo.resultstatemanager.ResultStateData;
import app.chalo.resultstatemanager.instantticket.InstantTicketResultState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.Flow;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.instantticket.ui.routeselection.RouteBasedStopSearchForProductPurchaseComponent$collectInstantTicketResult$1", f = "RouteBasedStopSearchForProductPurchaseComponent.kt", l = {277}, m = "invokeSuspend", v = 1)
final class RouteBasedStopSearchForProductPurchaseComponent$collectInstantTicketResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $requestId;
    int label;
    final /* synthetic */ RouteBasedStopSearchForProductPurchaseComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteBasedStopSearchForProductPurchaseComponent$collectInstantTicketResult$1(RouteBasedStopSearchForProductPurchaseComponent routeBasedStopSearchForProductPurchaseComponent, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = routeBasedStopSearchForProductPurchaseComponent;
        this.$requestId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RouteBasedStopSearchForProductPurchaseComponent$collectInstantTicketResult$1(this.this$0, this.$requestId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RouteBasedStopSearchForProductPurchaseComponent$collectInstantTicketResult$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            RouteBasedStopSearchForProductPurchaseComponent routeBasedStopSearchForProductPurchaseComponent = this.this$0;
            Flow flowB = routeBasedStopSearchForProductPurchaseComponent.r.b(this.$requestId);
            this.label = 1;
            obj = routeBasedStopSearchForProductPurchaseComponent.b.v(flowB, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        ResultStateData resultStateData = (ResultStateData) obj;
        boolean z = resultStateData instanceof ResultStateData.Cancelled;
        Unit unit = Unit.f17538a;
        if (z) {
            return unit;
        }
        if (!(resultStateData instanceof ResultStateData.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        InstantTicketResultState instantTicketResultState = (InstantTicketResultState) ((ResultStateData.Success) resultStateData).f9039a;
        String str = instantTicketResultState.f9056a;
        String str2 = instantTicketResultState.b;
        if (str != null && str.length() != 0) {
            Json json = ChaloJson.b;
            json.getClass();
            this.this$0.F0(new RouteSelectionIntent.RouteDetailsFetched((ProductBookingRouteDetails) json.b(str, ProductBookingRouteDetails.INSTANCE.serializer())));
        } else if (str2 != null && str2.length() != 0) {
            Json json2 = ChaloJson.b;
            json2.getClass();
            this.this$0.F0(new RouteSelectionIntent.StopDetailsFetched((ProductBookingStopDetails) json2.b(str2, ProductBookingStopDetails.INSTANCE.serializer())));
        }
        Job job = this.this$0.s;
        if (job != null) {
            ((JobSupport) job).cancel(null);
        }
        this.this$0.s = null;
        return unit;
    }
}
