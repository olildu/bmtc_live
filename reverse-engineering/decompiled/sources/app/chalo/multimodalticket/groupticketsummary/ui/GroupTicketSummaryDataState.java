package app.chalo.multimodalticket.groupticketsummary.ui;

import app.chalo.multimodalticket.data.model.app.GroupTicketSummaryResponseAppModel;
import app.chalo.scenes.args.GroupTicketBookingSummaryArgs;
import defpackage.b3;
import defpackage.z40;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/groupticketsummary/ui/GroupTicketSummaryDataState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GroupTicketSummaryDataState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f5902a;
    public final GroupTicketBookingSummaryArgs b;
    public final GroupTicketSummaryResponseAppModel c;
    public final Set d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public GroupTicketSummaryDataState(List tncList, GroupTicketBookingSummaryArgs groupTicketBookingSummaryArgs, GroupTicketSummaryResponseAppModel groupTicketSummaryResponseAppModel, Set expandedLegSequences, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        Intrinsics.i(tncList, "tncList");
        Intrinsics.i(expandedLegSequences, "expandedLegSequences");
        this.f5902a = tncList;
        this.b = groupTicketBookingSummaryArgs;
        this.c = groupTicketSummaryResponseAppModel;
        this.d = expandedLegSequences;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = z5;
    }

    public static GroupTicketSummaryDataState a(GroupTicketSummaryDataState groupTicketSummaryDataState, List list, GroupTicketBookingSummaryArgs groupTicketBookingSummaryArgs, GroupTicketSummaryResponseAppModel groupTicketSummaryResponseAppModel, LinkedHashSet linkedHashSet, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i) {
        if ((i & 1) != 0) {
            list = groupTicketSummaryDataState.f5902a;
        }
        List tncList = list;
        if ((i & 2) != 0) {
            groupTicketBookingSummaryArgs = groupTicketSummaryDataState.b;
        }
        GroupTicketBookingSummaryArgs groupTicketBookingSummaryArgs2 = groupTicketBookingSummaryArgs;
        if ((i & 4) != 0) {
            groupTicketSummaryResponseAppModel = groupTicketSummaryDataState.c;
        }
        GroupTicketSummaryResponseAppModel groupTicketSummaryResponseAppModel2 = groupTicketSummaryResponseAppModel;
        Set set = linkedHashSet;
        if ((i & 8) != 0) {
            set = groupTicketSummaryDataState.d;
        }
        Set expandedLegSequences = set;
        if ((i & 16) != 0) {
            z = groupTicketSummaryDataState.e;
        }
        boolean z6 = z;
        boolean z7 = (i & 32) != 0 ? groupTicketSummaryDataState.f : z2;
        boolean z8 = (i & 64) != 0 ? groupTicketSummaryDataState.g : z3;
        boolean z9 = (i & 128) != 0 ? groupTicketSummaryDataState.h : z4;
        boolean z10 = (i & 256) != 0 ? groupTicketSummaryDataState.i : z5;
        groupTicketSummaryDataState.getClass();
        Intrinsics.i(tncList, "tncList");
        Intrinsics.i(expandedLegSequences, "expandedLegSequences");
        return new GroupTicketSummaryDataState(tncList, groupTicketBookingSummaryArgs2, groupTicketSummaryResponseAppModel2, expandedLegSequences, z6, z7, z8, z9, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupTicketSummaryDataState)) {
            return false;
        }
        GroupTicketSummaryDataState groupTicketSummaryDataState = (GroupTicketSummaryDataState) obj;
        return Intrinsics.d(this.f5902a, groupTicketSummaryDataState.f5902a) && Intrinsics.d(this.b, groupTicketSummaryDataState.b) && Intrinsics.d(this.c, groupTicketSummaryDataState.c) && Intrinsics.d(this.d, groupTicketSummaryDataState.d) && this.e == groupTicketSummaryDataState.e && this.f == groupTicketSummaryDataState.f && this.g == groupTicketSummaryDataState.g && this.h == groupTicketSummaryDataState.h && this.i == groupTicketSummaryDataState.i;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f5902a.hashCode() * 31)) * 31;
        GroupTicketSummaryResponseAppModel groupTicketSummaryResponseAppModel = this.c;
        return ((((((((((this.d.hashCode() + ((iHashCode + (groupTicketSummaryResponseAppModel == null ? 0 : groupTicketSummaryResponseAppModel.hashCode())) * 31)) * 31) + (this.e ? 1231 : 1237)) * 31) + (this.f ? 1231 : 1237)) * 31) + (this.g ? 1231 : 1237)) * 31) + (this.h ? 1231 : 1237)) * 31) + (this.i ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupTicketSummaryDataState(tncList=");
        sb.append(this.f5902a);
        sb.append(", screenArgs=");
        sb.append(this.b);
        sb.append(", summary=");
        sb.append(this.c);
        sb.append(", expandedLegSequences=");
        sb.append(this.d);
        sb.append(", showTripDetails=");
        z40.r(sb, this.e, ", showPriceDetailsShimmer=", this.f, ", showPriceDetailsFailedSnackbar=");
        z40.r(sb, this.g, ", showTncDialog=", this.h, ", showLoadingDialog=");
        return b3.g(")", sb, this.i);
    }
}
