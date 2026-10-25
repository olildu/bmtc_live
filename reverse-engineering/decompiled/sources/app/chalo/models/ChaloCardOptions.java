package app.chalo.models;

import defpackage.vo1;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/models/ChaloCardOptions;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChaloCardOptions {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f5579a;
    public final String b;
    public final String c;

    public ChaloCardOptions(String str, String str2, ArrayList arrayList) {
        this.f5579a = arrayList;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloCardOptions)) {
            return false;
        }
        ChaloCardOptions chaloCardOptions = (ChaloCardOptions) obj;
        return this.f5579a.equals(chaloCardOptions.f5579a) && Intrinsics.d(this.b, chaloCardOptions.b) && Intrinsics.d(this.c, chaloCardOptions.c);
    }

    public final int hashCode() {
        int iHashCode = this.f5579a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChaloCardOptions(chaloCardOptions=");
        sb.append(this.f5579a);
        sb.append(", buyCardUrl=");
        sb.append(this.b);
        sb.append(", activateNcmcCardUrl=");
        return vo1.p(sb, this.c, ")");
    }
}
