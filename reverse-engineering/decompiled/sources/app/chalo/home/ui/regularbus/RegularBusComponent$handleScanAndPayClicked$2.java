package app.chalo.home.ui.regularbus;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.ui.regularbus.RegularBusComponent$handleScanAndPayClicked$2", f = "RegularBusComponent.kt", l = {560, 564, 565, 567}, m = "invokeSuspend", v = 1)
final class RegularBusComponent$handleScanAndPayClicked$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ RegularBusComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegularBusComponent$handleScanAndPayClicked$2(RegularBusComponent regularBusComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = regularBusComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RegularBusComponent$handleScanAndPayClicked$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RegularBusComponent$handleScanAndPayClicked$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0084 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:8:0x0015, B:15:0x0028, B:33:0x007b, B:35:0x0084, B:38:0x0091, B:18:0x0030, B:27:0x0064, B:21:0x0037, B:23:0x0041, B:30:0x006e), top: B:43:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0090  */
    /* JADX WARN: Code duplicated, block: B:38:0x0091 A[Catch: all -> 0x0019, TRY_LEAVE, TryCatch #0 {all -> 0x0019, blocks: (B:8:0x0015, B:15:0x0028, B:33:0x007b, B:35:0x0084, B:38:0x0091, B:18:0x0030, B:27:0x0064, B:21:0x0037, B:23:0x0041, B:30:0x006e), top: B:43:0x000b }] */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009b, code lost:
    
        if (app.chalo.home.ui.regularbus.RegularBusComponent.M0(r9, r1, r8) == r0) goto L40;
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
            kotlin.Unit r2 = kotlin.Unit.f17538a
            r3 = 4
            r4 = 3
            r5 = 1
            r6 = 0
            r7 = 2
            if (r1 == 0) goto L34
            if (r1 == r5) goto L2c
            if (r1 == r7) goto L24
            if (r1 == r4) goto L15
            if (r1 != r3) goto L1c
        L15:
            kotlin.ResultKt.b(r9)     // Catch: java.lang.Throwable -> L19
            goto L69
        L19:
            r9 = move-exception
            goto L9e
        L1c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L24:
            java.lang.Object r1 = r8.L$0
            app.chalo.juspay.JuspayController r1 = (app.chalo.juspay.JuspayController) r1
            kotlin.ResultKt.b(r9)     // Catch: java.lang.Throwable -> L19
            goto L7b
        L2c:
            java.lang.Object r0 = r8.L$0
            app.chalo.providers.toast.KotlinToastManager r0 = (app.chalo.providers.toast.KotlinToastManager) r0
            kotlin.ResultKt.b(r9)     // Catch: java.lang.Throwable -> L19
            goto L64
        L34:
            kotlin.ResultKt.b(r9)
            app.chalo.home.ui.regularbus.RegularBusComponent r9 = r8.this$0     // Catch: java.lang.Throwable -> L19
            app.chalo.juspay.JuspayControllerProvider r9 = r9.Z     // Catch: java.lang.Throwable -> L19
            app.chalo.juspay.JuspayController r1 = r9.d()     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto L6e
            app.chalo.home.ui.regularbus.RegularBusComponent r9 = r8.this$0     // Catch: java.lang.Throwable -> L19
            java.lang.String r1 = "controller_unavailable"
            g11 r3 = new g11     // Catch: java.lang.Throwable -> L19
            r4 = 2
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L19
            r9.b1(r1, r3)     // Catch: java.lang.Throwable -> L19
            app.chalo.home.ui.regularbus.RegularBusComponent r9 = r8.this$0     // Catch: java.lang.Throwable -> L19
            app.chalo.providers.toast.KotlinToastManager r1 = r9.O     // Catch: java.lang.Throwable -> L19
            app.chalo.providers.stringprovider.StringProvider r9 = r9.o     // Catch: java.lang.Throwable -> L19
            app.chalo.providers.stringprovider.StringEnum r3 = app.chalo.providers.stringprovider.StringEnum.GENERIC_ERROR_MESSAGE     // Catch: java.lang.Throwable -> L19
            java.lang.Object[] r4 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L19
            r8.L$0 = r1     // Catch: java.lang.Throwable -> L19
            r8.label = r5     // Catch: java.lang.Throwable -> L19
            java.lang.Object r9 = r9.b(r3, r4, r8)     // Catch: java.lang.Throwable -> L19
            if (r9 != r0) goto L63
            goto L9d
        L63:
            r0 = r1
        L64:
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Throwable -> L19
            app.chalo.providers.toast.KotlinToastManagerKt.b(r0, r9)     // Catch: java.lang.Throwable -> L19
        L69:
            app.chalo.home.ui.regularbus.RegularBusComponent r9 = r8.this$0
            r9.j0 = r6
            return r2
        L6e:
            app.chalo.home.ui.regularbus.RegularBusComponent r9 = r8.this$0     // Catch: java.lang.Throwable -> L19
            r8.L$0 = r1     // Catch: java.lang.Throwable -> L19
            r8.label = r7     // Catch: java.lang.Throwable -> L19
            java.lang.Object r9 = app.chalo.home.ui.regularbus.RegularBusComponent.F0(r9, r8)     // Catch: java.lang.Throwable -> L19
            if (r9 != r0) goto L7b
            goto L9d
        L7b:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L19
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L19
            r7 = 0
            if (r9 == 0) goto L91
            app.chalo.home.ui.regularbus.RegularBusComponent r9 = r8.this$0     // Catch: java.lang.Throwable -> L19
            r8.L$0 = r7     // Catch: java.lang.Throwable -> L19
            r8.label = r4     // Catch: java.lang.Throwable -> L19
            java.lang.Object r9 = r9.X0(r1, r5, r8)     // Catch: java.lang.Throwable -> L19
            if (r9 != r0) goto L69
            goto L9d
        L91:
            app.chalo.home.ui.regularbus.RegularBusComponent r9 = r8.this$0     // Catch: java.lang.Throwable -> L19
            r8.L$0 = r7     // Catch: java.lang.Throwable -> L19
            r8.label = r3     // Catch: java.lang.Throwable -> L19
            java.lang.Object r9 = app.chalo.home.ui.regularbus.RegularBusComponent.M0(r9, r1, r8)     // Catch: java.lang.Throwable -> L19
            if (r9 != r0) goto L69
        L9d:
            return r0
        L9e:
            app.chalo.home.ui.regularbus.RegularBusComponent r0 = r8.this$0
            r0.j0 = r6
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.ui.regularbus.RegularBusComponent$handleScanAndPayClicked$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
