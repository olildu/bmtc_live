package app.chalo.ncmc.domain;

import app.chalo.buildconfig.ChaloBuildConfig;
import app.chalo.buildconfig.ProductFlavor;
import app.chalo.contract.BasicInfoContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.features.chaloconfig.ChaloConfigFeature;
import app.chalo.ncmc.data.CardOptions;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/domain/GetChaloCardExpOptionsUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetChaloCardExpOptionsUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloConfigFeature f6235a;
    public final CrashlyticsLogger b;
    public final ChaloBuildConfig c;
    public final BasicInfoContract d;
    public CardOptions e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6236a;

        static {
            int[] iArr = new int[ProductFlavor.values().length];
            try {
                iArr[ProductFlavor.PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProductFlavor.BETA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProductFlavor.ALPHA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f6236a = iArr;
        }
    }

    public GetChaloCardExpOptionsUseCase(ChaloBuildConfig chaloBuildConfig, BasicInfoContract basicInfoContract, CrashlyticsLogger crashlyticsLogger, ChaloConfigFeature chaloConfigFeature) {
        this.f6235a = chaloConfigFeature;
        this.b = crashlyticsLogger;
        this.c = chaloBuildConfig;
        this.d = basicInfoContract;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
    
        if (r8 == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0080, code lost:
    
        if (r8 == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008e, code lost:
    
        if (r8 == r1) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof app.chalo.ncmc.domain.GetChaloCardExpOptionsUseCase$invoke$1
            if (r0 == 0) goto L13
            r0 = r8
            app.chalo.ncmc.domain.GetChaloCardExpOptionsUseCase$invoke$1 r0 = (app.chalo.ncmc.domain.GetChaloCardExpOptionsUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.ncmc.domain.GetChaloCardExpOptionsUseCase$invoke$1 r0 = new app.chalo.ncmc.domain.GetChaloCardExpOptionsUseCase$invoke$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.ResultKt.b(r8)
            goto L83
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L35:
            kotlin.ResultKt.b(r8)
            goto L91
        L39:
            kotlin.ResultKt.b(r8)
            goto L5a
        L3d:
            kotlin.ResultKt.b(r8)
            app.chalo.ncmc.data.CardOptions r8 = r7.e
            if (r8 == 0) goto L45
            return r8
        L45:
            app.chalo.contract.BasicInfoContract r8 = r7.d
            boolean r8 = r8.f()
            app.chalo.features.chaloconfig.ChaloConfigFeature r2 = r7.f6235a
            if (r8 == 0) goto L5d
            r0.label = r5
            java.lang.String r8 = "chaloCardExpOptionsDev"
            java.lang.Object r8 = r2.a(r8, r0)
            if (r8 != r1) goto L5a
            goto L90
        L5a:
            java.lang.String r8 = (java.lang.String) r8
            goto L93
        L5d:
            app.chalo.buildconfig.ChaloBuildConfig r8 = r7.c
            app.chalo.buildconfig.ProductFlavor r8 = r8.m()
            int[] r6 = app.chalo.ncmc.domain.GetChaloCardExpOptionsUseCase.WhenMappings.f6236a
            int r8 = r8.ordinal()
            r8 = r6[r8]
            if (r8 == r5) goto L86
            if (r8 == r4) goto L78
            if (r8 != r3) goto L72
            goto L78
        L72:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        L78:
            r0.label = r3
            java.lang.String r8 = "chaloCardExpOptionsBeta"
            java.lang.Object r8 = r2.a(r8, r0)
            if (r8 != r1) goto L83
            goto L90
        L83:
            java.lang.String r8 = (java.lang.String) r8
            goto L93
        L86:
            r0.label = r4
            java.lang.String r8 = "chaloCardExpOptionsProd"
            java.lang.Object r8 = r2.a(r8, r0)
            if (r8 != r1) goto L91
        L90:
            return r1
        L91:
            java.lang.String r8 = (java.lang.String) r8
        L93:
            r0 = 0
            if (r8 == 0) goto Lbc
            int r1 = r8.length()
            if (r1 != 0) goto L9d
            goto Lbc
        L9d:
            kotlinx.serialization.json.Json r1 = app.chalo.network.config.ChaloJson.b     // Catch: java.lang.Exception -> Lb3
            r1.getClass()     // Catch: java.lang.Exception -> Lb3
            app.chalo.ncmc.data.CardOptions$Companion r2 = app.chalo.ncmc.data.CardOptions.INSTANCE     // Catch: java.lang.Exception -> Lb3
            kotlinx.serialization.KSerializer r2 = r2.serializer()     // Catch: java.lang.Exception -> Lb3
            kotlinx.serialization.DeserializationStrategy r2 = (kotlinx.serialization.DeserializationStrategy) r2     // Catch: java.lang.Exception -> Lb3
            java.lang.Object r8 = r1.b(r8, r2)     // Catch: java.lang.Exception -> Lb3
            app.chalo.ncmc.data.CardOptions r8 = (app.chalo.ncmc.data.CardOptions) r8     // Catch: java.lang.Exception -> Lb3
            r7.e = r8     // Catch: java.lang.Exception -> Lb3
            return r8
        Lb3:
            r8 = move-exception
            r8.printStackTrace()
            app.chalo.crashlytics.CrashlyticsLogger r1 = r7.b
            r1.i(r8)
        Lbc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.ncmc.domain.GetChaloCardExpOptionsUseCase.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
