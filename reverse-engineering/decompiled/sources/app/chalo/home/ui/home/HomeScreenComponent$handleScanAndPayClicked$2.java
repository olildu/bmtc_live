package app.chalo.home.ui.home;

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
@DebugMetadata(c = "app.chalo.home.ui.home.HomeScreenComponent$handleScanAndPayClicked$2", f = "HomeScreenComponent.kt", l = {567, 571, 572, 574}, m = "invokeSuspend", v = 1)
final class HomeScreenComponent$handleScanAndPayClicked$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ HomeScreenComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeScreenComponent$handleScanAndPayClicked$2(HomeScreenComponent homeScreenComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = homeScreenComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HomeScreenComponent$handleScanAndPayClicked$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((HomeScreenComponent$handleScanAndPayClicked$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0077 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:8:0x0015, B:15:0x0028, B:33:0x006e, B:35:0x0077, B:38:0x0084, B:18:0x0030, B:27:0x0057, B:21:0x0037, B:23:0x0041, B:30:0x0061), top: B:43:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0083  */
    /* JADX WARN: Code duplicated, block: B:38:0x0084 A[Catch: all -> 0x0019, TRY_LEAVE, TryCatch #0 {all -> 0x0019, blocks: (B:8:0x0015, B:15:0x0028, B:33:0x006e, B:35:0x0077, B:38:0x0084, B:18:0x0030, B:27:0x0057, B:21:0x0037, B:23:0x0041, B:30:0x0061), top: B:43:0x000b }] */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008e, code lost:
    
        if (app.chalo.home.ui.home.HomeScreenComponent.I0(r9, r1, r8) == r0) goto L40;
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
            r6 = 2
            r7 = 0
            if (r1 == 0) goto L34
            if (r1 == r5) goto L2c
            if (r1 == r6) goto L24
            if (r1 == r4) goto L15
            if (r1 != r3) goto L1c
        L15:
            kotlin.ResultKt.b(r9)     // Catch: java.lang.Throwable -> L19
            goto L5c
        L19:
            r9 = move-exception
            goto L91
        L1c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L24:
            java.lang.Object r1 = r8.L$0
            app.chalo.juspay.JuspayController r1 = (app.chalo.juspay.JuspayController) r1
            kotlin.ResultKt.b(r9)     // Catch: java.lang.Throwable -> L19
            goto L6e
        L2c:
            java.lang.Object r0 = r8.L$0
            app.chalo.providers.toast.KotlinToastManager r0 = (app.chalo.providers.toast.KotlinToastManager) r0
            kotlin.ResultKt.b(r9)     // Catch: java.lang.Throwable -> L19
            goto L57
        L34:
            kotlin.ResultKt.b(r9)
            app.chalo.home.ui.home.HomeScreenComponent r9 = r8.this$0     // Catch: java.lang.Throwable -> L19
            app.chalo.juspay.JuspayControllerProvider r9 = r9.T     // Catch: java.lang.Throwable -> L19
            app.chalo.juspay.JuspayController r1 = r9.d()     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto L61
            app.chalo.home.ui.home.HomeScreenComponent r9 = r8.this$0     // Catch: java.lang.Throwable -> L19
            app.chalo.providers.toast.KotlinToastManager r1 = r9.R     // Catch: java.lang.Throwable -> L19
            app.chalo.providers.stringprovider.StringProvider r9 = r9.m     // Catch: java.lang.Throwable -> L19
            app.chalo.providers.stringprovider.StringEnum r3 = app.chalo.providers.stringprovider.StringEnum.GENERIC_ERROR_MESSAGE     // Catch: java.lang.Throwable -> L19
            java.lang.Object[] r4 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L19
            r8.L$0 = r1     // Catch: java.lang.Throwable -> L19
            r8.label = r5     // Catch: java.lang.Throwable -> L19
            java.lang.Object r9 = r9.b(r3, r4, r8)     // Catch: java.lang.Throwable -> L19
            if (r9 != r0) goto L56
            goto L90
        L56:
            r0 = r1
        L57:
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Throwable -> L19
            app.chalo.providers.toast.KotlinToastManagerKt.b(r0, r9)     // Catch: java.lang.Throwable -> L19
        L5c:
            app.chalo.home.ui.home.HomeScreenComponent r9 = r8.this$0
            r9.b0 = r7
            return r2
        L61:
            app.chalo.home.ui.home.HomeScreenComponent r9 = r8.this$0     // Catch: java.lang.Throwable -> L19
            r8.L$0 = r1     // Catch: java.lang.Throwable -> L19
            r8.label = r6     // Catch: java.lang.Throwable -> L19
            java.lang.Object r9 = app.chalo.home.ui.home.HomeScreenComponent.F0(r9, r8)     // Catch: java.lang.Throwable -> L19
            if (r9 != r0) goto L6e
            goto L90
        L6e:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L19
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L19
            r5 = 0
            if (r9 == 0) goto L84
            app.chalo.home.ui.home.HomeScreenComponent r9 = r8.this$0     // Catch: java.lang.Throwable -> L19
            r8.L$0 = r5     // Catch: java.lang.Throwable -> L19
            r8.label = r4     // Catch: java.lang.Throwable -> L19
            java.lang.Object r9 = r9.Q0(r1, r8)     // Catch: java.lang.Throwable -> L19
            if (r9 != r0) goto L5c
            goto L90
        L84:
            app.chalo.home.ui.home.HomeScreenComponent r9 = r8.this$0     // Catch: java.lang.Throwable -> L19
            r8.L$0 = r5     // Catch: java.lang.Throwable -> L19
            r8.label = r3     // Catch: java.lang.Throwable -> L19
            java.lang.Object r9 = app.chalo.home.ui.home.HomeScreenComponent.I0(r9, r1, r8)     // Catch: java.lang.Throwable -> L19
            if (r9 != r0) goto L5c
        L90:
            return r0
        L91:
            app.chalo.home.ui.home.HomeScreenComponent r0 = r8.this$0
            r0.b0 = r7
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.ui.home.HomeScreenComponent$handleScanAndPayClicked$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
