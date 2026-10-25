package app.chalo.ads;

import app.chalo.constants.Source;
import app.chalo.domain.CheckIfExperimentEnabledUseCase;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lapp/chalo/ads/ExitInterstitialAdConfig;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.ads.FetchExitInterstitialConfigUseCase$invoke$2", f = "FetchExitInterstitialConfigUseCase.kt", l = {31}, m = "invokeSuspend", v = 1)
final class FetchExitInterstitialConfigUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ExitInterstitialAdConfig>, Object> {
    final /* synthetic */ Source $source;
    Object L$0;
    int label;
    final /* synthetic */ FetchExitInterstitialConfigUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchExitInterstitialConfigUseCase$invoke$2(FetchExitInterstitialConfigUseCase fetchExitInterstitialConfigUseCase, Source source, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fetchExitInterstitialConfigUseCase;
        this.$source = source;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FetchExitInterstitialConfigUseCase$invoke$2(this.this$0, this.$source, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FetchExitInterstitialConfigUseCase$invoke$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ExitInterstitialAdConfig exitInterstitialAdConfig;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                ExitInterstitialAdConfig exitInterstitialAdConfigA = ((ExitInterstitialAdConfig) this.this$0.f783a.a("exitInterstitialAdConfigV2", Reflection.a(ExitInterstitialAdConfig.class), new ExitInterstitialAdConfig(63))).a();
                String str = exitInterstitialAdConfigA.b;
                String str2 = exitInterstitialAdConfigA.f770a;
                if (!exitInterstitialAdConfigA.d || StringsKt.F(str2) || StringsKt.F(str)) {
                    return FetchExitInterstitialConfigUseCase.e;
                }
                CheckIfExperimentEnabledUseCase checkIfExperimentEnabledUseCase = this.this$0.b;
                this.L$0 = exitInterstitialAdConfigA;
                this.label = 1;
                Object objA = checkIfExperimentEnabledUseCase.a(str, str2, this);
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
                exitInterstitialAdConfig = exitInterstitialAdConfigA;
                obj = objA;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                exitInterstitialAdConfig = (ExitInterstitialAdConfig) this.L$0;
                ResultKt.b(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                return FetchExitInterstitialConfigUseCase.e;
            }
            this.this$0.c.a(exitInterstitialAdConfig.b, exitInterstitialAdConfig.f770a, exitInterstitialAdConfig.c, this.$source.name());
            return exitInterstitialAdConfig;
        } catch (Throwable th) {
            if (th instanceof CancellationException) {
                throw th;
            }
            return FetchExitInterstitialConfigUseCase.e;
        }
    }
}
