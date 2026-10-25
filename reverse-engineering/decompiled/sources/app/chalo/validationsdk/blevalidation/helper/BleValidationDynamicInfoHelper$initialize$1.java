package app.chalo.validationsdk.blevalidation.helper;

import app.chalo.models.validation.ValidationProcessFlowDetails;
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
@DebugMetadata(c = "app.chalo.validationsdk.blevalidation.helper.BleValidationDynamicInfoHelper$initialize$1", f = "BleValidationDynamicInfoHelper.kt", l = {44, 45}, m = "invokeSuspend", v = 1)
final class BleValidationDynamicInfoHelper$initialize$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ProductValidationData $productValidationData;
    final /* synthetic */ ValidationProcessFlowDetails $validationProcessFlowDetails;
    final /* synthetic */ ValidationProduct $validationProduct;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BleValidationDynamicInfoHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BleValidationDynamicInfoHelper$initialize$1(BleValidationDynamicInfoHelper bleValidationDynamicInfoHelper, ProductValidationData productValidationData, ValidationProcessFlowDetails validationProcessFlowDetails, ValidationProduct validationProduct, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bleValidationDynamicInfoHelper;
        this.$productValidationData = productValidationData;
        this.$validationProcessFlowDetails = validationProcessFlowDetails;
        this.$validationProduct = validationProduct;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BleValidationDynamicInfoHelper$initialize$1 bleValidationDynamicInfoHelper$initialize$1 = new BleValidationDynamicInfoHelper$initialize$1(this.this$0, this.$productValidationData, this.$validationProcessFlowDetails, this.$validationProduct, continuation);
        bleValidationDynamicInfoHelper$initialize$1.L$0 = obj;
        return bleValidationDynamicInfoHelper$initialize$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((BleValidationDynamicInfoHelper$initialize$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0032  */
    /* JADX WARN: Code duplicated, block: B:17:0x0045  */
    /* JADX WARN: Code duplicated, block: B:21:0x0053  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        if (kotlinx.coroutines.DelayKt.b(1000, r7) == r0) goto L20;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0050 -> B:7:0x0013). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r7.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L25
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            java.lang.Object r1 = r7.L$0
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            kotlin.ResultKt.b(r8)
        L13:
            r8 = r1
            goto L2c
        L15:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1d:
            java.lang.Object r1 = r7.L$0
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            kotlin.ResultKt.b(r8)
            goto L46
        L25:
            kotlin.ResultKt.b(r8)
            java.lang.Object r8 = r7.L$0
            kotlinx.coroutines.CoroutineScope r8 = (kotlinx.coroutines.CoroutineScope) r8
        L2c:
            boolean r1 = kotlinx.coroutines.CoroutineScopeKt.e(r8)
            if (r1 == 0) goto L53
            app.chalo.validationsdk.blevalidation.helper.BleValidationDynamicInfoHelper r1 = r7.this$0
            app.chalo.validationsdk.blevalidation.data.models.ProductValidationData r4 = r7.$productValidationData
            app.chalo.models.validation.ValidationProcessFlowDetails r5 = r7.$validationProcessFlowDetails
            app.chalo.models.validation.ValidationProduct r6 = r7.$validationProduct
            r7.L$0 = r8
            r7.label = r3
            java.lang.Object r1 = app.chalo.validationsdk.blevalidation.helper.BleValidationDynamicInfoHelper.a(r1, r4, r5, r6, r7)
            if (r1 != r0) goto L45
            goto L52
        L45:
            r1 = r8
        L46:
            r7.L$0 = r1
            r7.label = r2
            r4 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r8 = kotlinx.coroutines.DelayKt.b(r4, r7)
            if (r8 != r0) goto L13
        L52:
            return r0
        L53:
            kotlin.Unit r8 = kotlin.Unit.f17538a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.validationsdk.blevalidation.helper.BleValidationDynamicInfoHelper$initialize$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
