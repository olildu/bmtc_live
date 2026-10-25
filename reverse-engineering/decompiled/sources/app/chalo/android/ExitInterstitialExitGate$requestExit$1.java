package app.chalo.android;

import android.app.Activity;
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
@DebugMetadata(c = "app.chalo.android.ExitInterstitialExitGate$requestExit$1", f = "ExitInterstitialExitGate.kt", l = {141}, m = "invokeSuspend", v = 1)
final class ExitInterstitialExitGate$requestExit$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ Function0<Unit> $exitApp;
    final /* synthetic */ long $nowEpochMillis;
    int label;
    final /* synthetic */ ExitInterstitialExitGate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExitInterstitialExitGate$requestExit$1(ExitInterstitialExitGate exitInterstitialExitGate, Activity activity, Function0 function0, long j, Continuation continuation) {
        super(2, continuation);
        this.this$0 = exitInterstitialExitGate;
        this.$activity = activity;
        this.$exitApp = function0;
        this.$nowEpochMillis = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ExitInterstitialExitGate$requestExit$1(this.this$0, this.$activity, this.$exitApp, this.$nowEpochMillis, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ExitInterstitialExitGate$requestExit$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            ExitInterstitialExitGate exitInterstitialExitGate = this.this$0;
            Activity activity = this.$activity;
            Function0<Unit> function0 = this.$exitApp;
            long j = this.$nowEpochMillis;
            this.label = 1;
            if (ExitInterstitialExitGate.a(exitInterstitialExitGate, activity, function0, j, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f17538a;
    }
}
