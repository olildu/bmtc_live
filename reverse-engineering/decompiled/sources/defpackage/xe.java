package defpackage;

import app.chalo.capacitorDataMigration.dataFetcher.CapacitorDataResult;
import app.chalo.constants.Source;
import app.chalo.data.CardRechargePaymentStatus;
import app.chalo.data.CardRechargeStatus;
import app.chalo.data.CardRechargeSummaryData;
import app.chalo.homescreen.data.model.app.CardSectionAppModel;
import app.chalo.models.CardRechargeConfiguration;
import app.chalo.models.CardRechargeFareInfo;
import app.chalo.ncmc.data.CardOptions;
import app.chalo.ncmc.data.CityWiseCardOptions$$serializer;
import app.chalo.ncmc.data.LinkCardConfig$$serializer;
import app.chalo.ncmc.data.apiresponsemodel.CardRechargeConfigApiResponseModel;
import app.chalo.ncmc.data.apiresponsemodel.CardRechargeConfigApiResponseModel$$serializer;
import app.chalo.ncmc.data.apiresponsemodel.CardRechargeConfigListApiResponseModel;
import app.chalo.ncmc.data.apiresponsemodel.ChaloCardUnsyncedRechargesApiModel$$serializer;
import app.chalo.ncmc.data.appmodel.ChaloCardUnsyncedRechargeDetails$$serializer;
import app.chalo.ncmc.data.cardtransactions.CardRechargePaymentMode;
import app.chalo.ncmc.data.cardtransactions.CardRechargeTransactionApiResponse;
import app.chalo.ncmc.data.cardtransactions.CardRechargeTransactionAppModel;
import app.chalo.ncmc.data.cardtransactions.CardTicketPaymentMode;
import app.chalo.ncmc.data.cardtransactions.CardTicketTransactionApiResponse;
import app.chalo.ncmc.data.cardtransactions.CardTicketTransactionAppModel;
import app.chalo.ncmc.data.cardtransactions.CardTransaction;
import app.chalo.ncmc.data.cardtransactions.CardTransactionApiResponseModel;
import app.chalo.ncmc.data.cardtransactions.CardTransactionFareBreakupApiResponse$$serializer;
import app.chalo.ncmc.data.cardtransactions.CardTransactionFareBreakupAppModel$$serializer;
import app.chalo.ncmc.data.cardtransactions.CardTransactionFareInfoApiResponse;
import app.chalo.ncmc.data.cardtransactions.CardTransactionFareInfoAppModel;
import app.chalo.ncmc.data.cardtransactions.ChaloCardTransactionTypeDeserializer;
import app.chalo.ncmc.ui.CardPendingRechargesArgsModel;
import app.chalo.ncmc.ui.CardRechargeEnterAmountArgsModel;
import app.chalo.ncmc.ui.CardTransactionDetailArgsModel;
import app.chalo.ncmc.ui.CardTransactionHistoryArgsModel;
import app.chalo.ncmc.ui.cardrechargeamount.ChaloCardRechargeAmountFlowType;
import app.chalo.ncmc.ui.transactionhistory.CardTransactionHistoryUiErrorWrapper;
import app.chalo.ncmc.ui.transactionhistory.CardTransactionTypeUiModel;
import app.chalo.ncmc.ui.transactionhistory.ChaloCardTransactionsUiErrorType;
import app.chalo.productpurchase.productselection.data.models.api.CardRechargeFareInfoApiResponseModel;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.scenes.args.CardLinkingScreenArgs;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonElementSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class xe implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20011a;

    public /* synthetic */ xe(int i) {
        this.f20011a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f20011a) {
            case 0:
                CapacitorDataResult.Companion companion = CapacitorDataResult.Companion;
                return new LinkedHashMapSerializer(StringSerializer.f18170a, JsonElementSerializer.f18193a);
            case 1:
                CapacitorDataResult.Companion companion2 = CapacitorDataResult.Companion;
                return new LinkedHashMapSerializer(StringSerializer.f18170a, JsonElementSerializer.f18193a);
            case 2:
                CardLinkingScreenArgs.Companion companion3 = CardLinkingScreenArgs.Companion;
                return Source.INSTANCE.serializer();
            case 3:
                CardOptions.Companion companion4 = CardOptions.INSTANCE;
                return new ArrayListSerializer(CityWiseCardOptions$$serializer.f6029a);
            case 4:
                CardOptions.Companion companion5 = CardOptions.INSTANCE;
                return new ArrayListSerializer(LinkCardConfig$$serializer.f6031a);
            case 5:
                CardPendingRechargesArgsModel.Companion companion6 = CardPendingRechargesArgsModel.Companion;
                return new ArrayListSerializer(ChaloCardUnsyncedRechargeDetails$$serializer.f6135a);
            case 6:
                CardRechargeConfigApiResponseModel.Companion companion7 = CardRechargeConfigApiResponseModel.INSTANCE;
                return new ArrayListSerializer(BuiltinSerializersKt.c(StringSerializer.f18170a));
            case 7:
                CardRechargeConfigListApiResponseModel.Companion companion8 = CardRechargeConfigListApiResponseModel.Companion;
                return new ArrayListSerializer(BuiltinSerializersKt.c(CardRechargeConfigApiResponseModel$$serializer.f6068a));
            case 8:
                CardRechargeConfiguration.Companion companion9 = CardRechargeConfiguration.INSTANCE;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 9:
                CardRechargeEnterAmountArgsModel.Companion companion10 = CardRechargeEnterAmountArgsModel.Companion;
                return Source.INSTANCE.serializer();
            case 10:
                CardRechargeEnterAmountArgsModel.Companion companion11 = CardRechargeEnterAmountArgsModel.Companion;
                return ChaloCardRechargeAmountFlowType.INSTANCE.serializer();
            case 11:
                CardRechargeFareInfo.Companion companion12 = CardRechargeFareInfo.INSTANCE;
                return new ArrayListSerializer(LongSerializer.f18151a);
            case 12:
                CardRechargeFareInfoApiResponseModel.Companion companion13 = CardRechargeFareInfoApiResponseModel.Companion;
                return new ArrayListSerializer(LongSerializer.f18151a);
            case 13:
                return CardRechargePaymentStatus._init_$_anonymous_();
            case 14:
                return CardRechargeStatus._init_$_anonymous_();
            case 15:
                CardRechargeSummaryData.Companion companion14 = CardRechargeSummaryData.INSTANCE;
                return CardRechargePaymentStatus.INSTANCE.serializer();
            case 16:
                CardRechargeSummaryData.Companion companion15 = CardRechargeSummaryData.INSTANCE;
                return CardRechargeStatus.INSTANCE.serializer();
            case 17:
                CardRechargeTransactionApiResponse.Companion companion16 = CardRechargeTransactionApiResponse.Companion;
                return EnumsKt.b("app.chalo.ncmc.data.cardtransactions.CardRechargePaymentMode", CardRechargePaymentMode.values());
            case 18:
                CardRechargeTransactionAppModel.Companion companion17 = CardRechargeTransactionAppModel.INSTANCE;
                return EnumsKt.b("app.chalo.ncmc.data.cardtransactions.CardRechargePaymentMode", CardRechargePaymentMode.values());
            case 19:
                CardSectionAppModel.Companion companion18 = CardSectionAppModel.INSTANCE;
                return EnumsKt.b("app.chalo.providers.iconassetprovider.IconType", IconType.values());
            case 20:
                CardTicketTransactionApiResponse.Companion companion19 = CardTicketTransactionApiResponse.Companion;
                return EnumsKt.b("app.chalo.ncmc.data.cardtransactions.CardTicketPaymentMode", CardTicketPaymentMode.values());
            case 21:
                CardTicketTransactionAppModel.Companion companion20 = CardTicketTransactionAppModel.INSTANCE;
                return EnumsKt.b("app.chalo.ncmc.data.cardtransactions.CardTicketPaymentMode", CardTicketPaymentMode.values());
            case 22:
                CardTransactionApiResponseModel.Companion companion21 = CardTransactionApiResponseModel.Companion;
                return new ArrayListSerializer(ChaloCardTransactionTypeDeserializer.c);
            case 23:
                CardTransactionApiResponseModel.Companion companion22 = CardTransactionApiResponseModel.Companion;
                return new ArrayListSerializer(ChaloCardUnsyncedRechargesApiModel$$serializer.f6084a);
            case 24:
                CardTransactionDetailArgsModel.Companion companion23 = CardTransactionDetailArgsModel.Companion;
                return CardTransaction.INSTANCE.serializer();
            case 25:
                CardTransactionDetailArgsModel.Companion companion24 = CardTransactionDetailArgsModel.Companion;
                return EnumsKt.b("app.chalo.ncmc.ui.transactionhistory.CardTransactionTypeUiModel", CardTransactionTypeUiModel.values());
            case 26:
                CardTransactionFareInfoApiResponse.Companion companion25 = CardTransactionFareInfoApiResponse.INSTANCE;
                return new ArrayListSerializer(CardTransactionFareBreakupApiResponse$$serializer.f6185a);
            case 27:
                CardTransactionFareInfoAppModel.Companion companion26 = CardTransactionFareInfoAppModel.INSTANCE;
                return new ArrayListSerializer(CardTransactionFareBreakupAppModel$$serializer.f6187a);
            case 28:
                CardTransactionHistoryArgsModel.Companion companion27 = CardTransactionHistoryArgsModel.Companion;
                return Source.INSTANCE.serializer();
            default:
                CardTransactionHistoryUiErrorWrapper.Companion companion28 = CardTransactionHistoryUiErrorWrapper.INSTANCE;
                return EnumsKt.b("app.chalo.ncmc.ui.transactionhistory.ChaloCardTransactionsUiErrorType", ChaloCardTransactionsUiErrorType.values());
        }
    }
}
