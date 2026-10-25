package app.chalo.superpass.data.features;

import app.chalo.superpass.data.models.entities.SuperPass;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.eac.EACTags;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.superpass.data.features.DigitalTripReceiptFeature$sendSuperPassActivationTimeStampToBackend$1", f = "DigitalTripReceiptFeature.kt", l = {EACTags.APPLICATION_IMAGE, 70}, m = "invokeSuspend", v = 1)
final class DigitalTripReceiptFeature$sendSuperPassActivationTimeStampToBackend$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SuperPass $lSuperPass;
    final /* synthetic */ long $lTimeStamp;
    int label;
    final /* synthetic */ DigitalTripReceiptFeature this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DigitalTripReceiptFeature$sendSuperPassActivationTimeStampToBackend$1(DigitalTripReceiptFeature digitalTripReceiptFeature, SuperPass superPass, long j, Continuation continuation) {
        super(2, continuation);
        this.this$0 = digitalTripReceiptFeature;
        this.$lSuperPass = superPass;
        this.$lTimeStamp = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DigitalTripReceiptFeature$sendSuperPassActivationTimeStampToBackend$1(this.this$0, this.$lSuperPass, this.$lTimeStamp, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((DigitalTripReceiptFeature$sendSuperPassActivationTimeStampToBackend$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0061, code lost:
    
        if (r14.d(r3, r13) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r13.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            kotlin.ResultKt.b(r14)
            goto L64
        L10:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L18:
            kotlin.ResultKt.b(r14)
            goto L2c
        L1c:
            kotlin.ResultKt.b(r14)
            app.chalo.superpass.data.features.DigitalTripReceiptFeature r14 = r13.this$0
            app.chalo.superpass.data.models.entities.SuperPass r1 = r13.$lSuperPass
            r13.label = r3
            java.lang.Object r14 = app.chalo.superpass.data.features.DigitalTripReceiptFeature.d(r14, r1, r13)
            if (r14 != r0) goto L2c
            goto L63
        L2c:
            app.chalo.superpass.data.features.DigitalTripReceiptFeature r14 = r13.this$0
            app.chalo.superpass.data.models.entities.SuperPass r1 = r13.$lSuperPass
            long r4 = r13.$lTimeStamp
            r14.getClass()
            app.chalo.superpass.data.models.entities.SuperPassProperties r14 = r1.f9560a
            app.chalo.superpass.data.models.entities.ProductActivationDetails r3 = new app.chalo.superpass.data.models.entities.ProductActivationDetails
            java.lang.String r6 = r14.f9566a
            app.chalo.superpass.data.models.entities.SuperPassValidationProperties r7 = r1.getB()
            long r7 = r7.c
            app.chalo.superpass.data.models.entities.SuperPassProperties r1 = r1.f9560a
            java.lang.String r9 = r1.b
            app.chalo.superpass.data.models.entities.SuperPassSubType$Companion r10 = app.chalo.superpass.data.models.entities.SuperPassSubType.INSTANCE
            app.chalo.superpass.data.models.entities.SuperPassSubType r1 = r1.c
            r10.getClass()
            java.lang.String r10 = app.chalo.superpass.data.models.entities.SuperPassSubType.Companion.b(r1)
            java.lang.String r11 = r14.d
            java.lang.String r12 = r14.e
            r3.<init>(r4, r6, r7, r9, r10, r11, r12)
            app.chalo.superpass.data.features.DigitalTripReceiptFeature r14 = r13.this$0
            app.chalo.superpass.data.repository.DigitalTripReceiptRepository r14 = r14.b
            r13.label = r2
            java.lang.Object r14 = r14.d(r3, r13)
            if (r14 != r0) goto L64
        L63:
            return r0
        L64:
            app.chalo.superpass.data.features.DigitalTripReceiptFeature r14 = r13.this$0
            r14.a()
            kotlin.Unit r14 = kotlin.Unit.f17538a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.superpass.data.features.DigitalTripReceiptFeature$sendSuperPassActivationTimeStampToBackend$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
