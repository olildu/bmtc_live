package app.chalo.login.domain;

import app.chalo.constants.Source;
import app.chalo.login.data.models.app.OnboardingMinProfileUpdateRemoteConfigModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lapp/chalo/login/data/models/app/OnboardingMinProfileUpdateRemoteConfigModel;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.login.domain.FetchOnboardingMinProfileUpdateConfigUseCase$invoke$2", f = "FetchOnboardingMinProfileUpdateConfigUseCase.kt", l = {}, m = "invokeSuspend", v = 1)
final class FetchOnboardingMinProfileUpdateConfigUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super OnboardingMinProfileUpdateRemoteConfigModel>, Object> {
    final /* synthetic */ OnboardingMinProfileUpdateRemoteConfigModel $config;
    final /* synthetic */ Source $source;
    int label;
    final /* synthetic */ FetchOnboardingMinProfileUpdateConfigUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchOnboardingMinProfileUpdateConfigUseCase$invoke$2(FetchOnboardingMinProfileUpdateConfigUseCase fetchOnboardingMinProfileUpdateConfigUseCase, OnboardingMinProfileUpdateRemoteConfigModel onboardingMinProfileUpdateRemoteConfigModel, Source source, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fetchOnboardingMinProfileUpdateConfigUseCase;
        this.$config = onboardingMinProfileUpdateRemoteConfigModel;
        this.$source = source;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FetchOnboardingMinProfileUpdateConfigUseCase$invoke$2(this.this$0, this.$config, this.$source, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FetchOnboardingMinProfileUpdateConfigUseCase$invoke$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        FetchOnboardingMinProfileUpdateConfigUseCase fetchOnboardingMinProfileUpdateConfigUseCase = this.this$0;
        OnboardingMinProfileUpdateRemoteConfigModel onboardingMinProfileUpdateRemoteConfigModel = this.$config;
        OnboardingMinProfileUpdateRemoteConfigModel onboardingMinProfileUpdateRemoteConfigModel2 = FetchOnboardingMinProfileUpdateConfigUseCase.d;
        fetchOnboardingMinProfileUpdateConfigUseCase.getClass();
        OnboardingMinProfileUpdateRemoteConfigModel onboardingMinProfileUpdateRemoteConfigModel3 = FetchOnboardingMinProfileUpdateConfigUseCase.d;
        String expId = onboardingMinProfileUpdateRemoteConfigModel.f5197a;
        boolean z = onboardingMinProfileUpdateRemoteConfigModel.c;
        if (StringsKt.F(expId)) {
            expId = onboardingMinProfileUpdateRemoteConfigModel3.f5197a;
        }
        String expName = onboardingMinProfileUpdateRemoteConfigModel.b;
        if (StringsKt.F(expName)) {
            expName = onboardingMinProfileUpdateRemoteConfigModel3.b;
        }
        String variant = onboardingMinProfileUpdateRemoteConfigModel.d;
        if (StringsKt.F(variant)) {
            variant = z ? "variant_a" : onboardingMinProfileUpdateRemoteConfigModel3.d;
        }
        Intrinsics.i(expId, "expId");
        Intrinsics.i(expName, "expName");
        Intrinsics.i(variant, "variant");
        OnboardingMinProfileUpdateRemoteConfigModel onboardingMinProfileUpdateRemoteConfigModel4 = new OnboardingMinProfileUpdateRemoteConfigModel(expId, expName, variant, z);
        this.this$0.c.a(expName, expId, variant, this.$source.getSourceName());
        return onboardingMinProfileUpdateRemoteConfigModel4;
    }
}
