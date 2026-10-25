package app.chalo.home.ui.history;

import app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel;
import app.chalo.premiumbus.prebookedtickets.domain.PremiumBusProductConfigForRepurchaseFailureReason;
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
@DebugMetadata(c = "app.chalo.home.ui.history.MyTicketsComponent$handlePremiumBusBookAgainClick$2", f = "MyTicketsComponent.kt", l = {1997, 2012, 2040}, m = "invokeSuspend", v = 1)
final class MyTicketsComponent$handlePremiumBusBookAgainClick$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PremiumReserveTicketAppModel $premiumReserveTicket;
    Object L$0;
    int label;
    final /* synthetic */ MyTicketsComponent this$0;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3398a;

        static {
            int[] iArr = new int[PremiumBusProductConfigForRepurchaseFailureReason.values().length];
            try {
                iArr[PremiumBusProductConfigForRepurchaseFailureReason.CONFIG_FETCH_FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PremiumBusProductConfigForRepurchaseFailureReason.CONFIG_NOT_AVAILABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PremiumBusProductConfigForRepurchaseFailureReason.CONFIG_NOT_ACTIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f3398a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyTicketsComponent$handlePremiumBusBookAgainClick$2(MyTicketsComponent myTicketsComponent, PremiumReserveTicketAppModel premiumReserveTicketAppModel, Continuation continuation) {
        super(2, continuation);
        this.this$0 = myTicketsComponent;
        this.$premiumReserveTicket = premiumReserveTicketAppModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MyTicketsComponent$handlePremiumBusBookAgainClick$2(this.this$0, this.$premiumReserveTicket, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MyTicketsComponent$handlePremiumBusBookAgainClick$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00bd, code lost:
    
        if (r8 == r0) goto L37;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.ui.history.MyTicketsComponent$handlePremiumBusBookAgainClick$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
