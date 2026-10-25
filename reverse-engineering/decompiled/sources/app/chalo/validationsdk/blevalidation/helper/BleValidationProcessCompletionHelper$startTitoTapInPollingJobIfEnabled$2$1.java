package app.chalo.validationsdk.blevalidation.helper;

import app.chalo.models.validation.ValidationProduct;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationData;
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
@DebugMetadata(c = "app.chalo.validationsdk.blevalidation.helper.BleValidationProcessCompletionHelper$startTitoTapInPollingJobIfEnabled$2$1", f = "BleValidationProcessCompletionHelper.kt", l = {269, 280, 284, 292, 303, 311}, m = "invokeSuspend", v = 1)
final class BleValidationProcessCompletionHelper$startTitoTapInPollingJobIfEnabled$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ProductValidationData $productValidationData;
    final /* synthetic */ long $titoTapInPollingDelay;
    final /* synthetic */ ValidationProduct $validationProduct;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ BleValidationProcessCompletionHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BleValidationProcessCompletionHelper$startTitoTapInPollingJobIfEnabled$2$1(ProductValidationData productValidationData, long j, ValidationProduct validationProduct, BleValidationProcessCompletionHelper bleValidationProcessCompletionHelper, Continuation continuation) {
        super(2, continuation);
        this.$productValidationData = productValidationData;
        this.$titoTapInPollingDelay = j;
        this.$validationProduct = validationProduct;
        this.this$0 = bleValidationProcessCompletionHelper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BleValidationProcessCompletionHelper$startTitoTapInPollingJobIfEnabled$2$1 bleValidationProcessCompletionHelper$startTitoTapInPollingJobIfEnabled$2$1 = new BleValidationProcessCompletionHelper$startTitoTapInPollingJobIfEnabled$2$1(this.$productValidationData, this.$titoTapInPollingDelay, this.$validationProduct, this.this$0, continuation);
        bleValidationProcessCompletionHelper$startTitoTapInPollingJobIfEnabled$2$1.L$0 = obj;
        return bleValidationProcessCompletionHelper$startTitoTapInPollingJobIfEnabled$2$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((BleValidationProcessCompletionHelper$startTitoTapInPollingJobIfEnabled$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0099 A[PHI: r0 r2 r3 r4 r5 r6 r7
      0x0099: PHI (r0v17 long) = (r0v10 long), (r0v27 long) binds: [B:9:0x007c, B:28:0x0139] A[DONT_GENERATE, DONT_INLINE]
      0x0099: PHI (r2v12 java.lang.Long) = (r2v6 java.lang.Long), (r2v16 java.lang.Long) binds: [B:9:0x007c, B:28:0x0139] A[DONT_GENERATE, DONT_INLINE]
      0x0099: PHI (r3v13 java.lang.String) = (r3v7 java.lang.String), (r3v17 java.lang.String) binds: [B:9:0x007c, B:28:0x0139] A[DONT_GENERATE, DONT_INLINE]
      0x0099: PHI (r4v16 java.lang.String) = (r4v9 java.lang.String), (r4v18 java.lang.String) binds: [B:9:0x007c, B:28:0x0139] A[DONT_GENERATE, DONT_INLINE]
      0x0099: PHI (r5v8 java.lang.String) = (r5v3 java.lang.String), (r5v9 java.lang.String) binds: [B:9:0x007c, B:28:0x0139] A[DONT_GENERATE, DONT_INLINE]
      0x0099: PHI (r6v14 java.lang.String) = (r6v7 java.lang.String), (r6v18 java.lang.String) binds: [B:9:0x007c, B:28:0x0139] A[DONT_GENERATE, DONT_INLINE]
      0x0099: PHI (r7v14 kotlinx.coroutines.CoroutineScope) = (r7v7 kotlinx.coroutines.CoroutineScope), (r7v18 kotlinx.coroutines.CoroutineScope) binds: [B:9:0x007c, B:28:0x0139] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x0122  */
    /* JADX WARN: Code duplicated, block: B:32:0x0143  */
    /* JADX WARN: Code duplicated, block: B:35:0x0160  */
    /* JADX WARN: Code duplicated, block: B:40:0x018a  */
    /* JADX WARN: Code duplicated, block: B:42:0x018e  */
    /* JADX WARN: Code duplicated, block: B:64:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:68:0x01f4  */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00e4, code lost:
    
        if (r4 == r9) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x017f, code lost:
    
        if (app.chalo.validationsdk.blevalidation.helper.BleValidationProcessCompletionHelper.c(r11, (app.chalo.utils.ChaloUseCaseResult) r0, r15) == r9) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0183, code lost:
    
        r13 = r4;
        r4 = r1;
        r0 = r13;
        r5 = r6;
        r6 = r7;
        r7 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01f1, code lost:
    
        if (app.chalo.validationsdk.blevalidation.helper.BleValidationProcessCompletionHelper.d(r11, (app.chalo.utils.ChaloUseCaseResult) r0, r15) == r9) goto L67;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x017f -> B:39:0x0183). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x01d2 -> B:65:0x01d8). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instruction units count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.validationsdk.blevalidation.helper.BleValidationProcessCompletionHelper$startTitoTapInPollingJobIfEnabled$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
