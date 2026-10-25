package app.chalo.core.database.mappers;

import app.chalo.core.Magic_super_pass_table;
import app.chalo.core.Ride_based_super_pass_table;
import app.chalo.core.Super_pass_application_table;
import app.chalo.features.productsync.constants.SuperPassApplicationStatus;
import app.chalo.features.productsync.constants.SuperPassStatus;
import app.chalo.models.ProductBranding;
import app.chalo.premiumbus.data.models.app.PassTierType;
import app.chalo.productbooking.common.data.models.entity.RefundInfoEntityModel;
import app.chalo.superpass.data.models.entities.CashPaymentPendingTransactionDetails;
import app.chalo.superpass.data.models.entities.FareInfo;
import app.chalo.superpass.data.models.entities.MagicSuperPass;
import app.chalo.superpass.data.models.entities.PassApplicationActionRequired;
import app.chalo.superpass.data.models.entities.PassApplicationRejectionReasons;
import app.chalo.superpass.data.models.entities.PremiumBusMeta;
import app.chalo.superpass.data.models.entities.RideBasedSuperPass;
import app.chalo.superpass.data.models.entities.RideBasedSuperPassRideDetails;
import app.chalo.superpass.data.models.entities.RideBasedSuperPassUIProperties;
import app.chalo.superpass.data.models.entities.RideBasedSuperPassValidationProperties;
import app.chalo.superpass.data.models.entities.SuperPassApplication;
import app.chalo.superpass.data.models.entities.SuperPassProperties;
import app.chalo.superpass.data.models.entities.SuperPassRepurchaseProperties;
import app.chalo.superpass.data.models.entities.SuperPassRideDetails;
import app.chalo.superpass.data.models.entities.SuperPassSubType;
import app.chalo.superpass.data.models.entities.SuperPassTransactionDetails;
import app.chalo.superpass.data.models.entities.SuperPassTripPreferences;
import app.chalo.superpass.data.models.entities.SuperPassUIProperties;
import app.chalo.superpass.data.models.entities.SuperPassUserDetails;
import app.chalo.superpass.data.models.entities.SuperPassValidationProperties;
import app.chalo.superpass.data.models.pendingSuperPass.PendingSuperPass;
import app.chalo.superpass.data.models.pendingSuperPass.PendingSuperPassProperties;
import app.chalo.superpass.data.models.pendingSuperPass.PendingSuperPassRepurchaseProperties;
import app.chalo.superpass.data.models.pendingSuperPass.PendingSuperPassTransactionDetails;
import app.chalo.superpass.data.models.pendingSuperPass.PendingSuperPassUIProperties;
import app.chalo.userprofile.Gender;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/database/mappers/SuperPassTableMappers;", "", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SuperPassTableMappers {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SuperPassTableMappers f2109a = new SuperPassTableMappers();

    public static MagicSuperPass a(String str, String str2, String str3, String str4, SuperPassSubType superPassSubType, String str5, String str6, SuperPassStatus superPassStatus, long j, long j2, long j3, long j4, boolean z, List list, long j5, long j6, List list2, Map map, long j7, String str7, String str8, String str9, String str10, String str11, String str12, Gender gender, String str13, String str14, String str15, long j8, double d, double d2, boolean z2, double d3, List list3, boolean z3, String str16, String str17, long j9, long j10, boolean z4, boolean z5, String str18, String str19, String str20, String str21, String str22, String str23, String str24, RefundInfoEntityModel refundInfoEntityModel, PassTierType passTierType, Long l, Long l2, Boolean bool, PremiumBusMeta premiumBusMeta, Boolean bool2) {
        SuperPassProperties superPassProperties = new SuperPassProperties(str3, str4, superPassSubType, str5, str6, str, str2, premiumBusMeta);
        SuperPassRideDetails superPassRideDetails = new SuperPassRideDetails(j4, j5);
        Integer numValueOf = l != null ? Integer.valueOf((int) l.longValue()) : null;
        Integer numValueOf2 = l2 != null ? Integer.valueOf((int) l2.longValue()) : null;
        Boolean bool3 = Boolean.TRUE;
        return new MagicSuperPass(superPassProperties, new SuperPassValidationProperties(superPassStatus, j, j2, j3, list, z, superPassRideDetails, passTierType, numValueOf, numValueOf2, Intrinsics.d(bool, bool3)), new SuperPassUIProperties((int) j6, list2, new SuperPassUserDetails(str10, str11, str12, gender, str13, str14, str15, j8), map, j7, new FareInfo(d, d2, z2, d3, list3), str7, str8, new ProductBranding(z3), str9, Intrinsics.d(bool2, bool3)), new SuperPassRepurchaseProperties(str16, str17, (int) j9, j10, z4, z5), new SuperPassTransactionDetails(str18, str19, refundInfoEntityModel), new SuperPassTripPreferences(str20, str21, str22, str23, str24));
    }

    public static RideBasedSuperPass b(long j, long j2, SuperPassStatus superPassStatus, long j3, long j4, long j5, List list, boolean z, long j6, long j7, long j8, boolean z2, boolean z3, List list2, long j9, double d, String str, long j10, List list3, Map map, long j11, String str2, String str3, String str4, String str5, String str6, String str7, Gender gender, String str8, String str9, String str10, double d2, double d3, boolean z4, double d4, List list4, boolean z5, long j12, String str11, String str12, String str13, String str14, SuperPassSubType superPassSubType, String str15, String str16, String str17, String str18, long j13, long j14, boolean z6, boolean z7, String str19, String str20, String str21, String str22, String str23, String str24, String str25, RefundInfoEntityModel refundInfoEntityModel, PassTierType passTierType, Long l, Long l2, Boolean bool, PremiumBusMeta premiumBusMeta, Boolean bool2) {
        SuperPassProperties superPassProperties = new SuperPassProperties(str13, str14, superPassSubType, str15, str16, str11, str12, premiumBusMeta);
        int i = (int) j;
        int i2 = (int) j2;
        RideBasedSuperPassRideDetails rideBasedSuperPassRideDetails = new RideBasedSuperPassRideDetails(list, z, j6, z2, j7, j8);
        int i3 = (int) j9;
        Integer numValueOf = l != null ? Integer.valueOf((int) l.longValue()) : null;
        Integer numValueOf2 = l2 != null ? Integer.valueOf((int) l2.longValue()) : null;
        Boolean bool3 = Boolean.TRUE;
        return new RideBasedSuperPass(superPassProperties, new RideBasedSuperPassValidationProperties(superPassStatus, j3, j4, j5, list2, z3, i, i2, i3, rideBasedSuperPassRideDetails, passTierType, numValueOf, numValueOf2, Intrinsics.d(bool, bool3)), new RideBasedSuperPassUIProperties((int) j10, list3, new SuperPassUserDetails(str5, str6, str7, gender, str8, str9, str10, j12), map, j11, new FareInfo(d2, d3, z4, d4, list4), d, str2, str3, new ProductBranding(z5), str4, str, Intrinsics.d(bool2, bool3)), new SuperPassRepurchaseProperties(str17, str18, (int) j13, j14, z6, z7), new SuperPassTransactionDetails(str19, str20, refundInfoEntityModel), new SuperPassTripPreferences(str21, str22, str23, str24, str25));
    }

    public static SuperPassApplication c(String str, String str2, String str3, String str4, long j, String str5, String str6, long j2, long j3, SuperPassApplicationStatus superPassApplicationStatus, Map map, PassApplicationActionRequired passApplicationActionRequired, String str7, String str8, String str9, Gender gender, String str10, String str11, String str12, long j4, Double d, String str13, List list, List list2, List list3, RefundInfoEntityModel refundInfoEntityModel) {
        return new SuperPassApplication(str, str2, str3, str4, (int) j, str5, str6, j2, j3, new SuperPassUserDetails(str7, str8, str9, gender, str10, str11, str12, j4), superPassApplicationStatus, map, (d == null || str13 == null) ? null : new CashPaymentPendingTransactionDetails(d.doubleValue(), str13), new PassApplicationRejectionReasons(list == null ? EmptyList.f17557a : list, list2 == null ? EmptyList.f17557a : list2, list3 == null ? EmptyList.f17557a : list3), passApplicationActionRequired, refundInfoEntityModel);
    }

    public static PendingSuperPass d(SuperPassStatus superPassStatus, String str, String str2, SuperPassSubType superPassSubType, String str3, String str4, double d, String str5, long j, List list, Map map, long j2, String str6, String str7, String str8, String str9, String str10, String str11, Gender gender, String str12, String str13, String str14, double d2, double d3, boolean z, double d4, List list2, boolean z2, String str15, String str16, long j3, long j4, long j5, boolean z3, String str17, String str18, String str19, RefundInfoEntityModel refundInfoEntityModel) {
        return new PendingSuperPass(new PendingSuperPassProperties(str, str2, superPassSubType, str3, str4, superPassStatus), new PendingSuperPassUIProperties((int) j, list, new SuperPassUserDetails(str9, str10, str11, gender, str12, str13, str14, 128), map, j2, new FareInfo(d2, d3, z, d4, list2), str6, str7, new ProductBranding(z2), str8, d, str5), new PendingSuperPassRepurchaseProperties(str15, str16, (int) j3, j4, j5, z3), new PendingSuperPassTransactionDetails(str17, str18, str19, refundInfoEntityModel));
    }

    public static Magic_super_pass_table e(MagicSuperPass magicSuperPass) {
        Intrinsics.i(magicSuperPass, "<this>");
        SuperPassProperties superPassProperties = magicSuperPass.f9560a;
        String str = superPassProperties.f;
        String str2 = superPassProperties.g;
        String str3 = superPassProperties.f9566a;
        String str4 = superPassProperties.b;
        SuperPassSubType superPassSubType = superPassProperties.c;
        String str5 = superPassProperties.d;
        String str6 = superPassProperties.e;
        SuperPassValidationProperties superPassValidationProperties = magicSuperPass.b;
        SuperPassStatus superPassStatus = superPassValidationProperties.f9582a;
        long j = superPassValidationProperties.b;
        long j2 = superPassValidationProperties.c;
        long j3 = superPassValidationProperties.d;
        long j4 = superPassValidationProperties.getG().f9570a;
        boolean z = superPassValidationProperties.f;
        List list = superPassValidationProperties.e;
        long j5 = superPassValidationProperties.getG().b;
        SuperPassUIProperties superPassUIProperties = magicSuperPass.c;
        long j6 = superPassUIProperties.f9578a;
        List list2 = superPassUIProperties.b;
        Map map = superPassUIProperties.d;
        long j7 = superPassUIProperties.e;
        String str7 = superPassUIProperties.g;
        String str8 = superPassUIProperties.h;
        String str9 = superPassUIProperties.j;
        SuperPassUserDetails superPassUserDetails = superPassUIProperties.c;
        String str10 = superPassUserDetails.f9580a;
        String str11 = superPassUserDetails.b;
        String str12 = superPassUserDetails.c;
        Gender gender = superPassUserDetails.d;
        String str13 = superPassUserDetails.e;
        String str14 = superPassUserDetails.f;
        String str15 = superPassUserDetails.g;
        long j8 = superPassUserDetails.h;
        FareInfo fareInfo = superPassUIProperties.f;
        double d = fareInfo.f9545a;
        double d2 = fareInfo.b;
        double d3 = fareInfo.d;
        boolean z2 = fareInfo.c;
        List list3 = fareInfo.e;
        boolean z3 = superPassUIProperties.i.f5592a;
        SuperPassRepurchaseProperties superPassRepurchaseProperties = magicSuperPass.d;
        String str16 = superPassRepurchaseProperties.f9569a;
        long j9 = superPassRepurchaseProperties.d;
        long j10 = superPassRepurchaseProperties.c;
        String str17 = superPassRepurchaseProperties.b;
        boolean z4 = superPassRepurchaseProperties.f;
        boolean z5 = superPassRepurchaseProperties.e;
        SuperPassTransactionDetails superPassTransactionDetails = magicSuperPass.e;
        String str18 = superPassTransactionDetails.f9573a;
        SuperPassTripPreferences superPassTripPreferences = magicSuperPass.f;
        String str19 = superPassTripPreferences.b;
        String str20 = superPassTripPreferences.f9575a;
        String str21 = superPassTransactionDetails.b;
        String str22 = superPassTripPreferences.d;
        String str23 = superPassTripPreferences.e;
        String str24 = superPassTripPreferences.c;
        RefundInfoEntityModel refundInfoEntityModel = superPassTransactionDetails.c;
        PassTierType passTierType = superPassValidationProperties.h;
        Integer num = superPassValidationProperties.i;
        Long lValueOf = num != null ? Long.valueOf(num.intValue()) : null;
        Integer num2 = superPassValidationProperties.j;
        return new Magic_super_pass_table(str, str2, str3, str4, superPassSubType, str5, str6, superPassStatus, j, j2, j3, j4, z, list, j5, j6, list2, map, j7, str7, str8, str9, str10, str11, str12, gender, str13, str14, str15, j8, d, d2, z2, d3, list3, z3, str16, str17, j10, j9, z5, z4, str18, str21, str20, str19, str24, str22, str23, refundInfoEntityModel, passTierType, lValueOf, num2 != null ? Long.valueOf(num2.intValue()) : null, Boolean.valueOf(superPassValidationProperties.k), superPassProperties.h, Boolean.valueOf(superPassUIProperties.k));
    }

    public static Ride_based_super_pass_table f(RideBasedSuperPass rideBasedSuperPass) {
        Intrinsics.i(rideBasedSuperPass, "<this>");
        SuperPassProperties superPassProperties = rideBasedSuperPass.f9560a;
        String str = superPassProperties.f;
        String str2 = superPassProperties.g;
        String str3 = superPassProperties.f9566a;
        String str4 = superPassProperties.b;
        SuperPassSubType superPassSubType = superPassProperties.c;
        String str5 = superPassProperties.d;
        String str6 = superPassProperties.e;
        RideBasedSuperPassValidationProperties rideBasedSuperPassValidationProperties = rideBasedSuperPass.g;
        long j = rideBasedSuperPassValidationProperties.l;
        long j2 = rideBasedSuperPassValidationProperties.m;
        SuperPassStatus superPassStatus = rideBasedSuperPassValidationProperties.f9582a;
        long j3 = rideBasedSuperPassValidationProperties.b;
        long j4 = rideBasedSuperPassValidationProperties.c;
        long j5 = rideBasedSuperPassValidationProperties.d;
        RideBasedSuperPassRideDetails rideBasedSuperPassRideDetails = rideBasedSuperPassValidationProperties.o;
        List list = rideBasedSuperPassRideDetails.c;
        boolean z = rideBasedSuperPassRideDetails.d;
        long j6 = rideBasedSuperPassRideDetails.e;
        long j7 = rideBasedSuperPassRideDetails.f9570a;
        long j8 = rideBasedSuperPassRideDetails.b;
        boolean z2 = rideBasedSuperPassRideDetails.f;
        boolean z3 = rideBasedSuperPassValidationProperties.f;
        List list2 = rideBasedSuperPassValidationProperties.e;
        long j9 = rideBasedSuperPassValidationProperties.n;
        RideBasedSuperPassUIProperties rideBasedSuperPassUIProperties = rideBasedSuperPass.h;
        double d = rideBasedSuperPassUIProperties.m;
        String str7 = rideBasedSuperPassUIProperties.n;
        long j10 = rideBasedSuperPassUIProperties.f9578a;
        List list3 = rideBasedSuperPassUIProperties.b;
        Map map = rideBasedSuperPassUIProperties.d;
        long j11 = rideBasedSuperPassUIProperties.e;
        String str8 = rideBasedSuperPassUIProperties.g;
        String str9 = rideBasedSuperPassUIProperties.h;
        String str10 = rideBasedSuperPassUIProperties.j;
        SuperPassUserDetails superPassUserDetails = rideBasedSuperPassUIProperties.c;
        String str11 = superPassUserDetails.f9580a;
        String str12 = superPassUserDetails.b;
        String str13 = superPassUserDetails.c;
        Gender gender = superPassUserDetails.d;
        String str14 = superPassUserDetails.e;
        String str15 = superPassUserDetails.f;
        String str16 = superPassUserDetails.g;
        FareInfo fareInfo = rideBasedSuperPassUIProperties.f;
        double d2 = fareInfo.f9545a;
        double d3 = fareInfo.b;
        boolean z4 = fareInfo.c;
        double d4 = fareInfo.d;
        List list4 = fareInfo.e;
        boolean z5 = rideBasedSuperPassUIProperties.i.f5592a;
        long j12 = superPassUserDetails.h;
        SuperPassRepurchaseProperties superPassRepurchaseProperties = rideBasedSuperPass.d;
        String str17 = superPassRepurchaseProperties.f9569a;
        String str18 = superPassRepurchaseProperties.b;
        long j13 = superPassRepurchaseProperties.c;
        long j14 = superPassRepurchaseProperties.d;
        boolean z6 = superPassRepurchaseProperties.e;
        boolean z7 = superPassRepurchaseProperties.f;
        SuperPassTransactionDetails superPassTransactionDetails = rideBasedSuperPass.e;
        String str19 = superPassTransactionDetails.f9573a;
        String str20 = superPassTransactionDetails.b;
        SuperPassTripPreferences superPassTripPreferences = rideBasedSuperPass.i;
        String str21 = superPassTripPreferences.f9575a;
        String str22 = superPassTripPreferences.b;
        String str23 = superPassTripPreferences.c;
        String str24 = superPassTripPreferences.d;
        String str25 = superPassTripPreferences.e;
        RefundInfoEntityModel refundInfoEntityModel = superPassTransactionDetails.c;
        PassTierType passTierType = rideBasedSuperPassValidationProperties.h;
        Integer num = rideBasedSuperPassValidationProperties.i;
        Long lValueOf = num != null ? Long.valueOf(num.intValue()) : null;
        Integer num2 = rideBasedSuperPassValidationProperties.j;
        return new Ride_based_super_pass_table(j, j2, superPassStatus, j3, j4, j5, list, z, j6, j7, j8, z2, z3, list2, j9, d, str7, j10, list3, map, j11, str8, str9, str10, str11, str12, str13, gender, str14, str15, str16, d2, d3, z4, d4, list4, z5, j12, str, str2, str3, str4, superPassSubType, str5, str6, str17, str18, j13, j14, z6, z7, str19, str20, str21, str22, str23, str24, str25, refundInfoEntityModel, passTierType, lValueOf, num2 != null ? Long.valueOf(num2.intValue()) : null, Boolean.valueOf(rideBasedSuperPassValidationProperties.k), superPassProperties.h, Boolean.valueOf(rideBasedSuperPassUIProperties.k));
    }

    public static Super_pass_application_table g(SuperPassApplication superPassApplication) {
        Intrinsics.i(superPassApplication, "<this>");
        String str = superPassApplication.f9563a;
        String str2 = superPassApplication.b;
        String str3 = superPassApplication.c;
        String str4 = superPassApplication.d;
        long j = superPassApplication.e;
        String str5 = superPassApplication.f;
        String str6 = superPassApplication.g;
        long j2 = superPassApplication.h;
        long j3 = superPassApplication.i;
        SuperPassApplicationStatus superPassApplicationStatus = superPassApplication.k;
        Map map = superPassApplication.l;
        PassApplicationActionRequired passApplicationActionRequired = superPassApplication.o;
        SuperPassUserDetails superPassUserDetails = superPassApplication.j;
        String str7 = superPassUserDetails.f9580a;
        String str8 = superPassUserDetails.b;
        String str9 = superPassUserDetails.c;
        Gender gender = superPassUserDetails.d;
        String str10 = superPassUserDetails.e;
        String str11 = superPassUserDetails.f;
        String str12 = superPassUserDetails.g;
        long j4 = superPassUserDetails.h;
        CashPaymentPendingTransactionDetails cashPaymentPendingTransactionDetails = superPassApplication.m;
        Double dValueOf = cashPaymentPendingTransactionDetails != null ? Double.valueOf(cashPaymentPendingTransactionDetails.f9541a) : null;
        String str13 = cashPaymentPendingTransactionDetails != null ? cashPaymentPendingTransactionDetails.b : null;
        PassApplicationRejectionReasons passApplicationRejectionReasons = superPassApplication.n;
        return new Super_pass_application_table(str, str2, str3, str4, j, str5, str6, j2, j3, superPassApplicationStatus, map, passApplicationActionRequired, str7, str8, str9, gender, str10, str11, str12, j4, dValueOf, str13, passApplicationRejectionReasons != null ? passApplicationRejectionReasons.f9547a : null, passApplicationRejectionReasons != null ? passApplicationRejectionReasons.b : null, passApplicationRejectionReasons != null ? passApplicationRejectionReasons.c : null, superPassApplication.p);
    }
}
