package app.chalo.models.productbooking.productcapability;

import defpackage.t10;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/models/productbooking/productcapability/OperationalHoursAppModel;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class OperationalHoursAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5674a;
    public final long b;
    public final long c;

    public OperationalHoursAppModel(String text, long j, long j2) {
        Intrinsics.i(text, "text");
        this.f5674a = text;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OperationalHoursAppModel)) {
            return false;
        }
        OperationalHoursAppModel operationalHoursAppModel = (OperationalHoursAppModel) obj;
        return Intrinsics.d(this.f5674a, operationalHoursAppModel.f5674a) && this.b == operationalHoursAppModel.b && this.c == operationalHoursAppModel.c;
    }

    public final int hashCode() {
        int iHashCode = this.f5674a.hashCode() * 31;
        long j = this.b;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.c;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        return t10.g(this.c, ", endTimeStamp=", ")", t10.m(this.b, "OperationalHoursAppModel(text=", this.f5674a, ", startTimeStamp="));
    }
}
