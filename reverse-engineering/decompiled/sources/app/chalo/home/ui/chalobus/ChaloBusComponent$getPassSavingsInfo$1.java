package app.chalo.home.ui.chalobus;

import app.chalo.constants.Source;
import app.chalo.home.analytics.HomeScreenAnalyticsHelper;
import app.chalo.home.data.model.PremiumPassSavingsInfo;
import app.chalo.home.domain.FetchPremiumPassSavingsUseCase;
import app.chalo.utils.ChaloUseCaseResult;
import defpackage.vo1;
import defpackage.we;
import defpackage.yg;
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
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.ui.chalobus.ChaloBusComponent$getPassSavingsInfo$1", f = "ChaloBusComponent.kt", l = {1190}, m = "invokeSuspend", v = 1)
final class ChaloBusComponent$getPassSavingsInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ChaloBusComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloBusComponent$getPassSavingsInfo$1(ChaloBusComponent chaloBusComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = chaloBusComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChaloBusComponent$getPassSavingsInfo$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChaloBusComponent$getPassSavingsInfo$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            FetchPremiumPassSavingsUseCase fetchPremiumPassSavingsUseCase = this.this$0.B;
            this.label = 1;
            obj = fetchPremiumPassSavingsUseCase.a(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) obj;
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
            HomeScreenAnalyticsHelper.DefaultImpls.a(this.this$0.r, "pb pass savings fetch failure", vo1.s("errorType", ((FetchPremiumPassSavingsUseCase.PremiumPassSavingsFetchException) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a).name()), Source.CHALO_BUS_SCREEN_TAB, 12);
            this.this$0.E0(new we(26));
        } else {
            if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            HomeScreenAnalyticsHelper homeScreenAnalyticsHelper = this.this$0.r;
            Source source = Source.CHALO_BUS_SCREEN_TAB;
            ChaloUseCaseResult.Success success = (ChaloUseCaseResult.Success) chaloUseCaseResult;
            PremiumPassSavingsInfo premiumPassSavingsInfo = (PremiumPassSavingsInfo) success.f10419a;
            HomeScreenAnalyticsHelper.DefaultImpls.a(homeScreenAnalyticsHelper, "pb pass savings fetch success", MapsKt.i(new Pair("newPassSavings", String.valueOf(premiumPassSavingsInfo.b)), new Pair("oldPassSavings", String.valueOf(premiumPassSavingsInfo.f2874a)), new Pair("isUpdated", Boolean.valueOf(!Intrinsics.d(premiumPassSavingsInfo.b, premiumPassSavingsInfo.f2874a)))), source, 12);
            this.this$0.E0(new yg(success, 0));
        }
        return Unit.f17538a;
    }
}
