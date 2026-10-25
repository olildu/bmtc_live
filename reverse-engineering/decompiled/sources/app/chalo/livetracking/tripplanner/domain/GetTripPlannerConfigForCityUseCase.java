package app.chalo.livetracking.tripplanner.domain;

import app.chalo.buildconfig.ChaloBuildConfig;
import app.chalo.buildconfig.ProductFlavor;
import app.chalo.contract.BasicInfoContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.features.chaloconfig.ChaloConfigFeature;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerCityConfigModel;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerConfigModel;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/tripplanner/domain/GetTripPlannerConfigForCityUseCase;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetTripPlannerConfigForCityUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloConfigFeature f4695a;
    public final ChaloBuildConfig b;
    public final CityProvider c;
    public final CrashlyticsLogger d;
    public final BasicInfoContract e;
    public TripPlannerConfigModel f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4696a;

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
            f4696a = iArr;
        }
    }

    public GetTripPlannerConfigForCityUseCase(ChaloBuildConfig chaloBuildConfig, BasicInfoContract basicInfoContract, CrashlyticsLogger crashlyticsLogger, ChaloConfigFeature chaloConfigFeature, CityProvider cityProvider) {
        this.f4695a = chaloConfigFeature;
        this.b = chaloBuildConfig;
        this.c = cityProvider;
        this.d = crashlyticsLogger;
        this.e = basicInfoContract;
    }

    public final TripPlannerCityConfigModel a() {
        String strB = CityProviderKt.b(this.c);
        if (strB == null) {
            strB = "";
        }
        return new TripPlannerCityConfigModel(strB);
    }

    public final TripPlannerCityConfigModel b(TripPlannerConfigModel tripPlannerConfigModel) {
        Object next;
        Iterator it = tripPlannerConfigModel.f4659a.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!StringsKt.x(((TripPlannerCityConfigModel) next).f4657a, CityProviderKt.b(this.c), true));
        TripPlannerCityConfigModel tripPlannerCityConfigModel = (TripPlannerCityConfigModel) next;
        if (tripPlannerCityConfigModel != null) {
            return tripPlannerCityConfigModel;
        }
        TripPlannerCityConfigModel tripPlannerCityConfigModel2 = tripPlannerConfigModel.b;
        return tripPlannerCityConfigModel2 == null ? a() : tripPlannerCityConfigModel2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
    
        if (r8 == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0086, code lost:
    
        if (r8 == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0095, code lost:
    
        if (r8 == r1) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.tripplanner.domain.GetTripPlannerConfigForCityUseCase.c(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
