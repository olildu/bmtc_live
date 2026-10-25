package app.chalo.validationsdk.blevalidation.domain.qrvalidation;

import androidx.compose.runtime.ComposerImplKt;
import app.chalo.models.validation.ValidationProduct;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationData;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import org.bouncycastle.asn1.eac.EACTags;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lapp/chalo/validationsdk/blevalidation/domain/qrvalidation/QRValidationLifecycleResult;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.validationsdk.blevalidation.domain.qrvalidation.QRValidationLifecycleDelegateImpl$initialise$1", f = "QRValidationLifecycleDelegate.kt", l = {63, 64, EACTags.APPLICATION_IMAGE, 87, 95, 100, 103, 105, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD, 122, 118, ComposerImplKt.nodeKey}, m = "invokeSuspend", v = 1)
final class QRValidationLifecycleDelegateImpl$initialise$1 extends SuspendLambda implements Function2<FlowCollector<? super QRValidationLifecycleResult>, Continuation<? super Unit>, Object> {
    final /* synthetic */ ProductValidationData $productData;
    final /* synthetic */ ValidationProduct $validationProduct;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    boolean Z$0;
    int label;
    final /* synthetic */ QRValidationLifecycleDelegateImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QRValidationLifecycleDelegateImpl$initialise$1(QRValidationLifecycleDelegateImpl qRValidationLifecycleDelegateImpl, ProductValidationData productValidationData, ValidationProduct validationProduct, Continuation continuation) {
        super(2, continuation);
        this.this$0 = qRValidationLifecycleDelegateImpl;
        this.$productData = productValidationData;
        this.$validationProduct = validationProduct;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        QRValidationLifecycleDelegateImpl$initialise$1 qRValidationLifecycleDelegateImpl$initialise$1 = new QRValidationLifecycleDelegateImpl$initialise$1(this.this$0, this.$productData, this.$validationProduct, continuation);
        qRValidationLifecycleDelegateImpl$initialise$1.L$0 = obj;
        return qRValidationLifecycleDelegateImpl$initialise$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((QRValidationLifecycleDelegateImpl$initialise$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:52:0x01b1 A[PHI: r0 r1
      0x01b1: PHI (r0v33 kotlin.jvm.internal.Ref$ObjectRef) = (r0v20 kotlin.jvm.internal.Ref$ObjectRef), (r0v34 kotlin.jvm.internal.Ref$ObjectRef) binds: [B:10:0x0068, B:50:0x01ad] A[DONT_GENERATE, DONT_INLINE]
      0x01b1: PHI (r1v21 ??) = (r1v30 ??), (r1v31 ??) binds: [B:10:0x0068, B:50:0x01ad] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x01c9 A[PHI: r0 r1 r2
      0x01c9: PHI (r0v32 kotlin.jvm.internal.Ref$ObjectRef) = (r0v22 kotlin.jvm.internal.Ref$ObjectRef), (r0v33 kotlin.jvm.internal.Ref$ObjectRef) binds: [B:9:0x0059, B:53:0x01c5] A[DONT_GENERATE, DONT_INLINE]
      0x01c9: PHI (r1v20 ??) = (r1v32 ??), (r1v33 ??) binds: [B:9:0x0059, B:53:0x01c5] A[DONT_GENERATE, DONT_INLINE]
      0x01c9: PHI (r2v29 java.lang.Object) = (r2v21 java.lang.Object), (r2v33 java.lang.Object) binds: [B:9:0x0059, B:53:0x01c5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:63:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:65:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:68:0x020c  */
    /* JADX WARN: Code duplicated, block: B:72:0x022f  */
    /* JADX WARN: Code duplicated, block: B:75:0x0234  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:57:0x01cd, B:60:0x01df], limit reached: 75 */
    /* JADX WARN: Type inference failed for: r0v36, types: [T, app.chalo.validationsdk.blevalidation.domain.qrvalidation.QRValidationLifecycleResult, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v5, types: [T, app.chalo.validationsdk.blevalidation.domain.qrvalidation.QRValidationLifecycleResult] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, kotlinx.coroutines.flow.FlowCollector] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, kotlinx.coroutines.flow.FlowCollector] */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r2v30, types: [T, app.chalo.validationsdk.blevalidation.domain.qrvalidation.QRValidationLifecycleResult, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x01eb -> B:47:0x0196). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x022f -> B:73:0x0230). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.validationsdk.blevalidation.domain.qrvalidation.QRValidationLifecycleDelegateImpl$initialise$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
