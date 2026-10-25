package app.chalo.validationsdk.blevalidation.ui;

import defpackage.dd;
import defpackage.nf1;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/JourneyDetailsFieldData;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class JourneyDetailsFieldData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10612a;
    public final String b;
    public final String c;
    public final String d;

    public JourneyDetailsFieldData(String str, String str2, String from, String to) {
        Intrinsics.i(from, "from");
        Intrinsics.i(to, "to");
        this.f10612a = str;
        this.b = str2;
        this.c = from;
        this.d = to;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JourneyDetailsFieldData)) {
            return false;
        }
        JourneyDetailsFieldData journeyDetailsFieldData = (JourneyDetailsFieldData) obj;
        return Intrinsics.d(this.f10612a, journeyDetailsFieldData.f10612a) && Intrinsics.d(this.b, journeyDetailsFieldData.b) && Intrinsics.d(this.c, journeyDetailsFieldData.c) && Intrinsics.d(this.d, journeyDetailsFieldData.d);
    }

    public final int hashCode() {
        String str = this.f10612a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return this.d.hashCode() + nf1.e((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.c);
    }

    public final String toString() {
        return r30.i(dd.e("JourneyDetailsFieldData(colorHex=", this.f10612a, ", name=", this.b, ", from="), this.c, ", to=", this.d, ")");
    }
}
