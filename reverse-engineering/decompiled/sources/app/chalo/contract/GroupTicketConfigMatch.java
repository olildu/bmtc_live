package app.chalo.contract;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/contract/GroupTicketConfigMatch;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GroupTicketConfigMatch {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1946a;
    public final ArrayList b;

    public GroupTicketConfigMatch(String journeyConfigId, ArrayList arrayList) {
        Intrinsics.i(journeyConfigId, "journeyConfigId");
        this.f1946a = journeyConfigId;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupTicketConfigMatch)) {
            return false;
        }
        GroupTicketConfigMatch groupTicketConfigMatch = (GroupTicketConfigMatch) obj;
        return Intrinsics.d(this.f1946a, groupTicketConfigMatch.f1946a) && this.b.equals(groupTicketConfigMatch.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f1946a.hashCode() * 31);
    }

    public final String toString() {
        return "GroupTicketConfigMatch(journeyConfigId=" + this.f1946a + ", eligibleSubProducts=" + this.b + ")";
    }
}
