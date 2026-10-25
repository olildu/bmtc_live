package app.chalo.premiumbus.ui.slotselection;

import app.chalo.premiumbus.domain.ODPairsAndRespectiveSlotsBetweenStops;
import defpackage.b3;
import defpackage.nf1;
import defpackage.xs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/PBODPairWithSlotSectionListUiModel;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PBODPairWithSlotSectionListUiModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7820a;
    public final String b;
    public final ODPairsAndRespectiveSlotsBetweenStops c;
    public final long d;
    public final long e;
    public final Long f;
    public final boolean g;
    public final boolean h;
    public final int i;
    public final int j;
    public final boolean k;
    public final boolean l;

    public /* synthetic */ PBODPairWithSlotSectionListUiModel(long j, String str, ODPairsAndRespectiveSlotsBetweenStops oDPairsAndRespectiveSlotsBetweenStops, long j2, long j3, Long l, boolean z, int i) {
        this(j, str, oDPairsAndRespectiveSlotsBetweenStops, j2, j3, (i & 32) != 0 ? null : l, false, z, 0, 0, true, false);
    }

    public static PBODPairWithSlotSectionListUiModel a(PBODPairWithSlotSectionListUiModel pBODPairWithSlotSectionListUiModel, ODPairsAndRespectiveSlotsBetweenStops oDPairsAndRespectiveSlotsBetweenStops, Long l, boolean z, int i, int i2, boolean z2, boolean z3, int i3) {
        long j = pBODPairWithSlotSectionListUiModel.f7820a;
        String sectionTitle = pBODPairWithSlotSectionListUiModel.b;
        ODPairsAndRespectiveSlotsBetweenStops oDPairsAndRespectiveSlotsBetweenStops2 = (i3 & 4) != 0 ? pBODPairWithSlotSectionListUiModel.c : oDPairsAndRespectiveSlotsBetweenStops;
        long j2 = pBODPairWithSlotSectionListUiModel.d;
        long j3 = pBODPairWithSlotSectionListUiModel.e;
        Long l2 = (i3 & 32) != 0 ? pBODPairWithSlotSectionListUiModel.f : l;
        boolean z4 = (i3 & 64) != 0 ? pBODPairWithSlotSectionListUiModel.g : z;
        boolean z5 = pBODPairWithSlotSectionListUiModel.h;
        int i4 = (i3 & 1024) != 0 ? pBODPairWithSlotSectionListUiModel.i : i;
        int i5 = (i3 & 2048) != 0 ? pBODPairWithSlotSectionListUiModel.j : i2;
        boolean z6 = (i3 & 4096) != 0 ? pBODPairWithSlotSectionListUiModel.k : z2;
        boolean z7 = (i3 & 8192) != 0 ? pBODPairWithSlotSectionListUiModel.l : z3;
        Intrinsics.i(sectionTitle, "sectionTitle");
        return new PBODPairWithSlotSectionListUiModel(j, sectionTitle, oDPairsAndRespectiveSlotsBetweenStops2, j2, j3, l2, z4, z5, i4, i5, z6, z7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PBODPairWithSlotSectionListUiModel)) {
            return false;
        }
        PBODPairWithSlotSectionListUiModel pBODPairWithSlotSectionListUiModel = (PBODPairWithSlotSectionListUiModel) obj;
        return this.f7820a == pBODPairWithSlotSectionListUiModel.f7820a && Intrinsics.d(this.b, pBODPairWithSlotSectionListUiModel.b) && Intrinsics.d(this.c, pBODPairWithSlotSectionListUiModel.c) && this.d == pBODPairWithSlotSectionListUiModel.d && this.e == pBODPairWithSlotSectionListUiModel.e && Intrinsics.d(this.f, pBODPairWithSlotSectionListUiModel.f) && this.g == pBODPairWithSlotSectionListUiModel.g && this.h == pBODPairWithSlotSectionListUiModel.h && this.i == pBODPairWithSlotSectionListUiModel.i && this.j == pBODPairWithSlotSectionListUiModel.j && this.k == pBODPairWithSlotSectionListUiModel.k && this.l == pBODPairWithSlotSectionListUiModel.l;
    }

    public final int hashCode() {
        long j = this.f7820a;
        int iE = nf1.e(((int) (j ^ (j >>> 32))) * 31, 31, this.b);
        ODPairsAndRespectiveSlotsBetweenStops oDPairsAndRespectiveSlotsBetweenStops = this.c;
        int iHashCode = (iE + (oDPairsAndRespectiveSlotsBetweenStops == null ? 0 : oDPairsAndRespectiveSlotsBetweenStops.hashCode())) * 31;
        long j2 = this.d;
        int i = (iHashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.e;
        int i2 = (i + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        Long l = this.f;
        return ((((((((((((((((i2 + (l != null ? l.hashCode() : 0)) * 31) + (this.g ? 1231 : 1237)) * 31) + (this.h ? 1231 : 1237)) * 31) + 1237) * 31) + 1237) * 31) + this.i) * 31) + this.j) * 31) + (this.k ? 1231 : 1237)) * 31) + (this.l ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PBODPairWithSlotSectionListUiModel(sectionId=");
        sb.append(this.f7820a);
        sb.append(", sectionTitle=");
        sb.append(this.b);
        sb.append(", odPairAndSlotsInfo=");
        sb.append(this.c);
        sb.append(", minSlotTimeAllowed=");
        sb.append(this.d);
        xs.r(this.e, ", maxSlotTimeAllowed=", ", preferredTimeForSlotSelection=", sb);
        sb.append(this.f);
        sb.append(", showPassPurchaseNudgeCard=");
        sb.append(this.g);
        sb.append(", isValidSectionForTicketPurchase=");
        sb.append(this.h);
        sb.append(", hasMoreODPairs=false, isLoadingMoreODPairs=false, currentPage=");
        sb.append(this.i);
        sb.append(", totalPages=");
        sb.append(this.j);
        sb.append(", hasMorePages=");
        sb.append(this.k);
        sb.append(", isFetchingMoreSlots=");
        return b3.g(")", sb, this.l);
    }

    public PBODPairWithSlotSectionListUiModel(long j, String sectionTitle, ODPairsAndRespectiveSlotsBetweenStops oDPairsAndRespectiveSlotsBetweenStops, long j2, long j3, Long l, boolean z, boolean z2, int i, int i2, boolean z3, boolean z4) {
        Intrinsics.i(sectionTitle, "sectionTitle");
        this.f7820a = j;
        this.b = sectionTitle;
        this.c = oDPairsAndRespectiveSlotsBetweenStops;
        this.d = j2;
        this.e = j3;
        this.f = l;
        this.g = z;
        this.h = z2;
        this.i = i;
        this.j = i2;
        this.k = z3;
        this.l = z4;
    }
}
