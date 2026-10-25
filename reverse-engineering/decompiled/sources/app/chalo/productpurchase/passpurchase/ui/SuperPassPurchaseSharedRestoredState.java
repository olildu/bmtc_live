package app.chalo.productpurchase.passpurchase.ui;

import app.chalo.constants.Source;
import app.chalo.models.BookableSuperPassConfiguration;
import app.chalo.models.productbooking.SuperPassPurchaseStopsInfo;
import app.chalo.providers.cityprovider.impl.data.models.app.AgencyInfoAppModel;
import app.chalo.scenes.args.PostPassPurchaseSuccessFlowType;
import app.chalo.superpass.data.models.entities.PassApplicationActionRequired;
import app.chalo.superpass.data.models.entities.PassApplicationRejectionReasons;
import app.chalo.superpass.data.models.entities.SuperPassUserDetails;
import app.chalo.userprofile.Gender;
import defpackage.gg1;
import defpackage.r30;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/SuperPassPurchaseSharedRestoredState;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class SuperPassPurchaseSharedRestoredState {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Source f8357a;
    public final AgencyInfoAppModel b;
    public final String c;
    public final PassApplicationActionRequired d;
    public final PassApplicationRejectionReasons e;
    public final String f;
    public final SuperPassUserDetails g;
    public final BookableSuperPassConfiguration h;
    public final Long i;
    public final long j;
    public final boolean k;
    public final SuperPassPurchaseStopsInfo l;
    public final PostPassPurchaseSuccessFlowType m;
    public final List n;
    public final Map o;
    public final Map p;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/SuperPassPurchaseSharedRestoredState$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productpurchase/passpurchase/ui/SuperPassPurchaseSharedRestoredState;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<SuperPassPurchaseSharedRestoredState> serializer() {
            return SuperPassPurchaseSharedRestoredState$$serializer.f8358a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        q = new Lazy[]{LazyKt.a(lazyThreadSafetyMode, new gg1(20)), null, null, LazyKt.a(lazyThreadSafetyMode, new gg1(21)), null, null, null, null, null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new gg1(22)), LazyKt.a(lazyThreadSafetyMode, new gg1(23)), LazyKt.a(lazyThreadSafetyMode, new gg1(24)), LazyKt.a(lazyThreadSafetyMode, new gg1(25))};
    }

    public SuperPassPurchaseSharedRestoredState(int i, Source source, AgencyInfoAppModel agencyInfoAppModel, String str, PassApplicationActionRequired passApplicationActionRequired, PassApplicationRejectionReasons passApplicationRejectionReasons, String str2, SuperPassUserDetails superPassUserDetails, BookableSuperPassConfiguration bookableSuperPassConfiguration, Long l, long j, boolean z, SuperPassPurchaseStopsInfo superPassPurchaseStopsInfo, PostPassPurchaseSuccessFlowType postPassPurchaseSuccessFlowType, List list, Map map, Map map2) {
        this.f8357a = (i & 1) == 0 ? Source.UNKNOWN : source;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = agencyInfoAppModel;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = PassApplicationActionRequired.FRESH;
        } else {
            this.d = passApplicationActionRequired;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = passApplicationRejectionReasons;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str2;
        }
        if ((i & 64) == 0) {
            this.g = new SuperPassUserDetails((String) null, (String) null, (String) null, Gender.NULL, (String) null, (String) null, (String) null, 247);
        } else {
            this.g = superPassUserDetails;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = bookableSuperPassConfiguration;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = l;
        }
        this.j = (i & 512) == 0 ? -1L : j;
        this.k = (i & 1024) == 0 ? true : z;
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = superPassPurchaseStopsInfo;
        }
        this.m = (i & 4096) == 0 ? PostPassPurchaseSuccessFlowType.ACTIVATION : postPassPurchaseSuccessFlowType;
        this.n = (i & 8192) == 0 ? EmptyList.f17557a : list;
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = map;
        }
        if ((i & 32768) == 0) {
            this.p = null;
        } else {
            this.p = map2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperPassPurchaseSharedRestoredState)) {
            return false;
        }
        SuperPassPurchaseSharedRestoredState superPassPurchaseSharedRestoredState = (SuperPassPurchaseSharedRestoredState) obj;
        return this.f8357a == superPassPurchaseSharedRestoredState.f8357a && Intrinsics.d(this.b, superPassPurchaseSharedRestoredState.b) && Intrinsics.d(this.c, superPassPurchaseSharedRestoredState.c) && this.d == superPassPurchaseSharedRestoredState.d && Intrinsics.d(this.e, superPassPurchaseSharedRestoredState.e) && Intrinsics.d(this.f, superPassPurchaseSharedRestoredState.f) && Intrinsics.d(this.g, superPassPurchaseSharedRestoredState.g) && Intrinsics.d(this.h, superPassPurchaseSharedRestoredState.h) && Intrinsics.d(this.i, superPassPurchaseSharedRestoredState.i) && this.j == superPassPurchaseSharedRestoredState.j && this.k == superPassPurchaseSharedRestoredState.k && Intrinsics.d(this.l, superPassPurchaseSharedRestoredState.l) && this.m == superPassPurchaseSharedRestoredState.m && Intrinsics.d(this.n, superPassPurchaseSharedRestoredState.n) && Intrinsics.d(this.o, superPassPurchaseSharedRestoredState.o) && Intrinsics.d(this.p, superPassPurchaseSharedRestoredState.p);
    }

    public final int hashCode() {
        int iHashCode = this.f8357a.hashCode() * 31;
        AgencyInfoAppModel agencyInfoAppModel = this.b;
        int iHashCode2 = (iHashCode + (agencyInfoAppModel == null ? 0 : agencyInfoAppModel.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (this.d.hashCode() + ((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        PassApplicationRejectionReasons passApplicationRejectionReasons = this.e;
        int iHashCode4 = (iHashCode3 + (passApplicationRejectionReasons == null ? 0 : passApplicationRejectionReasons.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode5 = (this.g.hashCode() + ((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        BookableSuperPassConfiguration bookableSuperPassConfiguration = this.h;
        int iHashCode6 = (iHashCode5 + (bookableSuperPassConfiguration == null ? 0 : bookableSuperPassConfiguration.hashCode())) * 31;
        Long l = this.i;
        int iHashCode7 = l == null ? 0 : l.hashCode();
        long j = this.j;
        int i = (((((iHashCode6 + iHashCode7) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + (this.k ? 1231 : 1237)) * 31;
        SuperPassPurchaseStopsInfo superPassPurchaseStopsInfo = this.l;
        int iB = r30.b((this.m.hashCode() + ((i + (superPassPurchaseStopsInfo == null ? 0 : superPassPurchaseStopsInfo.hashCode())) * 31)) * 31, 31, this.n);
        Map map = this.o;
        int iHashCode8 = (iB + (map == null ? 0 : map.hashCode())) * 31;
        Map map2 = this.p;
        return iHashCode8 + (map2 != null ? map2.hashCode() : 0);
    }

    public final String toString() {
        return "SuperPassPurchaseSharedRestoredState(source=" + this.f8357a + ", agency=" + this.b + ", purchaseFlowType=" + this.c + ", passApplicationActionRequired=" + this.d + ", passApplicationRejectionReasons=" + this.e + ", passIdForRenew=" + this.f + ", userDetails=" + this.g + ", bookableSuperPassConfiguration=" + this.h + ", passStartTime=" + this.i + ", passVerificationExpiryTime=" + this.j + ", isAgencyAvailable=" + this.k + ", purchaseStopsInfo=" + this.l + ", postPurchaseFlowType=" + this.m + ", proofDocumentPropsList=" + this.n + ", proofUploadDetailsMap=" + this.o + ", preUploadedProofsMap=" + this.p + ")";
    }

    public SuperPassPurchaseSharedRestoredState(Source source, AgencyInfoAppModel agencyInfoAppModel, String str, PassApplicationActionRequired passApplicationActionRequired, PassApplicationRejectionReasons passApplicationRejectionReasons, String str2, SuperPassUserDetails userDetails, BookableSuperPassConfiguration bookableSuperPassConfiguration, Long l, long j, boolean z, SuperPassPurchaseStopsInfo superPassPurchaseStopsInfo, PostPassPurchaseSuccessFlowType postPurchaseFlowType, List proofDocumentPropsList, LinkedHashMap linkedHashMap, Map map) {
        Intrinsics.i(source, "source");
        Intrinsics.i(passApplicationActionRequired, "passApplicationActionRequired");
        Intrinsics.i(userDetails, "userDetails");
        Intrinsics.i(postPurchaseFlowType, "postPurchaseFlowType");
        Intrinsics.i(proofDocumentPropsList, "proofDocumentPropsList");
        this.f8357a = source;
        this.b = agencyInfoAppModel;
        this.c = str;
        this.d = passApplicationActionRequired;
        this.e = passApplicationRejectionReasons;
        this.f = str2;
        this.g = userDetails;
        this.h = bookableSuperPassConfiguration;
        this.i = l;
        this.j = j;
        this.k = z;
        this.l = superPassPurchaseStopsInfo;
        this.m = postPurchaseFlowType;
        this.n = proofDocumentPropsList;
        this.o = linkedHashMap;
        this.p = map;
    }
}
