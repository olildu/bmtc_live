package app.chalo.tripreceipt.tripreceiptnew;

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
@DebugMetadata(c = "app.chalo.tripreceipt.tripreceiptnew.RideReceiptComponent$handleInitializationIntent$2", f = "RideReceiptComponent.kt", l = {208, 208}, m = "invokeSuspend", v = 1)
final class RideReceiptComponent$handleInitializationIntent$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ RideReceiptIntent.InitializationIntent $intent;
    int label;
    final /* synthetic */ RideReceiptComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideReceiptComponent$handleInitializationIntent$2(RideReceiptComponent rideReceiptComponent, RideReceiptIntent.InitializationIntent initializationIntent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = rideReceiptComponent;
        this.$intent = initializationIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RideReceiptComponent$handleInitializationIntent$2(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RideReceiptComponent$handleInitializationIntent$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        if (((kotlinx.coroutines.flow.Flow) r6).collect(r1, r5) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r5.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            kotlin.ResultKt.b(r6)
            goto L44
        L10:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L18:
            kotlin.ResultKt.b(r6)
            goto L30
        L1c:
            kotlin.ResultKt.b(r6)
            app.chalo.tripreceipt.tripreceiptnew.RideReceiptComponent r6 = r5.this$0
            app.chalo.tripreceipt.domain.FetchSuperPassTripHistoryDataUseCase r6 = r6.o
            app.chalo.tripreceipt.tripreceiptnew.RideReceiptIntent$InitializationIntent r1 = r5.$intent
            java.lang.String r1 = r1.f9741a
            r5.label = r3
            java.lang.Object r6 = r6.a(r1, r5)
            if (r6 != r0) goto L30
            goto L43
        L30:
            kotlinx.coroutines.flow.Flow r6 = (kotlinx.coroutines.flow.Flow) r6
            app.chalo.tripreceipt.tripreceiptnew.RideReceiptComponent$handleInitializationIntent$2$1 r1 = new app.chalo.tripreceipt.tripreceiptnew.RideReceiptComponent$handleInitializationIntent$2$1
            app.chalo.tripreceipt.tripreceiptnew.RideReceiptComponent r3 = r5.this$0
            app.chalo.tripreceipt.tripreceiptnew.RideReceiptIntent$InitializationIntent r4 = r5.$intent
            r1.<init>()
            r5.label = r2
            java.lang.Object r6 = r6.collect(r1, r5)
            if (r6 != r0) goto L44
        L43:
            return r0
        L44:
            kotlin.Unit r6 = kotlin.Unit.f17538a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.tripreceipt.tripreceiptnew.RideReceiptComponent$handleInitializationIntent$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
