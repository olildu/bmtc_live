package app.chalo.premiumbus.ui.changestop;

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
@DebugMetadata(c = "app.chalo.premiumbus.ui.changestop.PremiumBusChangeStopComponent$fetchEligibleStopsAndRouteInfo$1", f = "PremiumBusChangeStopComponent.kt", l = {140, 143}, m = "invokeSuspend", v = 1)
final class PremiumBusChangeStopComponent$fetchEligibleStopsAndRouteInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $bookingId;
    final /* synthetic */ String $routeId;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ PremiumBusChangeStopComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumBusChangeStopComponent$fetchEligibleStopsAndRouteInfo$1(PremiumBusChangeStopComponent premiumBusChangeStopComponent, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = premiumBusChangeStopComponent;
        this.$routeId = str;
        this.$bookingId = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PremiumBusChangeStopComponent$fetchEligibleStopsAndRouteInfo$1 premiumBusChangeStopComponent$fetchEligibleStopsAndRouteInfo$1 = new PremiumBusChangeStopComponent$fetchEligibleStopsAndRouteInfo$1(this.this$0, this.$routeId, this.$bookingId, continuation);
        premiumBusChangeStopComponent$fetchEligibleStopsAndRouteInfo$1.L$0 = obj;
        return premiumBusChangeStopComponent$fetchEligibleStopsAndRouteInfo$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PremiumBusChangeStopComponent$fetchEligibleStopsAndRouteInfo$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:41:0x0102  */
    /* JADX WARN: Code duplicated, block: B:42:0x012a  */
    /* JADX WARN: Code duplicated, block: B:44:0x012e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0180  */
    /* JADX WARN: Code duplicated, block: B:48:0x0184  */
    /* JADX WARN: Code duplicated, block: B:52:0x019b  */
    /* JADX WARN: Code duplicated, block: B:57:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:60:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:62:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:66:0x01f3 A[LOOP:1: B:64:0x01ed->B:66:0x01f3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:70:0x0220  */
    /* JADX WARN: Code duplicated, block: B:72:0x0224  */
    /* JADX WARN: Code duplicated, block: B:76:0x0238  */
    /* JADX WARN: Code duplicated, block: B:79:0x01ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x0195 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0081, code lost:
    
        if (r9 == r1) goto L37;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.ui.changestop.PremiumBusChangeStopComponent$fetchEligibleStopsAndRouteInfo$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
