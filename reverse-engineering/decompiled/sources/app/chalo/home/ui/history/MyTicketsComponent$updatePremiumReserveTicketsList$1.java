package app.chalo.home.ui.history;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.ui.history.MyTicketsComponent$updatePremiumReserveTicketsList$1", f = "MyTicketsComponent.kt", l = {2816, 2821, 2825, 2829}, m = "invokeSuspend", v = 1)
final class MyTicketsComponent$updatePremiumReserveTicketsList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    long J$0;
    Object L$0;
    int label;
    final /* synthetic */ MyTicketsComponent this$0;

    /* JADX INFO: renamed from: app.chalo.home.ui.history.MyTicketsComponent$updatePremiumReserveTicketsList$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final class AnonymousClass1<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MyTicketsComponent f3412a;
        public final /* synthetic */ long b;

        public AnonymousClass1(MyTicketsComponent myTicketsComponent, long j) {
            this.f3412a = myTicketsComponent;
            this.b = j;
        }

        /* JADX WARN: Code duplicated, block: B:20:0x008f  */
        /* JADX WARN: Code duplicated, block: B:23:0x00b4  */
        /* JADX WARN: Code duplicated, block: B:27:0x00f6  */
        /* JADX WARN: Code duplicated, block: B:31:0x0119  */
        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00f6 -> B:13:0x004f). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(java.util.List r29, kotlin.coroutines.Continuation r30) {
            /*
                Method dump skipped, instruction units count: 335
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.ui.history.MyTicketsComponent$updatePremiumReserveTicketsList$1.AnonymousClass1.emit(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyTicketsComponent$updatePremiumReserveTicketsList$1(MyTicketsComponent myTicketsComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = myTicketsComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MyTicketsComponent$updatePremiumReserveTicketsList$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MyTicketsComponent$updatePremiumReserveTicketsList$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0097  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a7, code lost:
    
        if (((kotlinx.coroutines.flow.Flow) r13).collect(r1, r12) == r0) goto L29;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r12.label
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L3b
            if (r1 == r5) goto L32
            if (r1 == r4) goto L26
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L17
            kotlin.ResultKt.b(r13)
            goto Laa
        L17:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1f:
            long r3 = r12.J$0
            kotlin.ResultKt.b(r13)
            goto L98
        L26:
            long r4 = r12.J$0
            java.lang.Object r1 = r12.L$0
            app.chalo.usecase.GetTimeInMillisAfterXTimeUseCase r1 = (app.chalo.usecase.GetTimeInMillisAfterXTimeUseCase) r1
            kotlin.ResultKt.b(r13)
            r10 = r4
        L30:
            r4 = r1
            goto L72
        L32:
            java.lang.Object r1 = r12.L$0
            app.chalo.usecase.GetTimeInMillisAfterXTimeUseCase r1 = (app.chalo.usecase.GetTimeInMillisAfterXTimeUseCase) r1
            kotlin.ResultKt.b(r13)
        L39:
            r5 = r1
            goto L4f
        L3b:
            kotlin.ResultKt.b(r13)
            app.chalo.home.ui.history.MyTicketsComponent r13 = r12.this$0
            app.chalo.usecase.GetTimeInMillisAfterXTimeUseCase r1 = r13.p
            app.chalo.contract.BasicInfoContract r13 = r13.k
            r12.L$0 = r1
            r12.label = r5
            java.lang.Object r13 = r13.c(r12)
            if (r13 != r0) goto L39
            goto La9
        L4f:
            java.lang.Number r13 = (java.lang.Number) r13
            long r6 = r13.longValue()
            r8 = 0
            app.chalo.usecase.MillisAfterTimeFormatType r10 = app.chalo.usecase.MillisAfterTimeFormatType.START_OF_DAY
            long r5 = r5.a(r6, r8, r10)
            app.chalo.home.ui.history.MyTicketsComponent r13 = r12.this$0
            app.chalo.usecase.GetTimeInMillisAfterXTimeUseCase r1 = r13.p
            app.chalo.contract.BasicInfoContract r13 = r13.k
            r12.L$0 = r1
            r12.J$0 = r5
            r12.label = r4
            java.lang.Object r13 = r13.c(r12)
            if (r13 != r0) goto L70
            goto La9
        L70:
            r10 = r5
            goto L30
        L72:
            java.lang.Number r13 = (java.lang.Number) r13
            long r5 = r13.longValue()
            r7 = 31536000000(0x757b12c00, double:1.55808542072E-313)
            app.chalo.usecase.MillisAfterTimeFormatType r9 = app.chalo.usecase.MillisAfterTimeFormatType.END_OF_DAY
            long r8 = r4.a(r5, r7, r9)
            app.chalo.home.ui.history.MyTicketsComponent r13 = r12.this$0
            app.chalo.premiumbus.prebookedtickets.domain.GetActivePremiumReserveTicketBetweenGivenTimeUseCase r5 = r13.q
            r13 = 0
            r12.L$0 = r13
            r12.J$0 = r10
            r12.label = r3
            r6 = r10
            r10 = 1
            kotlinx.coroutines.flow.Flow r13 = r5.a(r6, r8, r10)
            if (r13 != r0) goto L97
            goto La9
        L97:
            r3 = r6
        L98:
            kotlinx.coroutines.flow.Flow r13 = (kotlinx.coroutines.flow.Flow) r13
            app.chalo.home.ui.history.MyTicketsComponent$updatePremiumReserveTicketsList$1$1 r1 = new app.chalo.home.ui.history.MyTicketsComponent$updatePremiumReserveTicketsList$1$1
            app.chalo.home.ui.history.MyTicketsComponent r5 = r12.this$0
            r1.<init>(r5, r3)
            r12.label = r2
            java.lang.Object r13 = r13.collect(r1, r12)
            if (r13 != r0) goto Laa
        La9:
            return r0
        Laa:
            kotlin.Unit r13 = kotlin.Unit.f17538a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.ui.history.MyTicketsComponent$updatePremiumReserveTicketsList$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
