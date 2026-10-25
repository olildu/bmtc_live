package app.chalo.validationsdk.vehiclebasedvalidation.ui;

import app.chalo.constants.Source;
import app.chalo.contract.NavigationContract;
import app.chalo.contract.ProductTypeForReceipt;
import app.chalo.contract.ProductsSyncContract;
import app.chalo.models.ondc.OndcTicketReceiptAppModel;
import app.chalo.scenes.args.SceneArgs;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.validationsdk.vehiclebasedvalidation.domain.FetchOndcReceiptFailureReason;
import app.chalo.validationsdk.vehiclebasedvalidation.domain.ValidateONDCTicketAndFetchReceiptUseCase;
import defpackage.eu0;
import defpackage.kz0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.validationsdk.vehiclebasedvalidation.ui.QRScannerValidationComponent$validateTicketAndFetchReceipt$2", f = "QRScannerValidationComponent.kt", l = {99, 118}, m = "invokeSuspend", v = 1)
final class QRScannerValidationComponent$validateTicketAndFetchReceipt$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $bookingId;
    final /* synthetic */ String $vehicleNumber;
    Object L$0;
    int label;
    final /* synthetic */ QRScannerValidationComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QRScannerValidationComponent$validateTicketAndFetchReceipt$2(QRScannerValidationComponent qRScannerValidationComponent, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = qRScannerValidationComponent;
        this.$bookingId = str;
        this.$vehicleNumber = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new QRScannerValidationComponent$validateTicketAndFetchReceipt$2(this.this$0, this.$bookingId, this.$vehicleNumber, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((QRScannerValidationComponent$validateTicketAndFetchReceipt$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x009a  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ChaloUseCaseResult chaloUseCaseResult;
        String str;
        SceneArgs sceneArgsA;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            ValidateONDCTicketAndFetchReceiptUseCase validateONDCTicketAndFetchReceiptUseCase = this.this$0.m;
            String str2 = this.$bookingId;
            String str3 = this.$vehicleNumber;
            this.label = 1;
            obj = validateONDCTicketAndFetchReceiptUseCase.a(str2, str3, this);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            ResultKt.b(obj);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            chaloUseCaseResult = (ChaloUseCaseResult) this.L$0;
            ResultKt.b(obj);
        }
        this.this$0.E0(new kz0(1));
        sceneArgsA = NavigationContract.DefaultImpls.a(this.this$0.q, Source.ONDC_QR_SCANNER_FRAGMENT.getSourceName(), ((OndcTicketReceiptAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a).f5630a, null, ProductTypeForReceipt.ONDC_TICKET, 52);
        if (sceneArgsA != null) {
            this.this$0.q.c(sceneArgsA);
        }
        return Unit.f17538a;
        ChaloUseCaseResult chaloUseCaseResult2 = (ChaloUseCaseResult) obj;
        if (!(chaloUseCaseResult2 instanceof ChaloUseCaseResult.Failure)) {
            if (!(chaloUseCaseResult2 instanceof ChaloUseCaseResult.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            ProductsSyncContract productsSyncContract = this.this$0.n;
            this.L$0 = chaloUseCaseResult2;
            this.label = 2;
            if (productsSyncContract.b(this) != coroutineSingletons) {
                chaloUseCaseResult = chaloUseCaseResult2;
                this.this$0.E0(new kz0(1));
                sceneArgsA = NavigationContract.DefaultImpls.a(this.this$0.q, Source.ONDC_QR_SCANNER_FRAGMENT.getSourceName(), ((OndcTicketReceiptAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a).f5630a, null, ProductTypeForReceipt.ONDC_TICKET, 52);
                if (sceneArgsA != null) {
                    this.this$0.q.c(sceneArgsA);
                }
            }
            return coroutineSingletons;
        }
        Object obj2 = ((ChaloUseCaseResult.Failure) chaloUseCaseResult2).f10418a;
        String str4 = null;
        if ((obj2 instanceof FetchOndcReceiptFailureReason.ServerError) && (str = ((FetchOndcReceiptFailureReason.ServerError) obj2).f10716a) != null && str.length() != 0) {
            str4 = str;
        }
        this.this$0.E0(new eu0(str4, 16));
        return Unit.f17538a;
    }
}
