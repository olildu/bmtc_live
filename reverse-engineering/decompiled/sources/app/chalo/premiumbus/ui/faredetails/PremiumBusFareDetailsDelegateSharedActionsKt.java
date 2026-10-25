package app.chalo.premiumbus.ui.faredetails;

import app.chalo.bookingsuccessproducttype.BookingSuccessProductType;
import app.chalo.constants.Source;
import app.chalo.features.chalotime.ChaloTimeProvider;
import app.chalo.models.SuperPassSubTypes;
import app.chalo.models.productbooking.SuperPassPurchaseStopsInfo;
import app.chalo.network.config.ChaloJson;
import app.chalo.premiumbus.PremiumBusProductPurchaseFlowType;
import app.chalo.premiumbus.data.SuperPassDataWrapper;
import app.chalo.premiumbus.data.SuperPassValidationPropertiesAppModel;
import app.chalo.premiumbus.data.models.app.PBStopPlaceSelectedAppModel;
import app.chalo.premiumbus.data.models.app.PassTierType;
import app.chalo.premiumbus.data.models.app.PremiumBusSelectedLocationType;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsBottomSheetType;
import app.chalo.productbooking.common.data.models.app.FareDetailsData;
import app.chalo.productbooking.common.data.models.app.ProductBookingStopDetails;
import app.chalo.scenes.ChaloNavOptions;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.PopUpToConfig;
import app.chalo.scenes.args.BookingSuccessArgs;
import app.chalo.scenes.args.HomeArgs;
import app.chalo.utils.SystemHelper;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.JobKt;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PremiumBusFareDetailsDelegateSharedActionsKt {
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object a(FareDetailsData fareDetailsData, ChaloTimeProvider chaloTimeProvider, SystemHelper systemHelper, ChaloNavigationManager chaloNavigationManager, ContinuationImpl continuationImpl) {
        PremiumBusFareDetailsDelegateSharedActionsKt$navigateToBookingSuccessScreenForGenderMismatch$1 premiumBusFareDetailsDelegateSharedActionsKt$navigateToBookingSuccessScreenForGenderMismatch$1;
        PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel;
        PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel2;
        SystemHelper systemHelper2;
        ChaloNavigationManager chaloNavigationManager2;
        Object objB;
        PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel3;
        long jLongValue;
        if (continuationImpl instanceof PremiumBusFareDetailsDelegateSharedActionsKt$navigateToBookingSuccessScreenForGenderMismatch$1) {
            premiumBusFareDetailsDelegateSharedActionsKt$navigateToBookingSuccessScreenForGenderMismatch$1 = (PremiumBusFareDetailsDelegateSharedActionsKt$navigateToBookingSuccessScreenForGenderMismatch$1) continuationImpl;
            int i = premiumBusFareDetailsDelegateSharedActionsKt$navigateToBookingSuccessScreenForGenderMismatch$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusFareDetailsDelegateSharedActionsKt$navigateToBookingSuccessScreenForGenderMismatch$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusFareDetailsDelegateSharedActionsKt$navigateToBookingSuccessScreenForGenderMismatch$1 = new PremiumBusFareDetailsDelegateSharedActionsKt$navigateToBookingSuccessScreenForGenderMismatch$1(continuationImpl);
            }
        } else {
            premiumBusFareDetailsDelegateSharedActionsKt$navigateToBookingSuccessScreenForGenderMismatch$1 = new PremiumBusFareDetailsDelegateSharedActionsKt$navigateToBookingSuccessScreenForGenderMismatch$1(continuationImpl);
        }
        Object obj = premiumBusFareDetailsDelegateSharedActionsKt$navigateToBookingSuccessScreenForGenderMismatch$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusFareDetailsDelegateSharedActionsKt$navigateToBookingSuccessScreenForGenderMismatch$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            ProductBookingStopDetails productBookingStopDetails = fareDetailsData.b;
            Intrinsics.i(productBookingStopDetails, "<this>");
            String str = productBookingStopDetails.f8199a;
            String str2 = productBookingStopDetails.b;
            String str3 = productBookingStopDetails.c;
            PremiumBusSelectedLocationType premiumBusSelectedLocationType = PremiumBusSelectedLocationType.STOP;
            pBStopPlaceSelectedAppModel = new PBStopPlaceSelectedAppModel(str, "searchPartnerChaloStop", str2, str3, null, premiumBusSelectedLocationType);
            ProductBookingStopDetails productBookingStopDetails2 = fareDetailsData.c;
            Intrinsics.i(productBookingStopDetails2, "<this>");
            pBStopPlaceSelectedAppModel2 = new PBStopPlaceSelectedAppModel(productBookingStopDetails2.f8199a, "searchPartnerChaloStop", productBookingStopDetails2.b, productBookingStopDetails2.c, null, premiumBusSelectedLocationType);
            Long l = fareDetailsData.e;
            if (l != null) {
                jLongValue = l.longValue();
                chaloNavigationManager2 = chaloNavigationManager;
            } else {
                systemHelper2 = systemHelper;
                premiumBusFareDetailsDelegateSharedActionsKt$navigateToBookingSuccessScreenForGenderMismatch$1.L$0 = systemHelper2;
                chaloNavigationManager2 = chaloNavigationManager;
                premiumBusFareDetailsDelegateSharedActionsKt$navigateToBookingSuccessScreenForGenderMismatch$1.L$1 = chaloNavigationManager2;
                premiumBusFareDetailsDelegateSharedActionsKt$navigateToBookingSuccessScreenForGenderMismatch$1.L$2 = pBStopPlaceSelectedAppModel2;
                premiumBusFareDetailsDelegateSharedActionsKt$navigateToBookingSuccessScreenForGenderMismatch$1.L$3 = pBStopPlaceSelectedAppModel;
                premiumBusFareDetailsDelegateSharedActionsKt$navigateToBookingSuccessScreenForGenderMismatch$1.label = 1;
                objB = chaloTimeProvider.b(premiumBusFareDetailsDelegateSharedActionsKt$navigateToBookingSuccessScreenForGenderMismatch$1);
                if (objB == obj2) {
                    return obj2;
                }
                pBStopPlaceSelectedAppModel3 = pBStopPlaceSelectedAppModel2;
            }
            PremiumBusProductPurchaseFlowType.FreshPurchase freshPurchase = new PremiumBusProductPurchaseFlowType.FreshPurchase(pBStopPlaceSelectedAppModel, pBStopPlaceSelectedAppModel2, jLongValue);
            JobKt.e(premiumBusFareDetailsDelegateSharedActionsKt$navigateToBookingSuccessScreenForGenderMismatch$1.getContext());
            HomeArgs homeArgs = new HomeArgs((String) null, (String) null, 7);
            Json json = ChaloJson.b;
            json.getClass();
            ChaloNavigationManagerKt.a(chaloNavigationManager2, CollectionsKt.S(homeArgs, new BookingSuccessArgs.ProductSuccessScreen(new BookingSuccessProductType.GenderMismatchError(json.a(PremiumBusProductPurchaseFlowType.FreshPurchase.INSTANCE.serializer(), freshPurchase)), Source.PREMIUM_BUS_FARE_DETAILS_SCREEN)));
            return Unit.f17538a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel4 = (PBStopPlaceSelectedAppModel) premiumBusFareDetailsDelegateSharedActionsKt$navigateToBookingSuccessScreenForGenderMismatch$1.L$3;
        pBStopPlaceSelectedAppModel3 = (PBStopPlaceSelectedAppModel) premiumBusFareDetailsDelegateSharedActionsKt$navigateToBookingSuccessScreenForGenderMismatch$1.L$2;
        ChaloNavigationManager chaloNavigationManager3 = (ChaloNavigationManager) premiumBusFareDetailsDelegateSharedActionsKt$navigateToBookingSuccessScreenForGenderMismatch$1.L$1;
        SystemHelper systemHelper3 = (SystemHelper) premiumBusFareDetailsDelegateSharedActionsKt$navigateToBookingSuccessScreenForGenderMismatch$1.L$0;
        ResultKt.b(obj);
        pBStopPlaceSelectedAppModel = pBStopPlaceSelectedAppModel4;
        systemHelper2 = systemHelper3;
        objB = obj;
        chaloNavigationManager2 = chaloNavigationManager3;
        Long l2 = (Long) objB;
        jLongValue = l2 != null ? l2.longValue() : systemHelper2.j();
        pBStopPlaceSelectedAppModel2 = pBStopPlaceSelectedAppModel3;
        PremiumBusProductPurchaseFlowType.FreshPurchase freshPurchase2 = new PremiumBusProductPurchaseFlowType.FreshPurchase(pBStopPlaceSelectedAppModel, pBStopPlaceSelectedAppModel2, jLongValue);
        JobKt.e(premiumBusFareDetailsDelegateSharedActionsKt$navigateToBookingSuccessScreenForGenderMismatch$1.getContext());
        HomeArgs homeArgs2 = new HomeArgs((String) null, (String) null, 7);
        Json json2 = ChaloJson.b;
        json2.getClass();
        ChaloNavigationManagerKt.a(chaloNavigationManager2, CollectionsKt.S(homeArgs2, new BookingSuccessArgs.ProductSuccessScreen(new BookingSuccessProductType.GenderMismatchError(json2.a(PremiumBusProductPurchaseFlowType.FreshPurchase.INSTANCE.serializer(), freshPurchase2)), Source.PREMIUM_BUS_FARE_DETAILS_SCREEN)));
        return Unit.f17538a;
    }

    public static final void b(ChaloNavigationManager chaloNavigationManager) {
        chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new HomeArgs((String) null, (String) null, 7), new ChaloNavOptions(new PopUpToConfig.ClearAll(), 2), null, 4));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object c(String str, String str2, SuperPassSubTypes superPassSubTypes, SuperPassDataWrapper superPassDataWrapper, ChaloNavigationManager chaloNavigationManager, ContinuationImpl continuationImpl) {
        PremiumBusFareDetailsDelegateSharedActionsKt$navigateToPremiumTicketBookingSuccess$1 premiumBusFareDetailsDelegateSharedActionsKt$navigateToPremiumTicketBookingSuccess$1;
        String str3;
        String tierTypeStr;
        PassTierType passTierType;
        if (continuationImpl instanceof PremiumBusFareDetailsDelegateSharedActionsKt$navigateToPremiumTicketBookingSuccess$1) {
            premiumBusFareDetailsDelegateSharedActionsKt$navigateToPremiumTicketBookingSuccess$1 = (PremiumBusFareDetailsDelegateSharedActionsKt$navigateToPremiumTicketBookingSuccess$1) continuationImpl;
            int i = premiumBusFareDetailsDelegateSharedActionsKt$navigateToPremiumTicketBookingSuccess$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusFareDetailsDelegateSharedActionsKt$navigateToPremiumTicketBookingSuccess$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusFareDetailsDelegateSharedActionsKt$navigateToPremiumTicketBookingSuccess$1 = new PremiumBusFareDetailsDelegateSharedActionsKt$navigateToPremiumTicketBookingSuccess$1(continuationImpl);
            }
        } else {
            premiumBusFareDetailsDelegateSharedActionsKt$navigateToPremiumTicketBookingSuccess$1 = new PremiumBusFareDetailsDelegateSharedActionsKt$navigateToPremiumTicketBookingSuccess$1(continuationImpl);
        }
        Object objC = premiumBusFareDetailsDelegateSharedActionsKt$navigateToPremiumTicketBookingSuccess$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusFareDetailsDelegateSharedActionsKt$navigateToPremiumTicketBookingSuccess$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            premiumBusFareDetailsDelegateSharedActionsKt$navigateToPremiumTicketBookingSuccess$1.L$0 = str;
            premiumBusFareDetailsDelegateSharedActionsKt$navigateToPremiumTicketBookingSuccess$1.L$1 = null;
            premiumBusFareDetailsDelegateSharedActionsKt$navigateToPremiumTicketBookingSuccess$1.L$2 = chaloNavigationManager;
            premiumBusFareDetailsDelegateSharedActionsKt$navigateToPremiumTicketBookingSuccess$1.label = 1;
            objC = superPassDataWrapper.c(str2, superPassSubTypes, premiumBusFareDetailsDelegateSharedActionsKt$navigateToPremiumTicketBookingSuccess$1);
            if (objC == obj) {
                return obj;
            }
            str3 = null;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            chaloNavigationManager = (ChaloNavigationManager) premiumBusFareDetailsDelegateSharedActionsKt$navigateToPremiumTicketBookingSuccess$1.L$2;
            String str4 = (String) premiumBusFareDetailsDelegateSharedActionsKt$navigateToPremiumTicketBookingSuccess$1.L$1;
            String str5 = (String) premiumBusFareDetailsDelegateSharedActionsKt$navigateToPremiumTicketBookingSuccess$1.L$0;
            ResultKt.b(objC);
            str3 = str4;
            str = str5;
        }
        SuperPassValidationPropertiesAppModel superPassValidationPropertiesAppModel = (SuperPassValidationPropertiesAppModel) objC;
        JobKt.e(premiumBusFareDetailsDelegateSharedActionsKt$navigateToPremiumTicketBookingSuccess$1.getContext());
        if (superPassValidationPropertiesAppModel == null || (passTierType = superPassValidationPropertiesAppModel.h) == null || (tierTypeStr = passTierType.getTierTypeStr()) == null) {
            tierTypeStr = PassTierType.UNKNOWN.getTierTypeStr();
        }
        Pair pair = new Pair("offerEngineRuleName", "null");
        if (str3 == null) {
            str3 = "null";
        }
        chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new BookingSuccessArgs.ProductSuccessScreen(new BookingSuccessProductType.PremiumReserveTicket(str, tierTypeStr, MapsKt.i(pair, new Pair("offerEngineRuleId", str3), new Pair("offerEnginePriceOperator", "null"), new Pair("offerEnginePriceOperatorValue", "null"))), Source.PREMIUM_BUS_FARE_DETAILS_SCREEN), null, null, 6));
        return Unit.f17538a;
    }

    public static final PremiumBusFareDetailsBottomSheetType.TncSection d(List list) {
        if (list == null) {
            list = EmptyList.f17557a;
        }
        if (list.isEmpty()) {
            return null;
        }
        return new PremiumBusFareDetailsBottomSheetType.TncSection(list);
    }

    public static final SuperPassPurchaseStopsInfo e(FareDetailsData fareDetailsData) {
        Intrinsics.i(fareDetailsData, "<this>");
        ProductBookingStopDetails productBookingStopDetails = fareDetailsData.b;
        String str = productBookingStopDetails.b;
        String str2 = productBookingStopDetails.f8199a;
        ProductBookingStopDetails productBookingStopDetails2 = fareDetailsData.c;
        return new SuperPassPurchaseStopsInfo(str, str2, productBookingStopDetails2.b, productBookingStopDetails2.f8199a, fareDetailsData.f8185a.b);
    }
}
