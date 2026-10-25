package app.chalo.instantticket.ui.routeselection;

import app.chalo.constants.Source;
import app.chalo.network.config.ChaloJson;
import app.chalo.productbooking.common.data.models.app.ProductBookingRouteDetailsKt;
import app.chalo.productbooking.common.data.models.app.ProductBookingStopDetails;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.PickStopArgs;
import defpackage.hq0;
import defpackage.x21;
import defpackage.z21;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.instantticket.ui.routeselection.RouteBasedStopSearchForProductPurchaseComponent$handleSelectStopClickedIntent$1", f = "RouteBasedStopSearchForProductPurchaseComponent.kt", l = {143}, m = "invokeSuspend", v = 1)
final class RouteBasedStopSearchForProductPurchaseComponent$handleSelectStopClickedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ RouteSelectionStopType $stopType;
    Object L$0;
    int label;
    final /* synthetic */ RouteBasedStopSearchForProductPurchaseComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteBasedStopSearchForProductPurchaseComponent$handleSelectStopClickedIntent$1(RouteBasedStopSearchForProductPurchaseComponent routeBasedStopSearchForProductPurchaseComponent, RouteSelectionStopType routeSelectionStopType, Continuation continuation) {
        super(2, continuation);
        this.this$0 = routeBasedStopSearchForProductPurchaseComponent;
        this.$stopType = routeSelectionStopType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RouteBasedStopSearchForProductPurchaseComponent$handleSelectStopClickedIntent$1(this.this$0, this.$stopType, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RouteBasedStopSearchForProductPurchaseComponent$handleSelectStopClickedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        KotlinToastManager kotlinToastManager;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            if (((RouteSelectionViewState) this.this$0.f.getValue()).f3969a.f8194a.length() == 0) {
                this.this$0.E0(new x21(23));
                RouteBasedStopSearchForProductPurchaseComponent routeBasedStopSearchForProductPurchaseComponent = this.this$0;
                KotlinToastManager kotlinToastManager2 = routeBasedStopSearchForProductPurchaseComponent.q;
                this.L$0 = kotlinToastManager2;
                this.label = 1;
                obj = routeBasedStopSearchForProductPurchaseComponent.l.b(StringEnum.MTICKET_TOAST_SELECT_ROUTE, new Object[0], this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                kotlinToastManager = kotlinToastManager2;
            } else {
                RouteBasedStopSearchForProductPurchaseComponent routeBasedStopSearchForProductPurchaseComponent2 = this.this$0;
                RouteSelectionStopType routeSelectionStopType = this.$stopType;
                StateFlow stateFlow = routeBasedStopSearchForProductPurchaseComponent2.f;
                List listA = ProductBookingRouteDetailsKt.a(((RouteSelectionViewState) stateFlow.getValue()).f3969a, routeSelectionStopType, ((RouteSelectionViewState) stateFlow.getValue()).b.f8199a, ((RouteSelectionViewState) stateFlow.getValue()).c.f8199a);
                this.this$0.E0(new z21(this.$stopType, 5));
                RouteBasedStopSearchForProductPurchaseComponent routeBasedStopSearchForProductPurchaseComponent3 = this.this$0;
                String str = routeBasedStopSearchForProductPurchaseComponent3.t;
                Job job = routeBasedStopSearchForProductPurchaseComponent3.s;
                if (job != null) {
                    ((JobSupport) job).cancel(null);
                }
                routeBasedStopSearchForProductPurchaseComponent3.s = BuildersKt.d(routeBasedStopSearchForProductPurchaseComponent3.j, null, null, new RouteBasedStopSearchForProductPurchaseComponent$collectInstantTicketResult$1(routeBasedStopSearchForProductPurchaseComponent3, str, null), 3);
                ChaloNavigationManager chaloNavigationManager = this.this$0.p;
                Source source = Source.PRODUCT_BOOKING_SRC;
                String str2 = this.this$0.t;
                Json json = ChaloJson.b;
                json.getClass();
                chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new PickStopArgs(source, str2, (ChaloTransitMode) null, json.a(new ArrayListSerializer(ProductBookingStopDetails.INSTANCE.serializer()), listA), 4), null, null, 6));
            }
            return Unit.f17538a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlinToastManager = (KotlinToastManager) this.L$0;
        ResultKt.b(obj);
        hq0.s(kotlinToastManager, (String) obj);
        return Unit.f17538a;
    }
}
