package app.chalo.ble_communication.domain;

import app.chalo.ble_communication.model.CityWiseTwoWayBleCommLoggingConfig;
import app.chalo.buildconfig.ChaloBuildConfig;
import app.chalo.buildconfig.ProductFlavor;
import app.chalo.contract.BasicInfoContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.features.chaloconfig.ChaloConfigFeature;
import app.chalo.providers.cityprovider.CityProvider;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ble_communication/domain/GetBLELoggingConfigUseCase;", "", "ble-communication_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetBLELoggingConfigUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloConfigFeature f1115a;
    public final ChaloBuildConfig b;
    public final CityProvider c;
    public final CrashlyticsLogger d;
    public final BasicInfoContract e;
    public CityWiseTwoWayBleCommLoggingConfig f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1116a;

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
            f1116a = iArr;
        }
    }

    public GetBLELoggingConfigUseCase(ChaloBuildConfig chaloBuildConfig, BasicInfoContract basicInfoContract, CrashlyticsLogger crashlyticsLogger, ChaloConfigFeature chaloConfigFeature, CityProvider cityProvider) {
        this.f1115a = chaloConfigFeature;
        this.b = chaloBuildConfig;
        this.c = cityProvider;
        this.d = crashlyticsLogger;
        this.e = basicInfoContract;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x017c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x01af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:? A[LOOP:1: B:97:0x0191->B:114:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x0117  */
    /* JADX WARN: Code duplicated, block: B:73:0x0136 A[Catch: Exception -> 0x0167, TryCatch #0 {Exception -> 0x0167, blocks: (B:71:0x011f, B:73:0x0136, B:75:0x013a, B:76:0x0140, B:78:0x0146, B:80:0x0164, B:84:0x016a, B:88:0x017d, B:92:0x0183, B:94:0x0187, B:96:0x018b, B:97:0x0191, B:99:0x0197, B:102:0x01b0), top: B:107:0x011f }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0146 A[Catch: Exception -> 0x0167, TryCatch #0 {Exception -> 0x0167, blocks: (B:71:0x011f, B:73:0x0136, B:75:0x013a, B:76:0x0140, B:78:0x0146, B:80:0x0164, B:84:0x016a, B:88:0x017d, B:92:0x0183, B:94:0x0187, B:96:0x018b, B:97:0x0191, B:99:0x0197, B:102:0x01b0), top: B:107:0x011f }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:80:0x0164 A[Catch: Exception -> 0x0167, TryCatch #0 {Exception -> 0x0167, blocks: (B:71:0x011f, B:73:0x0136, B:75:0x013a, B:76:0x0140, B:78:0x0146, B:80:0x0164, B:84:0x016a, B:88:0x017d, B:92:0x0183, B:94:0x0187, B:96:0x018b, B:97:0x0191, B:99:0x0197, B:102:0x01b0), top: B:107:0x011f }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0169  */
    /* JADX WARN: Code duplicated, block: B:90:0x0181  */
    /* JADX WARN: Code duplicated, block: B:91:0x0182 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:94:0x0187 A[Catch: Exception -> 0x0167, TryCatch #0 {Exception -> 0x0167, blocks: (B:71:0x011f, B:73:0x0136, B:75:0x013a, B:76:0x0140, B:78:0x0146, B:80:0x0164, B:84:0x016a, B:88:0x017d, B:92:0x0183, B:94:0x0187, B:96:0x018b, B:97:0x0191, B:99:0x0197, B:102:0x01b0), top: B:107:0x011f }] */
    /* JADX WARN: Code duplicated, block: B:99:0x0197 A[Catch: Exception -> 0x0167, TryCatch #0 {Exception -> 0x0167, blocks: (B:71:0x011f, B:73:0x0136, B:75:0x013a, B:76:0x0140, B:78:0x0146, B:80:0x0164, B:84:0x016a, B:88:0x017d, B:92:0x0183, B:94:0x0187, B:96:0x018b, B:97:0x0191, B:99:0x0197, B:102:0x01b0), top: B:107:0x011f }] */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d9, code lost:
    
        if (r12 == r1) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0102, code lost:
    
        if (r12 == r1) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0110, code lost:
    
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
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.ble_communication.domain.GetBLELoggingConfigUseCase.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
