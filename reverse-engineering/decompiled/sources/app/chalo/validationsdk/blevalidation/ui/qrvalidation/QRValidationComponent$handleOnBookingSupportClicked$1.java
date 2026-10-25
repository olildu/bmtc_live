package app.chalo.validationsdk.blevalidation.ui.qrvalidation;

import app.chalo.helper.BookingHelpConfigHelper;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.BookingCancellationTarget;
import app.chalo.scenes.args.BookingHelpArgs;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationData;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationComponent$handleOnBookingSupportClicked$1", f = "QRValidationComponent.kt", l = {558}, m = "invokeSuspend", v = 1)
final class QRValidationComponent$handleOnBookingSupportClicked$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ QRValidationComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QRValidationComponent$handleOnBookingSupportClicked$1(QRValidationComponent qRValidationComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = qRValidationComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        QRValidationComponent$handleOnBookingSupportClicked$1 qRValidationComponent$handleOnBookingSupportClicked$1 = new QRValidationComponent$handleOnBookingSupportClicked$1(this.this$0, continuation);
        qRValidationComponent$handleOnBookingSupportClicked$1.L$0 = obj;
        return qRValidationComponent$handleOnBookingSupportClicked$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((QRValidationComponent$handleOnBookingSupportClicked$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        QRValidationComponent qRValidationComponent;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        if (i == 0) {
            ResultKt.b(obj);
            ProductValidationData productValidationData = this.this$0.H;
            if (productValidationData != null) {
                String id = productValidationData.getId();
                List list = ((QRValidationDataState) this.this$0.f.getValue()).m;
                if (list == null) {
                    QRValidationComponent qRValidationComponent2 = this.this$0;
                    this.L$0 = qRValidationComponent2;
                    this.label = 1;
                    Object objB = qRValidationComponent2.s.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], this);
                    if (objB == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    qRValidationComponent = qRValidationComponent2;
                    obj = objB;
                } else {
                    QRValidationComponent qRValidationComponent3 = this.this$0;
                    BookingHelpConfigHelper bookingHelpConfigHelper = qRValidationComponent3.y;
                    ProductValidationData productValidationData2 = qRValidationComponent3.H;
                    String strA = productValidationData2 != null ? productValidationData2.a() : null;
                    if (strA == null) {
                        strA = "";
                    }
                    ProductValidationData productValidationData3 = this.this$0.H;
                    String strB = productValidationData3 != null ? productValidationData3.b() : null;
                    String str = strB != null ? strB : "";
                    bookingHelpConfigHelper.getClass();
                    BookingCancellationTarget bookingCancellationTargetB = BookingHelpConfigHelper.b(strA, str, id, false);
                    if (bookingCancellationTargetB != null) {
                        QRValidationComponent qRValidationComponent4 = this.this$0;
                        Job job = qRValidationComponent4.I;
                        if (job == null || !((AbstractCoroutine) job).isActive()) {
                            qRValidationComponent4.I = BuildersKt.d(qRValidationComponent4.j, null, null, new QRValidationComponent$listenForBookingCancellation$1(qRValidationComponent4, id, null), 3);
                        }
                        qRValidationComponent4.r.b(new ChaloNavigationRequest.Navigate(new BookingHelpArgs(list, bookingCancellationTargetB), null, null, 6));
                    }
                }
            }
            return unit;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        qRValidationComponent = (QRValidationComponent) this.L$0;
        ResultKt.b(obj);
        QRValidationComponent.X0(qRValidationComponent, (String) obj);
        return unit;
    }
}
