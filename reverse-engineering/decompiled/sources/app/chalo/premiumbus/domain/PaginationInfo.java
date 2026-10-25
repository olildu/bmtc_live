package app.chalo.premiumbus.domain;

import defpackage.uf0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/domain/PaginationInfo;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PaginationInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7218a;
    public final int b;
    public final boolean c;
    public final int d;

    public PaginationInfo(int i, int i2, boolean z, int i3) {
        this.f7218a = i;
        this.b = i2;
        this.c = z;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaginationInfo)) {
            return false;
        }
        PaginationInfo paginationInfo = (PaginationInfo) obj;
        return this.f7218a == paginationInfo.f7218a && this.b == paginationInfo.b && this.c == paginationInfo.c && this.d == paginationInfo.d;
    }

    public final int hashCode() {
        return (((((this.f7218a * 31) + this.b) * 31) + (this.c ? 1231 : 1237)) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sbS = uf0.s(this.f7218a, this.b, "PaginationInfo(currentPage=", ", totalPages=", ", hasMorePages=");
        sbS.append(this.c);
        sbS.append(", pageSize=");
        sbS.append(this.d);
        sbS.append(")");
        return sbS.toString();
    }
}
