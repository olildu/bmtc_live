package app.chalo.livetracking.routedetails.data.model.ui;

import defpackage.cb0;
import defpackage.r30;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/routedetails/data/model/ui/TimeTableUiModel;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TimeTableUiModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f4422a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public TimeTableUiModel(ArrayList arrayList, int i, String str, String str2, String str3, String str4) {
        this.f4422a = arrayList;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeTableUiModel)) {
            return false;
        }
        TimeTableUiModel timeTableUiModel = (TimeTableUiModel) obj;
        return this.f4422a.equals(timeTableUiModel.f4422a) && this.b == timeTableUiModel.b && Intrinsics.d(this.c, timeTableUiModel.c) && Intrinsics.d(this.d, timeTableUiModel.d) && Intrinsics.d(this.e, timeTableUiModel.e) && Intrinsics.d(this.f, timeTableUiModel.f);
    }

    public final int hashCode() {
        int iHashCode = ((this.f4422a.hashCode() * 31) + this.b) * 31;
        String str = this.c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TimeTableUiModel(timeTable=");
        sb.append(this.f4422a);
        sb.append(", slotIndexToHighlight=");
        sb.append(this.b);
        sb.append(", routeStartStopName=");
        cb0.t(sb, this.c, ", routeEndStopName=", this.d, ", firstBusTime=");
        return r30.i(sb, this.e, ", lastBusTime=", this.f, ")");
    }
}
