package app.chalo.premiumbus.ui.faredetails;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsComponent$switchTo$1", f = "PremiumBusFareDetailsComponent.kt", l = {518, 331, 336, 341, 346}, m = "invokeSuspend", v = 1)
final class PremiumBusFareDetailsComponent$switchTo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PremiumBusFareDetailsFlowType $flowType;
    final /* synthetic */ Job $supersededJob;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ PremiumBusFareDetailsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumBusFareDetailsComponent$switchTo$1(PremiumBusFareDetailsComponent premiumBusFareDetailsComponent, PremiumBusFareDetailsFlowType premiumBusFareDetailsFlowType, Job job, Continuation continuation) {
        super(2, continuation);
        this.this$0 = premiumBusFareDetailsComponent;
        this.$flowType = premiumBusFareDetailsFlowType;
        this.$supersededJob = job;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PremiumBusFareDetailsComponent$switchTo$1 premiumBusFareDetailsComponent$switchTo$1 = new PremiumBusFareDetailsComponent$switchTo$1(this.this$0, this.$flowType, this.$supersededJob, continuation);
        premiumBusFareDetailsComponent$switchTo$1.L$0 = obj;
        return premiumBusFareDetailsComponent$switchTo$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PremiumBusFareDetailsComponent$switchTo$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:42:0x00fa  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e1, code lost:
    
        if (app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsComponent.F0(r12, r1, app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsSwitchError.TimedOut.f7609a, r11) == r0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f7, code lost:
    
        if (app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsComponent.F0(r12, r1, r2, r11) == r0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0106, code lost:
    
        if (app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsComponent.G0(r12, r1, r3, r11) == r0) goto L44;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsComponent$switchTo$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
