package app.chalo.validationsdk.blevalidation.domain.configuration;

import app.chalo.buildconfig.ChaloBuildConfig;
import app.chalo.buildconfig.ProductFlavor;
import app.chalo.contract.BasicInfoContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.features.chaloconfig.ChaloConfigFeature;
import app.chalo.models.validation.RegularBusProductValidationMethodsConfig;
import app.chalo.providers.cityprovider.CityProvider;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/domain/configuration/GetRegularBusProductValidationMethodsConfigForCurrentCityUseCase;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetRegularBusProductValidationMethodsConfigForCurrentCityUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloConfigFeature f10511a;
    public final ChaloBuildConfig b;
    public final CityProvider c;
    public final CrashlyticsLogger d;
    public final BasicInfoContract e;
    public RegularBusProductValidationMethodsConfig f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10512a;

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
            f10512a = iArr;
        }
    }

    public GetRegularBusProductValidationMethodsConfigForCurrentCityUseCase(ChaloBuildConfig chaloBuildConfig, BasicInfoContract basicInfoContract, CrashlyticsLogger crashlyticsLogger, ChaloConfigFeature chaloConfigFeature, CityProvider cityProvider) {
        this.f10511a = chaloConfigFeature;
        this.b = chaloBuildConfig;
        this.c = cityProvider;
        this.d = crashlyticsLogger;
        this.e = basicInfoContract;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0183 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x01b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:? A[LOOP:1: B:97:0x0198->B:114:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x011a  */
    /* JADX WARN: Code duplicated, block: B:73:0x013d A[Catch: Exception -> 0x016e, TryCatch #0 {Exception -> 0x016e, blocks: (B:71:0x0122, B:73:0x013d, B:75:0x0141, B:76:0x0147, B:78:0x014d, B:80:0x016b, B:84:0x0171, B:88:0x0184, B:92:0x018a, B:94:0x018e, B:96:0x0192, B:97:0x0198, B:99:0x019e, B:103:0x01b8), top: B:107:0x0122 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x014d A[Catch: Exception -> 0x016e, TryCatch #0 {Exception -> 0x016e, blocks: (B:71:0x0122, B:73:0x013d, B:75:0x0141, B:76:0x0147, B:78:0x014d, B:80:0x016b, B:84:0x0171, B:88:0x0184, B:92:0x018a, B:94:0x018e, B:96:0x0192, B:97:0x0198, B:99:0x019e, B:103:0x01b8), top: B:107:0x0122 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:80:0x016b A[Catch: Exception -> 0x016e, TryCatch #0 {Exception -> 0x016e, blocks: (B:71:0x0122, B:73:0x013d, B:75:0x0141, B:76:0x0147, B:78:0x014d, B:80:0x016b, B:84:0x0171, B:88:0x0184, B:92:0x018a, B:94:0x018e, B:96:0x0192, B:97:0x0198, B:99:0x019e, B:103:0x01b8), top: B:107:0x0122 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0170  */
    /* JADX WARN: Code duplicated, block: B:90:0x0188  */
    /* JADX WARN: Code duplicated, block: B:91:0x0189 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:94:0x018e A[Catch: Exception -> 0x016e, TryCatch #0 {Exception -> 0x016e, blocks: (B:71:0x0122, B:73:0x013d, B:75:0x0141, B:76:0x0147, B:78:0x014d, B:80:0x016b, B:84:0x0171, B:88:0x0184, B:92:0x018a, B:94:0x018e, B:96:0x0192, B:97:0x0198, B:99:0x019e, B:103:0x01b8), top: B:107:0x0122 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x019e A[Catch: Exception -> 0x016e, TryCatch #0 {Exception -> 0x016e, blocks: (B:71:0x0122, B:73:0x013d, B:75:0x0141, B:76:0x0147, B:78:0x014d, B:80:0x016b, B:84:0x0171, B:88:0x0184, B:92:0x018a, B:94:0x018e, B:96:0x0192, B:97:0x0198, B:99:0x019e, B:103:0x01b8), top: B:107:0x0122 }] */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00da, code lost:
    
        if (r12 == r1) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0104, code lost:
    
        if (r12 == r1) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0113, code lost:
    
        if (r12 == r1) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            Method dump skipped, instruction units count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.validationsdk.blevalidation.domain.configuration.GetRegularBusProductValidationMethodsConfigForCurrentCityUseCase.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
