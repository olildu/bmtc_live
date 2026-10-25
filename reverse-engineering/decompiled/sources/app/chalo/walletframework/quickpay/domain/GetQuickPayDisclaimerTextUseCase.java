package app.chalo.walletframework.quickpay.domain;

import app.chalo.contract.BasicInfoContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.features.chaloconfig.ChaloConfigFeature;
import app.chalo.providers.cityprovider.CityProvider;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/walletframework/quickpay/domain/GetQuickPayDisclaimerTextUseCase;", "", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetQuickPayDisclaimerTextUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CityProvider f10942a;
    public final ChaloConfigFeature b;
    public final CrashlyticsLogger c;
    public final BasicInfoContract d;

    public GetQuickPayDisclaimerTextUseCase(BasicInfoContract basicInfoContract, CrashlyticsLogger crashlyticsLogger, ChaloConfigFeature chaloConfigFeature, CityProvider cityProvider) {
        this.f10942a = cityProvider;
        this.b = chaloConfigFeature;
        this.c = crashlyticsLogger;
        this.d = basicInfoContract;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
    
        if (r7 == r2) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
    
        if (r7 == r2) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r6 = this;
            app.chalo.crashlytics.CrashlyticsLogger r0 = r6.c
            boolean r1 = r7 instanceof app.chalo.walletframework.quickpay.domain.GetQuickPayDisclaimerTextUseCase$invoke$1
            if (r1 == 0) goto L15
            r1 = r7
            app.chalo.walletframework.quickpay.domain.GetQuickPayDisclaimerTextUseCase$invoke$1 r1 = (app.chalo.walletframework.quickpay.domain.GetQuickPayDisclaimerTextUseCase$invoke$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.label = r2
            goto L1a
        L15:
            app.chalo.walletframework.quickpay.domain.GetQuickPayDisclaimerTextUseCase$invoke$1 r1 = new app.chalo.walletframework.quickpay.domain.GetQuickPayDisclaimerTextUseCase$invoke$1
            r1.<init>(r6, r7)
        L1a:
            java.lang.Object r7 = r1.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r3 = r1.label
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L38
            if (r3 == r5) goto L34
            if (r3 != r4) goto L2c
            kotlin.ResultKt.b(r7)
            goto L5e
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            kotlin.ResultKt.b(r7)
            goto L50
        L38:
            kotlin.ResultKt.b(r7)
            app.chalo.contract.BasicInfoContract r7 = r6.d
            boolean r7 = r7.f()
            app.chalo.features.chaloconfig.ChaloConfigFeature r3 = r6.b
            if (r7 == 0) goto L53
            r1.label = r5
            java.lang.String r7 = "cityWiseQuickPayInfoDev"
            java.lang.Object r7 = r3.a(r7, r1)
            if (r7 != r2) goto L50
            goto L5d
        L50:
            java.lang.String r7 = (java.lang.String) r7
            goto L60
        L53:
            r1.label = r4
            java.lang.String r7 = "cityWiseQuickPayInfoProd"
            java.lang.Object r7 = r3.a(r7, r1)
            if (r7 != r2) goto L5e
        L5d:
            return r2
        L5e:
            java.lang.String r7 = (java.lang.String) r7
        L60:
            app.chalo.providers.cityprovider.CityProvider r1 = r6.f10942a
            java.lang.String r1 = app.chalo.providers.cityprovider.CityProviderKt.b(r1)
            r2 = 0
            if (r1 != 0) goto L6a
            goto Lbf
        L6a:
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r3)
            java.lang.String r3 = "toLowerCase(...)"
            kotlin.jvm.internal.Intrinsics.h(r1, r3)
            if (r7 == 0) goto Lbf
            kotlinx.serialization.json.Json r3 = app.chalo.network.config.ChaloJson.b     // Catch: java.lang.Exception -> Laa io.ktor.serialization.JsonConvertException -> Lac
            kotlinx.serialization.json.JsonElement r7 = r3.f(r7)     // Catch: java.lang.Exception -> Laa io.ktor.serialization.JsonConvertException -> Lac
            kotlinx.serialization.json.JsonObject r7 = kotlinx.serialization.json.JsonElementKt.g(r7)     // Catch: java.lang.Exception -> Laa io.ktor.serialization.JsonConvertException -> Lac
            java.lang.Object r7 = r7.get(r1)     // Catch: java.lang.Exception -> Laa io.ktor.serialization.JsonConvertException -> Lac
            kotlinx.serialization.json.JsonElement r7 = (kotlinx.serialization.json.JsonElement) r7     // Catch: java.lang.Exception -> Laa io.ktor.serialization.JsonConvertException -> Lac
            if (r7 == 0) goto Lbf
            kotlinx.serialization.json.JsonObject r7 = kotlinx.serialization.json.JsonElementKt.g(r7)     // Catch: java.lang.Exception -> Laa io.ktor.serialization.JsonConvertException -> Lac
            java.lang.String r1 = "disclaimerText"
            java.lang.Object r7 = r7.get(r1)     // Catch: java.lang.Exception -> Laa io.ktor.serialization.JsonConvertException -> Lac
            kotlinx.serialization.json.JsonElement r7 = (kotlinx.serialization.json.JsonElement) r7     // Catch: java.lang.Exception -> Laa io.ktor.serialization.JsonConvertException -> Lac
            if (r7 == 0) goto Lbf
            kotlinx.serialization.json.JsonPrimitive r7 = kotlinx.serialization.json.JsonElementKt.h(r7)     // Catch: java.lang.Exception -> Laa io.ktor.serialization.JsonConvertException -> Lac
            boolean r1 = r7 instanceof kotlinx.serialization.json.JsonNull     // Catch: java.lang.Exception -> Laa io.ktor.serialization.JsonConvertException -> Lac
            if (r1 == 0) goto La2
            r7 = r2
            goto La6
        La2:
            java.lang.String r7 = r7.getC()     // Catch: java.lang.Exception -> Laa io.ktor.serialization.JsonConvertException -> Lac
        La6:
            if (r7 != 0) goto La9
            goto Lbf
        La9:
            return r7
        Laa:
            r7 = move-exception
            goto Lae
        Lac:
            r7 = move-exception
            goto Lb7
        Lae:
            java.lang.Throwable r1 = new java.lang.Throwable
            r1.<init>(r7)
            r0.i(r1)
            goto Lbf
        Lb7:
            java.lang.Throwable r1 = new java.lang.Throwable
            r1.<init>(r7)
            r0.i(r1)
        Lbf:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.walletframework.quickpay.domain.GetQuickPayDisclaimerTextUseCase.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
