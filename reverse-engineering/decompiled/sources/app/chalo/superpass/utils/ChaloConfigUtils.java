package app.chalo.superpass.utils;

import androidx.media3.extractor.text.ttml.TtmlNode;
import app.chalo.contract.BasicInfoContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.extensions.JsonElementExtensionsKt;
import app.chalo.features.chaloconfig.ChaloConfigFeature;
import app.chalo.network.config.ChaloJson;
import app.chalo.providers.cityprovider.CityProvider;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.context.GlobalContext;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/superpass/utils/ChaloConfigUtils;", "Lorg/koin/core/component/KoinComponent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChaloConfigUtils implements KoinComponent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ChaloConfigUtils f9611a;
    public static final Object b;
    public static final Object c;
    public static final Object d;
    public static final Object e;

    static {
        final ChaloConfigUtils chaloConfigUtils = new ChaloConfigUtils();
        f9611a = chaloConfigUtils;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        b = LazyKt.a(lazyThreadSafetyMode, new Function0<BasicInfoContract>() { // from class: app.chalo.superpass.utils.ChaloConfigUtils$special$$inlined$inject$default$1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object obj = this.f9612a;
                return (obj instanceof KoinScopeComponent ? ((KoinScopeComponent) obj).i0() : GlobalContext.f18817a.a().c.d).d(Reflection.a(BasicInfoContract.class), null, null);
            }
        });
        c = LazyKt.a(lazyThreadSafetyMode, new Function0<ChaloConfigFeature>() { // from class: app.chalo.superpass.utils.ChaloConfigUtils$special$$inlined$inject$default$2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object obj = this.f9613a;
                return (obj instanceof KoinScopeComponent ? ((KoinScopeComponent) obj).i0() : GlobalContext.f18817a.a().c.d).d(Reflection.a(ChaloConfigFeature.class), null, null);
            }
        });
        d = LazyKt.a(lazyThreadSafetyMode, new Function0<CrashlyticsLogger>() { // from class: app.chalo.superpass.utils.ChaloConfigUtils$special$$inlined$inject$default$3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object obj = this.f9614a;
                return (obj instanceof KoinScopeComponent ? ((KoinScopeComponent) obj).i0() : GlobalContext.f18817a.a().c.d).d(Reflection.a(CrashlyticsLogger.class), null, null);
            }
        });
        e = LazyKt.a(lazyThreadSafetyMode, new Function0<CityProvider>() { // from class: app.chalo.superpass.utils.ChaloConfigUtils$special$$inlined$inject$default$4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object obj = this.f9615a;
                return (obj instanceof KoinScopeComponent ? ((KoinScopeComponent) obj).i0() : GlobalContext.f18817a.a().c.d).d(Reflection.a(CityProvider.class), null, null);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public static ChaloConfigFeature a() {
        return (ChaloConfigFeature) c.getValue();
    }

    @Override // org.koin.core.component.KoinComponent
    public final Koin L() {
        return GlobalContext.f18817a.a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    public final Object b(ContinuationImpl continuationImpl) {
        ChaloConfigUtils$getChaloTimeBackgroundSyncRepeatIntervalInMinutes$1 chaloConfigUtils$getChaloTimeBackgroundSyncRepeatIntervalInMinutes$1;
        if (continuationImpl instanceof ChaloConfigUtils$getChaloTimeBackgroundSyncRepeatIntervalInMinutes$1) {
            chaloConfigUtils$getChaloTimeBackgroundSyncRepeatIntervalInMinutes$1 = (ChaloConfigUtils$getChaloTimeBackgroundSyncRepeatIntervalInMinutes$1) continuationImpl;
            int i = chaloConfigUtils$getChaloTimeBackgroundSyncRepeatIntervalInMinutes$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chaloConfigUtils$getChaloTimeBackgroundSyncRepeatIntervalInMinutes$1.label = i - Integer.MIN_VALUE;
            } else {
                chaloConfigUtils$getChaloTimeBackgroundSyncRepeatIntervalInMinutes$1 = new ChaloConfigUtils$getChaloTimeBackgroundSyncRepeatIntervalInMinutes$1(this, continuationImpl);
            }
        } else {
            chaloConfigUtils$getChaloTimeBackgroundSyncRepeatIntervalInMinutes$1 = new ChaloConfigUtils$getChaloTimeBackgroundSyncRepeatIntervalInMinutes$1(this, continuationImpl);
        }
        Object objA = chaloConfigUtils$getChaloTimeBackgroundSyncRepeatIntervalInMinutes$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloConfigUtils$getChaloTimeBackgroundSyncRepeatIntervalInMinutes$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            ChaloConfigFeature chaloConfigFeatureA = a();
            chaloConfigUtils$getChaloTimeBackgroundSyncRepeatIntervalInMinutes$1.label = 1;
            objA = chaloConfigFeatureA.a("periodicBackgroundSyncRepeatInterval", chaloConfigUtils$getChaloTimeBackgroundSyncRepeatIntervalInMinutes$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        String str = (String) objA;
        if (str.length() > 0) {
            try {
                JsonObject jsonObjectG = JsonElementKt.g(ChaloJson.b.f(str));
                long jH = JsonElementExtensionsKt.l(TtmlNode.COMBINE_ALL, jsonObjectG) ? JsonElementExtensionsKt.h(jsonObjectG, TtmlNode.COMBINE_ALL) : 720L;
                if (JsonElementExtensionsKt.l("chaloTime", jsonObjectG)) {
                    jH = JsonElementExtensionsKt.h(jsonObjectG, "chaloTime");
                }
                return new Long(jH);
            } catch (Exception e2) {
                ((CrashlyticsLogger) d.getValue()).i(new Throwable(e2));
            }
        }
        return new Long(720L);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:
    
        if (r8 == r2) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007f, code lost:
    
        if (r8 == r2) goto L24;
     */
    /* JADX WARN: Type inference failed for: r8v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r6 = this;
            java.lang.String r0 = "all"
            boolean r1 = r8 instanceof app.chalo.superpass.utils.ChaloConfigUtils$getRideBasedSuperPassReclaimTimeForCity$1
            if (r1 == 0) goto L15
            r1 = r8
            app.chalo.superpass.utils.ChaloConfigUtils$getRideBasedSuperPassReclaimTimeForCity$1 r1 = (app.chalo.superpass.utils.ChaloConfigUtils$getRideBasedSuperPassReclaimTimeForCity$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.label = r2
            goto L1a
        L15:
            app.chalo.superpass.utils.ChaloConfigUtils$getRideBasedSuperPassReclaimTimeForCity$1 r1 = new app.chalo.superpass.utils.ChaloConfigUtils$getRideBasedSuperPassReclaimTimeForCity$1
            r1.<init>(r6, r8)
        L1a:
            java.lang.Object r8 = r1.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r3 = r1.label
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L40
            if (r3 == r5) goto L38
            if (r3 != r4) goto L30
            java.lang.Object r7 = r1.L$0
            java.lang.String r7 = (java.lang.String) r7
            kotlin.ResultKt.b(r8)
            goto L82
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            java.lang.Object r7 = r1.L$0
            java.lang.String r7 = (java.lang.String) r7
            kotlin.ResultKt.b(r8)
            goto L6e
        L40:
            kotlin.ResultKt.b(r8)
            java.util.Locale r8 = java.util.Locale.ROOT
            java.lang.String r7 = r7.toLowerCase(r8)
            java.lang.String r8 = "toLowerCase(...)"
            kotlin.jvm.internal.Intrinsics.h(r7, r8)
            java.lang.Object r8 = app.chalo.superpass.utils.ChaloConfigUtils.b
            java.lang.Object r8 = r8.getValue()
            app.chalo.contract.BasicInfoContract r8 = (app.chalo.contract.BasicInfoContract) r8
            boolean r8 = r8.f()
            if (r8 == 0) goto L71
            app.chalo.features.chaloconfig.ChaloConfigFeature r8 = a()
            r1.L$0 = r7
            r1.label = r5
            java.lang.String r3 = "cityWiseRBSPReclaimTimeDev"
            java.lang.Object r8 = r8.a(r3, r1)
            if (r8 != r2) goto L6e
            goto L81
        L6e:
            java.lang.String r8 = (java.lang.String) r8
            goto L84
        L71:
            app.chalo.features.chaloconfig.ChaloConfigFeature r8 = a()
            r1.L$0 = r7
            r1.label = r4
            java.lang.String r3 = "cityWiseRBSPReclaimTimeProd"
            java.lang.Object r8 = r8.a(r3, r1)
            if (r8 != r2) goto L82
        L81:
            return r2
        L82:
            java.lang.String r8 = (java.lang.String) r8
        L84:
            r1 = 86400000(0x5265c00, double:4.2687272E-316)
            if (r8 == 0) goto Lbc
            kotlinx.serialization.json.Json r3 = app.chalo.network.config.ChaloJson.b     // Catch: java.lang.Exception -> L9e
            kotlinx.serialization.json.JsonElement r8 = r3.f(r8)     // Catch: java.lang.Exception -> L9e
            kotlinx.serialization.json.JsonObject r8 = kotlinx.serialization.json.JsonElementKt.g(r8)     // Catch: java.lang.Exception -> L9e
            boolean r3 = app.chalo.extensions.JsonElementExtensionsKt.l(r0, r8)     // Catch: java.lang.Exception -> L9e
            if (r3 == 0) goto La0
            long r3 = app.chalo.extensions.JsonElementExtensionsKt.h(r8, r0)     // Catch: java.lang.Exception -> L9e
            goto La1
        L9e:
            r7 = move-exception
            goto Lb1
        La0:
            r3 = r1
        La1:
            boolean r0 = app.chalo.extensions.JsonElementExtensionsKt.l(r7, r8)     // Catch: java.lang.Exception -> L9e
            if (r0 == 0) goto Lab
            long r3 = app.chalo.extensions.JsonElementExtensionsKt.h(r8, r7)     // Catch: java.lang.Exception -> L9e
        Lab:
            java.lang.Long r7 = new java.lang.Long     // Catch: java.lang.Exception -> L9e
            r7.<init>(r3)     // Catch: java.lang.Exception -> L9e
            return r7
        Lb1:
            java.lang.Object r8 = app.chalo.superpass.utils.ChaloConfigUtils.d
            java.lang.Object r8 = r8.getValue()
            app.chalo.crashlytics.CrashlyticsLogger r8 = (app.chalo.crashlytics.CrashlyticsLogger) r8
            r8.i(r7)
        Lbc:
            java.lang.Long r7 = new java.lang.Long
            r7.<init>(r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.superpass.utils.ChaloConfigUtils.c(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
    
        if (r0 == r4) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
    
        if (r0 == r4) goto L24;
     */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(kotlin.coroutines.jvm.internal.ContinuationImpl r20) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.superpass.utils.ChaloConfigUtils.d(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        if (r6 == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0067, code lost:
    
        if (r6 == r1) goto L24;
     */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.superpass.utils.ChaloConfigUtils.e(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
