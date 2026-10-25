package app.chalo.productpurchase.passpurchase.ui;

import app.chalo.constants.Source;
import app.chalo.models.BookableSuperPassConfiguration;
import app.chalo.models.productbooking.SuperPassPurchaseStopsInfo;
import app.chalo.providers.cityprovider.impl.data.models.app.AgencyInfoAppModel;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
import app.chalo.scenes.args.PostPassPurchaseSuccessFlowType;
import app.chalo.superpass.data.models.entities.PassApplicationActionRequired;
import app.chalo.superpass.data.models.entities.PassApplicationRejectionReasons;
import app.chalo.superpass.data.models.entities.SuperPassUserDetails;
import app.chalo.userprofile.Gender;
import defpackage.r30;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/SuperPassPurchaseSharedState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SuperPassPurchaseSharedState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Source f8359a;
    public final CityAppModel b;
    public final AgencyInfoAppModel c;
    public final String d;
    public final PassApplicationActionRequired e;
    public final PassApplicationRejectionReasons f;
    public final String g;
    public final SuperPassUserDetails h;
    public final BookableSuperPassConfiguration i;
    public final Long j;
    public final long k;
    public final boolean l;
    public final SuperPassPurchaseStopsInfo m;
    public final PostPassPurchaseSuccessFlowType n;
    public final List o;
    public final Map p;
    public final Map q;

    public SuperPassPurchaseSharedState(Source source, CityAppModel cityAppModel, AgencyInfoAppModel agencyInfoAppModel, String str, PassApplicationActionRequired passApplicationActionRequired, PassApplicationRejectionReasons passApplicationRejectionReasons, String str2, SuperPassUserDetails userDetails, BookableSuperPassConfiguration bookableSuperPassConfiguration, Long l, long j, boolean z, SuperPassPurchaseStopsInfo superPassPurchaseStopsInfo, PostPassPurchaseSuccessFlowType postPurchaseFlowType, List proofDocumentPropsList, Map map, Map map2) {
        Intrinsics.i(source, "source");
        Intrinsics.i(passApplicationActionRequired, "passApplicationActionRequired");
        Intrinsics.i(userDetails, "userDetails");
        Intrinsics.i(postPurchaseFlowType, "postPurchaseFlowType");
        Intrinsics.i(proofDocumentPropsList, "proofDocumentPropsList");
        this.f8359a = source;
        this.b = cityAppModel;
        this.c = agencyInfoAppModel;
        this.d = str;
        this.e = passApplicationActionRequired;
        this.f = passApplicationRejectionReasons;
        this.g = str2;
        this.h = userDetails;
        this.i = bookableSuperPassConfiguration;
        this.j = l;
        this.k = j;
        this.l = z;
        this.m = superPassPurchaseStopsInfo;
        this.n = postPurchaseFlowType;
        this.o = proofDocumentPropsList;
        this.p = map;
        this.q = map2;
    }

    public static SuperPassPurchaseSharedState a(SuperPassPurchaseSharedState superPassPurchaseSharedState, CityAppModel cityAppModel, AgencyInfoAppModel agencyInfoAppModel, String str, SuperPassUserDetails superPassUserDetails, BookableSuperPassConfiguration bookableSuperPassConfiguration, Long l, long j, boolean z, List list, LinkedHashMap linkedHashMap, int i) {
        Source source = superPassPurchaseSharedState.f8359a;
        CityAppModel cityAppModel2 = (i & 2) != 0 ? superPassPurchaseSharedState.b : cityAppModel;
        AgencyInfoAppModel agencyInfoAppModel2 = (i & 4) != 0 ? superPassPurchaseSharedState.c : agencyInfoAppModel;
        String str2 = (i & 8) != 0 ? superPassPurchaseSharedState.d : "flowRenewPass";
        PassApplicationActionRequired passApplicationActionRequired = superPassPurchaseSharedState.e;
        PassApplicationRejectionReasons passApplicationRejectionReasons = superPassPurchaseSharedState.f;
        String str3 = (i & 64) != 0 ? superPassPurchaseSharedState.g : str;
        SuperPassUserDetails userDetails = (i & 128) != 0 ? superPassPurchaseSharedState.h : superPassUserDetails;
        BookableSuperPassConfiguration bookableSuperPassConfiguration2 = (i & 256) != 0 ? superPassPurchaseSharedState.i : bookableSuperPassConfiguration;
        Long l2 = (i & 512) != 0 ? superPassPurchaseSharedState.j : l;
        long j2 = (i & 1024) != 0 ? superPassPurchaseSharedState.k : j;
        boolean z2 = (i & 2048) != 0 ? superPassPurchaseSharedState.l : z;
        SuperPassPurchaseStopsInfo superPassPurchaseStopsInfo = superPassPurchaseSharedState.m;
        BookableSuperPassConfiguration bookableSuperPassConfiguration3 = bookableSuperPassConfiguration2;
        Long l3 = l2;
        long j3 = j2;
        boolean z3 = z2;
        PostPassPurchaseSuccessFlowType postPurchaseFlowType = superPassPurchaseSharedState.n;
        CityAppModel cityAppModel3 = cityAppModel2;
        List proofDocumentPropsList = (i & 16384) != 0 ? superPassPurchaseSharedState.o : list;
        Map map = (i & 32768) != 0 ? superPassPurchaseSharedState.p : linkedHashMap;
        Map map2 = superPassPurchaseSharedState.q;
        superPassPurchaseSharedState.getClass();
        superPassPurchaseSharedState.getClass();
        Intrinsics.i(source, "source");
        Intrinsics.i(passApplicationActionRequired, "passApplicationActionRequired");
        Intrinsics.i(userDetails, "userDetails");
        Intrinsics.i(postPurchaseFlowType, "postPurchaseFlowType");
        Intrinsics.i(proofDocumentPropsList, "proofDocumentPropsList");
        return new SuperPassPurchaseSharedState(source, cityAppModel3, agencyInfoAppModel2, str2, passApplicationActionRequired, passApplicationRejectionReasons, str3, userDetails, bookableSuperPassConfiguration3, l3, j3, z3, superPassPurchaseStopsInfo, postPurchaseFlowType, proofDocumentPropsList, map, map2);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final BookableSuperPassConfiguration getI() {
        return this.i;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final SuperPassUserDetails getH() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperPassPurchaseSharedState)) {
            return false;
        }
        SuperPassPurchaseSharedState superPassPurchaseSharedState = (SuperPassPurchaseSharedState) obj;
        return this.f8359a == superPassPurchaseSharedState.f8359a && Intrinsics.d(this.b, superPassPurchaseSharedState.b) && Intrinsics.d(this.c, superPassPurchaseSharedState.c) && Intrinsics.d(this.d, superPassPurchaseSharedState.d) && this.e == superPassPurchaseSharedState.e && Intrinsics.d(this.f, superPassPurchaseSharedState.f) && Intrinsics.d(this.g, superPassPurchaseSharedState.g) && Intrinsics.d(this.h, superPassPurchaseSharedState.h) && Intrinsics.d(this.i, superPassPurchaseSharedState.i) && Intrinsics.d(this.j, superPassPurchaseSharedState.j) && this.k == superPassPurchaseSharedState.k && this.l == superPassPurchaseSharedState.l && Intrinsics.d(this.m, superPassPurchaseSharedState.m) && this.n == superPassPurchaseSharedState.n && Intrinsics.d(this.o, superPassPurchaseSharedState.o) && Intrinsics.d(this.p, superPassPurchaseSharedState.p) && Intrinsics.d(this.q, superPassPurchaseSharedState.q);
    }

    public final int hashCode() {
        int iHashCode = this.f8359a.hashCode() * 31;
        CityAppModel cityAppModel = this.b;
        int iHashCode2 = (iHashCode + (cityAppModel == null ? 0 : cityAppModel.hashCode())) * 31;
        AgencyInfoAppModel agencyInfoAppModel = this.c;
        int iHashCode3 = (iHashCode2 + (agencyInfoAppModel == null ? 0 : agencyInfoAppModel.hashCode())) * 31;
        String str = this.d;
        int iHashCode4 = (this.e.hashCode() + ((iHashCode3 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        PassApplicationRejectionReasons passApplicationRejectionReasons = this.f;
        int iHashCode5 = (iHashCode4 + (passApplicationRejectionReasons == null ? 0 : passApplicationRejectionReasons.hashCode())) * 31;
        String str2 = this.g;
        int iHashCode6 = (this.h.hashCode() + ((iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        BookableSuperPassConfiguration bookableSuperPassConfiguration = this.i;
        int iHashCode7 = (iHashCode6 + (bookableSuperPassConfiguration == null ? 0 : bookableSuperPassConfiguration.hashCode())) * 31;
        Long l = this.j;
        int iHashCode8 = l == null ? 0 : l.hashCode();
        long j = this.k;
        int i = (((((iHashCode7 + iHashCode8) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + (this.l ? 1231 : 1237)) * 31;
        SuperPassPurchaseStopsInfo superPassPurchaseStopsInfo = this.m;
        int iB = r30.b((this.n.hashCode() + ((i + (superPassPurchaseStopsInfo == null ? 0 : superPassPurchaseStopsInfo.hashCode())) * 31)) * 31, 31, this.o);
        Map map = this.p;
        int iHashCode9 = (iB + (map == null ? 0 : map.hashCode())) * 31;
        Map map2 = this.q;
        return ((iHashCode9 + (map2 != null ? map2.hashCode() : 0)) * 31) + 1237;
    }

    public final String toString() {
        return "SuperPassPurchaseSharedState(source=" + this.f8359a + ", currentCity=" + this.b + ", agency=" + this.c + ", purchaseFlowType=" + this.d + ", passApplicationActionRequired=" + this.e + ", passApplicationRejectionReasons=" + this.f + ", passIdForRenew=" + this.g + ", userDetails=" + this.h + ", bookableSuperPassConfiguration=" + this.i + ", passStartTime=" + this.j + ", passVerificationExpiryTime=" + this.k + ", isAgencyAvailable=" + this.l + ", purchaseStopsInfo=" + this.m + ", postPurchaseFlowType=" + this.n + ", proofDocumentPropsList=" + this.o + ", proofUploadDetailsMap=" + this.p + ", preUploadedProofsMap=" + this.q + ", isPremiumPassLandingFlow=false)";
    }

    public SuperPassPurchaseSharedState(Source source, CityAppModel cityAppModel, AgencyInfoAppModel agencyInfoAppModel, String str, PassApplicationActionRequired passApplicationActionRequired, PassApplicationRejectionReasons passApplicationRejectionReasons, String str2, SuperPassUserDetails superPassUserDetails, BookableSuperPassConfiguration bookableSuperPassConfiguration, Long l, long j, boolean z, SuperPassPurchaseStopsInfo superPassPurchaseStopsInfo, PostPassPurchaseSuccessFlowType postPassPurchaseSuccessFlowType, List list, HashMap map, Map map2, int i) {
        this((i & 1) != 0 ? Source.UNKNOWN : source, (i & 2) != 0 ? null : cityAppModel, (i & 4) != 0 ? null : agencyInfoAppModel, (i & 8) != 0 ? null : str, (i & 16) != 0 ? PassApplicationActionRequired.FRESH : passApplicationActionRequired, (i & 32) != 0 ? null : passApplicationRejectionReasons, (i & 64) != 0 ? null : str2, (i & 128) != 0 ? new SuperPassUserDetails((String) null, (String) null, (String) null, Gender.NULL, (String) null, (String) null, (String) null, 247) : superPassUserDetails, (i & 256) != 0 ? null : bookableSuperPassConfiguration, (i & 512) != 0 ? null : l, (i & 1024) != 0 ? -1L : j, (i & 2048) != 0 ? true : z, (i & 4096) != 0 ? null : superPassPurchaseStopsInfo, (i & 8192) != 0 ? PostPassPurchaseSuccessFlowType.ACTIVATION : postPassPurchaseSuccessFlowType, (i & 16384) != 0 ? EmptyList.f17557a : list, (i & 32768) != 0 ? null : map, (i & 65536) != 0 ? null : map2);
    }
}
