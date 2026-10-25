package app.chalo.validationsdk.blevalidation.ui.qrvalidation;

import defpackage.k4;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationComponent$handleOnTicketNumberClicked$1", f = "QRValidationComponent.kt", l = {1421}, m = "invokeSuspend", v = 1)
final class QRValidationComponent$handleOnTicketNumberClicked$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ QRValidationIntent.OnTicketNumberClicked $intent;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ QRValidationComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QRValidationComponent$handleOnTicketNumberClicked$1(QRValidationComponent qRValidationComponent, QRValidationIntent.OnTicketNumberClicked onTicketNumberClicked, Continuation continuation) {
        super(2, continuation);
        this.this$0 = qRValidationComponent;
        this.$intent = onTicketNumberClicked;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new QRValidationComponent$handleOnTicketNumberClicked$1(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((QRValidationComponent$handleOnTicketNumberClicked$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        QRValidationComponent qRValidationComponent;
        Mutex mutex;
        QRValidationIntent.OnTicketNumberClicked onTicketNumberClicked;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            QRValidationComponent qRValidationComponent2 = this.this$0;
            MutexImpl mutexImpl = qRValidationComponent2.M;
            QRValidationIntent.OnTicketNumberClicked onTicketNumberClicked2 = this.$intent;
            this.L$0 = mutexImpl;
            this.L$1 = onTicketNumberClicked2;
            this.L$2 = qRValidationComponent2;
            this.label = 1;
            if (mutexImpl.a(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            qRValidationComponent = qRValidationComponent2;
            mutex = mutexImpl;
            onTicketNumberClicked = onTicketNumberClicked2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            qRValidationComponent = (QRValidationComponent) this.L$2;
            onTicketNumberClicked = (QRValidationIntent.OnTicketNumberClicked) this.L$1;
            mutex = (Mutex) this.L$0;
            ResultKt.b(obj);
        }
        try {
            int i2 = onTicketNumberClicked.f10641a;
            String message = "ticket clicked index " + i2;
            Intrinsics.i(message, "message");
            QrCodeData qrCodeData = (QrCodeData) CollectionsKt.L(i2, ((QRValidationDataState) qRValidationComponent.f.getValue()).g);
            if (qrCodeData != null && !qrCodeData.c) {
                qRValidationComponent.E0(new k4(qRValidationComponent, i2, 7));
            }
            return Unit.f17538a;
        } finally {
            mutex.e(null);
        }
    }
}
