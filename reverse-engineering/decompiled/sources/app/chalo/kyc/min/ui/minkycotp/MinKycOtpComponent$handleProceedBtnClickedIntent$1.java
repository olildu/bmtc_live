package app.chalo.kyc.min.ui.minkycotp;

import kotlin.Metadata;
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
@DebugMetadata(c = "app.chalo.kyc.min.ui.minkycotp.MinKycOtpComponent$handleProceedBtnClickedIntent$1", f = "MinKycOtpComponent.kt", l = {94, 96}, m = "invokeSuspend", v = 1)
final class MinKycOtpComponent$handleProceedBtnClickedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ MinKycOtpComponent this$0;

    /* JADX INFO: renamed from: app.chalo.kyc.min.ui.minkycotp.MinKycOtpComponent$handleProceedBtnClickedIntent$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.kyc.min.ui.minkycotp.MinKycOtpComponent$handleProceedBtnClickedIntent$1$1", f = "MinKycOtpComponent.kt", l = {91}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ MinKycOtpComponent this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MinKycOtpComponent minKycOtpComponent, Continuation continuation) {
            super(2, continuation);
            this.this$0 = minKycOtpComponent;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                MinKycOtpComponent minKycOtpComponent = this.this$0;
                this.label = 1;
                if (MinKycOtpComponent.G0(minKycOtpComponent, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            return Unit.f17538a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MinKycOtpComponent$handleProceedBtnClickedIntent$1(MinKycOtpComponent minKycOtpComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = minKycOtpComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MinKycOtpComponent$handleProceedBtnClickedIntent$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MinKycOtpComponent$handleProceedBtnClickedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0076  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a9, code lost:
    
        if (r13.J0(app.chalo.kyc.min.ui.minkycotp.KycErrorPositiveCtaType.GENERAL_ERROR, r12) == r0) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r12.label
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L12
            kotlin.ResultKt.b(r13)
            goto Lac
        L12:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1a:
            kotlin.ResultKt.b(r13)
            goto L64
        L1e:
            kotlin.ResultKt.b(r13)
            app.chalo.kyc.min.ui.minkycotp.MinKycOtpComponent r13 = r12.this$0
            kotlinx.coroutines.flow.StateFlow r13 = r13.f
            java.lang.Object r13 = r13.getValue()
            app.chalo.kyc.min.ui.minkycotp.MinKycOtpDataState r13 = (app.chalo.kyc.min.ui.minkycotp.MinKycOtpDataState) r13
            java.lang.String r13 = r13.l
            if (r13 == 0) goto L53
            app.chalo.kyc.min.ui.minkycotp.MinKycOtpComponent r13 = r12.this$0
            kotlinx.coroutines.flow.StateFlow r13 = r13.f
            java.lang.Object r13 = r13.getValue()
            app.chalo.kyc.min.ui.minkycotp.MinKycOtpDataState r13 = (app.chalo.kyc.min.ui.minkycotp.MinKycOtpDataState) r13
            java.lang.String r13 = r13.k
            if (r13 == 0) goto L53
            app.chalo.kyc.min.ui.minkycotp.MinKycOtpComponent r13 = r12.this$0
            kotlinx.coroutines.internal.ContextScope r0 = r13.j
            app.chalo.providers.CoroutineContextProvider r13 = r13.s
            kotlinx.coroutines.scheduling.DefaultIoScheduler r13 = r13.b()
            app.chalo.kyc.min.ui.minkycotp.MinKycOtpComponent$handleProceedBtnClickedIntent$1$1 r1 = new app.chalo.kyc.min.ui.minkycotp.MinKycOtpComponent$handleProceedBtnClickedIntent$1$1
            app.chalo.kyc.min.ui.minkycotp.MinKycOtpComponent r2 = r12.this$0
            r4 = 0
            r1.<init>(r2, r4)
            kotlinx.coroutines.BuildersKt.d(r0, r13, r4, r1, r3)
            goto Lac
        L53:
            app.chalo.kyc.min.ui.minkycotp.MinKycOtpComponent r13 = r12.this$0
            app.chalo.providers.stringprovider.StringProvider r13 = r13.k
            app.chalo.providers.stringprovider.StringEnum r1 = app.chalo.providers.stringprovider.StringEnum.SOMETHING_WENT_WRONG
            java.lang.Object[] r5 = new java.lang.Object[r2]
            r12.label = r4
            java.lang.Object r13 = r13.b(r1, r5, r12)
            if (r13 != r0) goto L64
            goto Lab
        L64:
            java.lang.String r13 = (java.lang.String) r13
            app.chalo.kyc.min.ui.minkycotp.MinKycOtpComponent r1 = r12.this$0
            app.chalo.analytics.contract.AnalyticsContract r5 = r1.p
            java.lang.Class<app.chalo.kyc.min.ui.minkycotp.MinKycOtpComponent> r1 = app.chalo.kyc.min.ui.minkycotp.MinKycOtpComponent.class
            kotlin.jvm.internal.ClassReference r1 = kotlin.jvm.internal.Reflection.a(r1)
            java.lang.String r1 = r1.f()
            if (r1 != 0) goto L78
            java.lang.String r1 = "MinKycOtpViewModel"
        L78:
            r7 = r1
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r6 = "reason"
            r1.<init>(r6, r13)
            java.lang.String r13 = java.lang.String.valueOf(r2)
            kotlin.Pair r6 = new kotlin.Pair
            java.lang.String r8 = "isInvalidOtpEntered"
            r6.<init>(r8, r13)
            kotlin.Pair[] r13 = new kotlin.Pair[r3]
            r13[r2] = r1
            r13[r4] = r6
            java.util.Map r8 = kotlin.collections.MapsKt.i(r13)
            r10 = 0
            r11 = 24
            java.lang.String r6 = "min kyc activation failed"
            r9 = 0
            app.chalo.analytics.contract.AnalyticsContract.DefaultImpls.a(r5, r6, r7, r8, r9, r10, r11)
            app.chalo.kyc.min.ui.minkycotp.MinKycOtpComponent r13 = r12.this$0
            r12.label = r3
            app.chalo.kyc.min.ui.minkycotp.KycErrorPositiveCtaType r1 = app.chalo.kyc.min.ui.minkycotp.KycErrorPositiveCtaType.GENERAL_ERROR
            java.lang.Object r13 = r13.J0(r1, r12)
            if (r13 != r0) goto Lac
        Lab:
            return r0
        Lac:
            kotlin.Unit r13 = kotlin.Unit.f17538a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.kyc.min.ui.minkycotp.MinKycOtpComponent$handleProceedBtnClickedIntent$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
