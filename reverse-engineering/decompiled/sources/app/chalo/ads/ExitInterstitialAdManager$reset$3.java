package app.chalo.ads;

import app.chalo.constants.Source;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.ads.ExitInterstitialAdManager$reset$3", f = "ExitInterstitialAdManager.android.kt", l = {}, m = "invokeSuspend", v = 1)
final class ExitInterstitialAdManager$reset$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.ObjectRef<ExitInterstitialLoadedAd> $showingAdToDestroy;
    final /* synthetic */ String $showingDestroyReason;
    int label;
    final /* synthetic */ ExitInterstitialAdManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExitInterstitialAdManager$reset$3(ExitInterstitialAdManager exitInterstitialAdManager, Ref.ObjectRef objectRef, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = exitInterstitialAdManager;
        this.$showingAdToDestroy = objectRef;
        this.$showingDestroyReason = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ExitInterstitialAdManager$reset$3(this.this$0, this.$showingAdToDestroy, this.$showingDestroyReason, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ExitInterstitialAdManager$reset$3 exitInterstitialAdManager$reset$3 = (ExitInterstitialAdManager$reset$3) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f17538a;
        exitInterstitialAdManager$reset$3.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        ExitInterstitialAdManager exitInterstitialAdManager = this.this$0;
        ExitInterstitialLoadedAd exitInterstitialLoadedAd = this.$showingAdToDestroy.element;
        String str = this.$showingDestroyReason;
        Source source = ExitInterstitialAdManager.w;
        exitInterstitialAdManager.getClass();
        ExitInterstitialAdManager.c(exitInterstitialLoadedAd, str);
        return Unit.f17538a;
    }
}
