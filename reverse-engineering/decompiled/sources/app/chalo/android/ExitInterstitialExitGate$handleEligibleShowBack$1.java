package app.chalo.android;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.android.ExitInterstitialExitGate", f = "ExitInterstitialExitGate.kt", l = {157, 174}, m = "handleEligibleShowBack", v = 1)
final class ExitInterstitialExitGate$handleEligibleShowBack$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ExitInterstitialExitGate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExitInterstitialExitGate$handleEligibleShowBack$1(ExitInterstitialExitGate exitInterstitialExitGate, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = exitInterstitialExitGate;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ExitInterstitialExitGate.a(this.this$0, null, null, 0L, this);
    }
}
