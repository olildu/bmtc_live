package app.chalo.premiumbus.data.mappers;

import androidx.browser.customtabs.CustomTabsCallback;
import app.chalo.citydata.data.model.app.response.StopDetailsAppModel;
import app.chalo.data.PremiumProductionModificationAdditionalInfoCtaActionType;
import app.chalo.data.RefundInfoAppModel;
import app.chalo.models.LocationAppModel;
import app.chalo.premiumbus.data.models.api.response.ApplicableRuleApiResponseModel;
import app.chalo.premiumbus.data.models.api.response.ApplicableRuleUxCopyApiResponseModel;
import app.chalo.premiumbus.data.models.api.response.PremiumBusSeatSelectionLayoutResponseApiModelKt;
import app.chalo.premiumbus.data.models.api.response.PremiumBusUpsellSuggestionApiResponseModel;
import app.chalo.premiumbus.data.models.api.response.SeatInfoApiModel;
import app.chalo.premiumbus.data.models.app.ApplicableRuleAppModel;
import app.chalo.premiumbus.data.models.app.ApplicableRuleLocationType;
import app.chalo.premiumbus.data.models.app.ApplicableRuleUxCopyAppModel;
import app.chalo.premiumbus.data.models.app.FirstBookingAppModel;
import app.chalo.premiumbus.data.models.app.PremiumBusPassUpsellAppModel;
import app.chalo.premiumbus.data.models.app.PremiumPassengerDetailsAppModel;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketBookingPropertiesAppModel;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketFareAndPassengerPropertiesAppModel;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketTripPropertiesAppModel;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketValidationPropertiesAppModel;
import app.chalo.premiumbus.data.models.app.PremiumStopDetailsAppModel;
import app.chalo.premiumbus.data.models.app.SeatInfoAppModel;
import app.chalo.premiumbus.data.models.entity.PremiumCategoryFareBreakup;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketStatus;
import app.chalo.productbooking.common.data.models.api.response.FirstBookingApiModel;
import app.chalo.productbooking.common.data.models.api.response.GenericMobileTicketFareBreakupApiResponseModel;
import app.chalo.productbooking.common.data.models.api.response.GenericMobileTicketPassengerDetailsApiResponseModel;
import app.chalo.productbooking.common.data.models.api.response.GenericMobileTicketProductApiResponseModel;
import app.chalo.productbooking.common.data.models.api.response.GenericMobileTicketProductApiResponseModelKt;
import app.chalo.productbooking.common.data.models.api.response.GenericMobileTicketStopDetailsApiResponseModel;
import app.chalo.productbooking.common.data.models.api.response.MobileTicketProductStopDetailsApiModel;
import app.chalo.productbooking.common.data.models.api.response.RefundInfoApiModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.apache.commons.io.IOUtils;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PBRemoteToAppModelMappersKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6982a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[PremiumProductionModificationAdditionalInfoCtaActionType.values().length];
            try {
                iArr[PremiumProductionModificationAdditionalInfoCtaActionType.CALL_CUSTOMER_CARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f6982a = iArr;
            int[] iArr2 = new int[ApplicableRuleLocationType.values().length];
            try {
                iArr2[ApplicableRuleLocationType.SLOT_SCREEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[ApplicableRuleLocationType.CHECKOUT_SCREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ApplicableRuleLocationType.PRODUCT_SCREEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ApplicableRuleLocationType.CHALO_BUS_TAB.ordinal()] = 4;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ApplicableRuleLocationType.PASS_PURCHASE_CONFIRMATION_SCREEN.ordinal()] = 5;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ApplicableRuleLocationType.PASS_PLAN_SCREEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused7) {
            }
            b = iArr2;
        }
    }

    public static final ApplicableRuleApiResponseModel a(ApplicableRuleAppModel applicableRuleAppModel) {
        ApplicableRuleUxCopyApiResponseModel applicableRuleUxCopyApiResponseModel;
        Intrinsics.i(applicableRuleAppModel, "<this>");
        String str = applicableRuleAppModel.f7070a;
        String str2 = applicableRuleAppModel.b;
        String str3 = applicableRuleAppModel.c;
        String str4 = applicableRuleAppModel.d;
        Double dValueOf = Double.valueOf(applicableRuleAppModel.e);
        List<ApplicableRuleUxCopyAppModel> list = applicableRuleAppModel.f;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(list, 10));
        for (ApplicableRuleUxCopyAppModel applicableRuleUxCopyAppModel : list) {
            Intrinsics.i(applicableRuleUxCopyAppModel, "<this>");
            if (applicableRuleUxCopyAppModel instanceof ApplicableRuleUxCopyAppModel.CheckoutScreen) {
                ApplicableRuleUxCopyAppModel.CheckoutScreen checkoutScreen = (ApplicableRuleUxCopyAppModel.CheckoutScreen) applicableRuleUxCopyAppModel;
                applicableRuleUxCopyApiResponseModel = new ApplicableRuleUxCopyApiResponseModel(ApplicableRuleLocationType.CHECKOUT_SCREEN.getValue(), null, checkoutScreen.b, checkoutScreen.c, checkoutScreen.d);
            } else if (applicableRuleUxCopyAppModel instanceof ApplicableRuleUxCopyAppModel.ProductScreen) {
                applicableRuleUxCopyApiResponseModel = new ApplicableRuleUxCopyApiResponseModel(ApplicableRuleLocationType.PRODUCT_SCREEN.getValue(), ((ApplicableRuleUxCopyAppModel.ProductScreen) applicableRuleUxCopyAppModel).b, null, null, null);
            } else if (applicableRuleUxCopyAppModel instanceof ApplicableRuleUxCopyAppModel.SlotScreen) {
                applicableRuleUxCopyApiResponseModel = new ApplicableRuleUxCopyApiResponseModel(ApplicableRuleLocationType.SLOT_SCREEN.getValue(), ((ApplicableRuleUxCopyAppModel.SlotScreen) applicableRuleUxCopyAppModel).b, null, null, null);
            } else if (applicableRuleUxCopyAppModel instanceof ApplicableRuleUxCopyAppModel.ChaloBusTab) {
                applicableRuleUxCopyApiResponseModel = new ApplicableRuleUxCopyApiResponseModel(ApplicableRuleLocationType.CHALO_BUS_TAB.getValue(), ((ApplicableRuleUxCopyAppModel.ChaloBusTab) applicableRuleUxCopyAppModel).b, null, null, null);
            } else if (applicableRuleUxCopyAppModel instanceof ApplicableRuleUxCopyAppModel.PassPurchaseConfirmationScreen) {
                ApplicableRuleUxCopyAppModel.PassPurchaseConfirmationScreen passPurchaseConfirmationScreen = (ApplicableRuleUxCopyAppModel.PassPurchaseConfirmationScreen) applicableRuleUxCopyAppModel;
                applicableRuleUxCopyApiResponseModel = new ApplicableRuleUxCopyApiResponseModel(ApplicableRuleLocationType.PASS_PURCHASE_CONFIRMATION_SCREEN.getValue(), null, passPurchaseConfirmationScreen.b, passPurchaseConfirmationScreen.c, passPurchaseConfirmationScreen.d);
            } else {
                if (!(applicableRuleUxCopyAppModel instanceof ApplicableRuleUxCopyAppModel.PassPlanScreen)) {
                    throw new NoWhenBranchMatchedException();
                }
                applicableRuleUxCopyApiResponseModel = new ApplicableRuleUxCopyApiResponseModel(ApplicableRuleLocationType.PASS_PLAN_SCREEN.getValue(), ((ApplicableRuleUxCopyAppModel.PassPlanScreen) applicableRuleUxCopyAppModel).b, null, null, null);
            }
            arrayList.add(applicableRuleUxCopyApiResponseModel);
        }
        Boolean boolValueOf = Boolean.valueOf(applicableRuleAppModel.g);
        Integer numValueOf = Integer.valueOf(applicableRuleAppModel.h);
        Long l = applicableRuleAppModel.i;
        PremiumBusPassUpsellAppModel premiumBusPassUpsellAppModel = applicableRuleAppModel.j;
        return new ApplicableRuleApiResponseModel(str, str2, str3, str4, dValueOf, arrayList, boolValueOf, numValueOf, l, premiumBusPassUpsellAppModel != null ? new PremiumBusUpsellSuggestionApiResponseModel(premiumBusPassUpsellAppModel.b, Integer.valueOf(premiumBusPassUpsellAppModel.c), premiumBusPassUpsellAppModel.d, premiumBusPassUpsellAppModel.e, premiumBusPassUpsellAppModel.f, premiumBusPassUpsellAppModel.g, premiumBusPassUpsellAppModel.h, premiumBusPassUpsellAppModel.i) : null);
    }

    /* JADX WARN: Code duplicated, block: B:116:0x017e  */
    /* JADX WARN: Code duplicated, block: B:119:0x0184  */
    /* JADX WARN: Code duplicated, block: B:128:0x019c  */
    /* JADX WARN: Code duplicated, block: B:130:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:133:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:136:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:141:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:147:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:153:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:159:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:166:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:170:0x020a  */
    /* JADX WARN: Code duplicated, block: B:175:0x008a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:0x0124 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x007d  */
    /* JADX WARN: Code duplicated, block: B:32:0x007f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0090  */
    /* JADX WARN: Code duplicated, block: B:39:0x0098  */
    /* JADX WARN: Code duplicated, block: B:41:0x009c  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00af  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:52:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:59:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00da  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:73:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:76:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:79:0x0102  */
    /* JADX WARN: Code duplicated, block: B:82:0x0107  */
    /* JADX WARN: Code duplicated, block: B:83:0x010d  */
    /* JADX WARN: Code duplicated, block: B:86:0x0115  */
    /* JADX WARN: Code duplicated, block: B:89:0x011a  */
    /* JADX WARN: Code duplicated, block: B:91:0x0121  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4, types: [java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r17v5, types: [app.chalo.premiumbus.data.models.app.ApplicableRuleLocationType] */
    /* JADX WARN: Type inference failed for: r3v5, types: [app.chalo.premiumbus.data.models.app.ApplicableRuleLocationType[]] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v10 app.chalo.premiumbus.data.models.app.RuleCategoryName, still in use, count: 2, list:
          (r10v10 app.chalo.premiumbus.data.models.app.RuleCategoryName) from 0x017a: PHI (r10 I:??) = 
          (r10v2 app.chalo.premiumbus.data.models.app.RuleCategoryName)
          (r10v10 app.chalo.premiumbus.data.models.app.RuleCategoryName)
         binds: [B:113:0x0178, B:181:0x017a] A[DONT_GENERATE, DONT_INLINE]
          (r10v10 app.chalo.premiumbus.data.models.app.RuleCategoryName) from 0x016d: INVOKE (r10v10 app.chalo.premiumbus.data.models.app.RuleCategoryName) VIRTUAL call: app.chalo.premiumbus.data.models.app.RuleCategoryName.getValue():java.lang.String A[MD:():java.lang.String (m), WRAPPED] (LINE:366)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public static final app.chalo.premiumbus.data.models.app.ApplicableRuleAppModel b(app.chalo.premiumbus.data.models.api.response.ApplicableRuleApiResponseModel r22) {
        /*
            Method dump skipped, instruction units count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.data.mappers.PBRemoteToAppModelMappersKt.b(app.chalo.premiumbus.data.models.api.response.ApplicableRuleApiResponseModel):app.chalo.premiumbus.data.models.app.ApplicableRuleAppModel");
    }

    /* JADX WARN: Code duplicated, block: B:101:0x017a  */
    /* JADX WARN: Code duplicated, block: B:102:0x0180  */
    /* JADX WARN: Code duplicated, block: B:105:0x018f  */
    /* JADX WARN: Code duplicated, block: B:106:0x0192  */
    /* JADX WARN: Code duplicated, block: B:109:0x0197  */
    /* JADX WARN: Code duplicated, block: B:110:0x019a  */
    /* JADX WARN: Code duplicated, block: B:113:0x019f  */
    /* JADX WARN: Code duplicated, block: B:114:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:117:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:120:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:121:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:124:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:127:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:129:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:137:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:139:0x0204  */
    /* JADX WARN: Code duplicated, block: B:142:0x0215  */
    /* JADX WARN: Code duplicated, block: B:148:0x0243  */
    /* JADX WARN: Code duplicated, block: B:150:0x024b  */
    /* JADX WARN: Code duplicated, block: B:154:0x0264  */
    /* JADX WARN: Code duplicated, block: B:157:0x027a  */
    /* JADX WARN: Code duplicated, block: B:159:0x0283  */
    /* JADX WARN: Code duplicated, block: B:162:0x0289  */
    /* JADX WARN: Code duplicated, block: B:163:0x0292  */
    /* JADX WARN: Code duplicated, block: B:169:0x00ca A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:174:0x00f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:0x027d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x024e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:48:0x00da  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:59:0x010b  */
    /* JADX WARN: Code duplicated, block: B:62:0x011b  */
    /* JADX WARN: Code duplicated, block: B:63:0x011e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0123  */
    /* JADX WARN: Code duplicated, block: B:68:0x012b  */
    /* JADX WARN: Code duplicated, block: B:69:0x0131  */
    /* JADX WARN: Code duplicated, block: B:73:0x0139  */
    /* JADX WARN: Code duplicated, block: B:75:0x013d  */
    /* JADX WARN: Code duplicated, block: B:76:0x0140  */
    /* JADX WARN: Code duplicated, block: B:79:0x0145  */
    /* JADX WARN: Code duplicated, block: B:81:0x014b  */
    /* JADX WARN: Code duplicated, block: B:92:0x0165  */
    /* JADX WARN: Code duplicated, block: B:99:0x0176  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v4, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.util.ArrayList] */
    public static final PremiumReserveTicketAppModel c(GenericMobileTicketProductApiResponseModel genericMobileTicketProductApiResponseModel) {
        String str;
        PremiumReserveTicketStatus premiumReserveTicketStatusValueOf;
        String str2;
        FirstBookingAppModel firstBookingAppModel;
        String str3;
        PremiumReserveTicketStatus premiumReserveTicketStatusValueOf2;
        PremiumReserveTicketStatus premiumReserveTicketStatus;
        RefundInfoApiModel refundInfoApiModel;
        RefundInfoAppModel refundInfoAppModelB;
        List list;
        ?? arrayList;
        PremiumReserveTicketBookingPropertiesAppModel premiumReserveTicketBookingPropertiesAppModel;
        String str4;
        String str5;
        Long l;
        long jLongValue;
        Long l2;
        long jLongValue2;
        String str6;
        String str7;
        String str8;
        GenericMobileTicketStopDetailsApiResponseModel genericMobileTicketStopDetailsApiResponseModel;
        String str9;
        String str10;
        PremiumStopDetailsAppModel premiumStopDetailsAppModel;
        GenericMobileTicketStopDetailsApiResponseModel genericMobileTicketStopDetailsApiResponseModel2;
        String str11;
        String str12;
        PremiumStopDetailsAppModel premiumStopDetailsAppModel2;
        Long l3;
        long jLongValue3;
        String str13;
        String str14;
        String str15;
        String str16;
        Long l4;
        long jLongValue4;
        Long l5;
        long jLongValue5;
        List list2;
        ?? arrayList2;
        String str17;
        String strR;
        Iterator it;
        GenericMobileTicketPassengerDetailsApiResponseModel genericMobileTicketPassengerDetailsApiResponseModel;
        String str18;
        String str19;
        Integer num;
        int iIntValue;
        Long l6;
        List list3;
        String str20;
        Iterator it2;
        String str21;
        String str22;
        List list4;
        PremiumPassengerDetailsAppModel premiumPassengerDetailsAppModel;
        ArrayList arrayList3;
        Iterator it3;
        String str23;
        PremiumCategoryFareBreakup premiumCategoryFareBreakup;
        Long l7;
        Iterator it4;
        SeatInfoAppModel seatInfoAppModelA;
        String str24 = "<this>";
        Intrinsics.i(genericMobileTicketProductApiResponseModel, "<this>");
        String str25 = genericMobileTicketProductApiResponseModel.f8124a;
        String str26 = str25 == null ? "" : str25;
        String str27 = genericMobileTicketProductApiResponseModel.q;
        if (str27 != null) {
            Long l8 = genericMobileTicketProductApiResponseModel.e;
            long jLongValue6 = l8 != null ? l8.longValue() : -1L;
            String str28 = genericMobileTicketProductApiResponseModel.k;
            String str29 = str28 == null ? "" : str28;
            String str30 = genericMobileTicketProductApiResponseModel.c;
            String str31 = genericMobileTicketProductApiResponseModel.d;
            String str32 = genericMobileTicketProductApiResponseModel.h;
            if (str32 != null && (str = genericMobileTicketProductApiResponseModel.g) != null) {
                PremiumReserveTicketStatus.INSTANCE.getClass();
                try {
                    premiumReserveTicketStatusValueOf = PremiumReserveTicketStatus.valueOf(str);
                } catch (IllegalArgumentException unused) {
                    premiumReserveTicketStatusValueOf = null;
                }
                if (premiumReserveTicketStatusValueOf != null) {
                    String str33 = genericMobileTicketProductApiResponseModel.y;
                    if (str33 == null) {
                        str33 = CustomTabsCallback.ONLINE_EXTRAS_KEY;
                    }
                    String str34 = str33;
                    String str35 = genericMobileTicketProductApiResponseModel.A;
                    String str36 = genericMobileTicketProductApiResponseModel.B;
                    FirstBookingApiModel firstBookingApiModel = genericMobileTicketProductApiResponseModel.D;
                    if (firstBookingApiModel != null) {
                        str2 = "";
                        String str37 = firstBookingApiModel.f8118a;
                        if (str37 != null) {
                            long j = firstBookingApiModel.b;
                            long j2 = firstBookingApiModel.c;
                            long j3 = firstBookingApiModel.d;
                            MobileTicketProductStopDetailsApiModel mobileTicketProductStopDetailsApiModel = firstBookingApiModel.e;
                            Intrinsics.i(mobileTicketProductStopDetailsApiModel, "<this>");
                            StopDetailsAppModel stopDetailsAppModel = new StopDetailsAppModel(mobileTicketProductStopDetailsApiModel.f8132a, mobileTicketProductStopDetailsApiModel.b, null, new LocationAppModel(0.0d, 0.0d), null);
                            MobileTicketProductStopDetailsApiModel mobileTicketProductStopDetailsApiModel2 = firstBookingApiModel.f;
                            Intrinsics.i(mobileTicketProductStopDetailsApiModel2, "<this>");
                            firstBookingAppModel = new FirstBookingAppModel(str37, j, j2, j3, stopDetailsAppModel, new StopDetailsAppModel(mobileTicketProductStopDetailsApiModel2.f8132a, mobileTicketProductStopDetailsApiModel2.b, null, new LocationAppModel(0.0d, 0.0d), null), firstBookingApiModel.g, firstBookingApiModel.h);
                        }
                        str3 = genericMobileTicketProductApiResponseModel.E;
                        if (str3 != null) {
                            try {
                                premiumReserveTicketStatusValueOf2 = PremiumReserveTicketStatus.valueOf(str3);
                            } catch (IllegalArgumentException unused2) {
                                premiumReserveTicketStatusValueOf2 = null;
                            }
                            premiumReserveTicketStatus = premiumReserveTicketStatusValueOf2;
                        } else {
                            premiumReserveTicketStatus = null;
                        }
                        refundInfoApiModel = genericMobileTicketProductApiResponseModel.F;
                        if (refundInfoApiModel != null) {
                            refundInfoAppModelB = GenericMobileTicketProductApiResponseModelKt.b(refundInfoApiModel);
                        } else {
                            refundInfoAppModelB = null;
                        }
                        list = genericMobileTicketProductApiResponseModel.G;
                        if (list != null) {
                            arrayList = new ArrayList();
                            it4 = list.iterator();
                            while (it4.hasNext()) {
                                seatInfoAppModelA = PremiumBusSeatSelectionLayoutResponseApiModelKt.a((SeatInfoApiModel) it4.next());
                                if (seatInfoAppModelA != null) {
                                    arrayList.add(seatInfoAppModelA);
                                }
                            }
                        } else {
                            arrayList = EmptyList.f17557a;
                        }
                        premiumReserveTicketBookingPropertiesAppModel = new PremiumReserveTicketBookingPropertiesAppModel(str26, jLongValue6, str29, str30, str31, str32, str27, premiumReserveTicketStatusValueOf, str34, str35, str36, firstBookingAppModel, premiumReserveTicketStatus, refundInfoAppModelB, arrayList);
                        str4 = genericMobileTicketProductApiResponseModel.l;
                        if (str4 == null) {
                            str5 = str2;
                        } else {
                            str5 = str4;
                        }
                        l = genericMobileTicketProductApiResponseModel.m;
                        if (l != null) {
                            return null;
                        }
                        jLongValue = l.longValue();
                        l2 = genericMobileTicketProductApiResponseModel.s;
                        if (l2 != null) {
                            jLongValue2 = l2.longValue();
                        } else {
                            jLongValue2 = -1;
                        }
                        str6 = genericMobileTicketProductApiResponseModel.p;
                        if (str6 == null) {
                            return null;
                        }
                        str7 = genericMobileTicketProductApiResponseModel.r;
                        if (str7 == null) {
                            str8 = str2;
                        } else {
                            str8 = str7;
                        }
                        genericMobileTicketStopDetailsApiResponseModel = genericMobileTicketProductApiResponseModel.n;
                        if (genericMobileTicketStopDetailsApiResponseModel != null) {
                            return null;
                        }
                        str9 = genericMobileTicketStopDetailsApiResponseModel.f8130a;
                        if (str9 == null && (str10 = genericMobileTicketStopDetailsApiResponseModel.b) != null) {
                            premiumStopDetailsAppModel = new PremiumStopDetailsAppModel(str9, str10);
                        } else {
                            premiumStopDetailsAppModel = null;
                        }
                        if (premiumStopDetailsAppModel != null || (genericMobileTicketStopDetailsApiResponseModel2 = genericMobileTicketProductApiResponseModel.o) == null) {
                            return null;
                        }
                        str11 = genericMobileTicketStopDetailsApiResponseModel2.f8130a;
                        if (str11 == null && (str12 = genericMobileTicketStopDetailsApiResponseModel2.b) != null) {
                            premiumStopDetailsAppModel2 = new PremiumStopDetailsAppModel(str11, str12);
                        } else {
                            premiumStopDetailsAppModel2 = null;
                        }
                        if (premiumStopDetailsAppModel2 == null) {
                            return null;
                        }
                        l3 = genericMobileTicketProductApiResponseModel.K;
                        if (l3 != null) {
                            jLongValue3 = l3.longValue();
                        } else {
                            jLongValue3 = -1;
                        }
                        PremiumReserveTicketTripPropertiesAppModel premiumReserveTicketTripPropertiesAppModel = new PremiumReserveTicketTripPropertiesAppModel(str5, jLongValue, jLongValue2, jLongValue3, str6, str8, premiumStopDetailsAppModel, premiumStopDetailsAppModel2, false);
                        str13 = genericMobileTicketProductApiResponseModel.j;
                        if (str13 == null) {
                            str14 = str2;
                        } else {
                            str14 = str13;
                        }
                        str15 = genericMobileTicketProductApiResponseModel.i;
                        if (str15 == null) {
                            str16 = str2;
                        } else {
                            str16 = str15;
                        }
                        l4 = genericMobileTicketProductApiResponseModel.t;
                        if (l4 != null) {
                            jLongValue4 = l4.longValue();
                        } else {
                            jLongValue4 = -1;
                        }
                        Long l9 = genericMobileTicketProductApiResponseModel.u;
                        PremiumReserveTicketValidationPropertiesAppModel premiumReserveTicketValidationPropertiesAppModel = new PremiumReserveTicketValidationPropertiesAppModel(str14, str16, jLongValue4, l9 != null ? l9.longValue() : -1L, genericMobileTicketProductApiResponseModel.x);
                        l5 = genericMobileTicketProductApiResponseModel.f;
                        if (l5 != null) {
                            jLongValue5 = l5.longValue();
                        } else {
                            jLongValue5 = 0;
                        }
                        list2 = genericMobileTicketProductApiResponseModel.v;
                        if (list2 != null) {
                            arrayList2 = new ArrayList();
                            it = list2.iterator();
                            while (it.hasNext()) {
                                genericMobileTicketPassengerDetailsApiResponseModel = (GenericMobileTicketPassengerDetailsApiResponseModel) it.next();
                                Intrinsics.i(genericMobileTicketPassengerDetailsApiResponseModel, str24);
                                str18 = genericMobileTicketPassengerDetailsApiResponseModel.f8122a;
                                if (str18 != null || (str19 = genericMobileTicketPassengerDetailsApiResponseModel.b) == null || (num = genericMobileTicketPassengerDetailsApiResponseModel.c) == null) {
                                    str20 = str24;
                                    it2 = it;
                                    premiumPassengerDetailsAppModel = null;
                                } else {
                                    iIntValue = num.intValue();
                                    l6 = genericMobileTicketPassengerDetailsApiResponseModel.d;
                                    if (l6 != null) {
                                        long jLongValue7 = l6.longValue();
                                        list3 = genericMobileTicketPassengerDetailsApiResponseModel.f;
                                        if (list3 != null) {
                                            arrayList3 = new ArrayList();
                                            it3 = list3.iterator();
                                            while (it3.hasNext()) {
                                                String str38 = str24;
                                                GenericMobileTicketFareBreakupApiResponseModel genericMobileTicketFareBreakupApiResponseModel = (GenericMobileTicketFareBreakupApiResponseModel) it3.next();
                                                Iterator it5 = it;
                                                str23 = genericMobileTicketFareBreakupApiResponseModel.f8120a;
                                                Iterator it6 = it3;
                                                Integer num2 = genericMobileTicketFareBreakupApiResponseModel.c;
                                                if (str23 != null || (l7 = genericMobileTicketFareBreakupApiResponseModel.b) == null || num2 == null) {
                                                    premiumCategoryFareBreakup = null;
                                                } else {
                                                    premiumCategoryFareBreakup = new PremiumCategoryFareBreakup(str23, l7.longValue(), num2.intValue());
                                                }
                                                if (premiumCategoryFareBreakup != null) {
                                                    arrayList3.add(premiumCategoryFareBreakup);
                                                }
                                                it3 = it6;
                                                str24 = str38;
                                                it = it5;
                                                str18 = str18;
                                                str19 = str19;
                                            }
                                            str20 = str24;
                                            it2 = it;
                                            str21 = str18;
                                            str22 = str19;
                                            list4 = arrayList3;
                                        } else {
                                            str20 = str24;
                                            it2 = it;
                                            str21 = str18;
                                            str22 = str19;
                                            list4 = EmptyList.f17557a;
                                        }
                                        premiumPassengerDetailsAppModel = new PremiumPassengerDetailsAppModel(str21, str22, iIntValue, jLongValue7, list4);
                                    } else {
                                        str20 = str24;
                                        it2 = it;
                                        premiumPassengerDetailsAppModel = null;
                                    }
                                }
                                if (premiumPassengerDetailsAppModel != null) {
                                    arrayList2.add(premiumPassengerDetailsAppModel);
                                }
                                str24 = str20;
                                it = it2;
                            }
                        } else {
                            arrayList2 = EmptyList.f17557a;
                        }
                        str17 = genericMobileTicketProductApiResponseModel.C;
                        if (str17 != null) {
                            strR = StringsKt.R(str17, "\\n", IOUtils.LINE_SEPARATOR_UNIX);
                        } else {
                            strR = null;
                        }
                        return new PremiumReserveTicketAppModel(premiumReserveTicketBookingPropertiesAppModel, premiumReserveTicketTripPropertiesAppModel, premiumReserveTicketValidationPropertiesAppModel, new PremiumReserveTicketFareAndPassengerPropertiesAppModel(jLongValue5, strR, arrayList2));
                    }
                    str2 = "";
                    firstBookingAppModel = null;
                    str3 = genericMobileTicketProductApiResponseModel.E;
                    if (str3 != null) {
                        premiumReserveTicketStatusValueOf2 = PremiumReserveTicketStatus.valueOf(str3);
                        premiumReserveTicketStatus = premiumReserveTicketStatusValueOf2;
                    } else {
                        premiumReserveTicketStatus = null;
                    }
                    refundInfoApiModel = genericMobileTicketProductApiResponseModel.F;
                    if (refundInfoApiModel != null) {
                        refundInfoAppModelB = GenericMobileTicketProductApiResponseModelKt.b(refundInfoApiModel);
                    } else {
                        refundInfoAppModelB = null;
                    }
                    list = genericMobileTicketProductApiResponseModel.G;
                    if (list != null) {
                        arrayList = new ArrayList();
                        it4 = list.iterator();
                        while (it4.hasNext()) {
                            seatInfoAppModelA = PremiumBusSeatSelectionLayoutResponseApiModelKt.a((SeatInfoApiModel) it4.next());
                            if (seatInfoAppModelA != null) {
                                arrayList.add(seatInfoAppModelA);
                            }
                        }
                    } else {
                        arrayList = EmptyList.f17557a;
                    }
                    premiumReserveTicketBookingPropertiesAppModel = new PremiumReserveTicketBookingPropertiesAppModel(str26, jLongValue6, str29, str30, str31, str32, str27, premiumReserveTicketStatusValueOf, str34, str35, str36, firstBookingAppModel, premiumReserveTicketStatus, refundInfoAppModelB, arrayList);
                    str4 = genericMobileTicketProductApiResponseModel.l;
                    if (str4 == null) {
                        str5 = str2;
                    } else {
                        str5 = str4;
                    }
                    l = genericMobileTicketProductApiResponseModel.m;
                    if (l != null) {
                        return null;
                    }
                    jLongValue = l.longValue();
                    l2 = genericMobileTicketProductApiResponseModel.s;
                    if (l2 != null) {
                        jLongValue2 = l2.longValue();
                    } else {
                        jLongValue2 = -1;
                    }
                    str6 = genericMobileTicketProductApiResponseModel.p;
                    if (str6 == null) {
                        return null;
                    }
                    str7 = genericMobileTicketProductApiResponseModel.r;
                    if (str7 == null) {
                        str8 = str2;
                    } else {
                        str8 = str7;
                    }
                    genericMobileTicketStopDetailsApiResponseModel = genericMobileTicketProductApiResponseModel.n;
                    if (genericMobileTicketStopDetailsApiResponseModel != null) {
                        return null;
                    }
                    str9 = genericMobileTicketStopDetailsApiResponseModel.f8130a;
                    if (str9 == null) {
                        premiumStopDetailsAppModel = null;
                    } else {
                        premiumStopDetailsAppModel = new PremiumStopDetailsAppModel(str9, str10);
                    }
                    if (premiumStopDetailsAppModel != null) {
                        return null;
                    }
                    str11 = genericMobileTicketStopDetailsApiResponseModel2.f8130a;
                    if (str11 == null) {
                        premiumStopDetailsAppModel2 = null;
                    } else {
                        premiumStopDetailsAppModel2 = new PremiumStopDetailsAppModel(str11, str12);
                    }
                    if (premiumStopDetailsAppModel2 == null) {
                        return null;
                    }
                    l3 = genericMobileTicketProductApiResponseModel.K;
                    if (l3 != null) {
                        jLongValue3 = l3.longValue();
                    } else {
                        jLongValue3 = -1;
                    }
                    PremiumReserveTicketTripPropertiesAppModel premiumReserveTicketTripPropertiesAppModel2 = new PremiumReserveTicketTripPropertiesAppModel(str5, jLongValue, jLongValue2, jLongValue3, str6, str8, premiumStopDetailsAppModel, premiumStopDetailsAppModel2, false);
                    str13 = genericMobileTicketProductApiResponseModel.j;
                    if (str13 == null) {
                        str14 = str2;
                    } else {
                        str14 = str13;
                    }
                    str15 = genericMobileTicketProductApiResponseModel.i;
                    if (str15 == null) {
                        str16 = str2;
                    } else {
                        str16 = str15;
                    }
                    l4 = genericMobileTicketProductApiResponseModel.t;
                    if (l4 != null) {
                        jLongValue4 = l4.longValue();
                    } else {
                        jLongValue4 = -1;
                    }
                    Long l10 = genericMobileTicketProductApiResponseModel.u;
                    PremiumReserveTicketValidationPropertiesAppModel premiumReserveTicketValidationPropertiesAppModel2 = new PremiumReserveTicketValidationPropertiesAppModel(str14, str16, jLongValue4, l10 != null ? l10.longValue() : -1L, genericMobileTicketProductApiResponseModel.x);
                    l5 = genericMobileTicketProductApiResponseModel.f;
                    if (l5 != null) {
                        jLongValue5 = l5.longValue();
                    } else {
                        jLongValue5 = 0;
                    }
                    list2 = genericMobileTicketProductApiResponseModel.v;
                    if (list2 != null) {
                        arrayList2 = new ArrayList();
                        it = list2.iterator();
                        while (it.hasNext()) {
                            genericMobileTicketPassengerDetailsApiResponseModel = (GenericMobileTicketPassengerDetailsApiResponseModel) it.next();
                            Intrinsics.i(genericMobileTicketPassengerDetailsApiResponseModel, str24);
                            str18 = genericMobileTicketPassengerDetailsApiResponseModel.f8122a;
                            if (str18 != null) {
                                str20 = str24;
                                it2 = it;
                                premiumPassengerDetailsAppModel = null;
                            } else {
                                iIntValue = num.intValue();
                                l6 = genericMobileTicketPassengerDetailsApiResponseModel.d;
                                if (l6 != null) {
                                    long jLongValue8 = l6.longValue();
                                    list3 = genericMobileTicketPassengerDetailsApiResponseModel.f;
                                    if (list3 != null) {
                                        arrayList3 = new ArrayList();
                                        it3 = list3.iterator();
                                        while (it3.hasNext()) {
                                            String str39 = str24;
                                            GenericMobileTicketFareBreakupApiResponseModel genericMobileTicketFareBreakupApiResponseModel2 = (GenericMobileTicketFareBreakupApiResponseModel) it3.next();
                                            Iterator it7 = it;
                                            str23 = genericMobileTicketFareBreakupApiResponseModel2.f8120a;
                                            Iterator it8 = it3;
                                            Integer num3 = genericMobileTicketFareBreakupApiResponseModel2.c;
                                            if (str23 != null) {
                                                premiumCategoryFareBreakup = null;
                                            } else {
                                                premiumCategoryFareBreakup = null;
                                            }
                                            if (premiumCategoryFareBreakup != null) {
                                                arrayList3.add(premiumCategoryFareBreakup);
                                            }
                                            it3 = it8;
                                            str24 = str39;
                                            it = it7;
                                            str18 = str18;
                                            str19 = str19;
                                        }
                                        str20 = str24;
                                        it2 = it;
                                        str21 = str18;
                                        str22 = str19;
                                        list4 = arrayList3;
                                    } else {
                                        str20 = str24;
                                        it2 = it;
                                        str21 = str18;
                                        str22 = str19;
                                        list4 = EmptyList.f17557a;
                                    }
                                    premiumPassengerDetailsAppModel = new PremiumPassengerDetailsAppModel(str21, str22, iIntValue, jLongValue8, list4);
                                } else {
                                    str20 = str24;
                                    it2 = it;
                                    premiumPassengerDetailsAppModel = null;
                                }
                            }
                            if (premiumPassengerDetailsAppModel != null) {
                                arrayList2.add(premiumPassengerDetailsAppModel);
                            }
                            str24 = str20;
                            it = it2;
                        }
                    } else {
                        arrayList2 = EmptyList.f17557a;
                    }
                    str17 = genericMobileTicketProductApiResponseModel.C;
                    if (str17 != null) {
                        strR = StringsKt.R(str17, "\\n", IOUtils.LINE_SEPARATOR_UNIX);
                    } else {
                        strR = null;
                    }
                    return new PremiumReserveTicketAppModel(premiumReserveTicketBookingPropertiesAppModel, premiumReserveTicketTripPropertiesAppModel2, premiumReserveTicketValidationPropertiesAppModel2, new PremiumReserveTicketFareAndPassengerPropertiesAppModel(jLongValue5, strR, arrayList2));
                }
            }
        }
        return null;
    }
}
