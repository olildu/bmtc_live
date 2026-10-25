package app.chalo.premiumbus.data.models.app;

import app.chalo.premiumbus.data.models.api.response.SeatInfoApiModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PremiumBusChangeSeatsRequestAppModelKt {
    public static final SeatInfoApiModel a(SeatInfoAppModel seatInfoAppModel) {
        Intrinsics.i(seatInfoAppModel, "<this>");
        Integer numValueOf = Integer.valueOf(seatInfoAppModel.f7122a);
        String string = seatInfoAppModel.b.toString();
        String str = seatInfoAppModel.c;
        String string2 = seatInfoAppModel.d.toString();
        String string3 = seatInfoAppModel.e.toString();
        Integer numValueOf2 = Integer.valueOf(seatInfoAppModel.f);
        Integer numValueOf3 = Integer.valueOf(seatInfoAppModel.g);
        Integer numValueOf4 = Integer.valueOf(seatInfoAppModel.h);
        Boolean boolValueOf = Boolean.valueOf(seatInfoAppModel.j);
        BufferType.Companion companion = BufferType.INSTANCE;
        BufferType type = seatInfoAppModel.k;
        companion.getClass();
        Intrinsics.i(type, "type");
        return new SeatInfoApiModel(numValueOf, string, str, string2, string3, numValueOf2, numValueOf3, numValueOf4, boolValueOf, type.getValue(), Boolean.valueOf(seatInfoAppModel.l), Boolean.valueOf(seatInfoAppModel.m));
    }
}
