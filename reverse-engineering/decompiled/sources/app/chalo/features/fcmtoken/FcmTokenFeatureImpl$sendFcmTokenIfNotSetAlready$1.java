package app.chalo.features.fcmtoken;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.eac.EACTags;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.features.fcmtoken.FcmTokenFeatureImpl$sendFcmTokenIfNotSetAlready$1", f = "FcmTokenFeatureImpl.kt", l = {57, 71, EACTags.INTEGRATED_CIRCUIT_MANUFACTURER_ID}, m = "invokeSuspend", v = 1)
final class FcmTokenFeatureImpl$sendFcmTokenIfNotSetAlready$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $force;
    Object L$0;
    int label;
    final /* synthetic */ FcmTokenFeatureImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FcmTokenFeatureImpl$sendFcmTokenIfNotSetAlready$1(FcmTokenFeatureImpl fcmTokenFeatureImpl, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fcmTokenFeatureImpl;
        this.$force = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FcmTokenFeatureImpl$sendFcmTokenIfNotSetAlready$1(this.this$0, this.$force, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FcmTokenFeatureImpl$sendFcmTokenIfNotSetAlready$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00bb A[Catch: Exception -> 0x0016, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x0016, blocks: (B:7:0x0011, B:14:0x0025, B:34:0x00b3, B:37:0x00bb, B:46:0x00fb, B:48:0x0101, B:50:0x0105, B:52:0x010e, B:58:0x0128, B:43:0x00dc, B:28:0x0064, B:31:0x007a, B:40:0x00c7), top: B:63:0x0009, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00f8 A[PHI: r7
      0x00f8: PHI (r7v11 app.chalo.network.exception.NetworkSuccessResponseParseException) = 
      (r7v8 app.chalo.network.exception.NetworkSuccessResponseParseException)
      (r7v9 app.chalo.network.exception.NetworkSuccessResponseParseException)
     binds: [B:39:0x00c5, B:43:0x00dc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:46:0x00fb A[Catch: Exception -> 0x0016, TryCatch #1 {Exception -> 0x0016, blocks: (B:7:0x0011, B:14:0x0025, B:34:0x00b3, B:37:0x00bb, B:46:0x00fb, B:48:0x0101, B:50:0x0105, B:52:0x010e, B:58:0x0128, B:43:0x00dc, B:28:0x0064, B:31:0x007a, B:40:0x00c7), top: B:63:0x0009, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0123  */
    /* JADX WARN: Code duplicated, block: B:55:0x0124  */
    /* JADX WARN: Code duplicated, block: B:58:0x0128 A[Catch: Exception -> 0x0016, TRY_LEAVE, TryCatch #1 {Exception -> 0x0016, blocks: (B:7:0x0011, B:14:0x0025, B:34:0x00b3, B:37:0x00bb, B:46:0x00fb, B:48:0x0101, B:50:0x0105, B:52:0x010e, B:58:0x0128, B:43:0x00dc, B:28:0x0064, B:31:0x007a, B:40:0x00c7), top: B:63:0x0009, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x00c7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0056, code lost:
    
        if (r11 == r0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
    
        if (((java.lang.Boolean) r11).booleanValue() == false) goto L60;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.features.fcmtoken.FcmTokenFeatureImpl$sendFcmTokenIfNotSetAlready$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
