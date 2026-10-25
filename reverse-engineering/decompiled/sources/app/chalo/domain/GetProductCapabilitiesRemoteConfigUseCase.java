package app.chalo.domain;

import app.chalo.buildconfig.ChaloBuildConfig;
import app.chalo.buildconfig.ProductFlavor;
import app.chalo.contract.BasicInfoContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.features.chaloconfig.ChaloConfigFeature;
import app.chalo.models.productbooking.productcapability.ProductCapabilitiesApiModel;
import app.chalo.providers.cityprovider.CityProvider;
import defpackage.z20;
import kotlin.Metadata;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/domain/GetProductCapabilitiesRemoteConfigUseCase;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetProductCapabilitiesRemoteConfigUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloConfigFeature f2498a;
    public final CrashlyticsLogger b;
    public final ChaloBuildConfig c;
    public final BasicInfoContract d;
    public final CityProvider e;
    public final Json f = JsonKt.a(Json.d, new z20(18));
    public final ProductCapabilitiesApiModel g;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2499a;

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
            f2499a = iArr;
        }
    }

    public GetProductCapabilitiesRemoteConfigUseCase(ChaloBuildConfig chaloBuildConfig, BasicInfoContract basicInfoContract, CrashlyticsLogger crashlyticsLogger, ChaloConfigFeature chaloConfigFeature, CityProvider cityProvider) {
        this.f2498a = chaloConfigFeature;
        this.b = crashlyticsLogger;
        this.c = chaloBuildConfig;
        this.d = basicInfoContract;
        this.e = cityProvider;
        ProductCapabilitiesApiModel.INSTANCE.getClass();
        this.g = ProductCapabilitiesApiModel.g;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0082, code lost:
    
        if (r11 == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b2, code lost:
    
        if (r11 == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c7, code lost:
    
        if (r11 == r1) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r8, java.lang.String r9, java.lang.String r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.domain.GetProductCapabilitiesRemoteConfigUseCase.a(java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
