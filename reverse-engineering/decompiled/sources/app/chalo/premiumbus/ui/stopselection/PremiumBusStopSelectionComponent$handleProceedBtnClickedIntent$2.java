package app.chalo.premiumbus.ui.stopselection;

import app.chalo.premiumbus.data.models.app.PBStopPlaceSelectedAppModel;
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
@DebugMetadata(c = "app.chalo.premiumbus.ui.stopselection.PremiumBusStopSelectionComponent$handleProceedBtnClickedIntent$2", f = "PremiumBusStopSelectionComponent.kt", l = {727, 747, 766, 788}, m = "invokeSuspend", v = 1)
final class PremiumBusStopSelectionComponent$handleProceedBtnClickedIntent$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PBStopPlaceSelectedAppModel $fromStop;
    final /* synthetic */ PBStopPlaceSelectedAppModel $toStop;
    int label;
    final /* synthetic */ PremiumBusStopSelectionComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumBusStopSelectionComponent$handleProceedBtnClickedIntent$2(PremiumBusStopSelectionComponent premiumBusStopSelectionComponent, PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel, PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = premiumBusStopSelectionComponent;
        this.$fromStop = pBStopPlaceSelectedAppModel;
        this.$toStop = pBStopPlaceSelectedAppModel2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PremiumBusStopSelectionComponent$handleProceedBtnClickedIntent$2(this.this$0, this.$fromStop, this.$toStop, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PremiumBusStopSelectionComponent$handleProceedBtnClickedIntent$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0174  */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0170, code lost:
    
        if (app.chalo.premiumbus.ui.stopselection.PremiumBusStopSelectionComponent.H0(r2, r3, r29) == r1) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0195, code lost:
    
        if (app.chalo.premiumbus.ui.stopselection.PremiumBusStopSelectionComponent.G0(r2, r29) == r1) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x02bc, code lost:
    
        if (r2 == r1) goto L99;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) {
        /*
            Method dump skipped, instruction units count: 813
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.ui.stopselection.PremiumBusStopSelectionComponent$handleProceedBtnClickedIntent$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
