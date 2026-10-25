package app.chalo.premiumbus.data.mappers;

import app.chalo.data.RefundInfoAppModel;
import app.chalo.premiumbus.data.models.app.FirstBookingAppModel;
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
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketStatus;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketTripProperties;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketValidationProperties;
import app.chalo.premiumbus.data.models.entity.PremiumStopDetailsInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PBEntityToAppModelMappersKt {
    public static final PremiumReserveTicketAppModel a(PremiumReserveTicketEntity premiumReserveTicketEntity) {
        Intrinsics.i(premiumReserveTicketEntity, "<this>");
        PremiumReserveTicketBookingProperties premiumReserveTicketBookingProperties = premiumReserveTicketEntity.f7136a;
        Intrinsics.i(premiumReserveTicketBookingProperties, "<this>");
        String str = premiumReserveTicketBookingProperties.f7135a;
        long j = premiumReserveTicketBookingProperties.b;
        String str2 = premiumReserveTicketBookingProperties.c;
        String str3 = premiumReserveTicketBookingProperties.d;
        String str4 = premiumReserveTicketBookingProperties.e;
        String str5 = premiumReserveTicketBookingProperties.f;
        String str6 = premiumReserveTicketBookingProperties.g;
        PremiumReserveTicketStatus premiumReserveTicketStatus = premiumReserveTicketBookingProperties.h;
        String str7 = premiumReserveTicketBookingProperties.i;
        String str8 = premiumReserveTicketBookingProperties.j;
        String str9 = premiumReserveTicketBookingProperties.k;
        FirstBookingAppModel firstBookingAppModel = premiumReserveTicketBookingProperties.l;
        PremiumReserveTicketStatus premiumReserveTicketStatus2 = premiumReserveTicketBookingProperties.m;
        RefundInfoAppModel refundInfoAppModel = premiumReserveTicketBookingProperties.n;
        List list = premiumReserveTicketBookingProperties.o;
        if (list == null) {
            list = EmptyList.f17557a;
        }
        PremiumReserveTicketBookingPropertiesAppModel premiumReserveTicketBookingPropertiesAppModel = new PremiumReserveTicketBookingPropertiesAppModel(str, j, str2, str3, str4, str5, str6, premiumReserveTicketStatus, str7, str8, str9, firstBookingAppModel, premiumReserveTicketStatus2, refundInfoAppModel, list);
        PremiumReserveTicketTripPropertiesAppModel premiumReserveTicketTripPropertiesAppModelB = b(premiumReserveTicketEntity.b);
        PremiumReserveTicketValidationProperties premiumReserveTicketValidationProperties = premiumReserveTicketEntity.c;
        Intrinsics.i(premiumReserveTicketValidationProperties, "<this>");
        PremiumReserveTicketValidationPropertiesAppModel premiumReserveTicketValidationPropertiesAppModel = new PremiumReserveTicketValidationPropertiesAppModel(premiumReserveTicketValidationProperties.f7140a, premiumReserveTicketValidationProperties.b, premiumReserveTicketValidationProperties.c, premiumReserveTicketValidationProperties.d, premiumReserveTicketValidationProperties.e);
        PremiumReserveTicketFareAndPassengerProperties premiumReserveTicketFareAndPassengerProperties = premiumReserveTicketEntity.d;
        Intrinsics.i(premiumReserveTicketFareAndPassengerProperties, "<this>");
        long j2 = premiumReserveTicketFareAndPassengerProperties.f7137a;
        List<PremiumPassengerCategoryDetailsInfo> list2 = premiumReserveTicketFareAndPassengerProperties.b;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(list2, 10));
        for (PremiumPassengerCategoryDetailsInfo premiumPassengerCategoryDetailsInfo : list2) {
            Intrinsics.i(premiumPassengerCategoryDetailsInfo, "<this>");
            arrayList.add(new PremiumPassengerDetailsAppModel(premiumPassengerCategoryDetailsInfo.f7132a, premiumPassengerCategoryDetailsInfo.b, premiumPassengerCategoryDetailsInfo.c, premiumPassengerCategoryDetailsInfo.d, premiumPassengerCategoryDetailsInfo.e));
        }
        return new PremiumReserveTicketAppModel(premiumReserveTicketBookingPropertiesAppModel, premiumReserveTicketTripPropertiesAppModelB, premiumReserveTicketValidationPropertiesAppModel, new PremiumReserveTicketFareAndPassengerPropertiesAppModel(j2, premiumReserveTicketFareAndPassengerProperties.c, arrayList));
    }

    public static final PremiumReserveTicketTripPropertiesAppModel b(PremiumReserveTicketTripProperties premiumReserveTicketTripProperties) {
        Intrinsics.i(premiumReserveTicketTripProperties, "<this>");
        String str = premiumReserveTicketTripProperties.f7139a;
        long j = premiumReserveTicketTripProperties.b;
        long j2 = premiumReserveTicketTripProperties.c;
        long j3 = premiumReserveTicketTripProperties.d;
        String str2 = premiumReserveTicketTripProperties.e;
        String str3 = premiumReserveTicketTripProperties.f;
        PremiumStopDetailsInfo premiumStopDetailsInfo = premiumReserveTicketTripProperties.g;
        PremiumStopDetailsAppModel premiumStopDetailsAppModel = new PremiumStopDetailsAppModel(premiumStopDetailsInfo.f7142a, premiumStopDetailsInfo.b);
        PremiumStopDetailsInfo premiumStopDetailsInfo2 = premiumReserveTicketTripProperties.h;
        return new PremiumReserveTicketTripPropertiesAppModel(str, j, j2, j3, str2, str3, premiumStopDetailsAppModel, new PremiumStopDetailsAppModel(premiumStopDetailsInfo2.f7142a, premiumStopDetailsInfo2.b), premiumReserveTicketTripProperties.i);
    }
}
