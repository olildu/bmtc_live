package app.chalo.sos;

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
@DebugMetadata(c = "app.chalo.sos.SosScreenComponent$handleAddContactsClickedIntent$1", f = "SosScreenComponent.kt", l = {271, 275, 285}, m = "invokeSuspend", v = 1)
final class SosScreenComponent$handleAddContactsClickedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ SosScreenComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SosScreenComponent$handleAddContactsClickedIntent$1(SosScreenComponent sosScreenComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = sosScreenComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SosScreenComponent$handleAddContactsClickedIntent$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SosScreenComponent$handleAddContactsClickedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0099, code lost:
    
        if (r9.e(r1, r8) == r0) goto L28;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r8.label
            r2 = 3
            r3 = 1
            r4 = 2
            if (r1 == 0) goto L2c
            if (r1 == r3) goto L28
            if (r1 == r4) goto L1c
            if (r1 != r2) goto L14
            kotlin.ResultKt.b(r9)
            goto La2
        L14:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1c:
            java.lang.Object r0 = r8.L$1
            app.chalo.providers.toast.KotlinToastManager r0 = (app.chalo.providers.toast.KotlinToastManager) r0
            java.lang.Object r1 = r8.L$0
            app.chalo.sos.feature.SosPickContactResult r1 = (app.chalo.sos.feature.SosPickContactResult) r1
            kotlin.ResultKt.b(r9)
            goto L64
        L28:
            kotlin.ResultKt.b(r9)
            goto L3c
        L2c:
            kotlin.ResultKt.b(r9)
            app.chalo.sos.SosScreenComponent r9 = r8.this$0
            app.chalo.sos.feature.SosContactsFeature r9 = r9.k
            r8.label = r3
            java.lang.Object r9 = r9.a(r8)
            if (r9 != r0) goto L3c
            goto L9b
        L3c:
            r1 = r9
            app.chalo.sos.feature.SosPickContactResult r1 = (app.chalo.sos.feature.SosPickContactResult) r1
            app.chalo.sos.feature.SosPickContactResult$Cancelled r9 = app.chalo.sos.feature.SosPickContactResult.Cancelled.f9441a
            boolean r9 = kotlin.jvm.internal.Intrinsics.d(r1, r9)
            if (r9 != 0) goto La2
            boolean r9 = r1 instanceof app.chalo.sos.feature.SosPickContactResult.Error
            if (r9 == 0) goto L87
            app.chalo.sos.SosScreenComponent r9 = r8.this$0
            app.chalo.providers.toast.KotlinToastManager r2 = r9.m
            app.chalo.providers.stringprovider.StringProvider r9 = r9.n
            app.chalo.providers.stringprovider.StringEnum r3 = app.chalo.providers.stringprovider.StringEnum.SOMETHING_WENT_WRONG
            r5 = 0
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r8.L$0 = r1
            r8.L$1 = r2
            r8.label = r4
            java.lang.Object r9 = r9.b(r3, r5, r8)
            if (r9 != r0) goto L63
            goto L9b
        L63:
            r0 = r2
        L64:
            java.lang.String r9 = (java.lang.String) r9
            app.chalo.providers.toast.KotlinToastManagerKt.b(r0, r9)
            app.chalo.sos.SosScreenComponent r9 = r8.this$0
            app.chalo.analytics.contract.AnalyticsContract r2 = r9.p
            app.chalo.constants.Source r4 = app.chalo.constants.Source.SOS_SCREEN
            app.chalo.sos.feature.SosPickContactResult$Error r1 = (app.chalo.sos.feature.SosPickContactResult.Error) r1
            java.lang.String r9 = r1.f9442a
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r0 = "error message"
            java.util.Map r5 = defpackage.vo1.s(r0, r9)
            r6 = 0
            r7 = 24
            java.lang.String r3 = "sos contact pick failed"
            app.chalo.analytics.AnalyticsContractImplKt.b(r2, r3, r4, r5, r6, r7)
            goto La2
        L87:
            boolean r9 = r1 instanceof app.chalo.sos.feature.SosPickContactResult.Success
            if (r9 == 0) goto L9c
            app.chalo.sos.SosScreenComponent r9 = r8.this$0
            app.chalo.sos.feature.SosContactsFeature r9 = r9.k
            app.chalo.sos.feature.SosPickContactResult$Success r1 = (app.chalo.sos.feature.SosPickContactResult.Success) r1
            app.chalo.sos.feature.SosContact r1 = r1.f9443a
            r8.label = r2
            java.lang.Object r9 = r9.e(r1, r8)
            if (r9 != r0) goto La2
        L9b:
            return r0
        L9c:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        La2:
            kotlin.Unit r9 = kotlin.Unit.f17538a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.sos.SosScreenComponent$handleAddContactsClickedIntent$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
