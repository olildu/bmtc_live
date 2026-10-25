package app.chalo.ridefeedback.domain;

import app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketBookingPropertiesAppModel;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketTripPropertiesAppModel;
import app.chalo.ridefeedback.data.app.RideFeedbackFillStatus;
import app.chalo.ridefeedback.data.app.RideFeedbackTriggerType;
import app.chalo.ridefeedback.data.dao.PostRideFeedbackEntity;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PremiumReserveTicketFeedbackMapperKt {
    public static final PostRideFeedbackEntity a(PremiumReserveTicketAppModel premiumReserveTicketAppModel, long j, long j2) {
        Intrinsics.i(premiumReserveTicketAppModel, "<this>");
        PremiumReserveTicketBookingPropertiesAppModel premiumReserveTicketBookingPropertiesAppModel = premiumReserveTicketAppModel.f7113a;
        PremiumReserveTicketTripPropertiesAppModel premiumReserveTicketTripPropertiesAppModel = premiumReserveTicketAppModel.b;
        Long lValueOf = Long.valueOf(premiumReserveTicketTripPropertiesAppModel.b);
        if (lValueOf.longValue() <= 0) {
            lValueOf = null;
        }
        if (lValueOf == null) {
            return null;
        }
        long jLongValue = lValueOf.longValue();
        Long lValueOf2 = Long.valueOf(j2);
        Long l = lValueOf2.longValue() > 0 ? lValueOf2 : null;
        long jLongValue2 = l != null ? l.longValue() : j;
        String str = premiumReserveTicketBookingPropertiesAppModel.f7114a;
        String str2 = premiumReserveTicketTripPropertiesAppModel.f7117a;
        String str3 = premiumReserveTicketTripPropertiesAppModel.e;
        String str4 = premiumReserveTicketTripPropertiesAppModel.g.b;
        String str5 = premiumReserveTicketTripPropertiesAppModel.h.b;
        RideFeedbackTriggerType rideFeedbackTriggerType = RideFeedbackTriggerType.FULLSCREEN;
        String str6 = premiumReserveTicketBookingPropertiesAppModel.d;
        String str7 = premiumReserveTicketBookingPropertiesAppModel.e;
        RideFeedbackFillStatus rideFeedbackFillStatus = RideFeedbackFillStatus.NOT_FILLED;
        String lowerCase = premiumReserveTicketBookingPropertiesAppModel.f.toLowerCase(Locale.ROOT);
        Intrinsics.h(lowerCase, "toLowerCase(...)");
        return new PostRideFeedbackEntity(str, premiumReserveTicketBookingPropertiesAppModel.g, lowerCase, str2, str3, str4, str5, jLongValue, jLongValue2, rideFeedbackTriggerType, str6, str7, rideFeedbackFillStatus, null);
    }
}
