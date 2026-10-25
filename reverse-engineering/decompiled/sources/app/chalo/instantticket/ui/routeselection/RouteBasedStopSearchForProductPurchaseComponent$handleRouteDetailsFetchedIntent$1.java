package app.chalo.instantticket.ui.routeselection;

import app.chalo.data.ProductBookingBranding;
import app.chalo.helper.ProductBookingBrandingResolversKt;
import app.chalo.instantticket.config.datastore.ProductBookingDataStore;
import app.chalo.instantticket.config.models.BrandingDetails;
import app.chalo.instantticket.config.models.InstantTicketConfiguration;
import app.chalo.productbooking.common.data.models.app.ProductBookingRouteDetails;
import defpackage.t01;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.instantticket.ui.routeselection.RouteBasedStopSearchForProductPurchaseComponent$handleRouteDetailsFetchedIntent$1", f = "RouteBasedStopSearchForProductPurchaseComponent.kt", l = {105}, m = "invokeSuspend", v = 1)
final class RouteBasedStopSearchForProductPurchaseComponent$handleRouteDetailsFetchedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ProductBookingRouteDetails $routeDetails;
    int label;
    final /* synthetic */ RouteBasedStopSearchForProductPurchaseComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteBasedStopSearchForProductPurchaseComponent$handleRouteDetailsFetchedIntent$1(RouteBasedStopSearchForProductPurchaseComponent routeBasedStopSearchForProductPurchaseComponent, ProductBookingRouteDetails productBookingRouteDetails, Continuation continuation) {
        super(2, continuation);
        this.this$0 = routeBasedStopSearchForProductPurchaseComponent;
        this.$routeDetails = productBookingRouteDetails;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RouteBasedStopSearchForProductPurchaseComponent$handleRouteDetailsFetchedIntent$1(this.this$0, this.$routeDetails, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RouteBasedStopSearchForProductPurchaseComponent$handleRouteDetailsFetchedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objA;
        BrandingDetails brandingDetails;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            if (!Intrinsics.d(((RouteSelectionViewState) this.this$0.f.getValue()).f3969a.f8194a, this.$routeDetails.f8194a)) {
                ProductBookingDataStore productBookingDataStore = this.this$0.n;
                this.label = 1;
                obj = productBookingDataStore.a(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return Unit.f17538a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        InstantTicketConfiguration instantTicketConfiguration = (InstantTicketConfiguration) obj;
        boolean z = (instantTicketConfiguration == null || (brandingDetails = instantTicketConfiguration.f) == null || !brandingDetails.f3827a) ? false : true;
        String strA = instantTicketConfiguration != null ? instantTicketConfiguration.a() : null;
        if (z) {
            String str = instantTicketConfiguration != null ? instantTicketConfiguration.c : null;
            if (str == null) {
                str = "";
            }
            String str2 = instantTicketConfiguration != null ? instantTicketConfiguration.d : null;
            objA = ProductBookingBrandingResolversKt.a(strA, str, str2 != null ? str2 : "");
        } else {
            objA = ProductBookingBranding.None.INSTANCE;
        }
        this.this$0.E0(new t01(21, this.$routeDetails, objA));
        return Unit.f17538a;
    }
}
