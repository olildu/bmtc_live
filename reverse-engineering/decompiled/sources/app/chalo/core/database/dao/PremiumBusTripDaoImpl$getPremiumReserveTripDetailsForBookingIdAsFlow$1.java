package app.chalo.core.database.dao;

import app.chalo.core.database.mappers.PremiumBusMappers;
import app.chalo.premiumbus.data.models.app.PremiumBusTripStatus;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTripEntity;
import kotlin.Metadata;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class PremiumBusTripDaoImpl$getPremiumReserveTripDetailsForBookingIdAsFlow$1 extends FunctionReferenceImpl implements Function5<String, String, String, PremiumBusTripStatus, Boolean, PremiumReserveTripEntity> {
    @Override // kotlin.jvm.functions.Function5
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        String p0 = (String) obj;
        String p1 = (String) obj2;
        String p2 = (String) obj3;
        PremiumBusTripStatus p3 = (PremiumBusTripStatus) obj4;
        boolean zBooleanValue = ((Boolean) obj5).booleanValue();
        Intrinsics.i(p0, "p0");
        Intrinsics.i(p1, "p1");
        Intrinsics.i(p2, "p2");
        Intrinsics.i(p3, "p3");
        ((PremiumBusMappers) this.receiver).getClass();
        return PremiumBusMappers.c(p0, p1, p2, p3, zBooleanValue);
    }
}
