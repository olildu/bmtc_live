package app.chalo.routeselection.ui;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.constants.Source;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.routeselection.ui.StopBasedRouteSearchViewState;
import defpackage.hq0;
import defpackage.va;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.routeselection.ui.StopBasedRouteSearchForProductPurchaseComponent$handleOnIntentResultSuccessIntent$1", f = "StopBasedRouteSearchForProductPurchaseComponent.kt", l = {676, 689}, m = "invokeSuspend", v = 1)
final class StopBasedRouteSearchForProductPurchaseComponent$handleOnIntentResultSuccessIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ StopBasedRouteSearchIntent.OnIntentResultSuccessBasedRoute $intent;
    Object L$0;
    int label;
    final /* synthetic */ StopBasedRouteSearchForProductPurchaseComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StopBasedRouteSearchForProductPurchaseComponent$handleOnIntentResultSuccessIntent$1(StopBasedRouteSearchForProductPurchaseComponent stopBasedRouteSearchForProductPurchaseComponent, StopBasedRouteSearchIntent.OnIntentResultSuccessBasedRoute onIntentResultSuccessBasedRoute, Continuation continuation) {
        super(2, continuation);
        this.this$0 = stopBasedRouteSearchForProductPurchaseComponent;
        this.$intent = onIntentResultSuccessBasedRoute;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new StopBasedRouteSearchForProductPurchaseComponent$handleOnIntentResultSuccessIntent$1(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((StopBasedRouteSearchForProductPurchaseComponent$handleOnIntentResultSuccessIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        KotlinToastManager kotlinToastManager;
        KotlinToastManager kotlinToastManager2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        boolean z = false;
        z = false;
        final int i2 = 1;
        if (i == 0) {
            ResultKt.b(obj);
            StopBasedRouteSearchForProductPurchaseComponent stopBasedRouteSearchForProductPurchaseComponent = this.this$0;
            AnalyticsContractImplKt.b(stopBasedRouteSearchForProductPurchaseComponent.t, stopBasedRouteSearchForProductPurchaseComponent.A ? "stop based stop selection screen from stop" : "stop based stop selection screen to stop", Source.STOP_BASED_ROUTE_SELECTION_FRAGMENT, MapsKt.i(new Pair("stopId", this.$intent.f9198a.f1727a), new Pair("flowType", ((StopBasedRouteSearchViewState) stopBasedRouteSearchForProductPurchaseComponent.f.getValue()).i.toString())), false, 24);
            StopBasedRouteSearchForProductPurchaseComponent stopBasedRouteSearchForProductPurchaseComponent2 = this.this$0;
            if (stopBasedRouteSearchForProductPurchaseComponent2.A) {
                String str = this.$intent.f9198a.f1727a;
                StopAppModel stopAppModel = stopBasedRouteSearchForProductPurchaseComponent2.C;
                if (Intrinsics.d(str, stopAppModel != null ? stopAppModel.f1727a : null)) {
                    StopBasedRouteSearchForProductPurchaseComponent stopBasedRouteSearchForProductPurchaseComponent3 = this.this$0;
                    KotlinToastManager kotlinToastManager3 = stopBasedRouteSearchForProductPurchaseComponent3.w;
                    this.L$0 = kotlinToastManager3;
                    this.label = 1;
                    obj = stopBasedRouteSearchForProductPurchaseComponent3.p.b(StringEnum.ORIGIN_AND_DESTINATION_MUST_BE_DIFFERENT, new Object[0], this);
                    if (obj != coroutineSingletons) {
                        kotlinToastManager2 = kotlinToastManager3;
                        hq0.s(kotlinToastManager2, (String) obj);
                    }
                    return coroutineSingletons;
                }
                StopBasedRouteSearchForProductPurchaseComponent stopBasedRouteSearchForProductPurchaseComponent4 = this.this$0;
                final StopBasedRouteSearchIntent.OnIntentResultSuccessBasedRoute onIntentResultSuccessBasedRoute = this.$intent;
                stopBasedRouteSearchForProductPurchaseComponent4.B = onIntentResultSuccessBasedRoute.f9198a;
                final int i3 = z ? 1 : 0;
                stopBasedRouteSearchForProductPurchaseComponent4.E0(new Function1() { // from class: eb1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        StopBasedRouteSearchViewState stopBasedRouteSearchViewState = (StopBasedRouteSearchViewState) obj2;
                        switch (i3) {
                            case 0:
                                return StopBasedRouteSearchViewState.a(stopBasedRouteSearchViewState, onIntentResultSuccessBasedRoute.f9198a.b, null, null, false, false, null, false, null, null, null, null, null, null, null, 16382);
                            default:
                                return StopBasedRouteSearchViewState.a(stopBasedRouteSearchViewState, null, onIntentResultSuccessBasedRoute.f9198a.b, null, false, false, null, false, null, null, null, null, null, null, null, 16381);
                        }
                    }
                });
            } else {
                String str2 = this.$intent.f9198a.f1727a;
                StopAppModel stopAppModel2 = stopBasedRouteSearchForProductPurchaseComponent2.B;
                if (Intrinsics.d(str2, stopAppModel2 != null ? stopAppModel2.f1727a : null)) {
                    StopBasedRouteSearchForProductPurchaseComponent stopBasedRouteSearchForProductPurchaseComponent5 = this.this$0;
                    KotlinToastManager kotlinToastManager4 = stopBasedRouteSearchForProductPurchaseComponent5.w;
                    this.L$0 = kotlinToastManager4;
                    this.label = 2;
                    obj = stopBasedRouteSearchForProductPurchaseComponent5.p.b(StringEnum.ORIGIN_AND_DESTINATION_MUST_BE_DIFFERENT, new Object[0], this);
                    if (obj != coroutineSingletons) {
                        kotlinToastManager = kotlinToastManager4;
                        hq0.s(kotlinToastManager, (String) obj);
                    }
                    return coroutineSingletons;
                }
                StopBasedRouteSearchForProductPurchaseComponent stopBasedRouteSearchForProductPurchaseComponent6 = this.this$0;
                final StopBasedRouteSearchIntent.OnIntentResultSuccessBasedRoute onIntentResultSuccessBasedRoute2 = this.$intent;
                stopBasedRouteSearchForProductPurchaseComponent6.C = onIntentResultSuccessBasedRoute2.f9198a;
                stopBasedRouteSearchForProductPurchaseComponent6.E0(new Function1() { // from class: eb1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        StopBasedRouteSearchViewState stopBasedRouteSearchViewState = (StopBasedRouteSearchViewState) obj2;
                        switch (i2) {
                            case 0:
                                return StopBasedRouteSearchViewState.a(stopBasedRouteSearchViewState, onIntentResultSuccessBasedRoute2.f9198a.b, null, null, false, false, null, false, null, null, null, null, null, null, null, 16382);
                            default:
                                return StopBasedRouteSearchViewState.a(stopBasedRouteSearchViewState, null, onIntentResultSuccessBasedRoute2.f9198a.b, null, false, false, null, false, null, null, null, null, null, null, null, 16381);
                        }
                    }
                });
            }
        } else if (i == 1) {
            kotlinToastManager2 = (KotlinToastManager) this.L$0;
            ResultKt.b(obj);
            hq0.s(kotlinToastManager2, (String) obj);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlinToastManager = (KotlinToastManager) this.L$0;
            ResultKt.b(obj);
            hq0.s(kotlinToastManager, (String) obj);
        }
        StopBasedRouteSearchForProductPurchaseComponent stopBasedRouteSearchForProductPurchaseComponent7 = this.this$0;
        if (stopBasedRouteSearchForProductPurchaseComponent7.B != null && stopBasedRouteSearchForProductPurchaseComponent7.C != null) {
            z = true;
        }
        stopBasedRouteSearchForProductPurchaseComponent7.E0(new va(z, 16));
        return Unit.f17538a;
    }
}
