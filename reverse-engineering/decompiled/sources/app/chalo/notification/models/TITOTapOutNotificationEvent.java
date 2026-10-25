package app.chalo.notification.models;

import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.py;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/notification/models/TITOTapOutNotificationEvent;", "Lapp/chalo/notification/models/AppNotification$PunchNotification;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TITOTapOutNotificationEvent implements AppNotification.PunchNotification {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6552a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Long f;
    public final Long g;
    public final String h;
    public final Long i;
    public final long j;
    public final String k;
    public final String l;
    public final String m;
    public final Long n;

    public TITOTapOutNotificationEvent(String str, String str2, String str3, String str4, String str5, Long l, Long l2, String str6, Long l3, long j, String str7, String str8, String str9, Long l4) {
        this.f6552a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = l;
        this.g = l2;
        this.h = str6;
        this.i = l3;
        this.j = j;
        this.k = str7;
        this.l = str8;
        this.m = str9;
        this.n = l4;
    }

    @Override // app.chalo.notification.models.AppNotification
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getB() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TITOTapOutNotificationEvent)) {
            return false;
        }
        TITOTapOutNotificationEvent tITOTapOutNotificationEvent = (TITOTapOutNotificationEvent) obj;
        return Intrinsics.d(this.f6552a, tITOTapOutNotificationEvent.f6552a) && Intrinsics.d(this.b, tITOTapOutNotificationEvent.b) && Intrinsics.d(this.c, tITOTapOutNotificationEvent.c) && Intrinsics.d(this.d, tITOTapOutNotificationEvent.d) && Intrinsics.d(this.e, tITOTapOutNotificationEvent.e) && Intrinsics.d(this.f, tITOTapOutNotificationEvent.f) && Intrinsics.d(this.g, tITOTapOutNotificationEvent.g) && Intrinsics.d(this.h, tITOTapOutNotificationEvent.h) && Intrinsics.d(this.i, tITOTapOutNotificationEvent.i) && this.j == tITOTapOutNotificationEvent.j && Intrinsics.d(this.k, tITOTapOutNotificationEvent.k) && Intrinsics.d(this.l, tITOTapOutNotificationEvent.l) && Intrinsics.d(this.m, tITOTapOutNotificationEvent.m) && Intrinsics.d(this.n, tITOTapOutNotificationEvent.n);
    }

    @Override // app.chalo.notification.models.AppNotification
    /* JADX INFO: renamed from: getTitle, reason: from getter */
    public final String getF6550a() {
        return this.f6552a;
    }

    public final int hashCode() {
        int iE = nf1.e(this.f6552a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.f;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.g;
        int iHashCode5 = (iHashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str4 = this.h;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l3 = this.i;
        int iHashCode7 = l3 == null ? 0 : l3.hashCode();
        long j = this.j;
        int i = (((iHashCode6 + iHashCode7) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        String str5 = this.k;
        int iHashCode8 = (i + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.l;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.m;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Long l4 = this.n;
        return iHashCode10 + (l4 != null ? l4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("TITOTapOutNotificationEvent(title=", this.f6552a, ", body=", this.b, ", bookingId=");
        cb0.t(sbE, this.c, ", productType=", this.d, ", productSubType=");
        cb0.r(this.f, this.e, ", activationTsInSec=", ", tapOutGroupNo=", sbE);
        py.t(this.g, ", tapOutTripNo=", this.h, ", tapOutWaybillNo=", sbE);
        sbE.append(this.i);
        sbE.append(", tapOutTsInMillis=");
        sbE.append(this.j);
        cb0.t(sbE, ", tapOutRouteId=", this.k, ", tapOutStopId=", this.l);
        sbE.append(", walletId=");
        sbE.append(this.m);
        sbE.append(", expiryTime=");
        sbE.append(this.n);
        sbE.append(")");
        return sbE.toString();
    }
}
