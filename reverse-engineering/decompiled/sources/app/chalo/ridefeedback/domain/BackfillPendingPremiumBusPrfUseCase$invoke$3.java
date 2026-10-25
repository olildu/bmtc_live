package app.chalo.ridefeedback.domain;

import app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel;
import app.chalo.premiumbus.data.models.app.PremiumReserveTripAppModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u001e\u0010\u0002\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "", "Lapp/chalo/premiumbus/data/models/app/PremiumReserveTicketAppModel;", "Lapp/chalo/premiumbus/data/models/app/PremiumReserveTripAppModel;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.ridefeedback.domain.BackfillPendingPremiumBusPrfUseCase$invoke$3", f = "BackfillPendingPremiumBusPrfUseCase.kt", l = {43, 44, 53}, m = "invokeSuspend", v = 1)
final class BackfillPendingPremiumBusPrfUseCase$invoke$3 extends SuspendLambda implements Function2<Pair<? extends List<? extends PremiumReserveTicketAppModel>, ? extends List<? extends PremiumReserveTripAppModel>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $userId;
    /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ BackfillPendingPremiumBusPrfUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackfillPendingPremiumBusPrfUseCase$invoke$3(BackfillPendingPremiumBusPrfUseCase backfillPendingPremiumBusPrfUseCase, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = backfillPendingPremiumBusPrfUseCase;
        this.$userId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BackfillPendingPremiumBusPrfUseCase$invoke$3 backfillPendingPremiumBusPrfUseCase$invoke$3 = new BackfillPendingPremiumBusPrfUseCase$invoke$3(this.this$0, this.$userId, continuation);
        backfillPendingPremiumBusPrfUseCase$invoke$3.L$0 = obj;
        return backfillPendingPremiumBusPrfUseCase$invoke$3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((BackfillPendingPremiumBusPrfUseCase$invoke$3) create((Pair) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003c A[PHI: r1 r5 r13
      0x003c: PHI (r1v5 java.util.List) = (r1v7 java.util.List), (r1v9 java.util.List) binds: [B:15:0x0062, B:11:0x0031] A[DONT_GENERATE, DONT_INLINE]
      0x003c: PHI (r5v2 java.util.List) = (r5v5 java.util.List), (r5v7 java.util.List) binds: [B:15:0x0062, B:11:0x0031] A[DONT_GENERATE, DONT_INLINE]
      0x003c: PHI (r13v9 java.lang.Object) = (r13v14 java.lang.Object), (r13v0 java.lang.Object) binds: [B:15:0x0062, B:11:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x0054 A[PHI: r1 r5
      0x0054: PHI (r1v7 java.util.List) = (r1v3 java.util.List), (r1v4 java.util.List), (r1v13 java.util.List) binds: [B:13:0x003f, B:26:0x0095, B:7:0x000f] A[DONT_GENERATE, DONT_INLINE]
      0x0054: PHI (r5v5 java.util.List) = (r5v0 java.util.List), (r5v1 java.util.List), (r5v11 java.util.List) binds: [B:13:0x003f, B:26:0x0095, B:7:0x000f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:16:0x0064  */
    /* JADX WARN: Code duplicated, block: B:20:0x007e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0084  */
    /* JADX WARN: Code duplicated, block: B:25:0x0087  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0095 -> B:14:0x0054). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r12.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L3f
            if (r1 == r4) goto L31
            if (r1 == r3) goto L24
            if (r1 != r2) goto L1c
            java.lang.Object r1 = r12.L$1
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r5 = r12.L$0
            java.util.List r5 = (java.util.List) r5
            kotlin.ResultKt.b(r13)
            r11 = r12
            goto L54
        L1c:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L24:
            java.lang.Object r1 = r12.L$1
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r5 = r12.L$0
            java.util.List r5 = (java.util.List) r5
            kotlin.ResultKt.b(r13)
            r11 = r12
            goto L80
        L31:
            java.lang.Object r1 = r12.L$1
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r5 = r12.L$0
            java.util.List r5 = (java.util.List) r5
            kotlin.ResultKt.b(r13)
        L3c:
            r7 = r1
            r6 = r5
            goto L66
        L3f:
            kotlin.ResultKt.b(r13)
            java.lang.Object r13 = r12.L$0
            kotlin.Pair r13 = (kotlin.Pair) r13
            java.lang.Object r1 = r13.getFirst()
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r13 = r13.getSecond()
            java.util.List r13 = (java.util.List) r13
            r5 = r1
            r1 = r13
        L54:
            app.chalo.ridefeedback.domain.BackfillPendingPremiumBusPrfUseCase r13 = r12.this$0
            app.chalo.contract.BasicInfoContract r13 = r13.d
            r12.L$0 = r5
            r12.L$1 = r1
            r12.label = r4
            java.lang.Object r13 = r13.c(r12)
            if (r13 != r0) goto L3c
            r11 = r12
            goto L97
        L66:
            java.lang.Number r13 = (java.lang.Number) r13
            long r9 = r13.longValue()
            app.chalo.ridefeedback.domain.BackfillPendingPremiumBusPrfUseCase r5 = r12.this$0
            java.lang.String r8 = r12.$userId
            r12.L$0 = r6
            r12.L$1 = r7
            r12.label = r3
            r11 = r12
            java.lang.Object r13 = app.chalo.ridefeedback.domain.BackfillPendingPremiumBusPrfUseCase.a(r5, r6, r7, r8, r9, r11)
            if (r13 != r0) goto L7e
            goto L97
        L7e:
            r5 = r6
            r1 = r7
        L80:
            java.lang.Long r13 = (java.lang.Long) r13
            if (r13 != 0) goto L87
            kotlin.Unit r13 = kotlin.Unit.f17538a
            return r13
        L87:
            long r6 = r13.longValue()
            r11.L$0 = r5
            r11.L$1 = r1
            r11.label = r2
            java.lang.Object r13 = kotlinx.coroutines.DelayKt.b(r6, r12)
            if (r13 != r0) goto L54
        L97:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.ridefeedback.domain.BackfillPendingPremiumBusPrfUseCase$invoke$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
