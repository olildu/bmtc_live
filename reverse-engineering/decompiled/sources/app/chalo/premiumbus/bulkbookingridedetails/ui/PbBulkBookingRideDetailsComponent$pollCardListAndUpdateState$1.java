package app.chalo.premiumbus.bulkbookingridedetails.ui;

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
@DebugMetadata(c = "app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsComponent$pollCardListAndUpdateState$1", f = "PbBulkBookingRideDetailsComponent.kt", l = {915}, m = "invokeSuspend", v = 1)
final class PbBulkBookingRideDetailsComponent$pollCardListAndUpdateState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PbBulkBookingRideDetailsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PbBulkBookingRideDetailsComponent$pollCardListAndUpdateState$1(PbBulkBookingRideDetailsComponent pbBulkBookingRideDetailsComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = pbBulkBookingRideDetailsComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PbBulkBookingRideDetailsComponent$pollCardListAndUpdateState$1 pbBulkBookingRideDetailsComponent$pollCardListAndUpdateState$1 = new PbBulkBookingRideDetailsComponent$pollCardListAndUpdateState$1(this.this$0, continuation);
        pbBulkBookingRideDetailsComponent$pollCardListAndUpdateState$1.L$0 = obj;
        return pbBulkBookingRideDetailsComponent$pollCardListAndUpdateState$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PbBulkBookingRideDetailsComponent$pollCardListAndUpdateState$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0027  */
    /* JADX WARN: Code duplicated, block: B:13:0x0033 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0031 -> B:14:0x0034). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L19
            if (r1 != r2) goto L11
            java.lang.Object r1 = r6.L$0
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            kotlin.ResultKt.b(r7)
            goto L34
        L11:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L19:
            kotlin.ResultKt.b(r7)
            java.lang.Object r7 = r6.L$0
            kotlinx.coroutines.CoroutineScope r7 = (kotlinx.coroutines.CoroutineScope) r7
            r1 = r7
        L21:
            boolean r7 = kotlinx.coroutines.CoroutineScopeKt.e(r1)
            if (r7 == 0) goto L48
            r6.L$0 = r1
            r6.label = r2
            r3 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r7 = kotlinx.coroutines.DelayKt.b(r3, r6)
            if (r7 != r0) goto L34
            return r0
        L34:
            app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsComponent r7 = r6.this$0
            java.util.List r3 = r7.R
            java.lang.String r4 = "liveCards"
            kotlin.jvm.internal.Intrinsics.i(r3, r4)
            ud r4 = new ud
            r5 = 13
            r4.<init>(r3, r5)
            r7.E0(r4)
            goto L21
        L48:
            kotlin.Unit r7 = kotlin.Unit.f17538a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsComponent$pollCardListAndUpdateState$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
