package app.chalo.livetracking.ui.routedetailsscreen;

import app.chalo.citydata.data.model.app.RouteAppModel;
import app.chalo.citydata.data.model.app.RouteLiveDetailsAppModel;
import app.chalo.citydata.domain.FetchRouteDataFromRemoteUseCase;
import app.chalo.livetracking.routedetails.data.model.app.ExtensionsKt;
import app.chalo.livetracking.routedetails.data.model.ui.RouteDetailsIntentModel;
import app.chalo.livetracking.routedetails.data.model.ui.TrackingAdditionalFeatures;
import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.utils.ChaloUseCaseResult;
import defpackage.r31;
import defpackage.z21;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
@DebugMetadata(c = "app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent$getRouteDetails$4", f = "RouteDetailsComponent.kt", l = {1196, 1206}, m = "invokeSuspend", v = 1)
final class RouteDetailsComponent$getRouteDetails$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $routeId;
    Object L$0;
    int label;
    final /* synthetic */ RouteDetailsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteDetailsComponent$getRouteDetails$4(RouteDetailsComponent routeDetailsComponent, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = routeDetailsComponent;
        this.$routeId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RouteDetailsComponent$getRouteDetails$4(this.this$0, this.$routeId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RouteDetailsComponent$getRouteDetails$4) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00be  */
    /* JADX WARN: Code duplicated, block: B:39:0x00cb  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ChaloUseCaseResult chaloUseCaseResult;
        ChaloUseCaseResult chaloUseCaseResult2;
        RouteDetailsComponent routeDetailsComponent;
        RouteDetailsIntentModel routeDetailsIntentModel;
        TrackingAdditionalFeatures trackingAdditionalFeatures;
        RouteBookingType routeBookingTypeA;
        RouteAppModel routeAppModel;
        RouteLiveDetailsAppModel routeLiveDetailsAppModel;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        if (i == 0) {
            ResultKt.b(obj);
            FetchRouteDataFromRemoteUseCase fetchRouteDataFromRemoteUseCase = this.this$0.n;
            String str = this.$routeId;
            this.label = 1;
            obj = fetchRouteDataFromRemoteUseCase.b(str, this);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            ResultKt.b(obj);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            chaloUseCaseResult2 = (ChaloUseCaseResult) this.L$0;
            ResultKt.b(obj);
        }
        chaloUseCaseResult = chaloUseCaseResult2;
        routeDetailsComponent = this.this$0;
        routeDetailsIntentModel = routeDetailsComponent.X;
        if (routeDetailsIntentModel != null && (trackingAdditionalFeatures = routeDetailsIntentModel.h) != null && trackingAdditionalFeatures.g) {
            routeBookingTypeA = routeDetailsComponent.j0;
            if (routeBookingTypeA == null) {
                routeAppModel = routeDetailsComponent.Y;
                if (routeAppModel != null || (routeLiveDetailsAppModel = routeAppModel.p) == null) {
                    routeBookingTypeA = null;
                } else {
                    routeBookingTypeA = ExtensionsKt.a(routeLiveDetailsAppModel);
                }
            }
            routeDetailsComponent.E0(new z21(routeBookingTypeA, 9));
        }
        RouteDetailsComponent routeDetailsComponent2 = this.this$0;
        RouteLiveDetailsAppModel routeLiveDetailsAppModel2 = ((RouteAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a).p;
        RouteDetailsComponent.M0(routeDetailsComponent2, true, routeLiveDetailsAppModel2.d, routeLiveDetailsAppModel2.c);
        return unit;
        chaloUseCaseResult = (ChaloUseCaseResult) obj;
        String message = "fetchRouteDataFromRemoteUseCase: " + chaloUseCaseResult;
        Intrinsics.i(message, "message");
        if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Success)) {
            if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
                throw new NoWhenBranchMatchedException();
            }
            RouteDetailsComponent routeDetailsComponent3 = this.this$0;
            if (routeDetailsComponent3.Y == null) {
                routeDetailsComponent3.E0(new r31(7));
                return unit;
            }
            RouteDetailsComponent.M0(routeDetailsComponent3, false, false, false);
            return unit;
        }
        RouteDetailsComponent routeDetailsComponent4 = this.this$0;
        if (routeDetailsComponent4.Y == null) {
            RouteAppModel routeAppModel2 = (RouteAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
            routeDetailsComponent4.Y = routeAppModel2;
            routeDetailsComponent4.r0 = routeAppModel2.p.f1713a;
            this.L$0 = chaloUseCaseResult;
            this.label = 2;
            if (RouteDetailsComponent.O0(routeDetailsComponent4, this) != coroutineSingletons) {
                chaloUseCaseResult2 = chaloUseCaseResult;
                chaloUseCaseResult = chaloUseCaseResult2;
            }
            return coroutineSingletons;
        }
        RouteAppModel routeAppModel3 = (RouteAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
        routeDetailsComponent4.j0 = ExtensionsKt.a(routeAppModel3.p);
        RouteDetailsComponent routeDetailsComponent5 = this.this$0;
        RouteBookingType routeBookingType = routeDetailsComponent5.j0;
        if (routeBookingType != null) {
            routeDetailsComponent5.z.d(routeBookingType, ((Boolean) routeDetailsComponent5.x.getG().getValue()).booleanValue(), String.valueOf(CityProviderKt.b(routeDetailsComponent5.k)), routeAppModel3);
        }
        this.this$0.r0 = routeAppModel3.p.f1713a;
        routeDetailsComponent = this.this$0;
        routeDetailsIntentModel = routeDetailsComponent.X;
        if (routeDetailsIntentModel != null) {
            routeBookingTypeA = routeDetailsComponent.j0;
            if (routeBookingTypeA == null) {
                routeAppModel = routeDetailsComponent.Y;
                if (routeAppModel != null) {
                    routeBookingTypeA = null;
                } else {
                    routeBookingTypeA = null;
                }
            }
            routeDetailsComponent.E0(new z21(routeBookingTypeA, 9));
        }
        RouteDetailsComponent routeDetailsComponent6 = this.this$0;
        RouteLiveDetailsAppModel routeLiveDetailsAppModel3 = ((RouteAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a).p;
        RouteDetailsComponent.M0(routeDetailsComponent6, true, routeLiveDetailsAppModel3.d, routeLiveDetailsAppModel3.c);
        return unit;
    }
}
