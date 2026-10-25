package app.chalo.android;

import app.chalo.ads.ExitInterstitialCapState;
import app.chalo.ads.ExitInterstitialCapStore;
import app.chalo.utils.chalologger.ChaloLog;
import java.util.concurrent.CancellationException;
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
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.android.ExitInterstitialExitGate$warmCapState$1", f = "ExitInterstitialExitGate.kt", l = {255}, m = "invokeSuspend", v = 1)
final class ExitInterstitialExitGate$warmCapState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $rearmPreload;
    final /* synthetic */ String $trigger;
    int label;
    final /* synthetic */ ExitInterstitialExitGate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExitInterstitialExitGate$warmCapState$1(ExitInterstitialExitGate exitInterstitialExitGate, String str, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = exitInterstitialExitGate;
        this.$trigger = str;
        this.$rearmPreload = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ExitInterstitialExitGate$warmCapState$1(this.this$0, this.$trigger, this.$rearmPreload, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ExitInterstitialExitGate$warmCapState$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            try {
                try {
                    if (i == 0) {
                        ResultKt.b(obj);
                        ExitInterstitialCapStore exitInterstitialCapStore = this.this$0.b;
                        this.label = 1;
                        obj = exitInterstitialCapStore.a(this);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.b(obj);
                    }
                    ExitInterstitialCapState exitInterstitialCapState = (ExitInterstitialCapState) obj;
                    ExitInterstitialExitGate exitInterstitialExitGate = this.this$0;
                    exitInterstitialExitGate.n = exitInterstitialCapState;
                    exitInterstitialExitGate.m = true;
                    String message = "cache action=refresh trigger=" + this.$trigger + " exitCount=" + exitInterstitialCapState.f778a + " lastShownAt=" + exitInterstitialCapState.b;
                    Intrinsics.i(message, "message");
                    if (this.$rearmPreload) {
                        ExitInterstitialExitGate exitInterstitialExitGate2 = this.this$0;
                        exitInterstitialExitGate2.d(exitInterstitialExitGate2.f903a.b(), this.$trigger);
                    }
                } catch (Throwable th) {
                    this.this$0.m = false;
                    ChaloLog.c("AdsterExitInterstitialExitGate", "cache action=refresh_failed trigger=" + this.$trigger, th);
                }
                this.this$0.l = null;
                return Unit.f17538a;
            } catch (CancellationException e) {
                throw e;
            }
        } catch (Throwable th2) {
            this.this$0.l = null;
            throw th2;
        }
    }
}
