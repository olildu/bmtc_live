package app.chalo.usecase;

import app.chalo.buildconfig.ChaloBuildConfig;
import app.chalo.buildconfig.ProductFlavor;
import app.chalo.contract.BasicInfoContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.features.chaloconfig.ChaloConfigFeature;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usecase/GetPremiumBusNativeConfigUseCase;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetPremiumBusNativeConfigUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloConfigFeature f10187a;
    public final BasicInfoContract b;
    public final ChaloBuildConfig c;
    public final CrashlyticsLogger d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10188a;

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
            f10188a = iArr;
        }
    }

    public GetPremiumBusNativeConfigUseCase(ChaloBuildConfig chaloBuildConfig, BasicInfoContract basicInfoContract, CrashlyticsLogger crashlyticsLogger, ChaloConfigFeature chaloConfigFeature) {
        this.f10187a = chaloConfigFeature;
        this.b = basicInfoContract;
        this.c = chaloBuildConfig;
        this.d = crashlyticsLogger;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
        if (r8 == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007b, code lost:
    
        if (r8 == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0089, code lost:
    
        if (r8 == r1) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof app.chalo.usecase.GetPremiumBusNativeConfigUseCase$invoke$1
            if (r0 == 0) goto L13
            r0 = r8
            app.chalo.usecase.GetPremiumBusNativeConfigUseCase$invoke$1 r0 = (app.chalo.usecase.GetPremiumBusNativeConfigUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.usecase.GetPremiumBusNativeConfigUseCase$invoke$1 r0 = new app.chalo.usecase.GetPremiumBusNativeConfigUseCase$invoke$1
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
            goto L7e
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L35:
            kotlin.ResultKt.b(r8)
            goto L8c
        L39:
            kotlin.ResultKt.b(r8)
            goto L55
        L3d:
            kotlin.ResultKt.b(r8)
            app.chalo.contract.BasicInfoContract r8 = r7.b
            boolean r8 = r8.f()
            app.chalo.features.chaloconfig.ChaloConfigFeature r2 = r7.f10187a
            if (r8 == 0) goto L58
            r0.label = r5
            java.lang.String r8 = "premiumBusNativeDebug"
            java.lang.Object r8 = r2.a(r8, r0)
            if (r8 != r1) goto L55
            goto L8b
        L55:
            java.lang.String r8 = (java.lang.String) r8
            goto L8e
        L58:
            app.chalo.buildconfig.ChaloBuildConfig r8 = r7.c
            app.chalo.buildconfig.ProductFlavor r8 = r8.m()
            int[] r6 = app.chalo.usecase.GetPremiumBusNativeConfigUseCase.WhenMappings.f10188a
            int r8 = r8.ordinal()
            r8 = r6[r8]
            if (r8 == r5) goto L81
            if (r8 == r4) goto L73
            if (r8 != r3) goto L6d
            goto L73
        L6d:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        L73:
            r0.label = r3
            java.lang.String r8 = "premiumBusNativeBeta"
            java.lang.Object r8 = r2.a(r8, r0)
            if (r8 != r1) goto L7e
            goto L8b
        L7e:
            java.lang.String r8 = (java.lang.String) r8
            goto L8e
        L81:
            r0.label = r4
            java.lang.String r8 = "premiumBusNativeProd"
            java.lang.Object r8 = r2.a(r8, r0)
            if (r8 != r1) goto L8c
        L8b:
            return r1
        L8c:
            java.lang.String r8 = (java.lang.String) r8
        L8e:
            int r0 = r8.length()
            if (r0 != 0) goto L9c
            app.chalo.data.PremiumBusNativeConfigAppModel r8 = new app.chalo.data.PremiumBusNativeConfigAppModel
            kotlin.collections.EmptyList r0 = kotlin.collections.EmptyList.f17557a
            r8.<init>(r0)
            return r8
        L9c:
            kotlinx.serialization.json.Json r0 = app.chalo.network.config.ChaloJson.b     // Catch: java.lang.Exception -> Lb0
            r0.getClass()     // Catch: java.lang.Exception -> Lb0
            app.chalo.data.PremiumBusNativeConfigAppModel$Companion r1 = app.chalo.data.PremiumBusNativeConfigAppModel.INSTANCE     // Catch: java.lang.Exception -> Lb0
            kotlinx.serialization.KSerializer r1 = r1.serializer()     // Catch: java.lang.Exception -> Lb0
            kotlinx.serialization.DeserializationStrategy r1 = (kotlinx.serialization.DeserializationStrategy) r1     // Catch: java.lang.Exception -> Lb0
            java.lang.Object r8 = r0.b(r8, r1)     // Catch: java.lang.Exception -> Lb0
            app.chalo.data.PremiumBusNativeConfigAppModel r8 = (app.chalo.data.PremiumBusNativeConfigAppModel) r8     // Catch: java.lang.Exception -> Lb0
            return r8
        Lb0:
            r8 = move-exception
            app.chalo.crashlytics.CrashlyticsLogger r0 = r7.d
            r0.i(r8)
            app.chalo.data.PremiumBusNativeConfigAppModel r8 = new app.chalo.data.PremiumBusNativeConfigAppModel
            kotlin.collections.EmptyList r0 = kotlin.collections.EmptyList.f17557a
            r8.<init>(r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.usecase.GetPremiumBusNativeConfigUseCase.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
