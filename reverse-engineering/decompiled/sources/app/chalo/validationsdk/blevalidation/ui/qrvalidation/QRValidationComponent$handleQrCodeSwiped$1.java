package app.chalo.validationsdk.blevalidation.ui.qrvalidation;

import defpackage.lu0;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationComponent$handleQrCodeSwiped$1", f = "QRValidationComponent.kt", l = {1421}, m = "invokeSuspend", v = 1)
final class QRValidationComponent$handleQrCodeSwiped$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ QRValidationIntent.OnQrSwiped $intent;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ QRValidationComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QRValidationComponent$handleQrCodeSwiped$1(QRValidationComponent qRValidationComponent, QRValidationIntent.OnQrSwiped onQrSwiped, Continuation continuation) {
        super(2, continuation);
        this.this$0 = qRValidationComponent;
        this.$intent = onQrSwiped;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new QRValidationComponent$handleQrCodeSwiped$1(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((QRValidationComponent$handleQrCodeSwiped$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        QRValidationComponent qRValidationComponent;
        Mutex mutex;
        QRValidationIntent.OnQrSwiped onQrSwiped;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            qRValidationComponent = this.this$0;
            MutexImpl mutexImpl = qRValidationComponent.M;
            QRValidationIntent.OnQrSwiped onQrSwiped2 = this.$intent;
            this.L$0 = mutexImpl;
            this.L$1 = qRValidationComponent;
            this.L$2 = onQrSwiped2;
            this.label = 1;
            if (mutexImpl.a(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            mutex = mutexImpl;
            onQrSwiped = onQrSwiped2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            onQrSwiped = (QRValidationIntent.OnQrSwiped) this.L$2;
            qRValidationComponent = (QRValidationComponent) this.L$1;
            mutex = (Mutex) this.L$0;
            ResultKt.b(obj);
        }
        try {
            qRValidationComponent.E0(new lu0(21, qRValidationComponent, onQrSwiped));
            return Unit.f17538a;
        } finally {
            mutex.e(null);
        }
    }
}
