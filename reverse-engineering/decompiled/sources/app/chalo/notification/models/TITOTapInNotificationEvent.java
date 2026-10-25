package app.chalo.notification.models;

import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.py;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/notification/models/TITOTapInNotificationEvent;", "Lapp/chalo/notification/models/AppNotification$PunchNotification;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TITOTapInNotificationEvent implements AppNotification.PunchNotification {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6551a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Long f;
    public final Long g;
    public final Long h;
    public final Long i;
    public final String j;
    public final String k;
    public final String l;
    public final Long m;
    public final String n;
    public final String o;
    public final Long p;

    public TITOTapInNotificationEvent(String str, String str2, String str3, String str4, String str5, Long l, Long l2, Long l3, Long l4, String str6, String str7, String str8, Long l5, String str9, String str10, Long l6) {
        this.f6551a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = l;
        this.g = l2;
        this.h = l3;
        this.i = l4;
        this.j = str6;
        this.k = str7;
        this.l = str8;
        this.m = l5;
        this.n = str9;
        this.o = str10;
        this.p = l6;
    }

    @Override // app.chalo.notification.models.AppNotification
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getB() {
        return this.b;
    }

    public final LinkedHashMap b(Map propertiesMap, long j) {
        Intrinsics.i(propertiesMap, "propertiesMap");
        LinkedHashMap linkedHashMapU = MapsKt.u(propertiesMap);
        Long l = this.h;
        long jLongValue = l.longValue() - (j / 1000);
        Long l2 = this.g;
        long jLongValue2 = l2.longValue() - j;
        Long l3 = this.i;
        long jLongValue3 = l3.longValue() - j;
        String str = this.f6551a;
        if (str == null) {
            str = "";
        }
        linkedHashMapU.put("notification title", str);
        String str2 = this.b;
        if (str2 == null) {
            str2 = "";
        }
        linkedHashMapU.put("notificationSubtitle", str2);
        String str3 = this.c;
        if (str3 == null) {
            str3 = "";
        }
        linkedHashMapU.put("notif bookingId", str3);
        String str4 = this.d;
        if (str4 == null) {
            str4 = "";
        }
        linkedHashMapU.put("notif productType", str4);
        String str5 = this.e;
        if (str5 == null) {
            str5 = "";
        }
        linkedHashMapU.put("notif productSubtype", str5);
        linkedHashMapU.put("groupNo", Long.valueOf(this.f.longValue()));
        linkedHashMapU.put("notif firstTimeValidScanTS", Long.valueOf(l2.longValue()));
        linkedHashMapU.put("notif activationTsInSec", Long.valueOf(l.longValue()));
        String str6 = this.j;
        if (str6 == null) {
            str6 = "";
        }
        linkedHashMapU.put("notif routeId", str6);
        String str7 = this.k;
        if (str7 == null) {
            str7 = "";
        }
        linkedHashMapU.put("notif stopId", str7);
        String str8 = this.l;
        if (str8 == null) {
            str8 = "";
        }
        linkedHashMapU.put("notif tripNo", str8);
        linkedHashMapU.put("notif waybillNo", Long.valueOf(this.m.longValue()));
        linkedHashMapU.put("notif timeTakenToGetNotificationInSec", String.valueOf(jLongValue));
        linkedHashMapU.put("notif approxTimeTakenForNotificationDelivery", String.valueOf(jLongValue2));
        linkedHashMapU.put("notif tapinPunchTsInMillis", String.valueOf(l3));
        linkedHashMapU.put("notif timeTakenFromPunchToAppNotifReceived", String.valueOf(jLongValue3));
        String str9 = this.o;
        linkedHashMapU.put("notif walletId", str9 != null ? str9 : "");
        Long l4 = this.p;
        linkedHashMapU.put("notif expiryTime", Long.valueOf(l4 != null ? l4.longValue() : -1L));
        return linkedHashMapU;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TITOTapInNotificationEvent)) {
            return false;
        }
        TITOTapInNotificationEvent tITOTapInNotificationEvent = (TITOTapInNotificationEvent) obj;
        return Intrinsics.d(this.f6551a, tITOTapInNotificationEvent.f6551a) && Intrinsics.d(this.b, tITOTapInNotificationEvent.b) && Intrinsics.d(this.c, tITOTapInNotificationEvent.c) && Intrinsics.d(this.d, tITOTapInNotificationEvent.d) && Intrinsics.d(this.e, tITOTapInNotificationEvent.e) && Intrinsics.d(this.f, tITOTapInNotificationEvent.f) && Intrinsics.d(this.g, tITOTapInNotificationEvent.g) && Intrinsics.d(this.h, tITOTapInNotificationEvent.h) && Intrinsics.d(this.i, tITOTapInNotificationEvent.i) && Intrinsics.d(this.j, tITOTapInNotificationEvent.j) && Intrinsics.d(this.k, tITOTapInNotificationEvent.k) && Intrinsics.d(this.l, tITOTapInNotificationEvent.l) && Intrinsics.d(this.m, tITOTapInNotificationEvent.m) && Intrinsics.d(this.n, tITOTapInNotificationEvent.n) && Intrinsics.d(this.o, tITOTapInNotificationEvent.o) && Intrinsics.d(this.p, tITOTapInNotificationEvent.p);
    }

    @Override // app.chalo.notification.models.AppNotification
    /* JADX INFO: renamed from: getTitle, reason: from getter */
    public final String getF6551a() {
        return this.f6551a;
    }

    public final int hashCode() {
        String str = this.f6551a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l = this.f;
        int iHashCode6 = (iHashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.g;
        int iHashCode7 = (iHashCode6 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.h;
        int iHashCode8 = (iHashCode7 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.i;
        int iHashCode9 = (iHashCode8 + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str6 = this.j;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.k;
        int iHashCode11 = (iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.l;
        int iHashCode12 = (iHashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Long l5 = this.m;
        int iHashCode13 = (iHashCode12 + (l5 == null ? 0 : l5.hashCode())) * 31;
        String str9 = this.n;
        int iHashCode14 = (iHashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.o;
        int iHashCode15 = (iHashCode14 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Long l6 = this.p;
        return iHashCode15 + (l6 != null ? l6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("TITOTapInNotificationEvent(title=", this.f6551a, ", body=", this.b, ", bookingId=");
        cb0.t(sbE, this.c, ", productType=", this.d, ", productSubType=");
        cb0.r(this.f, this.e, ", groupNo=", ", firstTimeValidScanTS=", sbE);
        nf1.w(sbE, this.g, ", activationTsInSec=", this.h, ", tapinPunchTsInMillis=");
        py.t(this.i, ", routeId=", this.j, ", stopId=", sbE);
        cb0.t(sbE, this.k, ", tripNo=", this.l, ", waybillNo=");
        py.t(this.m, ", vehicleNo=", this.n, ", walletId=", sbE);
        sbE.append(this.o);
        sbE.append(", expiryTime=");
        sbE.append(this.p);
        sbE.append(")");
        return sbE.toString();
    }
}
