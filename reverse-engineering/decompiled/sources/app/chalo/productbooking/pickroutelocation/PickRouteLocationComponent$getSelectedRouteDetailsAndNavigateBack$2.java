package app.chalo.productbooking.pickroutelocation;

import app.chalo.citydata.data.model.app.RouteAppModel;
import app.chalo.citydata.domain.FetchRouteDataFromRemoteUseCase;
import app.chalo.instantticket.data.model.RouteInfoToProductBookingDetailsHelperKt;
import app.chalo.network.config.ChaloJson;
import app.chalo.productbooking.common.data.models.app.ProductBookingRouteDetails;
import app.chalo.resultstatemanager.instantticket.InstantTicketResultState;
import app.chalo.resultstatemanager.instantticket.RouteSearchResultStateManager;
import app.chalo.utils.ChaloUseCaseResult;
import defpackage.gf;
import defpackage.ir0;
import defpackage.ym0;
import java.util.Locale;
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
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.productbooking.pickroutelocation.PickRouteLocationComponent$getSelectedRouteDetailsAndNavigateBack$2", f = "PickRouteLocationComponent.kt", l = {226, 243, 262}, m = "invokeSuspend", v = 1)
final class PickRouteLocationComponent$getSelectedRouteDetailsAndNavigateBack$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $routeId;
    Object L$0;
    int label;
    final /* synthetic */ PickRouteLocationComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PickRouteLocationComponent$getSelectedRouteDetailsAndNavigateBack$2(PickRouteLocationComponent pickRouteLocationComponent, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = pickRouteLocationComponent;
        this.$routeId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PickRouteLocationComponent$getSelectedRouteDetailsAndNavigateBack$2(this.this$0, this.$routeId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PickRouteLocationComponent$getSelectedRouteDetailsAndNavigateBack$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00ba  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        RouteAppModel routeAppModel;
        RouteAppModel routeAppModel2;
        ProductBookingRouteDetails productBookingRouteDetails;
        PickRouteLocationComponent pickRouteLocationComponent;
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            FetchRouteDataFromRemoteUseCase fetchRouteDataFromRemoteUseCase = this.this$0.m;
            String str2 = this.$routeId;
            this.label = 1;
            obj = fetchRouteDataFromRemoteUseCase.b(str2, this);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                routeAppModel = (RouteAppModel) this.L$0;
                ResultKt.b(obj);
                this.this$0.E0(new ym0(routeAppModel, 23));
                return Unit.f17538a;
            }
            routeAppModel2 = (RouteAppModel) this.L$0;
            ResultKt.b(obj);
            String str3 = routeAppModel2.b;
            String str4 = routeAppModel2.c;
            String lowerCase = routeAppModel2.j.toLowerCase(Locale.ROOT);
            Intrinsics.h(lowerCase, "toLowerCase(...)");
            productBookingRouteDetails = new ProductBookingRouteDetails(str3, str4, lowerCase, RouteInfoToProductBookingDetailsHelperKt.b(routeAppModel2.n), RouteInfoToProductBookingDetailsHelperKt.a(routeAppModel2.e), routeAppModel2.k);
            pickRouteLocationComponent = this.this$0;
            str = pickRouteLocationComponent.k.b;
            if (str != null) {
                RouteSearchResultStateManager routeSearchResultStateManager = pickRouteLocationComponent.p;
                Json json = ChaloJson.b;
                json.getClass();
                routeSearchResultStateManager.c(new InstantTicketResultState(json.a(ProductBookingRouteDetails.INSTANCE.serializer(), productBookingRouteDetails), null, 2), str);
            }
            gf.u(null, this.this$0.s);
            return Unit.f17538a;
        }
        ResultKt.b(obj);
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) obj;
        if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
            if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            this.this$0.E0(new ir0(19));
            RouteAppModel routeAppModel3 = (RouteAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
            if (((PickRouteLocationDataState) this.this$0.f.getValue()).i && routeAppModel3.p.f1713a) {
                PickRouteLocationComponent pickRouteLocationComponent2 = this.this$0;
                this.L$0 = routeAppModel3;
                this.label = 2;
                if (PickRouteLocationComponent.F0(pickRouteLocationComponent2, routeAppModel3, false, this) != coroutineSingletons) {
                    routeAppModel2 = routeAppModel3;
                    String str5 = routeAppModel2.b;
                    String str6 = routeAppModel2.c;
                    String lowerCase2 = routeAppModel2.j.toLowerCase(Locale.ROOT);
                    Intrinsics.h(lowerCase2, "toLowerCase(...)");
                    productBookingRouteDetails = new ProductBookingRouteDetails(str5, str6, lowerCase2, RouteInfoToProductBookingDetailsHelperKt.b(routeAppModel2.n), RouteInfoToProductBookingDetailsHelperKt.a(routeAppModel2.e), routeAppModel2.k);
                    pickRouteLocationComponent = this.this$0;
                    str = pickRouteLocationComponent.k.b;
                    if (str != null) {
                        RouteSearchResultStateManager routeSearchResultStateManager2 = pickRouteLocationComponent.p;
                        Json json2 = ChaloJson.b;
                        json2.getClass();
                        routeSearchResultStateManager2.c(new InstantTicketResultState(json2.a(ProductBookingRouteDetails.INSTANCE.serializer(), productBookingRouteDetails), null, 2), str);
                    }
                    gf.u(null, this.this$0.s);
                }
            } else {
                PickRouteLocationComponent pickRouteLocationComponent3 = this.this$0;
                this.L$0 = routeAppModel3;
                this.label = 3;
                if (PickRouteLocationComponent.F0(pickRouteLocationComponent3, routeAppModel3, true, this) != coroutineSingletons) {
                    routeAppModel = routeAppModel3;
                    this.this$0.E0(new ym0(routeAppModel, 23));
                }
            }
            return coroutineSingletons;
        }
        this.this$0.E0(new ir0(18));
        return Unit.f17538a;
    }
}
