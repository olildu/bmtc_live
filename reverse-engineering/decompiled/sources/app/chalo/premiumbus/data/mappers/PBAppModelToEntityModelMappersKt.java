package app.chalo.premiumbus.data.mappers;

import app.chalo.premiumbus.data.models.app.PremiumPassengerDetailsAppModel;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketBookingPropertiesAppModel;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketFareAndPassengerPropertiesAppModel;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketTripPropertiesAppModel;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketValidationPropertiesAppModel;
import app.chalo.premiumbus.data.models.app.PremiumStopDetailsAppModel;
import app.chalo.premiumbus.data.models.entity.PremiumPassengerCategoryDetailsInfo;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketBookingProperties;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketEntity;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketFareAndPassengerProperties;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketTripProperties;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketValidationProperties;
import app.chalo.premiumbus.data.models.entity.PremiumStopDetailsInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PBAppModelToEntityModelMappersKt {
    public static final PremiumReserveTicketEntity a(PremiumReserveTicketAppModel premiumReserveTicketAppModel) {
        Intrinsics.i(premiumReserveTicketAppModel, "<this>");
        PremiumReserveTicketBookingPropertiesAppModel premiumReserveTicketBookingPropertiesAppModel = premiumReserveTicketAppModel.f7113a;
        PremiumReserveTicketBookingProperties premiumReserveTicketBookingProperties = new PremiumReserveTicketBookingProperties(premiumReserveTicketBookingPropertiesAppModel.f7114a, premiumReserveTicketBookingPropertiesAppModel.b, premiumReserveTicketBookingPropertiesAppModel.c, premiumReserveTicketBookingPropertiesAppModel.d, premiumReserveTicketBookingPropertiesAppModel.e, premiumReserveTicketBookingPropertiesAppModel.f, premiumReserveTicketBookingPropertiesAppModel.g, premiumReserveTicketBookingPropertiesAppModel.h, premiumReserveTicketBookingPropertiesAppModel.i, premiumReserveTicketBookingPropertiesAppModel.j, premiumReserveTicketBookingPropertiesAppModel.k, premiumReserveTicketBookingPropertiesAppModel.l, premiumReserveTicketBookingPropertiesAppModel.m, premiumReserveTicketBookingPropertiesAppModel.n, premiumReserveTicketBookingPropertiesAppModel.o);
        PremiumReserveTicketTripPropertiesAppModel premiumReserveTicketTripPropertiesAppModel = premiumReserveTicketAppModel.b;
        String str = premiumReserveTicketTripPropertiesAppModel.f7117a;
        long j = premiumReserveTicketTripPropertiesAppModel.b;
        long j2 = premiumReserveTicketTripPropertiesAppModel.c;
        long j3 = premiumReserveTicketTripPropertiesAppModel.d;
        String str2 = premiumReserveTicketTripPropertiesAppModel.e;
        String str3 = premiumReserveTicketTripPropertiesAppModel.f;
        PremiumStopDetailsAppModel premiumStopDetailsAppModel = premiumReserveTicketTripPropertiesAppModel.g;
        PremiumStopDetailsInfo premiumStopDetailsInfo = new PremiumStopDetailsInfo(premiumStopDetailsAppModel.f7121a, premiumStopDetailsAppModel.b);
        PremiumStopDetailsAppModel premiumStopDetailsAppModel2 = premiumReserveTicketTripPropertiesAppModel.h;
        PremiumReserveTicketTripProperties premiumReserveTicketTripProperties = new PremiumReserveTicketTripProperties(str, j, j2, j3, str2, str3, premiumStopDetailsInfo, new PremiumStopDetailsInfo(premiumStopDetailsAppModel2.f7121a, premiumStopDetailsAppModel2.b), premiumReserveTicketTripPropertiesAppModel.i);
        PremiumReserveTicketValidationPropertiesAppModel premiumReserveTicketValidationPropertiesAppModel = premiumReserveTicketAppModel.c;
        PremiumReserveTicketValidationProperties premiumReserveTicketValidationProperties = new PremiumReserveTicketValidationProperties(premiumReserveTicketValidationPropertiesAppModel.f7118a, premiumReserveTicketValidationPropertiesAppModel.b, premiumReserveTicketValidationPropertiesAppModel.c, premiumReserveTicketValidationPropertiesAppModel.d, premiumReserveTicketValidationPropertiesAppModel.e);
        PremiumReserveTicketFareAndPassengerPropertiesAppModel premiumReserveTicketFareAndPassengerPropertiesAppModel = premiumReserveTicketAppModel.d;
        long j4 = premiumReserveTicketFareAndPassengerPropertiesAppModel.f7115a;
        List<PremiumPassengerDetailsAppModel> list = premiumReserveTicketFareAndPassengerPropertiesAppModel.b;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(list, 10));
        for (PremiumPassengerDetailsAppModel premiumPassengerDetailsAppModel : list) {
            Intrinsics.i(premiumPassengerDetailsAppModel, "<this>");
            arrayList.add(new PremiumPassengerCategoryDetailsInfo(premiumPassengerDetailsAppModel.f7111a, premiumPassengerDetailsAppModel.b, premiumPassengerDetailsAppModel.c, premiumPassengerDetailsAppModel.d, premiumPassengerDetailsAppModel.e));
        }
        return new PremiumReserveTicketEntity(premiumReserveTicketBookingProperties, premiumReserveTicketTripProperties, premiumReserveTicketValidationProperties, new PremiumReserveTicketFareAndPassengerProperties(j4, premiumReserveTicketFareAndPassengerPropertiesAppModel.c, arrayList));
    }
}
