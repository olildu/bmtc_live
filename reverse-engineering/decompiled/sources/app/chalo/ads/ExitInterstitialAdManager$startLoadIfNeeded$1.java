package app.chalo.ads;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.ads.ExitInterstitialAdManager$startLoadIfNeeded$1", f = "ExitInterstitialAdManager.android.kt", l = {355, 377}, m = "invokeSuspend", v = 1)
final class ExitInterstitialAdManager$startLoadIfNeeded$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $generation;
    final /* synthetic */ String $trigger;
    long J$0;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ExitInterstitialAdManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExitInterstitialAdManager$startLoadIfNeeded$1(ExitInterstitialAdManager exitInterstitialAdManager, long j, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = exitInterstitialAdManager;
        this.$generation = j;
        this.$trigger = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ExitInterstitialAdManager$startLoadIfNeeded$1 exitInterstitialAdManager$startLoadIfNeeded$1 = new ExitInterstitialAdManager$startLoadIfNeeded$1(this.this$0, this.$generation, this.$trigger, continuation);
        exitInterstitialAdManager$startLoadIfNeeded$1.L$0 = obj;
        return exitInterstitialAdManager$startLoadIfNeeded$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ExitInterstitialAdManager$startLoadIfNeeded$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0115, code lost:
    
        if (kotlinx.coroutines.BuildersKt.g(r4, r5, r14) == r1) goto L41;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.ads.ExitInterstitialAdManager$startLoadIfNeeded$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
