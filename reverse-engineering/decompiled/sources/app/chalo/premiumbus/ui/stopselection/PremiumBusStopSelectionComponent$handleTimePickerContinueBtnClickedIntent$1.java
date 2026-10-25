package app.chalo.premiumbus.ui.stopselection;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.premiumbus.ui.stopselection.PremiumBusStopSelectionComponent$handleTimePickerContinueBtnClickedIntent$1", f = "PremiumBusStopSelectionComponent.kt", l = {362, 397}, m = "invokeSuspend", v = 1)
final class PremiumBusStopSelectionComponent$handleTimePickerContinueBtnClickedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ PremiumBusStopSelectionComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumBusStopSelectionComponent$handleTimePickerContinueBtnClickedIntent$1(PremiumBusStopSelectionComponent premiumBusStopSelectionComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = premiumBusStopSelectionComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PremiumBusStopSelectionComponent$handleTimePickerContinueBtnClickedIntent$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PremiumBusStopSelectionComponent$handleTimePickerContinueBtnClickedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d3, code lost:
    
        if (r2 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0160, code lost:
    
        if (r2 == r1) goto L30;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.ui.stopselection.PremiumBusStopSelectionComponent$handleTimePickerContinueBtnClickedIntent$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
