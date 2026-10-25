package app.chalo.android;

import app.chalo.ads.ExitInterstitialDecisionReason;
import defpackage.vo1;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.android.ExitInterstitialExitGate$handleSuppressedExit$1", f = "ExitInterstitialExitGate.kt", l = {218}, m = "invokeSuspend", v = 1)
final class ExitInterstitialExitGate$handleSuppressedExit$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $exitApp;
    final /* synthetic */ ExitInterstitialDecisionReason $reason;
    final /* synthetic */ String $trigger;
    int label;
    final /* synthetic */ ExitInterstitialExitGate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExitInterstitialExitGate$handleSuppressedExit$1(ExitInterstitialExitGate exitInterstitialExitGate, ExitInterstitialDecisionReason exitInterstitialDecisionReason, Function0 function0, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = exitInterstitialExitGate;
        this.$reason = exitInterstitialDecisionReason;
        this.$exitApp = function0;
        this.$trigger = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ExitInterstitialExitGate$handleSuppressedExit$1(this.this$0, this.$reason, this.$exitApp, this.$trigger, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ExitInterstitialExitGate$handleSuppressedExit$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.String] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        boolean z = 0;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                ExitInterstitialExitGate exitInterstitialExitGate = this.this$0;
                ExitInterstitialDecisionReason exitInterstitialDecisionReason = this.$reason;
                this.label = 1;
                if (exitInterstitialExitGate.c(exitInterstitialDecisionReason, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            this.this$0.i = false;
            vo1.x("exit action=allow reason=", this.$reason.getAnalyticsValue(), "message");
            z = "explicit_exit";
            this.this$0.d.i("explicit_exit", "explicit_exit_reset_loaded", "explicit_exit_reset_showing");
            this.$exitApp.invoke();
            this.this$0.e(this.$trigger, true);
            return Unit.f17538a;
        } catch (CancellationException e) {
            this.this$0.i = z;
            throw e;
        }
    }
}
