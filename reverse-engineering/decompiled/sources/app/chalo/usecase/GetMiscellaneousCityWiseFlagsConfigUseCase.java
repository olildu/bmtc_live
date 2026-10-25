package app.chalo.usecase;

import app.chalo.behaviour.policy.AccountDeletionUrlOverride;
import app.chalo.buildconfig.ChaloBuildConfig;
import app.chalo.buildconfig.ProductFlavor;
import app.chalo.contract.BasicInfoContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.data.BonnetNumberToggleConfig;
import app.chalo.data.LocationManagerToggleConfig;
import app.chalo.data.MiscellaneousCityWiseConfigForCity;
import app.chalo.data.PassRollOverRidesConfig;
import app.chalo.data.UserConsentConfig;
import app.chalo.features.chaloconfig.ChaloConfigFeature;
import app.chalo.providers.cityprovider.CityProvider;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usecase/GetMiscellaneousCityWiseFlagsConfigUseCase;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetMiscellaneousCityWiseFlagsConfigUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloConfigFeature f10184a;
    public final CityProvider b;
    public final CrashlyticsLogger c;
    public final ChaloBuildConfig d;
    public final BasicInfoContract e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10185a;

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
            f10185a = iArr;
        }
    }

    public GetMiscellaneousCityWiseFlagsConfigUseCase(ChaloConfigFeature chaloConfigFeature, CityProvider cityProvider, CrashlyticsLogger crashlyticsLogger, ChaloBuildConfig chaloBuildConfig, BasicInfoContract basicInfoContract, AccountDeletionUrlOverride accountDeletionUrlOverride) {
        this.f10184a = chaloConfigFeature;
        this.b = cityProvider;
        this.c = crashlyticsLogger;
        this.d = chaloBuildConfig;
        this.e = basicInfoContract;
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
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.usecase.GetMiscellaneousCityWiseFlagsConfigUseCase.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final MiscellaneousCityWiseConfigForCity b(MiscellaneousCityWiseConfigForCity miscellaneousCityWiseConfigForCity) {
        if (miscellaneousCityWiseConfigForCity.r != null) {
            return miscellaneousCityWiseConfigForCity;
        }
        String cityName = miscellaneousCityWiseConfigForCity.f2360a;
        BonnetNumberToggleConfig bonnetNumberToggle = miscellaneousCityWiseConfigForCity.b;
        LocationManagerToggleConfig locationManagerToggle = miscellaneousCityWiseConfigForCity.c;
        boolean z = miscellaneousCityWiseConfigForCity.d;
        List passConfigIdsForAdjustEvent = miscellaneousCityWiseConfigForCity.e;
        double d = miscellaneousCityWiseConfigForCity.f;
        List adjustCampaignIdsForUniversalSearch = miscellaneousCityWiseConfigForCity.g;
        String str = miscellaneousCityWiseConfigForCity.h;
        int i = miscellaneousCityWiseConfigForCity.i;
        List passConfigIdsForBulkBookingFlowV2 = miscellaneousCityWiseConfigForCity.j;
        Map adjustCampaignsForPB = miscellaneousCityWiseConfigForCity.k;
        int i2 = miscellaneousCityWiseConfigForCity.l;
        boolean z2 = miscellaneousCityWiseConfigForCity.m;
        boolean z3 = miscellaneousCityWiseConfigForCity.n;
        boolean z4 = miscellaneousCityWiseConfigForCity.o;
        int i3 = miscellaneousCityWiseConfigForCity.p;
        PassRollOverRidesConfig passRollOverRidesConfig = miscellaneousCityWiseConfigForCity.q;
        UserConsentConfig userConsentConfig = miscellaneousCityWiseConfigForCity.s;
        boolean z5 = miscellaneousCityWiseConfigForCity.t;
        Intrinsics.i(cityName, "cityName");
        Intrinsics.i(bonnetNumberToggle, "bonnetNumberToggle");
        Intrinsics.i(locationManagerToggle, "locationManagerToggle");
        Intrinsics.i(passConfigIdsForAdjustEvent, "passConfigIdsForAdjustEvent");
        Intrinsics.i(adjustCampaignIdsForUniversalSearch, "adjustCampaignIdsForUniversalSearch");
        Intrinsics.i(passConfigIdsForBulkBookingFlowV2, "passConfigIdsForBulkBookingFlowV2");
        Intrinsics.i(adjustCampaignsForPB, "adjustCampaignsForPB");
        Intrinsics.i(passRollOverRidesConfig, "passRollOverRidesConfig");
        Intrinsics.i(userConsentConfig, "userConsentConfig");
        return new MiscellaneousCityWiseConfigForCity(cityName, bonnetNumberToggle, locationManagerToggle, z, passConfigIdsForAdjustEvent, d, adjustCampaignIdsForUniversalSearch, str, i, passConfigIdsForBulkBookingFlowV2, adjustCampaignsForPB, i2, z2, z3, z4, i3, passRollOverRidesConfig, "https://docs.google.com/forms/d/e/1FAIpQLSdJKwLSnYEWe0IrWkH2S2sEsos-Bb_NilpuvLkpHbbjxhQYDw/viewform", userConsentConfig, z5);
    }
}
