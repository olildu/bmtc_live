package app.chalo.livetracking.frameworklivetracking.domain;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.livetracking.frameworklivetracking.domain.GetRealTimeSocketFeatureRemoteConfigUseCase", f = "GetRealTimeSocketFeatureRemoteConfigUseCase.kt", l = {23, 27, 32}, m = "invoke", v = 1)
final class GetRealTimeSocketFeatureRemoteConfigUseCase$invoke$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GetRealTimeSocketFeatureRemoteConfigUseCase this$0;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
    
        if (r8 == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006d, code lost:
    
        if (r8 == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007b, code lost:
    
        if (r8 == r1) goto L31;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            r7.result = r8
            int r0 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 | r1
            r7.label = r0
            app.chalo.livetracking.frameworklivetracking.domain.GetRealTimeSocketFeatureRemoteConfigUseCase r2 = r7.this$0
            app.chalo.features.chaloconfig.ChaloConfigFeature r3 = r2.f4326a
            int r0 = r0 - r1
            r7.label = r0
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            r4 = 3
            r5 = 2
            r6 = 1
            if (r0 == 0) goto L31
            if (r0 == r6) goto L2d
            if (r0 == r5) goto L29
            if (r0 != r4) goto L21
            kotlin.ResultKt.b(r8)
            goto L70
        L21:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L29:
            kotlin.ResultKt.b(r8)
            goto L7e
        L2d:
            kotlin.ResultKt.b(r8)
            goto L47
        L31:
            kotlin.ResultKt.b(r8)
            app.chalo.contract.BasicInfoContract r8 = r2.d
            boolean r8 = r8.f()
            if (r8 == 0) goto L4a
            r7.label = r6
            java.lang.String r8 = "newRtsFeatureRemoteConfigDev"
            java.lang.Object r8 = r3.a(r8, r7)
            if (r8 != r1) goto L47
            goto L7d
        L47:
            java.lang.String r8 = (java.lang.String) r8
            goto L80
        L4a:
            app.chalo.buildconfig.ChaloBuildConfig r8 = r2.c
            app.chalo.buildconfig.ProductFlavor r8 = r8.getB()
            int[] r0 = app.chalo.livetracking.frameworklivetracking.domain.GetRealTimeSocketFeatureRemoteConfigUseCase.WhenMappings.f4327a
            int r8 = r8.ordinal()
            r8 = r0[r8]
            if (r8 == r6) goto L73
            if (r8 == r5) goto L65
            if (r8 != r4) goto L5f
            goto L65
        L5f:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        L65:
            r7.label = r4
            java.lang.String r8 = "newRtsFeatureRemoteConfigBeta"
            java.lang.Object r8 = r3.a(r8, r7)
            if (r8 != r1) goto L70
            goto L7d
        L70:
            java.lang.String r8 = (java.lang.String) r8
            goto L80
        L73:
            r7.label = r5
            java.lang.String r8 = "newRtsFeatureRemoteConfigProd"
            java.lang.Object r8 = r3.a(r8, r7)
            if (r8 != r1) goto L7e
        L7d:
            return r1
        L7e:
            java.lang.String r8 = (java.lang.String) r8
        L80:
            app.chalo.livetracking.frameworklivetracking.domain.RealTimeSocketFeatureRemoteConfig r0 = new app.chalo.livetracking.frameworklivetracking.domain.RealTimeSocketFeatureRemoteConfig
            r0.<init>()
            int r1 = r8.length()
            if (r1 != 0) goto L8c
            return r0
        L8c:
            kotlinx.serialization.json.Json r1 = app.chalo.network.config.ChaloJson.b     // Catch: java.lang.Exception -> La0
            r1.getClass()     // Catch: java.lang.Exception -> La0
            app.chalo.livetracking.frameworklivetracking.domain.RealTimeSocketFeatureRemoteConfig$Companion r3 = app.chalo.livetracking.frameworklivetracking.domain.RealTimeSocketFeatureRemoteConfig.INSTANCE     // Catch: java.lang.Exception -> La0
            kotlinx.serialization.KSerializer r3 = r3.serializer()     // Catch: java.lang.Exception -> La0
            kotlinx.serialization.DeserializationStrategy r3 = (kotlinx.serialization.DeserializationStrategy) r3     // Catch: java.lang.Exception -> La0
            java.lang.Object r8 = r1.b(r8, r3)     // Catch: java.lang.Exception -> La0
            app.chalo.livetracking.frameworklivetracking.domain.RealTimeSocketFeatureRemoteConfig r8 = (app.chalo.livetracking.frameworklivetracking.domain.RealTimeSocketFeatureRemoteConfig) r8     // Catch: java.lang.Exception -> La0
            return r8
        La0:
            r8 = move-exception
            app.chalo.crashlytics.CrashlyticsLogger r1 = r2.b
            r1.i(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.frameworklivetracking.domain.GetRealTimeSocketFeatureRemoteConfigUseCase$invoke$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
