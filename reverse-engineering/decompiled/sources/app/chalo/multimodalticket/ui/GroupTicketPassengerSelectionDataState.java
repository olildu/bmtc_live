package app.chalo.multimodalticket.ui;

import app.chalo.multimodalticket.data.model.app.GroupTicketCategoryFareDetailsAppModel;
import defpackage.b3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/ui/GroupTicketPassengerSelectionDataState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GroupTicketPassengerSelectionDataState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GroupTicketCategoryFareDetailsAppModel f5947a;
    public final boolean b;
    public final int c;
    public final boolean d;
    public final boolean e;

    public GroupTicketPassengerSelectionDataState(GroupTicketCategoryFareDetailsAppModel groupTicketCategoryFareDetailsAppModel, boolean z, int i, boolean z2, boolean z3) {
        this.f5947a = groupTicketCategoryFareDetailsAppModel;
        this.b = z;
        this.c = i;
        this.d = z2;
        this.e = z3;
    }

    public static GroupTicketPassengerSelectionDataState a(GroupTicketPassengerSelectionDataState groupTicketPassengerSelectionDataState, boolean z, int i, boolean z2, boolean z3, int i2) {
        boolean z4 = z;
        GroupTicketCategoryFareDetailsAppModel groupTicketCategoryFareDetailsAppModel = groupTicketPassengerSelectionDataState.f5947a;
        if ((i2 & 2) != 0) {
            z4 = groupTicketPassengerSelectionDataState.b;
        }
        if ((i2 & 4) != 0) {
            i = groupTicketPassengerSelectionDataState.c;
        }
        if ((i2 & 8) != 0) {
            z2 = groupTicketPassengerSelectionDataState.d;
        }
        if ((i2 & 16) != 0) {
            z3 = groupTicketPassengerSelectionDataState.e;
        }
        boolean z5 = z3;
        groupTicketPassengerSelectionDataState.getClass();
        boolean z6 = z2;
        return new GroupTicketPassengerSelectionDataState(groupTicketCategoryFareDetailsAppModel, z4, i, z6, z5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupTicketPassengerSelectionDataState)) {
            return false;
        }
        GroupTicketPassengerSelectionDataState groupTicketPassengerSelectionDataState = (GroupTicketPassengerSelectionDataState) obj;
        return Intrinsics.d(this.f5947a, groupTicketPassengerSelectionDataState.f5947a) && this.b == groupTicketPassengerSelectionDataState.b && this.c == groupTicketPassengerSelectionDataState.c && this.d == groupTicketPassengerSelectionDataState.d && this.e == groupTicketPassengerSelectionDataState.e;
    }

    public final int hashCode() {
        return (((((((this.f5947a.hashCode() * 31) + (this.b ? 1231 : 1237)) * 31) + this.c) * 31) + (this.d ? 1231 : 1237)) * 31) + (this.e ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupTicketPassengerSelectionDataState(categoryFareDetails=");
        sb.append(this.f5947a);
        sb.append(", shouldShowFareBreakUp=");
        sb.append(this.b);
        sb.append(", selectedCount=");
        sb.append(this.c);
        sb.append(", isIncrementPossible=");
        sb.append(this.d);
        sb.append(", isDecrementPossible=");
        return b3.g(")", sb, this.e);
    }
}
