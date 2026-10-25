package app.chalo.instantticket.domain;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.instantticket.domain.UpdateInstantTicketEntryInTableOnTapOutUseCase", f = "UpdateInstantTicketEntryInTableOnTapOutUseCase.kt", l = {11, 11}, m = "invoke", v = 1)
final class UpdateInstantTicketEntryInTableOnTapOutUseCase$invoke$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UpdateInstantTicketEntryInTableOnTapOutUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateInstantTicketEntryInTableOnTapOutUseCase$invoke$1(UpdateInstantTicketEntryInTableOnTapOutUseCase updateInstantTicketEntryInTableOnTapOutUseCase, Continuation continuation) {
        super(continuation);
        this.this$0 = updateInstantTicketEntryInTableOnTapOutUseCase;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006a, code lost:
    
        if (r3.j(r6, r9, r0) == r2) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            r8.result = r9
            int r9 = r8.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = r9 | r0
            r8.label = r9
            app.chalo.instantticket.domain.UpdateInstantTicketEntryInTableOnTapOutUseCase r9 = r8.this$0
            r9.getClass()
            int r1 = r8.label
            r2 = r1 & r0
            if (r2 == 0) goto L19
            int r1 = r1 - r0
            r8.label = r1
            r0 = r8
            goto L1e
        L19:
            app.chalo.instantticket.domain.UpdateInstantTicketEntryInTableOnTapOutUseCase$invoke$1 r0 = new app.chalo.instantticket.domain.UpdateInstantTicketEntryInTableOnTapOutUseCase$invoke$1
            r0.<init>(r9, r8)
        L1e:
            java.lang.Object r1 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r3 = r0.label
            r4 = 0
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L45
            if (r3 == r6) goto L39
            if (r3 != r5) goto L31
            kotlin.ResultKt.b(r1)
            goto L6d
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L39:
            java.lang.Object r9 = r0.L$1
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r3 = r0.L$0
            app.chalo.instantticket.data.InstantTicketRepository r3 = (app.chalo.instantticket.data.InstantTicketRepository) r3
            kotlin.ResultKt.b(r1)
            goto L5a
        L45:
            kotlin.ResultKt.b(r1)
            app.chalo.instantticket.data.InstantTicketRepository r3 = r9.f3903a
            app.chalo.contract.BasicInfoContract r9 = r9.b
            r0.L$0 = r3
            r0.L$1 = r4
            r0.label = r6
            java.lang.Object r1 = r9.c(r0)
            if (r1 != r2) goto L59
            goto L6c
        L59:
            r9 = r4
        L5a:
            java.lang.Number r1 = (java.lang.Number) r1
            long r6 = r1.longValue()
            r0.L$0 = r4
            r0.L$1 = r4
            r0.label = r5
            java.lang.Object r9 = r3.j(r6, r9, r0)
            if (r9 != r2) goto L6d
        L6c:
            return r2
        L6d:
            kotlin.Unit r9 = kotlin.Unit.f17538a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.instantticket.domain.UpdateInstantTicketEntryInTableOnTapOutUseCase$invoke$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
