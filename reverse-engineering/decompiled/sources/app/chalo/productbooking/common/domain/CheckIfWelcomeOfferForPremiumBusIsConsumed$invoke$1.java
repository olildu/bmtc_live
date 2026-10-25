package app.chalo.productbooking.common.domain;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.productbooking.common.domain.CheckIfWelcomeOfferForPremiumBusIsConsumed", f = "CheckIfWelcomeOfferForPremiumBusIsConsumed.kt", l = {13, 15}, m = "invoke", v = 1)
final class CheckIfWelcomeOfferForPremiumBusIsConsumed$invoke$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CheckIfWelcomeOfferForPremiumBusIsConsumed this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckIfWelcomeOfferForPremiumBusIsConsumed$invoke$1(CheckIfWelcomeOfferForPremiumBusIsConsumed checkIfWelcomeOfferForPremiumBusIsConsumed, Continuation continuation) {
        super(continuation);
        this.this$0 = checkIfWelcomeOfferForPremiumBusIsConsumed;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0081  */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
    
        if (r1 == r2) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0073, code lost:
    
        if (r1 == r2) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0075, code lost:
    
        return r2;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0073 -> B:23:0x0076). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            r6.result = r7
            int r7 = r6.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r7 | r0
            r6.label = r7
            app.chalo.productbooking.common.domain.CheckIfWelcomeOfferForPremiumBusIsConsumed r7 = r6.this$0
            r7.getClass()
            int r1 = r6.label
            r2 = r1 & r0
            if (r2 == 0) goto L19
            int r1 = r1 - r0
            r6.label = r1
            r0 = r6
            goto L1e
        L19:
            app.chalo.productbooking.common.domain.CheckIfWelcomeOfferForPremiumBusIsConsumed$invoke$1 r0 = new app.chalo.productbooking.common.domain.CheckIfWelcomeOfferForPremiumBusIsConsumed$invoke$1
            r0.<init>(r7, r6)
        L1e:
            java.lang.Object r1 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r3 = r0.label
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L40
            if (r3 == r5) goto L3c
            if (r3 != r4) goto L34
            java.lang.Object r3 = r0.L$0
            java.util.Iterator r3 = (java.util.Iterator) r3
            kotlin.ResultKt.b(r1)
            goto L76
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L3c:
            kotlin.ResultKt.b(r1)
            goto L4e
        L40:
            kotlin.ResultKt.b(r1)
            app.chalo.features.onetimeoffer.GetOneTimeOfferConfigUseCase r1 = r7.f8252a
            r0.label = r5
            java.lang.Object r1 = r1.a(r0)
            if (r1 != r2) goto L4e
            goto L75
        L4e:
            app.chalo.features.onetimeoffer.models.OneTimeOfferConfigAppModel r1 = (app.chalo.features.onetimeoffer.models.OneTimeOfferConfigAppModel) r1
            java.util.List r1 = r1.f2738a
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
            r3 = r1
        L59:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L81
            java.lang.Object r1 = r3.next()
            java.lang.String r1 = (java.lang.String) r1
            app.chalo.features.onetimeoffer.IUserPreferencesDataStore r5 = r7.b
            kotlinx.coroutines.flow.Flow r1 = r5.a(r1)
            r0.L$0 = r3
            r0.label = r4
            java.lang.Object r1 = kotlinx.coroutines.flow.FlowKt.t(r1, r0)
            if (r1 != r2) goto L76
        L75:
            return r2
        L76:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L59
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            return r7
        L81:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.productbooking.common.domain.CheckIfWelcomeOfferForPremiumBusIsConsumed$invoke$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
