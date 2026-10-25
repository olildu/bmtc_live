package app.chalo.home;

import defpackage.dd;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/SnackBarData;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SnackBarData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2863a;
    public final String b;
    public final SnackBarType c;

    public SnackBarData(String snackBarMessage, String snackBarCta, SnackBarType snackBarType) {
        Intrinsics.i(snackBarMessage, "snackBarMessage");
        Intrinsics.i(snackBarCta, "snackBarCta");
        Intrinsics.i(snackBarType, "snackBarType");
        this.f2863a = snackBarMessage;
        this.b = snackBarCta;
        this.c = snackBarType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SnackBarData)) {
            return false;
        }
        SnackBarData snackBarData = (SnackBarData) obj;
        return Intrinsics.d(this.f2863a, snackBarData.f2863a) && Intrinsics.d(this.b, snackBarData.b) && this.c == snackBarData.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + nf1.e(this.f2863a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("SnackBarData(snackBarMessage=", this.f2863a, ", snackBarCta=", this.b, ", snackBarType=");
        sbE.append(this.c);
        sbE.append(")");
        return sbE.toString();
    }
}
