package app.chalo.ncmc.utils;

import app.chalo.ncmc.data.appmodel.ChaloCardActivePass;
import app.chalo.ncmc.data.appmodel.ChaloCardDetails;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChaloCardAnalyticsExtentionsKt {
    public static final void a(ChaloCardActivePass chaloCardActivePass, HashMap map) {
        Intrinsics.i(chaloCardActivePass, "<this>");
        String f6155a = chaloCardActivePass.getF6155a();
        if (f6155a != null) {
            map.put("chaloCardPassName", f6155a);
        }
        Long b = chaloCardActivePass.getB();
        if (b != null) {
            map.put("expiry time", Long.valueOf(b.longValue()));
        }
        Integer c = chaloCardActivePass.getC();
        if (c != null) {
            map.put("remainingTrips", Integer.valueOf(c.intValue()));
        }
        Integer d = chaloCardActivePass.getD();
        if (d != null) {
            map.put("maxPricePerTrip", Integer.valueOf(d.intValue()));
        }
        Integer e = chaloCardActivePass.getE();
        if (e != null) {
            map.put("maxTripsPerDay", Integer.valueOf(e.intValue()));
        }
    }

    public static final void b(ChaloCardDetails chaloCardDetails, HashMap map) {
        Intrinsics.i(chaloCardDetails, "<this>");
        map.put("cardNumber", chaloCardDetails.getF6161a());
        map.put("isCardRechargeEnabled", Boolean.valueOf(chaloCardDetails.getB()));
        Long c = chaloCardDetails.getC();
        if (c != null) {
            map.put("rechargeLimit", Long.valueOf(c.longValue()));
        }
        String d = chaloCardDetails.getD();
        if (d != null) {
            map.put("cardType", d);
        }
        Long e = chaloCardDetails.getE();
        if (e != null) {
            map.put("cardIssuedOn", Long.valueOf(e.longValue()));
        }
        map.put("cardBalance", Integer.valueOf(chaloCardDetails.c().intValue()));
        Boolean h = chaloCardDetails.getH();
        if (h != null) {
            map.put("isCardBlocked", h);
        }
    }
}
