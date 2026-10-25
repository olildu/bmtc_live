package app.chalo.usecase;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.buildconfig.ChaloBuildConfig;
import app.chalo.buildconfig.ProductFlavor;
import app.chalo.contract.BasicInfoContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.datastore.LocalDataStore;
import app.chalo.features.chaloconfig.ChaloConfigFeature;
import app.chalo.providers.cityprovider.CityProvider;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usecase/IsLocationMandatoryForUserUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IsLocationMandatoryForUserUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CityProvider f10206a;
    public final BasicInfoContract b;
    public final ChaloBuildConfig c;
    public final ChaloConfigFeature d;
    public final CrashlyticsLogger e;
    public final LocalDataStore f;
    public final AnalyticsContract g;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10207a;

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
            f10207a = iArr;
        }
    }

    public IsLocationMandatoryForUserUseCase(CityProvider cityProvider, BasicInfoContract basicInfoContract, ChaloBuildConfig chaloBuildConfig, ChaloConfigFeature chaloConfigFeature, CrashlyticsLogger crashlyticsLogger, LocalDataStore localDataStore, AnalyticsContract analyticsContract) {
        this.f10206a = cityProvider;
        this.b = basicInfoContract;
        this.c = chaloBuildConfig;
        this.d = chaloConfigFeature;
        this.e = crashlyticsLogger;
        this.f = localDataStore;
        this.g = analyticsContract;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
        if (r8 == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0079, code lost:
    
        if (r8 == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0087, code lost:
    
        if (r8 == r1) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.usecase.IsLocationMandatoryForUserUseCase.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:46:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:52:0x0129  */
    /* JADX WARN: Code duplicated, block: B:55:0x0141 A[PHI: r1 r4 r12
      0x0141: PHI (r1v28 java.lang.Object) = (r1v14 java.lang.Object), (r1v1 java.lang.Object) binds: [B:53:0x013e, B:15:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x0141: PHI (r4v16 app.chalo.ui.fragments.model.LocationAbTestingConfig) = 
      (r4v7 app.chalo.ui.fragments.model.LocationAbTestingConfig)
      (r4v22 app.chalo.ui.fragments.model.LocationAbTestingConfig)
     binds: [B:53:0x013e, B:15:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x0141: PHI (r12v7 app.chalo.constants.Source) = (r12v4 app.chalo.constants.Source), (r12v9 app.chalo.constants.Source) binds: [B:53:0x013e, B:15:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x014b  */
    /* JADX WARN: Code duplicated, block: B:59:0x0161  */
    /* JADX WARN: Code duplicated, block: B:63:0x017c  */
    /* JADX WARN: Code duplicated, block: B:69:0x019b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x011c, code lost:
    
        if (r1 == r3) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0177, code lost:
    
        if (r10.g(r1, "locationMandatory", r2) == r3) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0192, code lost:
    
        if (r10.g(r1, "locationNotMandatory", r2) == r3) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01ab, code lost:
    
        if (r10.g(r1, "locationNotMandatory", r2) == r3) goto L71;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(app.chalo.constants.Source r18, kotlin.coroutines.jvm.internal.ContinuationImpl r19) {
        /*
            Method dump skipped, instruction units count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.usecase.IsLocationMandatoryForUserUseCase.b(app.chalo.constants.Source, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void c(String str, String str2, String str3, String str4) {
        AnalyticsContract.DefaultImpls.a(this.g, vo1.m("Exp: ", str), str4, MapsKt.i(new Pair("variant", str3), new Pair(RemoteConfigConstants.ExperimentDescriptionFieldKey.EXPERIMENT_ID, str2)), null, false, 24);
    }
}
