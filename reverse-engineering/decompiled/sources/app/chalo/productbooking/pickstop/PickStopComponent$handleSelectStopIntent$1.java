package app.chalo.productbooking.pickstop;

import app.chalo.network.config.ChaloJson;
import app.chalo.productbooking.common.data.models.app.ProductBookingStopDetails;
import app.chalo.resultstatemanager.instantticket.InstantTicketResultState;
import app.chalo.resultstatemanager.instantticket.RouteSearchResultStateManager;
import defpackage.gf;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.productbooking.pickstop.PickStopComponent$handleSelectStopIntent$1", f = "PickStopComponent.kt", l = {}, m = "invokeSuspend", v = 1)
final class PickStopComponent$handleSelectStopIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PickStopIntent.SelectStopIntent $intent;
    int label;
    final /* synthetic */ PickStopComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PickStopComponent$handleSelectStopIntent$1(PickStopComponent pickStopComponent, PickStopIntent.SelectStopIntent selectStopIntent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = pickStopComponent;
        this.$intent = selectStopIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PickStopComponent$handleSelectStopIntent$1(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        PickStopComponent$handleSelectStopIntent$1 pickStopComponent$handleSelectStopIntent$1 = (PickStopComponent$handleSelectStopIntent$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f17538a;
        pickStopComponent$handleSelectStopIntent$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        PickStopComponent pickStopComponent = this.this$0;
        String str = pickStopComponent.k.c;
        if (str != null) {
            PickStopIntent.SelectStopIntent selectStopIntent = this.$intent;
            RouteSearchResultStateManager routeSearchResultStateManager = pickStopComponent.m;
            Json json = ChaloJson.b;
            ProductBookingStopDetails productBookingStopDetails = selectStopIntent.f8305a;
            json.getClass();
            routeSearchResultStateManager.c(new InstantTicketResultState(null, json.a(ProductBookingStopDetails.INSTANCE.serializer(), productBookingStopDetails), 1), str);
        }
        gf.u(null, this.this$0.n);
        return Unit.f17538a;
    }
}
