package app.chalo.metro.ui.regular;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.login.LoginAuthGuard;
import app.chalo.login.LoginAuthGuardKt;
import app.chalo.login.LoginGuardResult;
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
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.metro.ui.regular.StopBasedMetroLandingScreenComponent$handleSearchButtonClicked$1", f = "StopBasedMetroLandingScreenComponent.kt", l = {160, 169}, m = "invokeSuspend", v = 1)
final class StopBasedMetroLandingScreenComponent$handleSearchButtonClicked$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ StopBasedMetroLandingScreenComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StopBasedMetroLandingScreenComponent$handleSearchButtonClicked$1(StopBasedMetroLandingScreenComponent stopBasedMetroLandingScreenComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = stopBasedMetroLandingScreenComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new StopBasedMetroLandingScreenComponent$handleSearchButtonClicked$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((StopBasedMetroLandingScreenComponent$handleSearchButtonClicked$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        if (i == 0) {
            ResultKt.b(obj);
            StopBasedMetroLandingScreenComponent stopBasedMetroLandingScreenComponent = this.this$0;
            AnalyticsContract analyticsContract = stopBasedMetroLandingScreenComponent.t;
            Source source = Source.STOP_BASED_METRO_LANDING_SCREEN;
            AnalyticsContractImplKt.b(analyticsContract, "booking mode search button clicked", source, MapsKt.h(new Pair("isLoggedIn", stopBasedMetroLandingScreenComponent.y.getG().getValue())), false, 24);
            StopBasedMetroLandingScreenComponent stopBasedMetroLandingScreenComponent2 = this.this$0;
            LoginAuthGuard loginAuthGuard = stopBasedMetroLandingScreenComponent2.x;
            this.label = 1;
            obj = loginAuthGuard.a(source, stopBasedMetroLandingScreenComponent2, this);
            if (obj != coroutineSingletons) {
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return unit;
        }
        ResultKt.b(obj);
        LoginGuardResult loginGuardResult = (LoginGuardResult) obj;
        Intrinsics.i(loginGuardResult, "<this>");
        int i2 = LoginAuthGuardKt.WhenMappings.f5180a[loginGuardResult.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                return unit;
            }
            throw new NoWhenBranchMatchedException();
        }
        StopBasedMetroLandingScreenComponent stopBasedMetroLandingScreenComponent3 = this.this$0;
        this.label = 2;
        return StopBasedMetroLandingScreenComponent.H0(stopBasedMetroLandingScreenComponent3, this) == coroutineSingletons ? coroutineSingletons : unit;
    }
}
