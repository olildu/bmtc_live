package app.chalo.validationsdk.blevalidation.ui.qrvalidation;

import app.chalo.constants.Source;
import app.chalo.validationsdk.legacy.ProductKt;
import defpackage.kz0;
import java.util.Iterator;
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

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationComponent$handleQRClickedIntent$1", f = "QRValidationComponent.kt", l = {1421}, m = "invokeSuspend", v = 1)
final class QRValidationComponent$handleQRClickedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ QRValidationComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QRValidationComponent$handleQRClickedIntent$1(QRValidationComponent qRValidationComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = qRValidationComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new QRValidationComponent$handleQRClickedIntent$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((QRValidationComponent$handleQRClickedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Mutex mutex;
        QRValidationComponent qRValidationComponent;
        Object next;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        boolean z = true;
        if (i == 0) {
            ResultKt.b(obj);
            QRValidationComponent qRValidationComponent2 = this.this$0;
            mutex = qRValidationComponent2.M;
            this.L$0 = mutex;
            this.L$1 = qRValidationComponent2;
            this.label = 1;
            if (mutex.a(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            qRValidationComponent = qRValidationComponent2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            qRValidationComponent = (QRValidationComponent) this.L$1;
            mutex = (Mutex) this.L$0;
            ResultKt.b(obj);
        }
        try {
            QRValidationDataState qRValidationDataState = (QRValidationDataState) qRValidationComponent.f.getValue();
            Iterator it = qRValidationDataState.g.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((QrCodeData) next).c);
            QrCodeData qrCodeData = (QrCodeData) next;
            String str = qrCodeData != null ? qrCodeData.f10654a : null;
            if (str == null || str.equals("CHALO_EXPIRED_QR_PLACEHOLDER") || qRValidationDataState.b) {
                z = false;
            } else {
                qRValidationComponent.E0(new kz0(11));
            }
            if (z) {
                QRValidationComponent qRValidationComponent3 = this.this$0;
                qRValidationComponent3.P0().f(ProductKt.a(qRValidationComponent3.W0()), Source.QR_VALIDATION_FRAGMENT.getSourceName());
            }
            return Unit.f17538a;
        } finally {
            mutex.e(null);
        }
    }
}
