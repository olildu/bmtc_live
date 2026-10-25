package app.chalo.location;

import defpackage.n21;
import defpackage.t10;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/location/StoredLocation;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StoredLocation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f5160a;
    public final double b;
    public final long c;

    public StoredLocation(double d, double d2, long j) {
        this.f5160a = d;
        this.b = d2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoredLocation)) {
            return false;
        }
        StoredLocation storedLocation = (StoredLocation) obj;
        return Double.compare(this.f5160a, storedLocation.f5160a) == 0 && Double.compare(this.b, storedLocation.b) == 0 && this.c == storedLocation.c;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f5160a);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.b);
        int i = ((((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31;
        long j = this.c;
        return i + ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sbI = n21.i(this.f5160a, "StoredLocation(latitude=", ", longitude=");
        sbI.append(this.b);
        return t10.g(this.c, ", timestamp=", ")", sbI);
    }
}
