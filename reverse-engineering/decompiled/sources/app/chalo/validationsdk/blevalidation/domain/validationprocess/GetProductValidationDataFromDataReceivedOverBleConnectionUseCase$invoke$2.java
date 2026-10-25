package app.chalo.validationsdk.blevalidation.domain.validationprocess;

import androidx.constraintlayout.widget.ConstraintLayout;
import app.chalo.validationsdk.blevalidation.data.models.app.ProductValidationDataReceivedOverBle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lapp/chalo/validationsdk/blevalidation/data/models/app/ProductValidationDataReceivedOverBle;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.validationsdk.blevalidation.domain.validationprocess.GetProductValidationDataFromDataReceivedOverBleConnectionUseCase$invoke$2", f = "GetProductValidationDataFromDataReceivedOverBleConnectionUseCase.kt", l = {ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX, 66}, m = "invokeSuspend", v = 1)
final class GetProductValidationDataFromDataReceivedOverBleConnectionUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ProductValidationDataReceivedOverBle>, Object> {
    final /* synthetic */ String $dataString;
    int label;
    final /* synthetic */ GetProductValidationDataFromDataReceivedOverBleConnectionUseCase this$0;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10525a;

        static {
            int[] iArr = new int[BleValidationType.values().length];
            try {
                iArr[BleValidationType.REGULAR_BUS_TAP_IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BleValidationType.REGULAR_BUS_TAP_OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BleValidationType.PREMIUM_BUS_VALIDATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BleValidationType.REGULAR_BUS_CONDUCTOR_VALIDATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BleValidationType.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f10525a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetProductValidationDataFromDataReceivedOverBleConnectionUseCase$invoke$2(String str, GetProductValidationDataFromDataReceivedOverBleConnectionUseCase getProductValidationDataFromDataReceivedOverBleConnectionUseCase, Continuation continuation) {
        super(2, continuation);
        this.$dataString = str;
        this.this$0 = getProductValidationDataFromDataReceivedOverBleConnectionUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GetProductValidationDataFromDataReceivedOverBleConnectionUseCase$invoke$2(this.$dataString, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((GetProductValidationDataFromDataReceivedOverBleConnectionUseCase$invoke$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:39:0x0081  */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0165, code lost:
    
        if (r8 == r0) goto L68;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.validationsdk.blevalidation.domain.validationprocess.GetProductValidationDataFromDataReceivedOverBleConnectionUseCase$invoke$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
