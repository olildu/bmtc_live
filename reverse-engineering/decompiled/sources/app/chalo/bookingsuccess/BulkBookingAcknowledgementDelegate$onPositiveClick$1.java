package app.chalo.bookingsuccess;

import app.chalo.bookingsuccess.data.BulkBookingAcknowledgementData;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.bookingsuccess.BulkBookingAcknowledgementDelegate$onPositiveClick$1", f = "BulkBookingAcknowledgementDelegate.kt", l = {}, m = "invokeSuspend", v = 1)
final class BulkBookingAcknowledgementDelegate$onPositiveClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CoroutineScope $coroutineScope;
    final /* synthetic */ BulkBookingAcknowledgementData $data;
    int label;
    final /* synthetic */ BulkBookingAcknowledgementDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BulkBookingAcknowledgementDelegate$onPositiveClick$1(BulkBookingAcknowledgementDelegate bulkBookingAcknowledgementDelegate, CoroutineScope coroutineScope, BulkBookingAcknowledgementData bulkBookingAcknowledgementData, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bulkBookingAcknowledgementDelegate;
        this.$coroutineScope = coroutineScope;
        this.$data = bulkBookingAcknowledgementData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BulkBookingAcknowledgementDelegate$onPositiveClick$1(this.this$0, this.$coroutineScope, this.$data, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        BulkBookingAcknowledgementDelegate$onPositiveClick$1 bulkBookingAcknowledgementDelegate$onPositiveClick$1 = (BulkBookingAcknowledgementDelegate$onPositiveClick$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f17538a;
        bulkBookingAcknowledgementDelegate$onPositiveClick$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        BulkBookingAcknowledgementDelegate bulkBookingAcknowledgementDelegate = this.this$0;
        CoroutineScope coroutineScope = this.$coroutineScope;
        BulkBookingAcknowledgementData.BookingFailed bookingFailed = (BulkBookingAcknowledgementData.BookingFailed) this.$data;
        MutableStateFlow mutableStateFlow = bulkBookingAcknowledgementDelegate.e;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.c(value, BookingSuccessDataState.a((BookingSuccessDataState) value, null, 7)));
        BuildersKt.d(coroutineScope, null, null, new BulkBookingAcknowledgementDelegate$handlePositiveBtnClickForBookingFailed$2(bulkBookingAcknowledgementDelegate, bookingFailed, null), 3);
        return Unit.f17538a;
    }
}
