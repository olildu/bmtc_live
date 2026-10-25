package app.chalo.home.ui.base;

import app.chalo.constants.Source;
import app.chalo.home.analytics.HomeScreenAnalyticsHelper;
import app.chalo.home.domain.AllRequestedBookedProductsFailureReason;
import app.chalo.home.domain.GetAllRequestedBookedProductsUseCase;
import app.chalo.utils.ChaloUseCaseResult;
import defpackage.vo1;
import java.util.List;
import java.util.Map;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.ui.base.HomeComponent$raiseAnalyticsEventForAvailableCachedProducts$1", f = "HomeComponent.kt", l = {1840, 1849, 1854}, m = "invokeSuspend", v = 1)
final class HomeComponent$raiseAnalyticsEventForAvailableCachedProducts$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ HomeComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeComponent$raiseAnalyticsEventForAvailableCachedProducts$1(HomeComponent homeComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = homeComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HomeComponent$raiseAnalyticsEventForAvailableCachedProducts$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((HomeComponent$raiseAnalyticsEventForAvailableCachedProducts$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0079  */
    /* JADX WARN: Code duplicated, block: B:28:0x008c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0096  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list;
        HomeScreenAnalyticsHelper homeScreenAnalyticsHelper;
        Source source;
        HomeScreenAnalyticsHelper homeScreenAnalyticsHelper2;
        Source source2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            GetAllRequestedBookedProductsUseCase getAllRequestedBookedProductsUseCase = this.this$0.Y;
            this.label = 1;
            obj = GetAllRequestedBookedProductsUseCase.l(getAllRequestedBookedProductsUseCase, null, null, this, 7);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            ResultKt.b(obj);
        } else {
            if (i == 2) {
                ResultKt.b(obj);
                list = (List) obj;
                if (list != null) {
                    HomeComponent homeComponent = this.this$0;
                    homeScreenAnalyticsHelper = homeComponent.C;
                    source = Source.HOME_SCREEN;
                    this.L$0 = homeScreenAnalyticsHelper;
                    this.L$1 = source;
                    this.label = 3;
                    obj = HomeComponent.K0(homeComponent, list, this);
                    if (obj != coroutineSingletons) {
                        homeScreenAnalyticsHelper2 = homeScreenAnalyticsHelper;
                        source2 = source;
                    }
                    return coroutineSingletons;
                }
                HomeScreenAnalyticsHelper.DefaultImpls.a(this.this$0.C, "user bookings in cache empty", null, Source.HOME_SCREEN, 14);
                return Unit.f17538a;
            }
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            source2 = (Source) this.L$1;
            homeScreenAnalyticsHelper2 = (HomeScreenAnalyticsHelper) this.L$0;
            ResultKt.b(obj);
        }
        HomeScreenAnalyticsHelper.DefaultImpls.a(homeScreenAnalyticsHelper2, "homescreen user bookings in cache logger", (Map) obj, source2, 12);
        return Unit.f17538a;
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) obj;
        if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
            if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            Flow flow = (Flow) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
            this.label = 2;
            obj = FlowKt.v(flow, this);
            if (obj != coroutineSingletons) {
                list = (List) obj;
                if (list != null) {
                    HomeComponent homeComponent2 = this.this$0;
                    homeScreenAnalyticsHelper = homeComponent2.C;
                    source = Source.HOME_SCREEN;
                    this.L$0 = homeScreenAnalyticsHelper;
                    this.L$1 = source;
                    this.label = 3;
                    obj = HomeComponent.K0(homeComponent2, list, this);
                    if (obj != coroutineSingletons) {
                        homeScreenAnalyticsHelper2 = homeScreenAnalyticsHelper;
                        source2 = source;
                        HomeScreenAnalyticsHelper.DefaultImpls.a(homeScreenAnalyticsHelper2, "homescreen user bookings in cache logger", (Map) obj, source2, 12);
                    }
                } else {
                    HomeScreenAnalyticsHelper.DefaultImpls.a(this.this$0.C, "user bookings in cache empty", null, Source.HOME_SCREEN, 14);
                }
            }
            return coroutineSingletons;
        }
        HomeScreenAnalyticsHelper.DefaultImpls.a(this.this$0.C, "check user bookings in cache failed", vo1.s("failureReason", ((AllRequestedBookedProductsFailureReason) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a).name()), Source.HOME_SCREEN, 12);
        return Unit.f17538a;
    }
}
