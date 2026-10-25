package app.chalo.domain;

import app.chalo.buildconfig.ChaloBuildConfig;
import app.chalo.buildconfig.ProductFlavor;
import app.chalo.contract.BasicInfoContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.features.chaloconfig.ChaloConfigFeature;
import app.chalo.models.bookinghelp.BookingHelpConfigAppModel;
import app.chalo.providers.cityprovider.CityProvider;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/domain/GetBookingHelpRemoteConfigUseCase;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetBookingHelpRemoteConfigUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloConfigFeature f2490a;
    public final BasicInfoContract b;
    public final CityProvider c;
    public final CrashlyticsLogger d;
    public final ChaloBuildConfig e;
    public BookingHelpConfigAppModel f;
    public final BookingHelpConfigAppModel g = BookingHelpConfigAppModel.c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2491a;

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
            f2491a = iArr;
        }
    }

    public GetBookingHelpRemoteConfigUseCase(ChaloBuildConfig chaloBuildConfig, BasicInfoContract basicInfoContract, CrashlyticsLogger crashlyticsLogger, ChaloConfigFeature chaloConfigFeature, CityProvider cityProvider) {
        this.f2490a = chaloConfigFeature;
        this.b = basicInfoContract;
        this.c = cityProvider;
        this.d = crashlyticsLogger;
        this.e = chaloBuildConfig;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x010a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0067, code lost:
    
        if (r10 == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008e, code lost:
    
        if (r10 == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009c, code lost:
    
        if (r10 == r1) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.domain.GetBookingHelpRemoteConfigUseCase.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
