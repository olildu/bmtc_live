package app.chalo.superpass.data.models.entities;

import androidx.compose.material3.internal.CalendarModelKt;
import defpackage.dd;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/superpass/data/models/entities/SuperPassRepurchaseProperties;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SuperPassRepurchaseProperties {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9569a;
    public final String b;
    public final int c;
    public final long d;
    public final boolean e;
    public final boolean f;

    public SuperPassRepurchaseProperties(String configId, String categoryId, int i, long j, boolean z, boolean z2) {
        Intrinsics.i(configId, "configId");
        Intrinsics.i(categoryId, "categoryId");
        this.f9569a = configId;
        this.b = categoryId;
        this.c = i;
        this.d = j;
        this.e = z;
        this.f = z2;
    }

    public final Boolean a(int i, long j) {
        if (!this.e) {
            return Boolean.FALSE;
        }
        long j2 = this.d;
        if (j2 == -1) {
            return Boolean.FALSE;
        }
        return j2 > (((long) i) * CalendarModelKt.MillisecondsIn24Hours) + j ? Boolean.FALSE : Boolean.TRUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperPassRepurchaseProperties)) {
            return false;
        }
        SuperPassRepurchaseProperties superPassRepurchaseProperties = (SuperPassRepurchaseProperties) obj;
        return Intrinsics.d(this.f9569a, superPassRepurchaseProperties.f9569a) && Intrinsics.d(this.b, superPassRepurchaseProperties.b) && this.c == superPassRepurchaseProperties.c && this.d == superPassRepurchaseProperties.d && this.e == superPassRepurchaseProperties.e && this.f == superPassRepurchaseProperties.f;
    }

    public final int hashCode() {
        int iE = (nf1.e(this.f9569a.hashCode() * 31, 31, this.b) + this.c) * 31;
        long j = this.d;
        return ((((iE + ((int) (j ^ (j >>> 32)))) * 31) + (this.e ? 1231 : 1237)) * 31) + (this.f ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("SuperPassRepurchaseProperties(configId=", this.f9569a, ", categoryId=", this.b, ", fareMappingId=");
        sbE.append(this.c);
        sbE.append(", verificationExpiryTime=");
        sbE.append(this.d);
        sbE.append(", verificationFlag=");
        sbE.append(this.e);
        sbE.append(", isRenewable=");
        sbE.append(this.f);
        sbE.append(")");
        return sbE.toString();
    }
}
