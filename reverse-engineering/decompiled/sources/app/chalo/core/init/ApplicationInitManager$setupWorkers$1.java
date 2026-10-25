package app.chalo.core.init;

import androidx.media3.extractor.ts.TsExtractor;
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
@DebugMetadata(c = "app.chalo.core.init.ApplicationInitManager$setupWorkers$1", f = "ApplicationInitManager.kt", l = {137, TsExtractor.TS_STREAM_TYPE_E_AC3, TsExtractor.TS_STREAM_TYPE_DTS_UHD}, m = "invokeSuspend", v = 1)
final class ApplicationInitManager$setupWorkers$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $workerSource;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ApplicationInitManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApplicationInitManager$setupWorkers$1(ApplicationInitManager applicationInitManager, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = applicationInitManager;
        this.$workerSource = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ApplicationInitManager$setupWorkers$1(this.this$0, this.$workerSource, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ApplicationInitManager$setupWorkers$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0089, code lost:
    
        if (r11.d(r10) == r0) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r10.label
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L35
            if (r1 == r4) goto L25
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            kotlin.ResultKt.b(r11)
            goto L8c
        L15:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1d:
            java.lang.Object r1 = r10.L$0
            app.chalo.core.init.ApplicationInitManager r1 = (app.chalo.core.init.ApplicationInitManager) r1
            kotlin.ResultKt.b(r11)
            goto L79
        L25:
            java.lang.Object r1 = r10.L$2
            app.chalo.worker.ApplicationBackgroundWorkersManager r1 = (app.chalo.worker.ApplicationBackgroundWorkersManager) r1
            java.lang.Object r4 = r10.L$1
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r6 = r10.L$0
            app.chalo.core.init.ApplicationInitManager r6 = (app.chalo.core.init.ApplicationInitManager) r6
            kotlin.ResultKt.b(r11)
            goto L65
        L35:
            kotlin.ResultKt.b(r11)
            app.chalo.core.init.ApplicationInitManager r11 = r10.this$0
            kotlin.Lazy r11 = r11.o
            java.lang.Object r11 = r11.getValue()
            r1 = r11
            app.chalo.worker.ApplicationBackgroundWorkersManager r1 = (app.chalo.worker.ApplicationBackgroundWorkersManager) r1
            java.lang.String r11 = r10.$workerSource
            app.chalo.core.init.ApplicationInitManager r6 = r10.this$0
            r7 = 0
            r1.d(r11, r7)
            kotlin.Lazy r7 = r6.r
            java.lang.Object r7 = r7.getValue()
            app.chalo.security.sync.usecase.GetKeySyncRemoteConfigUseCase r7 = (app.chalo.security.sync.usecase.GetKeySyncRemoteConfigUseCase) r7
            r10.L$0 = r6
            r10.L$1 = r11
            r10.L$2 = r1
            r10.label = r4
            java.lang.Object r4 = r7.a(r10)
            if (r4 != r0) goto L62
            goto L8b
        L62:
            r9 = r4
            r4 = r11
            r11 = r9
        L65:
            app.chalo.security.sync.data.KeySyncRemoteConfig r11 = (app.chalo.security.sync.data.KeySyncRemoteConfig) r11
            long r7 = r11.b
            r10.L$0 = r6
            r10.L$1 = r5
            r10.L$2 = r5
            r10.label = r3
            java.lang.Object r11 = r1.e(r7, r4, r10)
            if (r11 != r0) goto L78
            goto L8b
        L78:
            r1 = r6
        L79:
            kotlin.Lazy r11 = r1.q
            java.lang.Object r11 = r11.getValue()
            app.chalo.features.wallet.WalletSyncHelper r11 = (app.chalo.features.wallet.WalletSyncHelper) r11
            r10.L$0 = r5
            r10.label = r2
            java.lang.Object r11 = r11.d(r10)
            if (r11 != r0) goto L8c
        L8b:
            return r0
        L8c:
            kotlin.Unit r11 = kotlin.Unit.f17538a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.core.init.ApplicationInitManager$setupWorkers$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
