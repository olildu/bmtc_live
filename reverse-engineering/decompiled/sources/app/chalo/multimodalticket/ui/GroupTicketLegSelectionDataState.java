package app.chalo.multimodalticket.ui;

import defpackage.d;
import defpackage.nf1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/ui/GroupTicketLegSelectionDataState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GroupTicketLegSelectionDataState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GroupTicketJourneySelectionMode f5931a;
    public final boolean b;
    public final GroupTicketLegSelectionBottomSheetDataStateType c;
    public final String d;
    public final Map e;
    public final Map f;
    public final int g;
    public final String h;

    public GroupTicketLegSelectionDataState(GroupTicketJourneySelectionMode selectedJourneyMode, boolean z, GroupTicketLegSelectionBottomSheetDataStateType bottomSheetState, String str, Map map, Map map2, int i, String str2) {
        Intrinsics.i(selectedJourneyMode, "selectedJourneyMode");
        Intrinsics.i(bottomSheetState, "bottomSheetState");
        this.f5931a = selectedJourneyMode;
        this.b = z;
        this.c = bottomSheetState;
        this.d = str;
        this.e = map;
        this.f = map2;
        this.g = i;
        this.h = str2;
    }

    public static GroupTicketLegSelectionDataState a(GroupTicketLegSelectionDataState groupTicketLegSelectionDataState, GroupTicketJourneySelectionMode groupTicketJourneySelectionMode, boolean z, GroupTicketLegSelectionBottomSheetDataStateType groupTicketLegSelectionBottomSheetDataStateType, String str, LinkedHashMap linkedHashMap, Map map, int i, String str2, int i2) {
        if ((i2 & 1) != 0) {
            groupTicketJourneySelectionMode = groupTicketLegSelectionDataState.f5931a;
        }
        GroupTicketJourneySelectionMode selectedJourneyMode = groupTicketJourneySelectionMode;
        if ((i2 & 2) != 0) {
            z = groupTicketLegSelectionDataState.b;
        }
        boolean z2 = z;
        if ((i2 & 4) != 0) {
            groupTicketLegSelectionBottomSheetDataStateType = groupTicketLegSelectionDataState.c;
        }
        GroupTicketLegSelectionBottomSheetDataStateType bottomSheetState = groupTicketLegSelectionBottomSheetDataStateType;
        if ((i2 & 8) != 0) {
            str = groupTicketLegSelectionDataState.d;
        }
        String journeyConfigId = str;
        Map map2 = linkedHashMap;
        if ((i2 & 16) != 0) {
            map2 = groupTicketLegSelectionDataState.e;
        }
        Map map3 = map2;
        if ((i2 & 32) != 0) {
            map = groupTicketLegSelectionDataState.f;
        }
        Map map4 = map;
        int i3 = (i2 & 64) != 0 ? groupTicketLegSelectionDataState.g : i;
        String transactionId = (i2 & 128) != 0 ? groupTicketLegSelectionDataState.h : str2;
        groupTicketLegSelectionDataState.getClass();
        Intrinsics.i(selectedJourneyMode, "selectedJourneyMode");
        Intrinsics.i(bottomSheetState, "bottomSheetState");
        Intrinsics.i(journeyConfigId, "journeyConfigId");
        Intrinsics.i(transactionId, "transactionId");
        return new GroupTicketLegSelectionDataState(selectedJourneyMode, z2, bottomSheetState, journeyConfigId, map3, map4, i3, transactionId);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupTicketLegSelectionDataState)) {
            return false;
        }
        GroupTicketLegSelectionDataState groupTicketLegSelectionDataState = (GroupTicketLegSelectionDataState) obj;
        return this.f5931a == groupTicketLegSelectionDataState.f5931a && this.b == groupTicketLegSelectionDataState.b && Intrinsics.d(this.c, groupTicketLegSelectionDataState.c) && Intrinsics.d(this.d, groupTicketLegSelectionDataState.d) && Intrinsics.d(this.e, groupTicketLegSelectionDataState.e) && Intrinsics.d(this.f, groupTicketLegSelectionDataState.f) && this.g == groupTicketLegSelectionDataState.g && Intrinsics.d(this.h, groupTicketLegSelectionDataState.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((d.f(this.f, d.f(this.e, nf1.e((this.c.hashCode() + (((this.f5931a.hashCode() * 31) + (this.b ? 1231 : 1237)) * 31)) * 31, 31, this.d), 31), 31) + this.g) * 31);
    }

    public final String toString() {
        return "GroupTicketLegSelectionDataState(selectedJourneyMode=" + this.f5931a + ", shouldShowLoader=" + this.b + ", bottomSheetState=" + this.c + ", journeyConfigId=" + this.d + ", selectableStepsMap=" + this.e + ", passengerSelectionMap=" + this.f + ", maxTotalIssueCount=" + this.g + ", transactionId=" + this.h + ")";
    }
}
