package app.chalo.ads;

import android.content.Context;
import java.util.Map;
import kotlin.Metadata;
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
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.ads.ExitInterstitialAdManager$startLoadIfNeeded$1$1$1", f = "ExitInterstitialAdManager.android.kt", l = {}, m = "invokeSuspend", v = 1)
final class ExitInterstitialAdManager$startLoadIfNeeded$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ExitInterstitialAdLoader $loader;
    final /* synthetic */ Map<String, String> $targeting;
    int label;
    final /* synthetic */ ExitInterstitialAdManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExitInterstitialAdManager$startLoadIfNeeded$1$1$1(ExitInterstitialAdLoader exitInterstitialAdLoader, ExitInterstitialAdManager exitInterstitialAdManager, Map map, Continuation continuation) {
        super(2, continuation);
        this.$loader = exitInterstitialAdLoader;
        this.this$0 = exitInterstitialAdManager;
        this.$targeting = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ExitInterstitialAdManager$startLoadIfNeeded$1$1$1(this.$loader, this.this$0, this.$targeting, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ExitInterstitialAdManager$startLoadIfNeeded$1$1$1 exitInterstitialAdManager$startLoadIfNeeded$1$1$1 = (ExitInterstitialAdManager$startLoadIfNeeded$1$1$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f17538a;
        exitInterstitialAdManager$startLoadIfNeeded$1$1$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        ExitInterstitialAdLoader exitInterstitialAdLoader = this.$loader;
        Context context = this.this$0.g;
        Intrinsics.h(context, "access$getAppContext$p(...)");
        exitInterstitialAdLoader.a(context, this.this$0.h, this.$targeting);
        return Unit.f17538a;
    }
}
