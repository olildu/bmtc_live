package app.chalo.security.sync.usecase;

import app.chalo.contract.BasicInfoContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.features.chaloconfig.ChaloConfigFeature;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/security/sync/usecase/GetKeySyncRemoteConfigUseCase;", "", "security_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetKeySyncRemoteConfigUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloConfigFeature f9395a;
    public final CrashlyticsLogger b;
    public final BasicInfoContract c;

    public GetKeySyncRemoteConfigUseCase(BasicInfoContract basicInfoContract, CrashlyticsLogger crashlyticsLogger, ChaloConfigFeature chaloConfigFeature) {
        this.f9395a = chaloConfigFeature;
        this.b = crashlyticsLogger;
        this.c = basicInfoContract;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        if (r6 == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        if (r6 == r1) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof app.chalo.security.sync.usecase.GetKeySyncRemoteConfigUseCase$invoke$1
            if (r0 == 0) goto L13
            r0 = r6
            app.chalo.security.sync.usecase.GetKeySyncRemoteConfigUseCase$invoke$1 r0 = (app.chalo.security.sync.usecase.GetKeySyncRemoteConfigUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.security.sync.usecase.GetKeySyncRemoteConfigUseCase$invoke$1 r0 = new app.chalo.security.sync.usecase.GetKeySyncRemoteConfigUseCase$invoke$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.b(r6)
            goto L5c
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            kotlin.ResultKt.b(r6)
            goto L4e
        L36:
            kotlin.ResultKt.b(r6)
            app.chalo.contract.BasicInfoContract r6 = r5.c
            boolean r6 = r6.f()
            app.chalo.features.chaloconfig.ChaloConfigFeature r2 = r5.f9395a
            if (r6 == 0) goto L51
            r0.label = r4
            java.lang.String r6 = "keySyncConfigDev"
            java.lang.Object r6 = r2.a(r6, r0)
            if (r6 != r1) goto L4e
            goto L5b
        L4e:
            java.lang.String r6 = (java.lang.String) r6
            goto L5e
        L51:
            r0.label = r3
            java.lang.String r6 = "keySyncConfigProd"
            java.lang.Object r6 = r2.a(r6, r0)
            if (r6 != r1) goto L5c
        L5b:
            return r1
        L5c:
            java.lang.String r6 = (java.lang.String) r6
        L5e:
            app.chalo.security.sync.data.KeySyncRemoteConfig r0 = new app.chalo.security.sync.data.KeySyncRemoteConfig
            r0.<init>()
            int r1 = r6.length()
            if (r1 != 0) goto L6a
            return r0
        L6a:
            kotlinx.serialization.json.Json r1 = app.chalo.network.config.ChaloJson.b     // Catch: java.lang.Exception -> L7e java.util.concurrent.CancellationException -> L80
            r1.getClass()     // Catch: java.lang.Exception -> L7e java.util.concurrent.CancellationException -> L80
            app.chalo.security.sync.data.KeySyncRemoteConfig$Companion r2 = app.chalo.security.sync.data.KeySyncRemoteConfig.INSTANCE     // Catch: java.lang.Exception -> L7e java.util.concurrent.CancellationException -> L80
            kotlinx.serialization.KSerializer r2 = r2.serializer()     // Catch: java.lang.Exception -> L7e java.util.concurrent.CancellationException -> L80
            kotlinx.serialization.DeserializationStrategy r2 = (kotlinx.serialization.DeserializationStrategy) r2     // Catch: java.lang.Exception -> L7e java.util.concurrent.CancellationException -> L80
            java.lang.Object r6 = r1.b(r6, r2)     // Catch: java.lang.Exception -> L7e java.util.concurrent.CancellationException -> L80
            app.chalo.security.sync.data.KeySyncRemoteConfig r6 = (app.chalo.security.sync.data.KeySyncRemoteConfig) r6     // Catch: java.lang.Exception -> L7e java.util.concurrent.CancellationException -> L80
            return r6
        L7e:
            r6 = move-exception
            goto L82
        L80:
            r6 = move-exception
            goto L88
        L82:
            app.chalo.crashlytics.CrashlyticsLogger r1 = r5.b
            r1.i(r6)
            return r0
        L88:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.security.sync.usecase.GetKeySyncRemoteConfigUseCase.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
