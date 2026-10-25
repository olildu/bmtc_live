package app.chalo.premiumbus.ui.faredetails.contract;

import app.chalo.instantticket.data.model.app.response.PassengerDetailAppModel;
import app.chalo.instantticket.data.model.app.response.PassengerSelectionPolicy;
import app.chalo.premiumbus.data.models.app.PremiumBusPassUpsellAppModel;
import defpackage.d;
import defpackage.nf1;
import defpackage.r30;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsDataState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumBusFareDetailsDataState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f7578a;
    public final boolean b;
    public final PremiumBusFareDetailsError c;
    public final long d;
    public final List e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final String i;
    public final List j;
    public final List k;
    public final Map l;
    public final PassengerSelectionPolicy m;
    public final String n;
    public final int o;
    public final PremiumBusPassUpsellAppModel p;
    public final PremiumBusFareDetailsBottomSheetType q;
    public final String r;
    public final boolean s;
    public final PremiumBusFareDetailsSharedContext t;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7579a;

        static {
            int[] iArr = new int[PassengerSelectionPolicy.values().length];
            try {
                iArr[PassengerSelectionPolicy.Multiple.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PassengerSelectionPolicy.Single.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f7579a = iArr;
        }
    }

    public PremiumBusFareDetailsDataState(boolean z, boolean z2, PremiumBusFareDetailsError premiumBusFareDetailsError, long j, List appliedRules, boolean z3, boolean z4, boolean z5, String str, List tncList, List passengerDetails, Map map, PassengerSelectionPolicy passengerSelectionPolicy, String str2, int i, PremiumBusPassUpsellAppModel premiumBusPassUpsellAppModel, PremiumBusFareDetailsBottomSheetType premiumBusFareDetailsBottomSheetType, String str3, boolean z6, PremiumBusFareDetailsSharedContext premiumBusFareDetailsSharedContext) {
        Intrinsics.i(appliedRules, "appliedRules");
        Intrinsics.i(tncList, "tncList");
        Intrinsics.i(passengerDetails, "passengerDetails");
        Intrinsics.i(passengerSelectionPolicy, "passengerSelectionPolicy");
        this.f7578a = z;
        this.b = z2;
        this.c = premiumBusFareDetailsError;
        this.d = j;
        this.e = appliedRules;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = str;
        this.j = tncList;
        this.k = passengerDetails;
        this.l = map;
        this.m = passengerSelectionPolicy;
        this.n = str2;
        this.o = i;
        this.p = premiumBusPassUpsellAppModel;
        this.q = premiumBusFareDetailsBottomSheetType;
        this.r = str3;
        this.s = z6;
        this.t = premiumBusFareDetailsSharedContext;
    }

    public static PremiumBusFareDetailsDataState a(PremiumBusFareDetailsDataState premiumBusFareDetailsDataState, boolean z, PremiumBusFareDetailsError premiumBusFareDetailsError, long j, List list, boolean z2, boolean z3, boolean z4, String str, List list2, List list3, Map map, PassengerSelectionPolicy passengerSelectionPolicy, String str2, int i, PremiumBusPassUpsellAppModel premiumBusPassUpsellAppModel, PremiumBusFareDetailsBottomSheetType premiumBusFareDetailsBottomSheetType, String str3, boolean z5, PremiumBusFareDetailsSharedContext premiumBusFareDetailsSharedContext, int i2) {
        boolean z6 = (i2 & 1) != 0 ? premiumBusFareDetailsDataState.f7578a : z;
        boolean z7 = (i2 & 2) != 0 ? premiumBusFareDetailsDataState.b : true;
        PremiumBusFareDetailsError premiumBusFareDetailsError2 = (i2 & 4) != 0 ? premiumBusFareDetailsDataState.c : premiumBusFareDetailsError;
        long j2 = (i2 & 8) != 0 ? premiumBusFareDetailsDataState.d : j;
        List appliedRules = (i2 & 16) != 0 ? premiumBusFareDetailsDataState.e : list;
        boolean z8 = (i2 & 32) != 0 ? premiumBusFareDetailsDataState.f : z2;
        boolean z9 = (i2 & 64) != 0 ? premiumBusFareDetailsDataState.g : z3;
        boolean z10 = (i2 & 128) != 0 ? premiumBusFareDetailsDataState.h : z4;
        String str4 = (i2 & 256) != 0 ? premiumBusFareDetailsDataState.i : str;
        List tncList = (i2 & 512) != 0 ? premiumBusFareDetailsDataState.j : list2;
        List passengerDetails = (i2 & 1024) != 0 ? premiumBusFareDetailsDataState.k : list3;
        Map passengerCounts = (i2 & 2048) != 0 ? premiumBusFareDetailsDataState.l : map;
        PassengerSelectionPolicy passengerSelectionPolicy2 = (i2 & 4096) != 0 ? premiumBusFareDetailsDataState.m : passengerSelectionPolicy;
        boolean z11 = z6;
        String str5 = (i2 & 8192) != 0 ? premiumBusFareDetailsDataState.n : str2;
        int i3 = (i2 & 16384) != 0 ? premiumBusFareDetailsDataState.o : i;
        PremiumBusPassUpsellAppModel premiumBusPassUpsellAppModel2 = (i2 & 32768) != 0 ? premiumBusFareDetailsDataState.p : premiumBusPassUpsellAppModel;
        PremiumBusFareDetailsBottomSheetType premiumBusFareDetailsBottomSheetType2 = (i2 & 65536) != 0 ? premiumBusFareDetailsDataState.q : premiumBusFareDetailsBottomSheetType;
        String str6 = (i2 & 131072) != 0 ? premiumBusFareDetailsDataState.r : str3;
        boolean z12 = (i2 & 262144) != 0 ? premiumBusFareDetailsDataState.s : z5;
        PremiumBusFareDetailsSharedContext premiumBusFareDetailsSharedContext2 = (i2 & 524288) != 0 ? premiumBusFareDetailsDataState.t : premiumBusFareDetailsSharedContext;
        premiumBusFareDetailsDataState.getClass();
        Intrinsics.i(appliedRules, "appliedRules");
        Intrinsics.i(tncList, "tncList");
        Intrinsics.i(passengerDetails, "passengerDetails");
        Intrinsics.i(passengerCounts, "passengerCounts");
        Intrinsics.i(passengerSelectionPolicy2, "passengerSelectionPolicy");
        return new PremiumBusFareDetailsDataState(z11, z7, premiumBusFareDetailsError2, j2, appliedRules, z8, z9, z10, str4, tncList, passengerDetails, passengerCounts, passengerSelectionPolicy2, str5, i3, premiumBusPassUpsellAppModel2, premiumBusFareDetailsBottomSheetType2, str6, z12, premiumBusFareDetailsSharedContext2);
    }

    public final Map b() {
        Map mapH;
        int i = WhenMappings.f7579a[this.m.ordinal()];
        Map map = this.l;
        if (i == 1) {
            return map;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        String str = this.n;
        if (str != null) {
            Integer num = (Integer) map.get(str);
            mapH = MapsKt.h(new Pair(str, Integer.valueOf(num != null ? num.intValue() : 0)));
        } else {
            mapH = null;
        }
        return mapH == null ? MapsKt.d() : mapH;
    }

    public final boolean c() {
        return this.f || this.g;
    }

    public final LinkedHashMap d() {
        List list = this.k;
        int iG = MapsKt.g(CollectionsKt.v(list, 10));
        if (iG < 16) {
            iG = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iG);
        for (Object obj : list) {
            linkedHashMap.put(((PassengerDetailAppModel) obj).d, obj);
        }
        return linkedHashMap;
    }

    public final boolean e() {
        return this.b && this.c == null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusFareDetailsDataState)) {
            return false;
        }
        PremiumBusFareDetailsDataState premiumBusFareDetailsDataState = (PremiumBusFareDetailsDataState) obj;
        return this.f7578a == premiumBusFareDetailsDataState.f7578a && this.b == premiumBusFareDetailsDataState.b && Intrinsics.d(this.c, premiumBusFareDetailsDataState.c) && this.d == premiumBusFareDetailsDataState.d && Intrinsics.d(this.e, premiumBusFareDetailsDataState.e) && this.f == premiumBusFareDetailsDataState.f && this.g == premiumBusFareDetailsDataState.g && this.h == premiumBusFareDetailsDataState.h && Intrinsics.d(this.i, premiumBusFareDetailsDataState.i) && Intrinsics.d(this.j, premiumBusFareDetailsDataState.j) && Intrinsics.d(this.k, premiumBusFareDetailsDataState.k) && Intrinsics.d(this.l, premiumBusFareDetailsDataState.l) && this.m == premiumBusFareDetailsDataState.m && Intrinsics.d(this.n, premiumBusFareDetailsDataState.n) && this.o == premiumBusFareDetailsDataState.o && Intrinsics.d(this.p, premiumBusFareDetailsDataState.p) && Intrinsics.d(this.q, premiumBusFareDetailsDataState.q) && Intrinsics.d(this.r, premiumBusFareDetailsDataState.r) && this.s == premiumBusFareDetailsDataState.s && Intrinsics.d(this.t, premiumBusFareDetailsDataState.t);
    }

    public final int hashCode() {
        int i = (((this.f7578a ? 1231 : 1237) * 31) + (this.b ? 1231 : 1237)) * 31;
        PremiumBusFareDetailsError premiumBusFareDetailsError = this.c;
        int iHashCode = premiumBusFareDetailsError == null ? 0 : premiumBusFareDetailsError.hashCode();
        long j = this.d;
        int iB = (((((r30.b((((i + iHashCode) * 31) + ((int) (j ^ (j >>> 32)))) * 31, 31, this.e) + (this.f ? 1231 : 1237)) * 31) + (this.g ? 1231 : 1237)) * 31) + (this.h ? 1231 : 1237)) * 31;
        String str = this.i;
        int iHashCode2 = (this.m.hashCode() + d.f(this.l, r30.b(r30.b((iB + (str == null ? 0 : str.hashCode())) * 31, 31, this.j), 31, this.k), 31)) * 31;
        String str2 = this.n;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.o) * 31;
        PremiumBusPassUpsellAppModel premiumBusPassUpsellAppModel = this.p;
        int iHashCode4 = (iHashCode3 + (premiumBusPassUpsellAppModel == null ? 0 : premiumBusPassUpsellAppModel.hashCode())) * 31;
        PremiumBusFareDetailsBottomSheetType premiumBusFareDetailsBottomSheetType = this.q;
        int iHashCode5 = (iHashCode4 + (premiumBusFareDetailsBottomSheetType == null ? 0 : premiumBusFareDetailsBottomSheetType.hashCode())) * 31;
        String str3 = this.r;
        int iHashCode6 = (((iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31) + (this.s ? 1231 : 1237)) * 31;
        PremiumBusFareDetailsSharedContext premiumBusFareDetailsSharedContext = this.t;
        return iHashCode6 + (premiumBusFareDetailsSharedContext != null ? premiumBusFareDetailsSharedContext.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbR = nf1.r("PremiumBusFareDetailsDataState(isLoading=", ", hasFirstFareOutcome=", ", error=", this.f7578a, this.b);
        sbR.append(this.c);
        sbR.append(", totalPayableAmountInSubcurrency=");
        sbR.append(this.d);
        sbR.append(", appliedRules=");
        sbR.append(this.e);
        sbR.append(", orderCreationInProgress=");
        sbR.append(this.f);
        sbR.append(", reservationInProgress=");
        sbR.append(this.g);
        sbR.append(", showLoadingDialogue=");
        sbR.append(this.h);
        sbR.append(", fareNote=");
        sbR.append(this.i);
        sbR.append(", tncList=");
        sbR.append(this.j);
        sbR.append(", passengerDetails=");
        sbR.append(this.k);
        sbR.append(", passengerCounts=");
        sbR.append(this.l);
        sbR.append(", passengerSelectionPolicy=");
        sbR.append(this.m);
        sbR.append(", selectedPassengerCategory=");
        sbR.append(this.n);
        sbR.append(", totalAvailableSeats=");
        sbR.append(this.o);
        sbR.append(", passUpsell=");
        sbR.append(this.p);
        sbR.append(", bottomSheetType=");
        sbR.append(this.q);
        sbR.append(", orderCreationErrorDialogMessage=");
        sbR.append(this.r);
        sbR.append(", isPaymentBtnClickProcessing=");
        sbR.append(this.s);
        sbR.append(", sharedContext=");
        sbR.append(this.t);
        sbR.append(")");
        return sbR.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PremiumBusFareDetailsDataState() {
        EmptyList emptyList = EmptyList.f17557a;
        this(true, false, null, 0L, emptyList, false, false, false, null, emptyList, emptyList, MapsKt.d(), PassengerSelectionPolicy.Multiple, null, 0, null, null, null, false, null);
    }
}
