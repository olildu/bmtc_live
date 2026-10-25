package app.chalo.home.ui.history;

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
@DebugMetadata(c = "app.chalo.home.ui.history.MyTicketsComponent$handleBookAgainClickedIntent$1", f = "MyTicketsComponent.kt", l = {1964, 1971}, m = "invokeSuspend", v = 1)
final class MyTicketsComponent$handleBookAgainClickedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MyTicketsViewIntent.BookAgainClickedIntent $intent;
    int label;
    final /* synthetic */ MyTicketsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyTicketsComponent$handleBookAgainClickedIntent$1(MyTicketsViewIntent.BookAgainClickedIntent bookAgainClickedIntent, MyTicketsComponent myTicketsComponent, Continuation continuation) {
        super(2, continuation);
        this.$intent = bookAgainClickedIntent;
        this.this$0 = myTicketsComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MyTicketsComponent$handleBookAgainClickedIntent$1(this.$intent, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MyTicketsComponent$handleBookAgainClickedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ad, code lost:
    
        if (r9.this$0.m1(((app.chalo.home.domain.ChaloUserBookingType.SuperPassBooking.MagicSuperPassBooking) r10).d, false, (app.chalo.home.domain.ChaloUserBookingType.SuperPassBooking) r10, r9) == r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c3, code lost:
    
        if (r9.this$0.m1(((app.chalo.home.domain.ChaloUserBookingType.SuperPassBooking.RideBasedSuperPassBooking) r10).d, false, (app.chalo.home.domain.ChaloUserBookingType.SuperPassBooking) r10, r9) == r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c5, code lost:
    
        return r0;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.ui.history.MyTicketsComponent$handleBookAgainClickedIntent$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
