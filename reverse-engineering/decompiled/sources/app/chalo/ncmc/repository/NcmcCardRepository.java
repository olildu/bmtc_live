package app.chalo.ncmc.repository;

import app.chalo.contract.BasicInfoContract;
import app.chalo.models.CardProps;
import app.chalo.models.CardRechargeConfiguration;
import app.chalo.models.CardRechargeFareInfo;
import app.chalo.models.CreateCardRechargeOrderRequestApiModel;
import app.chalo.models.PaymentProps;
import app.chalo.models.ProductBranding;
import app.chalo.models.ordercreation.CreateOrderResponseApiModel;
import app.chalo.models.ordercreation.CreateOrderResponseApiModelKt;
import app.chalo.ncmc.data.NcmcCardAppModel;
import app.chalo.ncmc.data.NcmcCardRechargeConfigAppModel;
import app.chalo.ncmc.data.NcmcCardRechargeConfigsListAppModel;
import app.chalo.ncmc.data.NcmcCardRechargeModelItem;
import app.chalo.ncmc.data.NcmcCardResponseApiModel;
import app.chalo.ncmc.data.NcmcCardStatus;
import app.chalo.ncmc.data.NcmcOfflineRechargeConfirmRequestModel;
import app.chalo.ncmc.data.NcmcOfflineRechargeRequestApiModel;
import app.chalo.ncmc.data.NcmcOnlineCardRechargeRequestApiModel;
import app.chalo.ncmc.data.apirequestmodel.BlockNCMCCardApiRequestModel;
import app.chalo.ncmc.data.apirequestmodel.IntentHashRequestApiModel;
import app.chalo.ncmc.data.apirequestmodel.IntentHashResponseApiModel;
import app.chalo.ncmc.data.apirequestmodel.LinkChaloCardRequestApiModel;
import app.chalo.ncmc.data.apiresponsemodel.CardInfoApiResponse;
import app.chalo.ncmc.data.apiresponsemodel.CardRechargeConfigApiResponseModel;
import app.chalo.ncmc.data.apiresponsemodel.CardRechargeConfigListApiResponseModel;
import app.chalo.ncmc.data.apiresponsemodel.CardRechargeConfigListApiResponseModelKt;
import app.chalo.ncmc.data.apiresponsemodel.CardsTypeInfoApiResponse;
import app.chalo.ncmc.data.apiresponsemodel.ChaloCardRechargeConfigBrandingApiResponseModel;
import app.chalo.ncmc.data.apiresponsemodel.ChaloCardRechargeFareInfoApiResponseModel;
import app.chalo.ncmc.data.apiresponsemodel.ChaloCardUnsyncedRechargesApiModel;
import app.chalo.ncmc.data.apiresponsemodel.ChaloCardsInfoApiResponseModel;
import app.chalo.ncmc.data.apiresponsemodel.ClosedCardActivePassApiResponse;
import app.chalo.ncmc.data.apiresponsemodel.ClosedCardDetailsApiResponse;
import app.chalo.ncmc.data.apiresponsemodel.ClosedCardInfoApiResponse;
import app.chalo.ncmc.data.apiresponsemodel.EligibleCard;
import app.chalo.ncmc.data.apiresponsemodel.EligibleCardResponseApiModel;
import app.chalo.ncmc.data.apiresponsemodel.LinkChaloCardApiResponseModel;
import app.chalo.ncmc.data.apiresponsemodel.OpenCardDetailsApiResponse;
import app.chalo.ncmc.data.apiresponsemodel.OpenCardInfoApiResponse;
import app.chalo.ncmc.data.apiresponsemodel.SemiClosedCardActivePassApiResponse;
import app.chalo.ncmc.data.apiresponsemodel.SemiClosedCardDetailsApiResponse;
import app.chalo.ncmc.data.apiresponsemodel.SemiClosedCardInfoApiResponse;
import app.chalo.ncmc.data.apiresponsemodel.UnknownCardDetailsApiResponse;
import app.chalo.ncmc.data.apiresponsemodel.UnknownCardInfoApiResponse;
import app.chalo.ncmc.data.apiresponsemodel.UnlinkCardApiResponseModel;
import app.chalo.ncmc.data.appmodel.CardsTypeInfoAppModel;
import app.chalo.ncmc.data.appmodel.ChaloCardRechargeConfigAppModel;
import app.chalo.ncmc.data.appmodel.ChaloCardRechargeConfigBrandingAppModel;
import app.chalo.ncmc.data.appmodel.ChaloCardRechargeConfigurationListAppModel;
import app.chalo.ncmc.data.appmodel.ChaloCardRechargeFareInfoAppModel;
import app.chalo.ncmc.data.appmodel.ChaloCardUnsyncedRechargeDetails;
import app.chalo.ncmc.data.appmodel.ChaloCardsInfoAppModel;
import app.chalo.ncmc.data.appmodel.ClosedCardActivePassAppModel;
import app.chalo.ncmc.data.appmodel.ClosedCardDetailsAppModel;
import app.chalo.ncmc.data.appmodel.ClosedCardInfo;
import app.chalo.ncmc.data.appmodel.EligibleCardResponseAppModel;
import app.chalo.ncmc.data.appmodel.IntentHashAppModel;
import app.chalo.ncmc.data.appmodel.IntentHashRequestAppModel;
import app.chalo.ncmc.data.appmodel.LinkChaloCardResponseAppModel;
import app.chalo.ncmc.data.appmodel.OpenCardDetailsAppModel;
import app.chalo.ncmc.data.appmodel.OpenCardInfo;
import app.chalo.ncmc.data.appmodel.SemiClosedCardActivePassAppModel;
import app.chalo.ncmc.data.appmodel.SemiClosedCardDetailsAppModel;
import app.chalo.ncmc.data.appmodel.SemiClosedCardInfo;
import app.chalo.ncmc.data.appmodel.UnknownCardDetailsAppModel;
import app.chalo.ncmc.data.appmodel.UnknownCardInfo;
import app.chalo.ncmc.data.appmodel.UnlinkCardResponseAppModel;
import app.chalo.ncmc.data.cardtransactions.CardMerchantTransactionAppModel;
import app.chalo.ncmc.data.cardtransactions.CardPassPurchaseTransactionApiResponse;
import app.chalo.ncmc.data.cardtransactions.CardPassPurchaseTransactionAppModel;
import app.chalo.ncmc.data.cardtransactions.CardRechargeTransactionApiResponse;
import app.chalo.ncmc.data.cardtransactions.CardRechargeTransactionAppModel;
import app.chalo.ncmc.data.cardtransactions.CardTicketTransactionApiResponse;
import app.chalo.ncmc.data.cardtransactions.CardTicketTransactionAppModel;
import app.chalo.ncmc.data.cardtransactions.CardTransaction;
import app.chalo.ncmc.data.cardtransactions.CardTransactionApiResponse;
import app.chalo.ncmc.data.cardtransactions.CardTransactionApiResponseModel;
import app.chalo.ncmc.data.cardtransactions.CardTransactionAppModel;
import app.chalo.ncmc.data.cardtransactions.CardTransactionFareBreakupApiResponse;
import app.chalo.ncmc.data.cardtransactions.CardTransactionFareBreakupAppModel;
import app.chalo.ncmc.data.cardtransactions.CardTransactionFareInfoApiResponse;
import app.chalo.ncmc.data.cardtransactions.CardTransactionFareInfoAppModel;
import app.chalo.ncmc.data.cardtransactions.CardTransactionTypeApiResponse;
import app.chalo.ncmc.data.cardtransactions.CardUnknownTransactionApiResponse;
import app.chalo.ncmc.data.cardtransactions.CardUnknownTransactionAppModel;
import app.chalo.ncmc.data.cardtransactions.MerchantTransactionApiResponse;
import app.chalo.ncmc.data.error.CardActionItemMalformedResponseException;
import app.chalo.ncmc.data.error.FetchChaloCardTransactionsMalformedResponseException;
import app.chalo.ncmc.data.error.GetCardInfoMalformedResponseException;
import app.chalo.ncmc.data.error.LinkChaloCardMalformedResponseException;
import app.chalo.ncmc.data.error.UvikInvalidResponseException;
import app.chalo.ncmc.domain.CardUnsyncedRechargesHelper;
import app.chalo.ncmc.domain.CardValidationAppModel;
import app.chalo.ncmc.domain.CardValidationRequestApiModel;
import app.chalo.ncmc.domain.CardValidationRequestAppModel;
import app.chalo.ncmc.domain.CardValidationResponseApiModel;
import app.chalo.ncmc.domain.CardValidationStatus;
import app.chalo.ncmc.remote.INcmcCardRemoteDataSource;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.userprofile.UserProfileAppModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/ncmc/repository/NcmcCardRepository;", "Lapp/chalo/ncmc/repository/INcmcCardRepository;", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NcmcCardRepository implements INcmcCardRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final INcmcCardRemoteDataSource f6257a;
    public final BasicInfoContract b;
    public final UserProfileDetailsProvider c;
    public final CardUnsyncedRechargesHelper d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/ncmc/repository/NcmcCardRepository$Companion;", "", "", "PAYMENT_TYPE_ONLINE", "Ljava/lang/String;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public NcmcCardRepository(INcmcCardRemoteDataSource iNcmcCardRemoteDataSource, BasicInfoContract basicInfoContract, UserProfileDetailsProvider userProfileDetailsProvider, CardUnsyncedRechargesHelper cardUnsyncedRechargesHelper) {
        this.f6257a = iNcmcCardRemoteDataSource;
        this.b = basicInfoContract;
        this.c = userProfileDetailsProvider;
        this.d = cardUnsyncedRechargesHelper;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v6, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.util.ArrayList] */
    @Override // app.chalo.ncmc.repository.INcmcCardRepository
    public final Object a(String str, ContinuationImpl continuationImpl, boolean z) throws GetCardInfoMalformedResponseException {
        NcmcCardRepository$fetchLinkedChaloCardsInfo$1 ncmcCardRepository$fetchLinkedChaloCardsInfo$1;
        ?? arrayList;
        CardsTypeInfoAppModel unknown;
        ArrayList arrayList2;
        ArrayList arrayList3;
        if (continuationImpl instanceof NcmcCardRepository$fetchLinkedChaloCardsInfo$1) {
            ncmcCardRepository$fetchLinkedChaloCardsInfo$1 = (NcmcCardRepository$fetchLinkedChaloCardsInfo$1) continuationImpl;
            int i = ncmcCardRepository$fetchLinkedChaloCardsInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ncmcCardRepository$fetchLinkedChaloCardsInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                ncmcCardRepository$fetchLinkedChaloCardsInfo$1 = new NcmcCardRepository$fetchLinkedChaloCardsInfo$1(this, continuationImpl);
            }
        } else {
            ncmcCardRepository$fetchLinkedChaloCardsInfo$1 = new NcmcCardRepository$fetchLinkedChaloCardsInfo$1(this, continuationImpl);
        }
        Object objA = ncmcCardRepository$fetchLinkedChaloCardsInfo$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ncmcCardRepository$fetchLinkedChaloCardsInfo$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            ncmcCardRepository$fetchLinkedChaloCardsInfo$1.label = 1;
            objA = this.f6257a.a(str, ncmcCardRepository$fetchLinkedChaloCardsInfo$1, z);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        ChaloCardsInfoApiResponseModel chaloCardsInfoApiResponseModel = (ChaloCardsInfoApiResponseModel) objA;
        Intrinsics.i(chaloCardsInfoApiResponseModel, "<this>");
        List<CardsTypeInfoApiResponse> list = chaloCardsInfoApiResponseModel.f6085a;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                List listA = ((CardsTypeInfoApiResponse) it.next()).getF6077a();
                if (!(listA instanceof Collection) || !listA.isEmpty()) {
                    Iterator it2 = listA.iterator();
                    while (it2.hasNext()) {
                        if (!((CardInfoApiResponse) it2.next()).isValid()) {
                            throw new GetCardInfoMalformedResponseException("Malformed JSON response");
                        }
                    }
                }
            }
        }
        List list2 = chaloCardsInfoApiResponseModel.b;
        int i3 = 10;
        if (list2 != null) {
            List<ChaloCardUnsyncedRechargesApiModel> list3 = list2;
            arrayList = new ArrayList(CollectionsKt.v(list3, 10));
            for (ChaloCardUnsyncedRechargesApiModel chaloCardUnsyncedRechargesApiModel : list3) {
                Intrinsics.i(chaloCardUnsyncedRechargesApiModel, "<this>");
                arrayList.add(new ChaloCardUnsyncedRechargeDetails(chaloCardUnsyncedRechargesApiModel.f6083a, chaloCardUnsyncedRechargesApiModel.b));
            }
        } else {
            arrayList = EmptyList.f17557a;
        }
        ArrayList arrayList4 = new ArrayList(CollectionsKt.v(list, 10));
        for (CardsTypeInfoApiResponse cardsTypeInfoApiResponse : list) {
            if (cardsTypeInfoApiResponse instanceof CardsTypeInfoApiResponse.Closed) {
                List<ClosedCardInfoApiResponse> list4 = ((CardsTypeInfoApiResponse.Closed) cardsTypeInfoApiResponse).f6071a;
                ArrayList arrayList5 = new ArrayList(CollectionsKt.v(list4, i3));
                for (ClosedCardInfoApiResponse closedCardInfoApiResponse : list4) {
                    ClosedCardDetailsApiResponse closedCardDetailsApiResponse = closedCardInfoApiResponse.f6093a;
                    Intrinsics.f(closedCardDetailsApiResponse);
                    String str2 = closedCardDetailsApiResponse.f6091a;
                    Intrinsics.f(str2);
                    Boolean bool = closedCardDetailsApiResponse.b;
                    boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
                    Long l = closedCardDetailsApiResponse.c;
                    Long lValueOf = Long.valueOf(l != null ? l.longValue() : Long.MAX_VALUE);
                    String str3 = closedCardDetailsApiResponse.d;
                    Long l2 = closedCardDetailsApiResponse.e;
                    int i4 = closedCardDetailsApiResponse.f;
                    String str4 = closedCardDetailsApiResponse.g;
                    Boolean bool2 = closedCardDetailsApiResponse.h;
                    Boolean boolValueOf = Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false);
                    Boolean bool3 = closedCardDetailsApiResponse.i;
                    Boolean boolValueOf2 = Boolean.valueOf(bool3 != null ? bool3.booleanValue() : false);
                    Boolean bool4 = closedCardDetailsApiResponse.j;
                    ClosedCardDetailsAppModel closedCardDetailsAppModel = new ClosedCardDetailsAppModel(str2, zBooleanValue, lValueOf, str3, l2, i4, str4, boolValueOf, boolValueOf2, Boolean.valueOf(bool4 != null ? bool4.booleanValue() : false));
                    List list5 = closedCardInfoApiResponse.b;
                    if (list5 != null) {
                        List<ClosedCardActivePassApiResponse> list6 = list5;
                        arrayList3 = new ArrayList(CollectionsKt.v(list6, 10));
                        for (ClosedCardActivePassApiResponse closedCardActivePassApiResponse : list6) {
                            arrayList3.add(new ClosedCardActivePassAppModel(closedCardActivePassApiResponse.f6089a, closedCardActivePassApiResponse.b, closedCardActivePassApiResponse.c, closedCardActivePassApiResponse.d, closedCardActivePassApiResponse.e, closedCardActivePassApiResponse.f, closedCardActivePassApiResponse.h));
                        }
                    } else {
                        arrayList3 = null;
                    }
                    arrayList5.add(new ClosedCardInfo(closedCardDetailsAppModel, arrayList3));
                }
                unknown = new CardsTypeInfoAppModel.Closed(arrayList5);
            } else if (cardsTypeInfoApiResponse instanceof CardsTypeInfoApiResponse.SemiClosed) {
                List list7 = ((CardsTypeInfoApiResponse.SemiClosed) cardsTypeInfoApiResponse).f6075a;
                ArrayList arrayList6 = new ArrayList(CollectionsKt.v(list7, 10));
                Iterator it3 = list7.iterator();
                while (it3.hasNext()) {
                    SemiClosedCardInfoApiResponse semiClosedCardInfoApiResponse = (SemiClosedCardInfoApiResponse) it3.next();
                    SemiClosedCardDetailsApiResponse semiClosedCardDetailsApiResponse = semiClosedCardInfoApiResponse.f6109a;
                    Intrinsics.f(semiClosedCardDetailsApiResponse);
                    String str5 = semiClosedCardDetailsApiResponse.f6107a;
                    Intrinsics.f(str5);
                    Boolean bool5 = semiClosedCardDetailsApiResponse.b;
                    boolean zBooleanValue2 = bool5 != null ? bool5.booleanValue() : true;
                    Long l3 = semiClosedCardDetailsApiResponse.c;
                    Long lValueOf2 = Long.valueOf(l3 != null ? l3.longValue() : Long.MAX_VALUE);
                    String str6 = semiClosedCardDetailsApiResponse.d;
                    Long l4 = semiClosedCardDetailsApiResponse.e;
                    int i5 = semiClosedCardDetailsApiResponse.f;
                    String str7 = semiClosedCardDetailsApiResponse.g;
                    Iterator it4 = it3;
                    Boolean bool6 = semiClosedCardDetailsApiResponse.h;
                    Boolean boolValueOf3 = Boolean.valueOf(bool6 != null ? bool6.booleanValue() : false);
                    Boolean bool7 = semiClosedCardDetailsApiResponse.i;
                    Boolean boolValueOf4 = Boolean.valueOf(bool7 != null ? bool7.booleanValue() : false);
                    Boolean bool8 = semiClosedCardDetailsApiResponse.j;
                    SemiClosedCardDetailsAppModel semiClosedCardDetailsAppModel = new SemiClosedCardDetailsAppModel(str5, zBooleanValue2, lValueOf2, str6, l4, i5, str7, boolValueOf3, boolValueOf4, Boolean.valueOf(bool8 != null ? bool8.booleanValue() : false));
                    List list8 = semiClosedCardInfoApiResponse.b;
                    if (list8 != null) {
                        List<SemiClosedCardActivePassApiResponse> list9 = list8;
                        arrayList2 = new ArrayList(CollectionsKt.v(list9, 10));
                        for (SemiClosedCardActivePassApiResponse semiClosedCardActivePassApiResponse : list9) {
                            arrayList2.add(new SemiClosedCardActivePassAppModel(semiClosedCardActivePassApiResponse.f6105a, semiClosedCardActivePassApiResponse.b, semiClosedCardActivePassApiResponse.c, semiClosedCardActivePassApiResponse.d, semiClosedCardActivePassApiResponse.e, semiClosedCardActivePassApiResponse.f, semiClosedCardActivePassApiResponse.h));
                        }
                    } else {
                        arrayList2 = null;
                    }
                    arrayList6.add(new SemiClosedCardInfo(semiClosedCardDetailsAppModel, arrayList2));
                    it3 = it4;
                }
                unknown = new CardsTypeInfoAppModel.Semiclosed(arrayList6);
            } else if (cardsTypeInfoApiResponse instanceof CardsTypeInfoApiResponse.Open) {
                List list10 = ((CardsTypeInfoApiResponse.Open) cardsTypeInfoApiResponse).f6073a;
                ArrayList arrayList7 = new ArrayList(CollectionsKt.v(list10, 10));
                Iterator it5 = list10.iterator();
                while (it5.hasNext()) {
                    OpenCardInfoApiResponse openCardInfoApiResponse = (OpenCardInfoApiResponse) it5.next();
                    openCardInfoApiResponse.getClass();
                    if (!CardInfoApiResponse.DefaultImpls.a(openCardInfoApiResponse)) {
                        throw new GetCardInfoMalformedResponseException("Malformed JSON response");
                    }
                    OpenCardDetailsApiResponse openCardDetailsApiResponse = openCardInfoApiResponse.f6103a;
                    Intrinsics.f(openCardDetailsApiResponse);
                    String str8 = openCardDetailsApiResponse.f6101a;
                    Intrinsics.f(str8);
                    Boolean bool9 = openCardDetailsApiResponse.b;
                    boolean zBooleanValue3 = bool9 != null ? bool9.booleanValue() : true;
                    Long l5 = openCardDetailsApiResponse.c;
                    Long lValueOf3 = Long.valueOf(l5 != null ? l5.longValue() : Long.MAX_VALUE);
                    String str9 = openCardDetailsApiResponse.d;
                    Long l6 = openCardDetailsApiResponse.e;
                    int i6 = openCardDetailsApiResponse.f;
                    String str10 = openCardDetailsApiResponse.g;
                    Iterator it6 = it5;
                    Boolean bool10 = openCardDetailsApiResponse.h;
                    Boolean boolValueOf5 = Boolean.valueOf(bool10 != null ? bool10.booleanValue() : false);
                    Boolean bool11 = openCardDetailsApiResponse.i;
                    Boolean boolValueOf6 = Boolean.valueOf(bool11 != null ? bool11.booleanValue() : false);
                    Boolean bool12 = openCardDetailsApiResponse.j;
                    Boolean boolValueOf7 = Boolean.valueOf(bool12 != null ? bool12.booleanValue() : false);
                    String str11 = openCardDetailsApiResponse.k;
                    Intrinsics.f(str11);
                    arrayList7.add(new OpenCardInfo(new OpenCardDetailsAppModel(str8, zBooleanValue3, lValueOf3, str9, l6, i6, str10, boolValueOf5, boolValueOf6, boolValueOf7, str11)));
                    it5 = it6;
                }
                unknown = new CardsTypeInfoAppModel.Open(arrayList7);
            } else {
                if (!(cardsTypeInfoApiResponse instanceof CardsTypeInfoApiResponse.Unknown)) {
                    throw new NoWhenBranchMatchedException();
                }
                List list11 = ((CardsTypeInfoApiResponse.Unknown) cardsTypeInfoApiResponse).f6077a;
                ArrayList arrayList8 = new ArrayList(CollectionsKt.v(list11, 10));
                Iterator it7 = list11.iterator();
                while (it7.hasNext()) {
                    UnknownCardDetailsApiResponse unknownCardDetailsApiResponse = ((UnknownCardInfoApiResponse) it7.next()).f6113a;
                    Intrinsics.f(unknownCardDetailsApiResponse);
                    String str12 = unknownCardDetailsApiResponse.f6111a;
                    Intrinsics.f(str12);
                    Boolean bool13 = unknownCardDetailsApiResponse.b;
                    boolean zBooleanValue4 = bool13 != null ? bool13.booleanValue() : true;
                    Long l7 = unknownCardDetailsApiResponse.c;
                    Long lValueOf4 = Long.valueOf(l7 != null ? l7.longValue() : Long.MAX_VALUE);
                    String str13 = unknownCardDetailsApiResponse.d;
                    Long l8 = unknownCardDetailsApiResponse.e;
                    int i7 = unknownCardDetailsApiResponse.f;
                    String str14 = unknownCardDetailsApiResponse.g;
                    Iterator it8 = it7;
                    Boolean bool14 = unknownCardDetailsApiResponse.h;
                    Boolean boolValueOf8 = Boolean.valueOf(bool14 != null ? bool14.booleanValue() : false);
                    Boolean bool15 = unknownCardDetailsApiResponse.i;
                    Boolean boolValueOf9 = Boolean.valueOf(bool15 != null ? bool15.booleanValue() : false);
                    Boolean bool16 = unknownCardDetailsApiResponse.j;
                    arrayList8.add(new UnknownCardInfo(new UnknownCardDetailsAppModel(str12, zBooleanValue4, lValueOf4, str13, l8, i7, str14, boolValueOf8, boolValueOf9, Boolean.valueOf(bool16 != null ? bool16.booleanValue() : false))));
                    it7 = it8;
                }
                unknown = new CardsTypeInfoAppModel.Unknown(arrayList8);
            }
            arrayList4.add(unknown);
            i3 = 10;
        }
        return new ChaloCardsInfoAppModel(arrayList4, arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v7, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.List] */
    @Override // app.chalo.ncmc.repository.INcmcCardRepository
    public final Object b(int i, String str, String str2, String str3, String str4, ContinuationImpl continuationImpl) throws FetchChaloCardTransactionsMalformedResponseException {
        NcmcCardRepository$getCardTransactions$1 ncmcCardRepository$getCardTransactions$1;
        String cardNumber;
        ?? arrayList;
        Object obj;
        Object value;
        LinkedHashMap linkedHashMapU;
        Long l;
        Integer num;
        ArrayList arrayList2;
        CardTransaction cardUnknownTransactionAppModel;
        Long l2;
        Integer num2;
        ArrayList arrayList3;
        Long l3;
        ArrayList arrayList4;
        CardTransactionFareInfoAppModel cardTransactionFareInfoAppModel;
        CardTransaction cardPassPurchaseTransactionAppModel;
        Long l4;
        Integer num3;
        ArrayList arrayList5;
        Long l5;
        Integer num4;
        ArrayList arrayList6;
        if (continuationImpl instanceof NcmcCardRepository$getCardTransactions$1) {
            ncmcCardRepository$getCardTransactions$1 = (NcmcCardRepository$getCardTransactions$1) continuationImpl;
            int i2 = ncmcCardRepository$getCardTransactions$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ncmcCardRepository$getCardTransactions$1.label = i2 - Integer.MIN_VALUE;
            } else {
                ncmcCardRepository$getCardTransactions$1 = new NcmcCardRepository$getCardTransactions$1(this, continuationImpl);
            }
        } else {
            ncmcCardRepository$getCardTransactions$1 = new NcmcCardRepository$getCardTransactions$1(this, continuationImpl);
        }
        NcmcCardRepository$getCardTransactions$1 ncmcCardRepository$getCardTransactions$2 = ncmcCardRepository$getCardTransactions$1;
        Object objB = ncmcCardRepository$getCardTransactions$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = ncmcCardRepository$getCardTransactions$2.label;
        if (i3 == 0) {
            ResultKt.b(objB);
            ncmcCardRepository$getCardTransactions$2.L$0 = str;
            ncmcCardRepository$getCardTransactions$2.label = 1;
            objB = this.f6257a.b(i, str, str2, str3, str4, ncmcCardRepository$getCardTransactions$2);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            cardNumber = str;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cardNumber = (String) ncmcCardRepository$getCardTransactions$2.L$0;
            ResultKt.b(objB);
        }
        CardTransactionApiResponseModel cardTransactionApiResponseModel = (CardTransactionApiResponseModel) objB;
        Intrinsics.i(cardTransactionApiResponseModel, "<this>");
        List list = cardTransactionApiResponseModel.f6181a;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                List listA = ((CardTransactionTypeApiResponse) it.next()).getF6200a();
                if (!(listA instanceof Collection) || !listA.isEmpty()) {
                    Iterator it2 = listA.iterator();
                    while (it2.hasNext()) {
                        if (!((CardTransactionApiResponse) it2.next()).isValid()) {
                            throw new FetchChaloCardTransactionsMalformedResponseException("Malformed JSON response");
                        }
                    }
                }
            }
        }
        ArrayList arrayList7 = new ArrayList();
        Iterator it3 = list.iterator();
        while (true) {
            int i4 = 10;
            if (!it3.hasNext()) {
                break;
            }
            List<CardTransactionApiResponse> listA2 = ((CardTransactionTypeApiResponse) it3.next()).getF6200a();
            ArrayList arrayList8 = new ArrayList();
            for (CardTransactionApiResponse cardTransactionApiResponse : listA2) {
                if (cardTransactionApiResponse instanceof CardRechargeTransactionApiResponse) {
                    CardRechargeTransactionApiResponse cardRechargeTransactionApiResponse = (CardRechargeTransactionApiResponse) cardTransactionApiResponse;
                    CardTransactionFareInfoApiResponse cardTransactionFareInfoApiResponse = cardRechargeTransactionApiResponse.c;
                    String str5 = cardRechargeTransactionApiResponse.f6172a;
                    if (str5 != null && (l5 = cardRechargeTransactionApiResponse.b) != null) {
                        long jLongValue = l5.longValue();
                        if (cardTransactionFareInfoApiResponse != null && (num4 = cardTransactionFareInfoApiResponse.f6188a) != null) {
                            int iIntValue = num4.intValue();
                            List list2 = cardTransactionFareInfoApiResponse.b;
                            if (list2 != null) {
                                List list3 = list2;
                                arrayList6 = new ArrayList(CollectionsKt.v(list3, i4));
                                for (Iterator it4 = list3.iterator(); it4.hasNext(); it4 = it4) {
                                    CardTransactionFareBreakupApiResponse cardTransactionFareBreakupApiResponse = (CardTransactionFareBreakupApiResponse) it4.next();
                                    arrayList6.add(new CardTransactionFareBreakupAppModel(cardTransactionFareBreakupApiResponse.f6184a, cardTransactionFareBreakupApiResponse.b));
                                }
                            } else {
                                arrayList6 = null;
                            }
                            cardUnknownTransactionAppModel = new CardRechargeTransactionAppModel(str5, jLongValue, new CardTransactionFareInfoAppModel(iIntValue, arrayList6), cardRechargeTransactionApiResponse.d);
                        }
                    }
                    it3 = it3;
                    cardUnknownTransactionAppModel = null;
                } else {
                    it3 = it3;
                    if (cardTransactionApiResponse instanceof CardTicketTransactionApiResponse) {
                        CardTicketTransactionApiResponse cardTicketTransactionApiResponse = (CardTicketTransactionApiResponse) cardTransactionApiResponse;
                        CardTransactionFareInfoApiResponse cardTransactionFareInfoApiResponse2 = cardTicketTransactionApiResponse.c;
                        String str6 = cardTicketTransactionApiResponse.f6176a;
                        if (str6 != null && (l4 = cardTicketTransactionApiResponse.b) != null) {
                            long jLongValue2 = l4.longValue();
                            if (cardTransactionFareInfoApiResponse2 != null && (num3 = cardTransactionFareInfoApiResponse2.f6188a) != null) {
                                int iIntValue2 = num3.intValue();
                                List list4 = cardTransactionFareInfoApiResponse2.b;
                                if (list4 != null) {
                                    List<CardTransactionFareBreakupApiResponse> list5 = list4;
                                    arrayList5 = new ArrayList(CollectionsKt.v(list5, 10));
                                    for (CardTransactionFareBreakupApiResponse cardTransactionFareBreakupApiResponse2 : list5) {
                                        arrayList5.add(new CardTransactionFareBreakupAppModel(cardTransactionFareBreakupApiResponse2.f6184a, cardTransactionFareBreakupApiResponse2.b));
                                    }
                                } else {
                                    arrayList5 = null;
                                }
                                cardPassPurchaseTransactionAppModel = new CardTicketTransactionAppModel(str6, jLongValue2, new CardTransactionFareInfoAppModel(iIntValue2, arrayList5), cardTicketTransactionApiResponse.d, cardTicketTransactionApiResponse.e, cardTicketTransactionApiResponse.f, cardTicketTransactionApiResponse.g, cardTicketTransactionApiResponse.h, cardTicketTransactionApiResponse.i);
                                cardUnknownTransactionAppModel = cardPassPurchaseTransactionAppModel;
                            }
                        }
                        cardUnknownTransactionAppModel = null;
                    } else {
                        if (cardTransactionApiResponse instanceof CardPassPurchaseTransactionApiResponse) {
                            CardPassPurchaseTransactionApiResponse cardPassPurchaseTransactionApiResponse = (CardPassPurchaseTransactionApiResponse) cardTransactionApiResponse;
                            CardTransactionFareInfoApiResponse cardTransactionFareInfoApiResponse3 = cardPassPurchaseTransactionApiResponse.c;
                            String str7 = cardPassPurchaseTransactionApiResponse.f6168a;
                            if (str7 != null && (l3 = cardPassPurchaseTransactionApiResponse.b) != null) {
                                long jLongValue3 = l3.longValue();
                                if (cardTransactionFareInfoApiResponse3 == null) {
                                    cardTransactionFareInfoAppModel = null;
                                } else {
                                    Integer num5 = cardTransactionFareInfoApiResponse3.f6188a;
                                    if (num5 != null) {
                                        int iIntValue3 = num5.intValue();
                                        List list6 = cardTransactionFareInfoApiResponse3.b;
                                        if (list6 != null) {
                                            List<CardTransactionFareBreakupApiResponse> list7 = list6;
                                            arrayList4 = new ArrayList(CollectionsKt.v(list7, 10));
                                            for (CardTransactionFareBreakupApiResponse cardTransactionFareBreakupApiResponse3 : list7) {
                                                arrayList4.add(new CardTransactionFareBreakupAppModel(cardTransactionFareBreakupApiResponse3.f6184a, cardTransactionFareBreakupApiResponse3.b));
                                            }
                                        } else {
                                            arrayList4 = null;
                                        }
                                        cardTransactionFareInfoAppModel = new CardTransactionFareInfoAppModel(iIntValue3, arrayList4);
                                    }
                                }
                                cardPassPurchaseTransactionAppModel = new CardPassPurchaseTransactionAppModel(str7, jLongValue3, cardTransactionFareInfoAppModel, cardPassPurchaseTransactionApiResponse.d, cardPassPurchaseTransactionApiResponse.e, cardPassPurchaseTransactionApiResponse.f, cardPassPurchaseTransactionApiResponse.g, cardPassPurchaseTransactionApiResponse.h, cardPassPurchaseTransactionApiResponse.i, cardPassPurchaseTransactionApiResponse.j, cardPassPurchaseTransactionApiResponse.k);
                                cardUnknownTransactionAppModel = cardPassPurchaseTransactionAppModel;
                            }
                        } else if (cardTransactionApiResponse instanceof MerchantTransactionApiResponse) {
                            MerchantTransactionApiResponse merchantTransactionApiResponse = (MerchantTransactionApiResponse) cardTransactionApiResponse;
                            CardTransactionFareInfoApiResponse cardTransactionFareInfoApiResponse4 = merchantTransactionApiResponse.c;
                            String str8 = merchantTransactionApiResponse.f6206a;
                            if (str8 != null && (l2 = merchantTransactionApiResponse.b) != null) {
                                long jLongValue4 = l2.longValue();
                                if (cardTransactionFareInfoApiResponse4 != null && (num2 = cardTransactionFareInfoApiResponse4.f6188a) != null) {
                                    int iIntValue4 = num2.intValue();
                                    List list8 = cardTransactionFareInfoApiResponse4.b;
                                    if (list8 != null) {
                                        List<CardTransactionFareBreakupApiResponse> list9 = list8;
                                        arrayList3 = new ArrayList(CollectionsKt.v(list9, 10));
                                        for (CardTransactionFareBreakupApiResponse cardTransactionFareBreakupApiResponse4 : list9) {
                                            arrayList3.add(new CardTransactionFareBreakupAppModel(cardTransactionFareBreakupApiResponse4.f6184a, cardTransactionFareBreakupApiResponse4.b));
                                        }
                                    } else {
                                        arrayList3 = null;
                                    }
                                    cardUnknownTransactionAppModel = new CardMerchantTransactionAppModel(str8, jLongValue4, new CardTransactionFareInfoAppModel(iIntValue4, arrayList3));
                                }
                            }
                        } else if (cardTransactionApiResponse instanceof CardUnknownTransactionApiResponse) {
                            CardUnknownTransactionApiResponse cardUnknownTransactionApiResponse = (CardUnknownTransactionApiResponse) cardTransactionApiResponse;
                            CardTransactionFareInfoApiResponse cardTransactionFareInfoApiResponse5 = cardUnknownTransactionApiResponse.c;
                            String str9 = cardUnknownTransactionApiResponse.f6202a;
                            if (str9 != null && (l = cardUnknownTransactionApiResponse.b) != null) {
                                long jLongValue5 = l.longValue();
                                if (cardTransactionFareInfoApiResponse5 != null && (num = cardTransactionFareInfoApiResponse5.f6188a) != null) {
                                    int iIntValue5 = num.intValue();
                                    List list10 = cardTransactionFareInfoApiResponse5.b;
                                    if (list10 != null) {
                                        List<CardTransactionFareBreakupApiResponse> list11 = list10;
                                        arrayList2 = new ArrayList(CollectionsKt.v(list11, 10));
                                        for (CardTransactionFareBreakupApiResponse cardTransactionFareBreakupApiResponse5 : list11) {
                                            arrayList2.add(new CardTransactionFareBreakupAppModel(cardTransactionFareBreakupApiResponse5.f6184a, cardTransactionFareBreakupApiResponse5.b));
                                        }
                                    } else {
                                        arrayList2 = null;
                                    }
                                    cardUnknownTransactionAppModel = new CardUnknownTransactionAppModel(str9, jLongValue5, new CardTransactionFareInfoAppModel(iIntValue5, arrayList2));
                                }
                            }
                        }
                        cardUnknownTransactionAppModel = null;
                    }
                }
                if (cardUnknownTransactionAppModel != null) {
                    arrayList8.add(cardUnknownTransactionAppModel);
                }
                it3 = it3;
                i4 = 10;
            }
            CollectionsKt.i(arrayList8, arrayList7);
        }
        Integer num6 = cardTransactionApiResponseModel.b.f6208a;
        int iIntValue6 = num6 != null ? num6.intValue() : 1;
        List list12 = cardTransactionApiResponseModel.c;
        if (list12 != null) {
            List<ChaloCardUnsyncedRechargesApiModel> list13 = list12;
            arrayList = new ArrayList(CollectionsKt.v(list13, 10));
            for (ChaloCardUnsyncedRechargesApiModel chaloCardUnsyncedRechargesApiModel : list13) {
                Intrinsics.i(chaloCardUnsyncedRechargesApiModel, "<this>");
                arrayList.add(new ChaloCardUnsyncedRechargeDetails(chaloCardUnsyncedRechargesApiModel.f6083a, chaloCardUnsyncedRechargesApiModel.b));
            }
        } else {
            arrayList = EmptyList.f17557a;
        }
        CardTransactionAppModel cardTransactionAppModel = new CardTransactionAppModel(arrayList7, arrayList, iIntValue6);
        Iterator it5 = ((Iterable) arrayList).iterator();
        while (true) {
            if (!it5.hasNext()) {
                obj = null;
                break;
            }
            Object next = it5.next();
            if (Intrinsics.d(((ChaloCardUnsyncedRechargeDetails) next).f6134a, cardNumber)) {
                obj = next;
                break;
            }
        }
        ChaloCardUnsyncedRechargeDetails chaloCardUnsyncedRechargeDetails = (ChaloCardUnsyncedRechargeDetails) obj;
        if (chaloCardUnsyncedRechargeDetails != null) {
            Intrinsics.i(cardNumber, "cardNumber");
            MutableStateFlow mutableStateFlow = this.d.f6213a;
            do {
                value = mutableStateFlow.getValue();
                linkedHashMapU = MapsKt.u((Map) value);
                linkedHashMapU.put(cardNumber, chaloCardUnsyncedRechargeDetails);
            } while (!mutableStateFlow.c(value, linkedHashMapU));
        }
        return cardTransactionAppModel;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.ncmc.repository.INcmcCardRepository
    public final Object c(String str, ContinuationImpl continuationImpl) throws CardActionItemMalformedResponseException {
        NcmcCardRepository$unlinkCard$1 ncmcCardRepository$unlinkCard$1;
        if (continuationImpl instanceof NcmcCardRepository$unlinkCard$1) {
            ncmcCardRepository$unlinkCard$1 = (NcmcCardRepository$unlinkCard$1) continuationImpl;
            int i = ncmcCardRepository$unlinkCard$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ncmcCardRepository$unlinkCard$1.label = i - Integer.MIN_VALUE;
            } else {
                ncmcCardRepository$unlinkCard$1 = new NcmcCardRepository$unlinkCard$1(this, continuationImpl);
            }
        } else {
            ncmcCardRepository$unlinkCard$1 = new NcmcCardRepository$unlinkCard$1(this, continuationImpl);
        }
        Object objC = ncmcCardRepository$unlinkCard$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ncmcCardRepository$unlinkCard$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            ncmcCardRepository$unlinkCard$1.label = 1;
            objC = this.f6257a.c(str, ncmcCardRepository$unlinkCard$1);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objC);
        }
        UnlinkCardApiResponseModel unlinkCardApiResponseModel = (UnlinkCardApiResponseModel) objC;
        Intrinsics.i(unlinkCardApiResponseModel, "<this>");
        String str2 = unlinkCardApiResponseModel.f6115a;
        if (str2 == null || str2.length() == 0) {
            throw new CardActionItemMalformedResponseException("Malformed JSON response");
        }
        return new UnlinkCardResponseAppModel(str2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.ncmc.repository.INcmcCardRepository
    public final Object d(String str, ContinuationImpl continuationImpl) {
        NcmcCardRepository$fetchEligibleCards$1 ncmcCardRepository$fetchEligibleCards$1;
        EligibleCard eligibleCard;
        if (continuationImpl instanceof NcmcCardRepository$fetchEligibleCards$1) {
            ncmcCardRepository$fetchEligibleCards$1 = (NcmcCardRepository$fetchEligibleCards$1) continuationImpl;
            int i = ncmcCardRepository$fetchEligibleCards$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ncmcCardRepository$fetchEligibleCards$1.label = i - Integer.MIN_VALUE;
            } else {
                ncmcCardRepository$fetchEligibleCards$1 = new NcmcCardRepository$fetchEligibleCards$1(this, continuationImpl);
            }
        } else {
            ncmcCardRepository$fetchEligibleCards$1 = new NcmcCardRepository$fetchEligibleCards$1(this, continuationImpl);
        }
        Object objD = ncmcCardRepository$fetchEligibleCards$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ncmcCardRepository$fetchEligibleCards$1.label;
        if (i2 == 0) {
            ResultKt.b(objD);
            ncmcCardRepository$fetchEligibleCards$1.label = 1;
            objD = this.f6257a.d(str, ncmcCardRepository$fetchEligibleCards$1);
            if (objD == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objD);
        }
        EligibleCardResponseApiModel eligibleCardResponseApiModel = (EligibleCardResponseApiModel) objD;
        Intrinsics.i(eligibleCardResponseApiModel, "<this>");
        List list = eligibleCardResponseApiModel.f6097a;
        return new EligibleCardResponseAppModel((list == null || (eligibleCard = (EligibleCard) CollectionsKt.H(list)) == null) ? null : eligibleCard.f6095a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.ncmc.repository.INcmcCardRepository
    public final Serializable e(String str, ContinuationImpl continuationImpl) {
        NcmcCardRepository$getNCMCCardData$1 ncmcCardRepository$getNCMCCardData$1;
        NcmcCardStatus ncmcCardStatus;
        if (continuationImpl instanceof NcmcCardRepository$getNCMCCardData$1) {
            ncmcCardRepository$getNCMCCardData$1 = (NcmcCardRepository$getNCMCCardData$1) continuationImpl;
            int i = ncmcCardRepository$getNCMCCardData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ncmcCardRepository$getNCMCCardData$1.label = i - Integer.MIN_VALUE;
            } else {
                ncmcCardRepository$getNCMCCardData$1 = new NcmcCardRepository$getNCMCCardData$1(this, continuationImpl);
            }
        } else {
            ncmcCardRepository$getNCMCCardData$1 = new NcmcCardRepository$getNCMCCardData$1(this, continuationImpl);
        }
        Object objE = ncmcCardRepository$getNCMCCardData$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ncmcCardRepository$getNCMCCardData$1.label;
        if (i2 == 0) {
            ResultKt.b(objE);
            ncmcCardRepository$getNCMCCardData$1.label = 1;
            objE = this.f6257a.e(str, ncmcCardRepository$getNCMCCardData$1);
            if (objE == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objE);
        }
        NcmcCardResponseApiModel ncmcCardResponseApiModel = (NcmcCardResponseApiModel) objE;
        Intrinsics.i(ncmcCardResponseApiModel, "<this>");
        List<NcmcCardRechargeModelItem> list = ncmcCardResponseApiModel.f6042a;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(list, 10));
        for (NcmcCardRechargeModelItem ncmcCardRechargeModelItem : list) {
            String str2 = ncmcCardRechargeModelItem.f6040a;
            Long lValueOf = Long.valueOf(ncmcCardRechargeModelItem.d);
            Long lValueOf2 = Long.valueOf(ncmcCardRechargeModelItem.c);
            NcmcCardStatus.Companion companion = NcmcCardStatus.INSTANCE;
            int i3 = ncmcCardRechargeModelItem.h;
            companion.getClass();
            if (i3 == 0) {
                ncmcCardStatus = NcmcCardStatus.INACTIVE;
            } else if (i3 != 1) {
                ncmcCardStatus = i3 != 2 ? NcmcCardStatus.INACTIVE : NcmcCardStatus.BLOCKED;
            } else {
                ncmcCardStatus = NcmcCardStatus.ACTIVE;
            }
            arrayList.add(new NcmcCardAppModel(str2, lValueOf, lValueOf2, ncmcCardStatus, ncmcCardRechargeModelItem.b, Long.valueOf(ncmcCardRechargeModelItem.f), Long.valueOf(ncmcCardRechargeModelItem.g)));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0077  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.ncmc.repository.INcmcCardRepository
    public final Object f(IntentHashRequestAppModel intentHashRequestAppModel, ContinuationImpl continuationImpl) throws UvikInvalidResponseException {
        NcmcCardRepository$getUvikIntentHash$1 ncmcCardRepository$getUvikIntentHash$1;
        IntentHashAppModel intentHashAppModel;
        if (continuationImpl instanceof NcmcCardRepository$getUvikIntentHash$1) {
            ncmcCardRepository$getUvikIntentHash$1 = (NcmcCardRepository$getUvikIntentHash$1) continuationImpl;
            int i = ncmcCardRepository$getUvikIntentHash$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ncmcCardRepository$getUvikIntentHash$1.label = i - Integer.MIN_VALUE;
            } else {
                ncmcCardRepository$getUvikIntentHash$1 = new NcmcCardRepository$getUvikIntentHash$1(this, continuationImpl);
            }
        } else {
            ncmcCardRepository$getUvikIntentHash$1 = new NcmcCardRepository$getUvikIntentHash$1(this, continuationImpl);
        }
        Object objO = ncmcCardRepository$getUvikIntentHash$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ncmcCardRepository$getUvikIntentHash$1.label;
        if (i2 == 0) {
            ResultKt.b(objO);
            IntentHashRequestApiModel intentHashRequestApiModel = new IntentHashRequestApiModel(intentHashRequestAppModel.f6149a, intentHashRequestAppModel.b.name());
            ncmcCardRepository$getUvikIntentHash$1.L$0 = intentHashRequestAppModel;
            ncmcCardRepository$getUvikIntentHash$1.label = 1;
            objO = this.f6257a.o(intentHashRequestApiModel, ncmcCardRepository$getUvikIntentHash$1);
            if (objO == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            intentHashRequestAppModel = (IntentHashRequestAppModel) ncmcCardRepository$getUvikIntentHash$1.L$0;
            ResultKt.b(objO);
        }
        IntentHashResponseApiModel intentHashResponseApiModel = (IntentHashResponseApiModel) objO;
        int i3 = NcmcCardRepositoryKt.WhenMappings.f6258a[intentHashRequestAppModel.b.ordinal()];
        if (i3 != 1) {
            if (i3 == 2 || i3 == 3) {
                intentHashAppModel = new IntentHashAppModel(intentHashResponseApiModel.f6061a, intentHashResponseApiModel.b, intentHashResponseApiModel.c, intentHashResponseApiModel.d, intentHashResponseApiModel.e);
            } else {
                if (i3 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                intentHashAppModel = null;
            }
        } else if (intentHashResponseApiModel.d == null || intentHashResponseApiModel.e == null) {
            intentHashAppModel = null;
        } else {
            intentHashAppModel = new IntentHashAppModel(intentHashResponseApiModel.f6061a, intentHashResponseApiModel.b, intentHashResponseApiModel.c, intentHashResponseApiModel.d, intentHashResponseApiModel.e);
        }
        if (intentHashAppModel != null) {
            return intentHashAppModel;
        }
        throw new UvikInvalidResponseException();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
    
        if (r13 == r0) goto L22;
     */
    @Override // app.chalo.ncmc.repository.INcmcCardRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) throws app.chalo.ncmc.data.error.CardActionItemMalformedResponseException {
        /*
            r8 = this;
            boolean r0 = r13 instanceof app.chalo.ncmc.repository.NcmcCardRepository$blockNCMCCard$1
            if (r0 == 0) goto L14
            r0 = r13
            app.chalo.ncmc.repository.NcmcCardRepository$blockNCMCCard$1 r0 = (app.chalo.ncmc.repository.NcmcCardRepository$blockNCMCCard$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            app.chalo.ncmc.repository.NcmcCardRepository$blockNCMCCard$1 r0 = new app.chalo.ncmc.repository.NcmcCardRepository$blockNCMCCard$1
            r0.<init>(r8, r13)
            goto L12
        L1a:
            java.lang.Object r13 = r6.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.label
            r7 = 2
            r2 = 1
            if (r1 == 0) goto L3a
            if (r1 == r2) goto L35
            if (r1 != r7) goto L2d
            kotlin.ResultKt.b(r13)
            r1 = r8
            goto L58
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            kotlin.ResultKt.b(r13)
            r1 = r8
            goto L4b
        L3a:
            kotlin.ResultKt.b(r13)
            r6.label = r2
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            java.lang.Object r13 = r1.p(r2, r3, r4, r5, r6)
            if (r13 != r0) goto L4b
            goto L57
        L4b:
            app.chalo.ncmc.data.apirequestmodel.BlockNCMCCardApiRequestModel r13 = (app.chalo.ncmc.data.apirequestmodel.BlockNCMCCardApiRequestModel) r13
            r6.label = r7
            app.chalo.ncmc.remote.INcmcCardRemoteDataSource r9 = r1.f6257a
            java.lang.Object r13 = r9.h(r13, r6)
            if (r13 != r0) goto L58
        L57:
            return r0
        L58:
            app.chalo.ncmc.data.apiresponsemodel.BlockNCMCCardApiResponseModel r13 = (app.chalo.ncmc.data.apiresponsemodel.BlockNCMCCardApiResponseModel) r13
            java.lang.String r9 = "<this>"
            kotlin.jvm.internal.Intrinsics.i(r13, r9)
            java.lang.String r9 = r13.f6065a
            if (r9 == 0) goto L6f
            int r10 = r9.length()
            if (r10 == 0) goto L6f
            app.chalo.ncmc.data.appmodel.BlockNCMCCardResponseAppModel r10 = new app.chalo.ncmc.data.appmodel.BlockNCMCCardResponseAppModel
            r10.<init>(r9)
            return r10
        L6f:
            app.chalo.ncmc.data.error.CardActionItemMalformedResponseException r9 = new app.chalo.ncmc.data.error.CardActionItemMalformedResponseException
            java.lang.String r10 = "Malformed JSON response"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.ncmc.repository.NcmcCardRepository.g(java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0092, code lost:
    
        if (r11 == r1) goto L38;
     */
    @Override // app.chalo.ncmc.repository.INcmcCardRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.lang.String r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) throws app.chalo.ncmc.data.error.CardActionItemMalformedResponseException {
        /*
            r9 = this;
            boolean r0 = r11 instanceof app.chalo.ncmc.repository.NcmcCardRepository$changeNcmcCardPin$1
            if (r0 == 0) goto L13
            r0 = r11
            app.chalo.ncmc.repository.NcmcCardRepository$changeNcmcCardPin$1 r0 = (app.chalo.ncmc.repository.NcmcCardRepository$changeNcmcCardPin$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.ncmc.repository.NcmcCardRepository$changeNcmcCardPin$1 r0 = new app.chalo.ncmc.repository.NcmcCardRepository$changeNcmcCardPin$1
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            java.lang.String r3 = ""
            app.chalo.providers.UserProfileDetailsProvider r4 = r9.c
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L4e
            if (r2 == r7) goto L46
            if (r2 == r6) goto L3a
            if (r2 != r5) goto L32
            kotlin.ResultKt.b(r11)
            goto L95
        L32:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3a:
            java.lang.Object r10 = r0.L$1
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r2 = r0.L$0
            java.lang.String r2 = (java.lang.String) r2
            kotlin.ResultKt.b(r11)
            goto L76
        L46:
            java.lang.Object r10 = r0.L$0
            java.lang.String r10 = (java.lang.String) r10
            kotlin.ResultKt.b(r11)
            goto L5c
        L4e:
            kotlin.ResultKt.b(r11)
            r0.L$0 = r10
            r0.label = r7
            java.lang.Object r11 = r4.l(r0)
            if (r11 != r1) goto L5c
            goto L94
        L5c:
            app.chalo.userprofile.UserProfileAppModel r11 = (app.chalo.userprofile.UserProfileAppModel) r11
            if (r11 == 0) goto L64
            java.lang.String r11 = r11.e
            if (r11 != 0) goto L65
        L64:
            r11 = r3
        L65:
            r0.L$0 = r10
            r0.L$1 = r11
            r0.label = r6
            java.lang.Object r2 = r4.l(r0)
            if (r2 != r1) goto L72
            goto L94
        L72:
            r8 = r2
            r2 = r10
            r10 = r11
            r11 = r8
        L76:
            app.chalo.userprofile.UserProfileAppModel r11 = (app.chalo.userprofile.UserProfileAppModel) r11
            if (r11 == 0) goto L80
            java.lang.String r11 = r11.f
            if (r11 != 0) goto L7f
            goto L80
        L7f:
            r3 = r11
        L80:
            app.chalo.ncmc.data.apirequestmodel.ChangeNcmcCardPinApiRequestModel r11 = new app.chalo.ncmc.data.apirequestmodel.ChangeNcmcCardPinApiRequestModel
            r11.<init>(r2, r10, r3)
            r10 = 0
            r0.L$0 = r10
            r0.L$1 = r10
            r0.label = r5
            app.chalo.ncmc.remote.INcmcCardRemoteDataSource r10 = r9.f6257a
            java.lang.Object r11 = r10.f(r11, r0)
            if (r11 != r1) goto L95
        L94:
            return r1
        L95:
            app.chalo.ncmc.data.apiresponsemodel.ChangeNcmcCardPinApiResponseModel r11 = (app.chalo.ncmc.data.apiresponsemodel.ChangeNcmcCardPinApiResponseModel) r11
            java.lang.String r10 = "<this>"
            kotlin.jvm.internal.Intrinsics.i(r11, r10)
            java.lang.String r10 = r11.f6087a
            if (r10 == 0) goto Lac
            int r11 = r10.length()
            if (r11 == 0) goto Lac
            app.chalo.ncmc.data.appmodel.ChangeNcmcCardPinResponseAppModel r11 = new app.chalo.ncmc.data.appmodel.ChangeNcmcCardPinResponseAppModel
            r11.<init>(r10)
            return r11
        Lac:
            app.chalo.ncmc.data.error.CardActionItemMalformedResponseException r10 = new app.chalo.ncmc.data.error.CardActionItemMalformedResponseException
            java.lang.String r11 = "Malformed JSON response"
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.ncmc.repository.NcmcCardRepository.h(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // app.chalo.ncmc.repository.INcmcCardRepository
    public final Object i(long j, String str, String str2, String str3, String str4, String str5, Continuation continuation) {
        return this.f6257a.n(new NcmcOfflineRechargeConfirmRequestModel(j, str4, str2, str, str3, str5), (ContinuationImpl) continuation);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v7, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Long, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v2 */
    @Override // app.chalo.ncmc.repository.INcmcCardRepository
    public final Object j(String str, ContinuationImpl continuationImpl) {
        NcmcCardRepository$fetchChaloCardRechargeConfiguration$1 ncmcCardRepository$fetchChaloCardRechargeConfiguration$1;
        ?? arrayList;
        ?? r6;
        ChaloCardRechargeConfigAppModel chaloCardRechargeConfigAppModel;
        ChaloCardRechargeFareInfoAppModel chaloCardRechargeFareInfoAppModel;
        ChaloCardRechargeConfigBrandingAppModel chaloCardRechargeConfigBrandingAppModel;
        ?? arrayList2;
        boolean z;
        if (continuationImpl instanceof NcmcCardRepository$fetchChaloCardRechargeConfiguration$1) {
            ncmcCardRepository$fetchChaloCardRechargeConfiguration$1 = (NcmcCardRepository$fetchChaloCardRechargeConfiguration$1) continuationImpl;
            int i = ncmcCardRepository$fetchChaloCardRechargeConfiguration$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ncmcCardRepository$fetchChaloCardRechargeConfiguration$1.label = i - Integer.MIN_VALUE;
            } else {
                ncmcCardRepository$fetchChaloCardRechargeConfiguration$1 = new NcmcCardRepository$fetchChaloCardRechargeConfiguration$1(this, continuationImpl);
            }
        } else {
            ncmcCardRepository$fetchChaloCardRechargeConfiguration$1 = new NcmcCardRepository$fetchChaloCardRechargeConfiguration$1(this, continuationImpl);
        }
        Object objG = ncmcCardRepository$fetchChaloCardRechargeConfiguration$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ncmcCardRepository$fetchChaloCardRechargeConfiguration$1.label;
        if (i2 == 0) {
            ResultKt.b(objG);
            ncmcCardRepository$fetchChaloCardRechargeConfiguration$1.label = 1;
            objG = this.f6257a.g(str, ncmcCardRepository$fetchChaloCardRechargeConfiguration$1);
            if (objG == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objG);
        }
        CardRechargeConfigListApiResponseModel cardRechargeConfigListApiResponseModel = (CardRechargeConfigListApiResponseModel) objG;
        int iH = this.b.h();
        Intrinsics.i(cardRechargeConfigListApiResponseModel, "<this>");
        List list = cardRechargeConfigListApiResponseModel.f6069a;
        if (list != null) {
            ArrayList arrayList3 = new ArrayList();
            Iterator it = list.iterator();
            while (true) {
                r6 = 0;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                CardRechargeConfigApiResponseModel cardRechargeConfigApiResponseModel = (CardRechargeConfigApiResponseModel) next;
                if (!(cardRechargeConfigApiResponseModel != null ? CardRechargeConfigListApiResponseModelKt.a(cardRechargeConfigApiResponseModel, iH) : false)) {
                    z = false;
                } else if (Intrinsics.d(cardRechargeConfigApiResponseModel != null ? cardRechargeConfigApiResponseModel.l : null, "cardRecharge") && Intrinsics.d(cardRechargeConfigApiResponseModel.m, "cardRecharge")) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    arrayList3.add(next);
                }
            }
            arrayList = new ArrayList();
            int size = arrayList3.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList3.get(i3);
                i3++;
                CardRechargeConfigApiResponseModel cardRechargeConfigApiResponseModel2 = (CardRechargeConfigApiResponseModel) obj;
                if (cardRechargeConfigApiResponseModel2 != null) {
                    String str2 = cardRechargeConfigApiResponseModel2.f6067a;
                    if (str2 == null) {
                        str2 = "";
                    }
                    ChaloCardRechargeFareInfoApiResponseModel chaloCardRechargeFareInfoApiResponseModel = cardRechargeConfigApiResponseModel2.g;
                    if (chaloCardRechargeFareInfoApiResponseModel != null) {
                        Long l = chaloCardRechargeFareInfoApiResponseModel.f6081a;
                        Long l2 = chaloCardRechargeFareInfoApiResponseModel.b;
                        List list2 = chaloCardRechargeFareInfoApiResponseModel.c;
                        if (list2 != null) {
                            List<Long> list3 = list2;
                            arrayList2 = new ArrayList(CollectionsKt.v(list3, 10));
                            for (Long l3 : list3) {
                                arrayList2.add(Long.valueOf(l3 != null ? l3.longValue() : 0L));
                            }
                        } else {
                            arrayList2 = r6;
                        }
                        chaloCardRechargeFareInfoAppModel = new ChaloCardRechargeFareInfoAppModel(l, l2, arrayList2);
                    } else {
                        chaloCardRechargeFareInfoAppModel = new ChaloCardRechargeFareInfoAppModel(r6, r6, r6);
                    }
                    Boolean bool = cardRechargeConfigApiResponseModel2.i;
                    Integer num = cardRechargeConfigApiResponseModel2.j;
                    Integer num2 = cardRechargeConfigApiResponseModel2.k;
                    String str3 = cardRechargeConfigApiResponseModel2.b;
                    String str4 = cardRechargeConfigApiResponseModel2.c;
                    ChaloCardRechargeConfigBrandingApiResponseModel chaloCardRechargeConfigBrandingApiResponseModel = cardRechargeConfigApiResponseModel2.d;
                    if (chaloCardRechargeConfigBrandingApiResponseModel != null) {
                        Boolean bool2 = chaloCardRechargeConfigBrandingApiResponseModel.f6079a;
                        chaloCardRechargeConfigBrandingAppModel = new ChaloCardRechargeConfigBrandingAppModel(Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false));
                    } else {
                        chaloCardRechargeConfigBrandingAppModel = null;
                    }
                    chaloCardRechargeConfigAppModel = new ChaloCardRechargeConfigAppModel(str2, chaloCardRechargeFareInfoAppModel, bool, num, num2, str3, str4, chaloCardRechargeConfigBrandingAppModel, cardRechargeConfigApiResponseModel2.e, cardRechargeConfigApiResponseModel2.f, cardRechargeConfigApiResponseModel2.l, cardRechargeConfigApiResponseModel2.m, cardRechargeConfigApiResponseModel2.o);
                } else {
                    chaloCardRechargeConfigAppModel = null;
                }
                if (chaloCardRechargeConfigAppModel != null) {
                    arrayList.add(chaloCardRechargeConfigAppModel);
                }
                r6 = 0;
            }
        } else {
            arrayList = EmptyList.f17557a;
        }
        return new ChaloCardRechargeConfigurationListAppModel(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // app.chalo.ncmc.repository.INcmcCardRepository
    public final Object k(long j, String str, String str2, String str3, ContinuationImpl continuationImpl) {
        NcmcCardRepository$createNcmcOnlineRechargeOrder$1 ncmcCardRepository$createNcmcOnlineRechargeOrder$1;
        if (continuationImpl instanceof NcmcCardRepository$createNcmcOnlineRechargeOrder$1) {
            ncmcCardRepository$createNcmcOnlineRechargeOrder$1 = (NcmcCardRepository$createNcmcOnlineRechargeOrder$1) continuationImpl;
            int i = ncmcCardRepository$createNcmcOnlineRechargeOrder$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ncmcCardRepository$createNcmcOnlineRechargeOrder$1.label = i - Integer.MIN_VALUE;
            } else {
                ncmcCardRepository$createNcmcOnlineRechargeOrder$1 = new NcmcCardRepository$createNcmcOnlineRechargeOrder$1(this, continuationImpl);
            }
        } else {
            ncmcCardRepository$createNcmcOnlineRechargeOrder$1 = new NcmcCardRepository$createNcmcOnlineRechargeOrder$1(this, continuationImpl);
        }
        Object objM = ncmcCardRepository$createNcmcOnlineRechargeOrder$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ncmcCardRepository$createNcmcOnlineRechargeOrder$1.label;
        if (i2 == 0) {
            ResultKt.b(objM);
            NcmcOnlineCardRechargeRequestApiModel ncmcOnlineCardRechargeRequestApiModel = new NcmcOnlineCardRechargeRequestApiModel(j, str, str2, str3);
            ncmcCardRepository$createNcmcOnlineRechargeOrder$1.label = 1;
            objM = this.f6257a.m(ncmcOnlineCardRechargeRequestApiModel, ncmcCardRepository$createNcmcOnlineRechargeOrder$1);
            if (objM == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objM);
        }
        return CreateOrderResponseApiModelKt.a((CreateOrderResponseApiModel) objM);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.ncmc.repository.INcmcCardRepository
    public final Object l(String str, long j, CardRechargeConfiguration cardRechargeConfiguration, String str2, ContinuationImpl continuationImpl) {
        NcmcCardRepository$createCardRechargeOrder$1 ncmcCardRepository$createCardRechargeOrder$1;
        if (continuationImpl instanceof NcmcCardRepository$createCardRechargeOrder$1) {
            ncmcCardRepository$createCardRechargeOrder$1 = (NcmcCardRepository$createCardRechargeOrder$1) continuationImpl;
            int i = ncmcCardRepository$createCardRechargeOrder$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ncmcCardRepository$createCardRechargeOrder$1.label = i - Integer.MIN_VALUE;
            } else {
                ncmcCardRepository$createCardRechargeOrder$1 = new NcmcCardRepository$createCardRechargeOrder$1(this, continuationImpl);
            }
        } else {
            ncmcCardRepository$createCardRechargeOrder$1 = new NcmcCardRepository$createCardRechargeOrder$1(this, continuationImpl);
        }
        Object objJ = ncmcCardRepository$createCardRechargeOrder$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ncmcCardRepository$createCardRechargeOrder$1.label;
        if (i2 == 0) {
            ResultKt.b(objJ);
            CreateCardRechargeOrderRequestApiModel createCardRechargeOrderRequestApiModel = new CreateCardRechargeOrderRequestApiModel(str, new CardProps((int) j, str, cardRechargeConfiguration.f5575a), new PaymentProps(), str2);
            ncmcCardRepository$createCardRechargeOrder$1.label = 1;
            objJ = this.f6257a.j(createCardRechargeOrderRequestApiModel, ncmcCardRepository$createCardRechargeOrder$1);
            if (objJ == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objJ);
        }
        return CreateOrderResponseApiModelKt.a((CreateOrderResponseApiModel) objJ);
    }

    @Override // app.chalo.ncmc.repository.INcmcCardRepository
    public final Object m(int i, String str, String str2, String str3, String str4, Continuation continuation) {
        return this.f6257a.i(new NcmcOfflineRechargeRequestApiModel(i, str, str2, str3, str4), (ContinuationImpl) continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.ncmc.repository.INcmcCardRepository
    public final Object n(String str, String str2, String str3, ContinuationImpl continuationImpl, boolean z) throws LinkChaloCardMalformedResponseException {
        NcmcCardRepository$linkChaloCard$1 ncmcCardRepository$linkChaloCard$1;
        if (continuationImpl instanceof NcmcCardRepository$linkChaloCard$1) {
            ncmcCardRepository$linkChaloCard$1 = (NcmcCardRepository$linkChaloCard$1) continuationImpl;
            int i = ncmcCardRepository$linkChaloCard$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ncmcCardRepository$linkChaloCard$1.label = i - Integer.MIN_VALUE;
            } else {
                ncmcCardRepository$linkChaloCard$1 = new NcmcCardRepository$linkChaloCard$1(this, continuationImpl);
            }
        } else {
            ncmcCardRepository$linkChaloCard$1 = new NcmcCardRepository$linkChaloCard$1(this, continuationImpl);
        }
        Object objK = ncmcCardRepository$linkChaloCard$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ncmcCardRepository$linkChaloCard$1.label;
        if (i2 == 0) {
            ResultKt.b(objK);
            LinkChaloCardRequestApiModel linkChaloCardRequestApiModel = new LinkChaloCardRequestApiModel(str, str2, str3, z);
            ncmcCardRepository$linkChaloCard$1.label = 1;
            objK = this.f6257a.k(linkChaloCardRequestApiModel, ncmcCardRepository$linkChaloCard$1);
            if (objK == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objK);
        }
        LinkChaloCardApiResponseModel linkChaloCardApiResponseModel = (LinkChaloCardApiResponseModel) objK;
        Intrinsics.i(linkChaloCardApiResponseModel, "<this>");
        String str4 = linkChaloCardApiResponseModel.f6099a;
        if (str4 == null || str4.length() == 0) {
            throw new LinkChaloCardMalformedResponseException("Malformed JSON response");
        }
        return new LinkChaloCardResponseAppModel(str4);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0095  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r16v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v4, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.ArrayList] */
    @Override // app.chalo.ncmc.repository.INcmcCardRepository
    public final Serializable o(int i, String str, ContinuationImpl continuationImpl) {
        NcmcCardRepository$fetchNcmcCardRechargeConfig$1 ncmcCardRepository$fetchNcmcCardRechargeConfig$1;
        int i2;
        Object objG;
        ?? arrayList;
        NcmcCardRechargeConfigAppModel ncmcCardRechargeConfigAppModel;
        CardRechargeFareInfo cardRechargeFareInfo;
        ProductBranding productBranding;
        ?? arrayList2;
        boolean z;
        if (continuationImpl instanceof NcmcCardRepository$fetchNcmcCardRechargeConfig$1) {
            ncmcCardRepository$fetchNcmcCardRechargeConfig$1 = (NcmcCardRepository$fetchNcmcCardRechargeConfig$1) continuationImpl;
            int i3 = ncmcCardRepository$fetchNcmcCardRechargeConfig$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ncmcCardRepository$fetchNcmcCardRechargeConfig$1.label = i3 - Integer.MIN_VALUE;
            } else {
                ncmcCardRepository$fetchNcmcCardRechargeConfig$1 = new NcmcCardRepository$fetchNcmcCardRechargeConfig$1(this, continuationImpl);
            }
        } else {
            ncmcCardRepository$fetchNcmcCardRechargeConfig$1 = new NcmcCardRepository$fetchNcmcCardRechargeConfig$1(this, continuationImpl);
        }
        Object obj = ncmcCardRepository$fetchNcmcCardRechargeConfig$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = ncmcCardRepository$fetchNcmcCardRechargeConfig$1.label;
        if (i4 == 0) {
            ResultKt.b(obj);
            i2 = i;
            ncmcCardRepository$fetchNcmcCardRechargeConfig$1.I$0 = i2;
            ncmcCardRepository$fetchNcmcCardRechargeConfig$1.label = 1;
            objG = this.f6257a.g(str, ncmcCardRepository$fetchNcmcCardRechargeConfig$1);
            if (objG == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = ncmcCardRepository$fetchNcmcCardRechargeConfig$1.I$0;
            ResultKt.b(obj);
            objG = obj;
            i2 = i5;
        }
        CardRechargeConfigListApiResponseModel cardRechargeConfigListApiResponseModel = (CardRechargeConfigListApiResponseModel) objG;
        Intrinsics.i(cardRechargeConfigListApiResponseModel, "<this>");
        List list = cardRechargeConfigListApiResponseModel.f6069a;
        if (list != null) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list) {
                CardRechargeConfigApiResponseModel cardRechargeConfigApiResponseModel = (CardRechargeConfigApiResponseModel) obj2;
                if (!(cardRechargeConfigApiResponseModel != null ? CardRechargeConfigListApiResponseModelKt.a(cardRechargeConfigApiResponseModel, i2) : false)) {
                    z = false;
                } else if (Intrinsics.d(cardRechargeConfigApiResponseModel != null ? cardRechargeConfigApiResponseModel.l : null, "cardRecharge") && Intrinsics.d(cardRechargeConfigApiResponseModel.m, "ncmcCardRecharge")) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    arrayList3.add(obj2);
                }
            }
            arrayList = new ArrayList();
            int size = arrayList3.size();
            int i6 = 0;
            while (i6 < size) {
                Object obj3 = arrayList3.get(i6);
                i6++;
                CardRechargeConfigApiResponseModel cardRechargeConfigApiResponseModel2 = (CardRechargeConfigApiResponseModel) obj3;
                if (cardRechargeConfigApiResponseModel2 != null) {
                    String str2 = cardRechargeConfigApiResponseModel2.f6067a;
                    Intrinsics.f(str2);
                    ChaloCardRechargeFareInfoApiResponseModel chaloCardRechargeFareInfoApiResponseModel = cardRechargeConfigApiResponseModel2.g;
                    if (chaloCardRechargeFareInfoApiResponseModel != null) {
                        Long l = chaloCardRechargeFareInfoApiResponseModel.f6081a;
                        long jLongValue = l != null ? l.longValue() : 0L;
                        Long l2 = chaloCardRechargeFareInfoApiResponseModel.b;
                        long jLongValue2 = l2 != null ? l2.longValue() : 1L;
                        List list2 = chaloCardRechargeFareInfoApiResponseModel.c;
                        if (list2 != null) {
                            List<Long> list3 = list2;
                            arrayList2 = new ArrayList(CollectionsKt.v(list3, 10));
                            for (Long l3 : list3) {
                                arrayList2.add(Long.valueOf(l3 != null ? l3.longValue() : 0L));
                            }
                        } else {
                            arrayList2 = EmptyList.f17557a;
                        }
                        cardRechargeFareInfo = new CardRechargeFareInfo(arrayList2, jLongValue, jLongValue2);
                    } else {
                        cardRechargeFareInfo = new CardRechargeFareInfo(EmptyList.f17557a, 0L, 0L);
                    }
                    Boolean bool = cardRechargeConfigApiResponseModel2.i;
                    Integer num = cardRechargeConfigApiResponseModel2.j;
                    Integer num2 = cardRechargeConfigApiResponseModel2.k;
                    String str3 = cardRechargeConfigApiResponseModel2.b;
                    String str4 = cardRechargeConfigApiResponseModel2.c;
                    ChaloCardRechargeConfigBrandingApiResponseModel chaloCardRechargeConfigBrandingApiResponseModel = cardRechargeConfigApiResponseModel2.d;
                    if (chaloCardRechargeConfigBrandingApiResponseModel != null) {
                        Boolean bool2 = chaloCardRechargeConfigBrandingApiResponseModel.f6079a;
                        productBranding = new ProductBranding(bool2 != null ? bool2.booleanValue() : false);
                    } else {
                        productBranding = null;
                    }
                    List list4 = cardRechargeConfigApiResponseModel2.e;
                    ArrayList arrayListD = list4 != null ? CollectionsKt.D(list4) : null;
                    String str5 = cardRechargeConfigApiResponseModel2.f;
                    Intrinsics.f(str5);
                    String str6 = cardRechargeConfigApiResponseModel2.l;
                    Intrinsics.f(str6);
                    String str7 = cardRechargeConfigApiResponseModel2.m;
                    Intrinsics.f(str7);
                    String str8 = cardRechargeConfigApiResponseModel2.o;
                    if (str8 == null) {
                        str8 = "";
                    }
                    ncmcCardRechargeConfigAppModel = new NcmcCardRechargeConfigAppModel(str2, str3, str4, productBranding, arrayListD, str5, cardRechargeFareInfo, cardRechargeConfigApiResponseModel2.h, bool, num, num2, str6, str7, cardRechargeConfigApiResponseModel2.n, str8);
                } else {
                    ncmcCardRechargeConfigAppModel = null;
                }
                if (ncmcCardRechargeConfigAppModel != null) {
                    arrayList.add(ncmcCardRechargeConfigAppModel);
                }
            }
        } else {
            arrayList = EmptyList.f17557a;
        }
        new NcmcCardRechargeConfigsListAppModel(arrayList);
        return (Serializable) arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object p(String str, String str2, String str3, String str4, ContinuationImpl continuationImpl) {
        NcmcCardRepository$getBlockNCMCCardRequestBody$1 ncmcCardRepository$getBlockNCMCCardRequestBody$1;
        String str5;
        Object obj;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        UserProfileAppModel userProfileAppModel;
        String str15;
        String str16;
        if (continuationImpl instanceof NcmcCardRepository$getBlockNCMCCardRequestBody$1) {
            ncmcCardRepository$getBlockNCMCCardRequestBody$1 = (NcmcCardRepository$getBlockNCMCCardRequestBody$1) continuationImpl;
            int i = ncmcCardRepository$getBlockNCMCCardRequestBody$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ncmcCardRepository$getBlockNCMCCardRequestBody$1.label = i - Integer.MIN_VALUE;
            } else {
                ncmcCardRepository$getBlockNCMCCardRequestBody$1 = new NcmcCardRepository$getBlockNCMCCardRequestBody$1(this, continuationImpl);
            }
        } else {
            ncmcCardRepository$getBlockNCMCCardRequestBody$1 = new NcmcCardRepository$getBlockNCMCCardRequestBody$1(this, continuationImpl);
        }
        Object obj2 = ncmcCardRepository$getBlockNCMCCardRequestBody$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ncmcCardRepository$getBlockNCMCCardRequestBody$1.label;
        UserProfileDetailsProvider userProfileDetailsProvider = this.c;
        if (i2 == 0) {
            ResultKt.b(obj2);
            ncmcCardRepository$getBlockNCMCCardRequestBody$1.L$0 = str;
            str5 = str2;
            ncmcCardRepository$getBlockNCMCCardRequestBody$1.L$1 = str5;
            ncmcCardRepository$getBlockNCMCCardRequestBody$1.L$2 = str3;
            ncmcCardRepository$getBlockNCMCCardRequestBody$1.L$3 = str4;
            ncmcCardRepository$getBlockNCMCCardRequestBody$1.label = 1;
            Object objL = userProfileDetailsProvider.l(ncmcCardRepository$getBlockNCMCCardRequestBody$1);
            if (objL != coroutineSingletons) {
                obj = objL;
                str6 = str3;
                str7 = str4;
                str8 = str;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            String str17 = (String) ncmcCardRepository$getBlockNCMCCardRequestBody$1.L$3;
            str6 = (String) ncmcCardRepository$getBlockNCMCCardRequestBody$1.L$2;
            String str18 = (String) ncmcCardRepository$getBlockNCMCCardRequestBody$1.L$1;
            str8 = (String) ncmcCardRepository$getBlockNCMCCardRequestBody$1.L$0;
            ResultKt.b(obj2);
            obj = obj2;
            str7 = str17;
            str5 = str18;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str19 = (String) ncmcCardRepository$getBlockNCMCCardRequestBody$1.L$4;
            String str20 = (String) ncmcCardRepository$getBlockNCMCCardRequestBody$1.L$3;
            String str21 = (String) ncmcCardRepository$getBlockNCMCCardRequestBody$1.L$2;
            String str22 = (String) ncmcCardRepository$getBlockNCMCCardRequestBody$1.L$1;
            String str23 = (String) ncmcCardRepository$getBlockNCMCCardRequestBody$1.L$0;
            ResultKt.b(obj2);
            str10 = str19;
            str12 = str20;
            str13 = str21;
            str14 = str22;
            str11 = str23;
        }
        userProfileAppModel = (UserProfileAppModel) obj2;
        if (userProfileAppModel != null || (str16 = userProfileAppModel.f) == null) {
            str15 = "";
        } else {
            str15 = str16;
        }
        return new BlockNCMCCardApiRequestModel(str11, str14, str13, str12, str10, str15);
        UserProfileAppModel userProfileAppModel2 = (UserProfileAppModel) obj;
        if (userProfileAppModel2 == null || (str9 = userProfileAppModel2.e) == null) {
            str9 = "";
        }
        ncmcCardRepository$getBlockNCMCCardRequestBody$1.L$0 = str8;
        ncmcCardRepository$getBlockNCMCCardRequestBody$1.L$1 = str5;
        ncmcCardRepository$getBlockNCMCCardRequestBody$1.L$2 = str6;
        ncmcCardRepository$getBlockNCMCCardRequestBody$1.L$3 = str7;
        ncmcCardRepository$getBlockNCMCCardRequestBody$1.L$4 = str9;
        ncmcCardRepository$getBlockNCMCCardRequestBody$1.label = 2;
        Object objL2 = userProfileDetailsProvider.l(ncmcCardRepository$getBlockNCMCCardRequestBody$1);
        if (objL2 != coroutineSingletons) {
            str10 = str9;
            str11 = str8;
            str12 = str7;
            obj2 = objL2;
            str13 = str6;
            str14 = str5;
            userProfileAppModel = (UserProfileAppModel) obj2;
            if (userProfileAppModel != null) {
                str15 = "";
            } else {
                str15 = "";
            }
            return new BlockNCMCCardApiRequestModel(str11, str14, str13, str12, str10, str15);
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0092  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object q(CardValidationRequestAppModel cardValidationRequestAppModel, ContinuationImpl continuationImpl) {
        NcmcCardRepository$validateChaloCard$1 ncmcCardRepository$validateChaloCard$1;
        CardValidationStatus cardValidationStatus;
        if (continuationImpl instanceof NcmcCardRepository$validateChaloCard$1) {
            ncmcCardRepository$validateChaloCard$1 = (NcmcCardRepository$validateChaloCard$1) continuationImpl;
            int i = ncmcCardRepository$validateChaloCard$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ncmcCardRepository$validateChaloCard$1.label = i - Integer.MIN_VALUE;
            } else {
                ncmcCardRepository$validateChaloCard$1 = new NcmcCardRepository$validateChaloCard$1(this, continuationImpl);
            }
        } else {
            ncmcCardRepository$validateChaloCard$1 = new NcmcCardRepository$validateChaloCard$1(this, continuationImpl);
        }
        Object objL = ncmcCardRepository$validateChaloCard$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ncmcCardRepository$validateChaloCard$1.label;
        if (i2 == 0) {
            ResultKt.b(objL);
            CardValidationRequestApiModel cardValidationRequestApiModel = new CardValidationRequestApiModel(cardValidationRequestAppModel.f6219a, cardValidationRequestAppModel.b, cardValidationRequestAppModel.c, cardValidationRequestAppModel.d);
            ncmcCardRepository$validateChaloCard$1.label = 1;
            objL = this.f6257a.l(cardValidationRequestApiModel, ncmcCardRepository$validateChaloCard$1);
            if (objL == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objL);
        }
        CardValidationResponseApiModel cardValidationResponseApiModel = (CardValidationResponseApiModel) objL;
        cardValidationResponseApiModel.getClass();
        CardValidationStatus.Companion companion = CardValidationStatus.INSTANCE;
        String value = cardValidationResponseApiModel.f6220a;
        companion.getClass();
        Intrinsics.i(value, "value");
        int iHashCode = value.hashCode();
        if (iHashCode != -1617199657) {
            if (iHashCode != 66247144) {
                if (iHashCode == 81434588 && value.equals("VALID")) {
                    cardValidationStatus = CardValidationStatus.VALID;
                } else {
                    cardValidationStatus = CardValidationStatus.ERROR;
                }
            } else if (value.equals("ERROR")) {
                cardValidationStatus = CardValidationStatus.ERROR;
            } else {
                cardValidationStatus = CardValidationStatus.ERROR;
            }
        } else if (value.equals("INVALID")) {
            cardValidationStatus = CardValidationStatus.INVALID;
        } else {
            cardValidationStatus = CardValidationStatus.ERROR;
        }
        Long l = cardValidationResponseApiModel.c;
        long jLongValue = l != null ? l.longValue() : -1L;
        String str = cardValidationResponseApiModel.b;
        if (str == null) {
            str = "";
        }
        return new CardValidationAppModel(cardValidationStatus, jLongValue, str);
    }
}
