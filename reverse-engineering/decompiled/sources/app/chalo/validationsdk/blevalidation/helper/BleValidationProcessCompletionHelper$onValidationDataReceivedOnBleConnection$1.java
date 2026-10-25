package app.chalo.validationsdk.blevalidation.helper;

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
@DebugMetadata(c = "app.chalo.validationsdk.blevalidation.helper.BleValidationProcessCompletionHelper$onValidationDataReceivedOnBleConnection$1", f = "BleValidationProcessCompletionHelper.kt", l = {164, 168, 178}, m = "invokeSuspend", v = 1)
final class BleValidationProcessCompletionHelper$onValidationDataReceivedOnBleConnection$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ byte[] $data;
    int label;
    final /* synthetic */ BleValidationProcessCompletionHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BleValidationProcessCompletionHelper$onValidationDataReceivedOnBleConnection$1(byte[] bArr, BleValidationProcessCompletionHelper bleValidationProcessCompletionHelper, Continuation continuation) {
        super(2, continuation);
        this.$data = bArr;
        this.this$0 = bleValidationProcessCompletionHelper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BleValidationProcessCompletionHelper$onValidationDataReceivedOnBleConnection$1(this.$data, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((BleValidationProcessCompletionHelper$onValidationDataReceivedOnBleConnection$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
    
        if (app.chalo.validationsdk.blevalidation.helper.BleValidationProcessCompletionHelper.b(r3, r4, r7, (app.chalo.validationsdk.blevalidation.data.models.app.ProductValidationDataReceivedOverBle.ConductorValidationPunchData) r0, r48) == r6) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x012b, code lost:
    
        if (r3.g(r4, r7, r2, r4, r48) == r6) goto L47;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r49) {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.validationsdk.blevalidation.helper.BleValidationProcessCompletionHelper$onValidationDataReceivedOnBleConnection$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
