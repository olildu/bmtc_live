package app.chalo.routeselection.ui;

import androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection;
import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.constants.Source;
import app.chalo.data.StopBasedRouteSelectionFlowType;
import app.chalo.productbooking.common.data.models.app.FareDetailsData;
import app.chalo.productbooking.common.data.models.app.OriginDestinationAppModel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.routeselection.ui.StopBasedRouteSearchForProductPurchaseComponent$handleRouteItemClickIntent$1", f = "StopBasedRouteSearchForProductPurchaseComponent.kt", l = {AdaptiveTrackSelection.DEFAULT_MAX_HEIGHT_TO_DISCARD}, m = "invokeSuspend", v = 1)
final class StopBasedRouteSearchForProductPurchaseComponent$handleRouteItemClickIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ StopBasedRouteSearchIntent.OnRouteClickIntentBasedRoute $intent;
    Object L$0;
    int label;
    final /* synthetic */ StopBasedRouteSearchForProductPurchaseComponent this$0;

    /* JADX INFO: renamed from: app.chalo.routeselection.ui.StopBasedRouteSearchForProductPurchaseComponent$handleRouteItemClickIntent$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.routeselection.ui.StopBasedRouteSearchForProductPurchaseComponent$handleRouteItemClickIntent$1$1", f = "StopBasedRouteSearchForProductPurchaseComponent.kt", l = {728}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ StopBasedRouteSearchIntent.OnRouteClickIntentBasedRoute $intent;
        int label;
        final /* synthetic */ StopBasedRouteSearchForProductPurchaseComponent this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(StopBasedRouteSearchForProductPurchaseComponent stopBasedRouteSearchForProductPurchaseComponent, StopBasedRouteSearchIntent.OnRouteClickIntentBasedRoute onRouteClickIntentBasedRoute, Continuation continuation) {
            super(2, continuation);
            this.this$0 = stopBasedRouteSearchForProductPurchaseComponent;
            this.$intent = onRouteClickIntentBasedRoute;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$intent, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                StopBasedRouteSearchForProductPurchaseComponent stopBasedRouteSearchForProductPurchaseComponent = this.this$0;
                OriginDestinationAppModel originDestinationAppModel = this.$intent.f9199a;
                this.label = 1;
                if (StopBasedRouteSearchForProductPurchaseComponent.H0(stopBasedRouteSearchForProductPurchaseComponent, originDestinationAppModel, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            return Unit.f17538a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StopBasedRouteSearchForProductPurchaseComponent$handleRouteItemClickIntent$1(StopBasedRouteSearchForProductPurchaseComponent stopBasedRouteSearchForProductPurchaseComponent, StopBasedRouteSearchIntent.OnRouteClickIntentBasedRoute onRouteClickIntentBasedRoute, Continuation continuation) {
        super(2, continuation);
        this.$intent = onRouteClickIntentBasedRoute;
        this.this$0 = stopBasedRouteSearchForProductPurchaseComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new StopBasedRouteSearchForProductPurchaseComponent$handleRouteItemClickIntent$1(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((StopBasedRouteSearchForProductPurchaseComponent$handleRouteItemClickIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        StopBasedRouteSelectionFlowType stopBasedRouteSelectionFlowType;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            FareDetailsData fareDetailsDataA = OriginDestinationAppModel.a(this.$intent.f9199a);
            StopBasedRouteSelectionFlowType stopBasedRouteSelectionFlowType2 = ((StopBasedRouteSearchViewState) this.this$0.f.getValue()).i;
            StopBasedRouteSearchForProductPurchaseComponent stopBasedRouteSearchForProductPurchaseComponent = this.this$0;
            AnalyticsContractImplKt.b(stopBasedRouteSearchForProductPurchaseComponent.t, "stop based stop selection screen route result item click", Source.STOP_BASED_ROUTE_SELECTION_FRAGMENT, MapsKt.i(new Pair("route id", fareDetailsDataA.f8185a.b), new Pair("from stop id", fareDetailsDataA.b.f8199a), new Pair("to stop id", fareDetailsDataA.c.f8199a), new Pair("flowType", ((StopBasedRouteSearchViewState) stopBasedRouteSearchForProductPurchaseComponent.f.getValue()).i.toString())), false, 24);
            StopBasedRouteSearchForProductPurchaseComponent stopBasedRouteSearchForProductPurchaseComponent2 = this.this$0;
            this.L$0 = stopBasedRouteSelectionFlowType2;
            this.label = 1;
            if (stopBasedRouteSearchForProductPurchaseComponent2.S0(fareDetailsDataA, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            stopBasedRouteSelectionFlowType = stopBasedRouteSelectionFlowType2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            stopBasedRouteSelectionFlowType = (StopBasedRouteSelectionFlowType) this.L$0;
            ResultKt.b(obj);
        }
        if (stopBasedRouteSelectionFlowType instanceof StopBasedRouteSelectionFlowType.InstantTicket) {
            StopBasedRouteSearchForProductPurchaseComponent stopBasedRouteSearchForProductPurchaseComponent3 = this.this$0;
            BuildersKt.d(stopBasedRouteSearchForProductPurchaseComponent3.j, null, null, new StopBasedRouteSearchForProductPurchaseComponent$navigateToInstantTicketFareDetailsIfPossible$1(stopBasedRouteSearchForProductPurchaseComponent3, this.$intent.f9199a, null), 3);
        } else if (stopBasedRouteSelectionFlowType instanceof StopBasedRouteSelectionFlowType.ONDC) {
            StopBasedRouteSearchForProductPurchaseComponent stopBasedRouteSearchForProductPurchaseComponent4 = this.this$0;
            BuildersKt.d(stopBasedRouteSearchForProductPurchaseComponent4.j, null, null, new AnonymousClass1(stopBasedRouteSearchForProductPurchaseComponent4, this.$intent, null), 3);
        } else if (!(stopBasedRouteSelectionFlowType instanceof StopBasedRouteSelectionFlowType.PassPurchase)) {
            throw new NoWhenBranchMatchedException();
        }
        this.this$0.Q0(StopBasedRouteSearchIntent.HideBottomSheetIntentBasedRoute.f9197a);
        return Unit.f17538a;
    }
}
