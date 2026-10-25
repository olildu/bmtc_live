package app.chalo.bookingsuccess;

import app.chalo.bookingsuccess.data.BulkBookingAcknowledgementData;
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
@DebugMetadata(c = "app.chalo.bookingsuccess.BulkBookingAcknowledgementDelegate$handlePositiveBtnClickForBookingFailed$2", f = "BulkBookingAcknowledgementDelegate.kt", l = {181, 222}, m = "invokeSuspend", v = 1)
final class BulkBookingAcknowledgementDelegate$handlePositiveBtnClickForBookingFailed$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ BulkBookingAcknowledgementData.BookingFailed $data;
    Object L$0;
    int label;
    final /* synthetic */ BulkBookingAcknowledgementDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BulkBookingAcknowledgementDelegate$handlePositiveBtnClickForBookingFailed$2(BulkBookingAcknowledgementDelegate bulkBookingAcknowledgementDelegate, BulkBookingAcknowledgementData.BookingFailed bookingFailed, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bulkBookingAcknowledgementDelegate;
        this.$data = bookingFailed;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BulkBookingAcknowledgementDelegate$handlePositiveBtnClickForBookingFailed$2(this.this$0, this.$data, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((BulkBookingAcknowledgementDelegate$handlePositiveBtnClickForBookingFailed$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x009e, code lost:
    
        if (app.chalo.bookingsuccess.BulkBookingAcknowledgementDelegate.f(r13, r1, r12) == r0) goto L24;
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
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L23
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.ResultKt.b(r13)
            r11 = r12
            goto La1
        L12:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1a:
            java.lang.Object r1 = r12.L$0
            app.chalo.bookingsuccess.BulkBookingAcknowledgementDelegate r1 = (app.chalo.bookingsuccess.BulkBookingAcknowledgementDelegate) r1
            kotlin.ResultKt.b(r13)
            r11 = r12
            goto L44
        L23:
            kotlin.ResultKt.b(r13)
            app.chalo.bookingsuccess.BulkBookingAcknowledgementDelegate r1 = r12.this$0
            app.chalo.productbooking.common.domain.BulkPreBookUseCase r4 = r1.d
            app.chalo.bookingsuccess.data.BulkBookingAcknowledgementData$BookingFailed r13 = r12.$data
            java.lang.String r5 = r13.b
            java.util.List r9 = r13.i
            java.util.List r8 = r13.h
            java.lang.String r6 = r13.f
            java.lang.String r7 = r13.g
            boolean r10 = r13.j
            r12.L$0 = r1
            r12.label = r3
            r11 = r12
            java.lang.Object r13 = r4.b(r5, r6, r7, r8, r9, r10, r11)
            if (r13 != r0) goto L44
            goto La0
        L44:
            app.chalo.utils.ChaloUseCaseResult r13 = (app.chalo.utils.ChaloUseCaseResult) r13
            boolean r3 = r13 instanceof app.chalo.utils.ChaloUseCaseResult.Failure
            if (r3 == 0) goto L7c
            app.chalo.utils.ChaloUseCaseResult$Failure r13 = (app.chalo.utils.ChaloUseCaseResult.Failure) r13
            java.lang.Object r13 = r13.f10418a
            app.chalo.mvibase.simple.UseCaseOperationError r13 = (app.chalo.mvibase.simple.UseCaseOperationError) r13
            int r3 = r13.b
            app.chalo.productbooking.common.domain.BulkPreBookRequestFailedReason r4 = app.chalo.productbooking.common.domain.BulkPreBookRequestFailedReason.OVERLAPPING_BOOKING_ERROR
            int r4 = r4.getErrorCode()
            if (r3 != r4) goto L6c
            app.chalo.bookingsuccess.data.BulkBookingAcknowledgementData$BookingFailed r3 = r11.$data
            java.lang.String r6 = r3.b
            app.chalo.models.SuperPassSubTypes r7 = r3.c
            java.lang.String r8 = r3.d
            int r9 = r3.e
            java.lang.String r5 = r13.c
            app.chalo.bookingsuccess.data.BulkBookingAcknowledgementData$OverlappingBookingFailure r4 = new app.chalo.bookingsuccess.data.BulkBookingAcknowledgementData$OverlappingBookingFailure
            r4.<init>(r5, r6, r7, r8, r9)
            goto L8f
        L6c:
            app.chalo.bookingsuccess.data.BulkBookingAcknowledgementData$BookingSuccess r4 = new app.chalo.bookingsuccess.data.BulkBookingAcknowledgementData$BookingSuccess
            app.chalo.bookingsuccess.data.BulkBookingAcknowledgementData$BookingFailed r13 = r11.$data
            java.lang.String r3 = r13.b
            app.chalo.models.SuperPassSubTypes r5 = r13.c
            java.lang.String r6 = r13.d
            int r13 = r13.e
            r4.<init>(r13, r5, r3, r6)
            goto L8f
        L7c:
            boolean r13 = r13 instanceof app.chalo.utils.ChaloUseCaseResult.Success
            if (r13 == 0) goto La4
            app.chalo.bookingsuccess.data.BulkBookingAcknowledgementData$BookingSuccess r4 = new app.chalo.bookingsuccess.data.BulkBookingAcknowledgementData$BookingSuccess
            app.chalo.bookingsuccess.data.BulkBookingAcknowledgementData$BookingFailed r13 = r11.$data
            java.lang.String r3 = r13.b
            app.chalo.models.SuperPassSubTypes r5 = r13.c
            java.lang.String r6 = r13.d
            int r13 = r13.e
            r4.<init>(r13, r5, r3, r6)
        L8f:
            r1.f = r4
            app.chalo.bookingsuccess.BulkBookingAcknowledgementDelegate r13 = r11.this$0
            app.chalo.bookingsuccess.data.BulkBookingAcknowledgementData r1 = r13.f
            r3 = 0
            r11.L$0 = r3
            r11.label = r2
            java.lang.Object r13 = app.chalo.bookingsuccess.BulkBookingAcknowledgementDelegate.f(r13, r1, r12)
            if (r13 != r0) goto La1
        La0:
            return r0
        La1:
            kotlin.Unit r13 = kotlin.Unit.f17538a
            return r13
        La4:
            kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
            r13.<init>()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.bookingsuccess.BulkBookingAcknowledgementDelegate$handlePositiveBtnClickForBookingFailed$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
