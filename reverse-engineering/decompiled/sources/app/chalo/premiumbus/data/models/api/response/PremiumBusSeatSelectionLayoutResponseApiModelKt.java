package app.chalo.premiumbus.data.models.api.response;

import app.chalo.premiumbus.data.models.app.BufferType;
import app.chalo.premiumbus.data.models.app.ReservationType;
import app.chalo.premiumbus.data.models.app.SeatInfoAppModel;
import app.chalo.premiumbus.data.models.app.SeatStatus;
import app.chalo.premiumbus.data.models.app.SeatType;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PremiumBusSeatSelectionLayoutResponseApiModelKt {
    /* JADX WARN: Code duplicated, block: B:63:0x0109  */
    public static final SeatInfoAppModel a(SeatInfoApiModel seatInfoApiModel) {
        SeatType next;
        SeatStatus next2;
        ReservationType next3;
        BufferType bufferType;
        Intrinsics.i(seatInfoApiModel, "<this>");
        Boolean bool = seatInfoApiModel.k;
        Integer num = seatInfoApiModel.f7062a;
        BufferType bufferType2 = null;
        if (num == null) {
            return null;
        }
        int iIntValue = num.intValue();
        String str = seatInfoApiModel.b;
        if (str != null) {
            SeatType.INSTANCE.getClass();
            Iterator<SeatType> it = SeatType.getEntries().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!StringsKt.x(next.getValue(), str, true));
            SeatType seatType = next;
            if (seatType != null) {
                String str2 = seatInfoApiModel.c;
                if (str2 == null) {
                    return null;
                }
                String str3 = seatInfoApiModel.d;
                if (str3 != null) {
                    SeatStatus.INSTANCE.getClass();
                    Iterator<SeatStatus> it2 = SeatStatus.getEntries().iterator();
                    do {
                        if (!it2.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it2.next();
                    } while (!StringsKt.x(next2.getValue(), str3, true));
                    SeatStatus seatStatus = next2;
                    if (seatStatus != null) {
                        String str4 = seatInfoApiModel.e;
                        if (str4 != null) {
                            ReservationType.INSTANCE.getClass();
                            Iterator<ReservationType> it3 = ReservationType.getEntries().iterator();
                            do {
                                if (!it3.hasNext()) {
                                    next3 = null;
                                    break;
                                }
                                next3 = it3.next();
                            } while (!StringsKt.x(next3.getValue(), str4, true));
                            ReservationType reservationType = next3;
                            if (reservationType != null) {
                                Integer num2 = seatInfoApiModel.f;
                                if (num2 == null) {
                                    return null;
                                }
                                int iIntValue2 = num2.intValue();
                                Integer num3 = seatInfoApiModel.g;
                                if (num3 == null) {
                                    return null;
                                }
                                int iIntValue3 = num3.intValue();
                                Integer num4 = seatInfoApiModel.h;
                                if (num4 == null) {
                                    return null;
                                }
                                int iIntValue4 = num4.intValue();
                                boolean zD = Intrinsics.d(seatInfoApiModel.i, Boolean.TRUE);
                                String str5 = seatInfoApiModel.j;
                                if (str5 != null) {
                                    BufferType.INSTANCE.getClass();
                                    for (BufferType bufferType3 : BufferType.getEntries()) {
                                        BufferType bufferType4 = bufferType2;
                                        if (StringsKt.x(bufferType3.getValue(), str5, true)) {
                                            bufferType2 = bufferType3;
                                            break;
                                        }
                                        bufferType2 = bufferType4;
                                    }
                                    bufferType = bufferType2;
                                    if (bufferType == null) {
                                        bufferType = BufferType.NONE;
                                    }
                                } else {
                                    bufferType = BufferType.NONE;
                                }
                                BufferType bufferType5 = bufferType;
                                Boolean bool2 = Boolean.TRUE;
                                return new SeatInfoAppModel(iIntValue, seatType, str2, seatStatus, reservationType, iIntValue2, iIntValue3, iIntValue4, Intrinsics.d(bool, bool2), zD, bufferType5, Intrinsics.d(bool, bool2), Intrinsics.d(seatInfoApiModel.l, bool2));
                            }
                        }
                        return null;
                    }
                }
                return null;
            }
        }
        return null;
    }
}
