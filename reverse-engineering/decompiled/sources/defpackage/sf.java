package defpackage;

import app.chalo.android.ChaloApplication;
import app.chalo.constants.Source;
import app.chalo.data.ChaloTextDataAppModel$$serializer;
import app.chalo.data.TextFormatAppModel;
import app.chalo.home.data.model.api.ChaloBusHeaderApiModel;
import app.chalo.home.data.model.api.ChaloTextDataApiModel$$serializer;
import app.chalo.homescreen.data.model.app.ChaloBusAppModel;
import app.chalo.homescreen.data.model.app.ChaloBusHeaderAppModel;
import app.chalo.homescreen.data.model.app.ChaloBusPageSectionType;
import app.chalo.homescreen.data.model.app.ChaloBusWidgetSectionAppModel;
import app.chalo.homescreen.data.model.app.ChaloBusWidgetSectionAppModel$CustomerSupportSection$$serializer;
import app.chalo.homescreen.data.model.app.ChaloBusWidgetSectionAppModel$PlotlineSection$$serializer;
import app.chalo.homescreen.data.model.app.ChaloBusWidgetSectionAppModel$PremiumBusProductPurchaseSection$$serializer;
import app.chalo.homescreen.data.model.app.ChaloBusWidgetSectionAppModel$TicketsPassesSection$$serializer;
import app.chalo.homescreen.data.model.app.ChaloBusWidgetSectionAppModel$Unknown$$serializer;
import app.chalo.ncmc.data.apiresponsemodel.CardsTypeInfoApiResponse;
import app.chalo.ncmc.data.apiresponsemodel.ClosedCardInfoApiResponse$$serializer;
import app.chalo.ncmc.data.apiresponsemodel.OpenCardInfoApiResponse$$serializer;
import app.chalo.ncmc.data.apiresponsemodel.SemiClosedCardInfoApiResponse$$serializer;
import app.chalo.ncmc.data.apiresponsemodel.UnknownCardInfoApiResponse$$serializer;
import app.chalo.ncmc.data.appmodel.CardsTypeInfoAppModel;
import app.chalo.ncmc.data.appmodel.CardsTypeInfoAppModel$Closed$$serializer;
import app.chalo.ncmc.data.appmodel.CardsTypeInfoAppModel$Open$$serializer;
import app.chalo.ncmc.data.appmodel.CardsTypeInfoAppModel$Semiclosed$$serializer;
import app.chalo.ncmc.data.appmodel.CardsTypeInfoAppModel$Unknown$$serializer;
import app.chalo.ncmc.data.appmodel.ClosedCardInfo$$serializer;
import app.chalo.ncmc.data.appmodel.OpenCardInfo$$serializer;
import app.chalo.ncmc.data.appmodel.SemiClosedCardInfo$$serializer;
import app.chalo.ncmc.data.appmodel.UnknownCardInfo$$serializer;
import app.chalo.ncmc.data.cardtransactions.CardPassPurchaseTransactionApiResponse$$serializer;
import app.chalo.ncmc.data.cardtransactions.CardRechargeTransactionApiResponse$$serializer;
import app.chalo.ncmc.data.cardtransactions.CardTicketTransactionApiResponse$$serializer;
import app.chalo.ncmc.data.cardtransactions.CardTransactionTypeApiResponse;
import app.chalo.ncmc.data.cardtransactions.CardUnknownTransactionApiResponse$$serializer;
import app.chalo.ncmc.data.cardtransactions.MerchantTransactionApiResponse$$serializer;
import app.chalo.network.rest.generic.ChaloAuthConfig;
import app.chalo.network.rest.generic.ChaloAuthPluginKt;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.reportproblem.FreshChatRestoreIdReceiver;
import app.chalo.scenes.args.ChaloBusRouteInfoScreenArgs;
import app.chalo.scenes.args.ChaloBusUserProfileSurveyArgs;
import io.ktor.client.plugins.api.ClientPlugin;
import java.lang.annotation.Annotation;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.coroutines.sync.MutexKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class sf implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19298a;

    public /* synthetic */ sf(int i) {
        this.f19298a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f19298a) {
            case 0:
                CardTransactionTypeApiResponse.MerchantTransaction.Companion companion = CardTransactionTypeApiResponse.MerchantTransaction.Companion;
                return new ArrayListSerializer(MerchantTransactionApiResponse$$serializer.f6207a);
            case 1:
                CardTransactionTypeApiResponse.PassPurchase.Companion companion2 = CardTransactionTypeApiResponse.PassPurchase.Companion;
                return new ArrayListSerializer(CardPassPurchaseTransactionApiResponse$$serializer.f6169a);
            case 2:
                CardTransactionTypeApiResponse.Recharge.Companion companion3 = CardTransactionTypeApiResponse.Recharge.Companion;
                return new ArrayListSerializer(CardRechargeTransactionApiResponse$$serializer.f6173a);
            case 3:
                CardTransactionTypeApiResponse.Ticket.Companion companion4 = CardTransactionTypeApiResponse.Ticket.Companion;
                return new ArrayListSerializer(CardTicketTransactionApiResponse$$serializer.f6177a);
            case 4:
                CardTransactionTypeApiResponse.Unknown.Companion companion5 = CardTransactionTypeApiResponse.Unknown.Companion;
                return new ArrayListSerializer(CardUnknownTransactionApiResponse$$serializer.f6203a);
            case 5:
                CardsTypeInfoApiResponse.Closed.Companion companion6 = CardsTypeInfoApiResponse.Closed.Companion;
                return new ArrayListSerializer(ClosedCardInfoApiResponse$$serializer.f6094a);
            case 6:
                CardsTypeInfoApiResponse.Open.Companion companion7 = CardsTypeInfoApiResponse.Open.Companion;
                return new ArrayListSerializer(OpenCardInfoApiResponse$$serializer.f6104a);
            case 7:
                CardsTypeInfoApiResponse.SemiClosed.Companion companion8 = CardsTypeInfoApiResponse.SemiClosed.Companion;
                return new ArrayListSerializer(SemiClosedCardInfoApiResponse$$serializer.f6110a);
            case 8:
                CardsTypeInfoApiResponse.Unknown.Companion companion9 = CardsTypeInfoApiResponse.Unknown.Companion;
                return new ArrayListSerializer(UnknownCardInfoApiResponse$$serializer.f6114a);
            case 9:
                CardsTypeInfoAppModel.Companion companion10 = CardsTypeInfoAppModel.INSTANCE;
                SealedClassSerializer sealedClassSerializer = new SealedClassSerializer("app.chalo.ncmc.data.appmodel.CardsTypeInfoAppModel", Reflection.a(CardsTypeInfoAppModel.class), new KClass[]{Reflection.a(CardsTypeInfoAppModel.Closed.class), Reflection.a(CardsTypeInfoAppModel.Open.class), Reflection.a(CardsTypeInfoAppModel.Semiclosed.class), Reflection.a(CardsTypeInfoAppModel.Unknown.class)}, new KSerializer[]{CardsTypeInfoAppModel$Closed$$serializer.f6119a, CardsTypeInfoAppModel$Open$$serializer.f6120a, CardsTypeInfoAppModel$Semiclosed$$serializer.f6121a, CardsTypeInfoAppModel$Unknown$$serializer.f6122a});
                sealedClassSerializer.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer;
            case 10:
                CardsTypeInfoAppModel.Closed.Companion companion11 = CardsTypeInfoAppModel.Closed.INSTANCE;
                return new ArrayListSerializer(ClosedCardInfo$$serializer.f6145a);
            case 11:
                CardsTypeInfoAppModel.Open.Companion companion12 = CardsTypeInfoAppModel.Open.INSTANCE;
                return new ArrayListSerializer(OpenCardInfo$$serializer.f6154a);
            case 12:
                CardsTypeInfoAppModel.Semiclosed.Companion companion13 = CardsTypeInfoAppModel.Semiclosed.INSTANCE;
                return new ArrayListSerializer(SemiClosedCardInfo$$serializer.f6160a);
            case 13:
                CardsTypeInfoAppModel.Unknown.Companion companion14 = CardsTypeInfoAppModel.Unknown.INSTANCE;
                return new ArrayListSerializer(UnknownCardInfo$$serializer.f6164a);
            case 14:
                int i = ChaloApplication.e;
                return new FreshChatRestoreIdReceiver();
            case 15:
                return MutexKt.a();
            case 16:
                ClientPlugin clientPlugin = ChaloAuthPluginKt.f6510a;
                return new ChaloAuthConfig();
            case 17:
                ChaloBusAppModel.Companion companion15 = ChaloBusAppModel.INSTANCE;
                return new ArrayListSerializer(ChaloBusWidgetSectionAppModel.INSTANCE.serializer());
            case 18:
                ChaloBusHeaderApiModel.Companion companion16 = ChaloBusHeaderApiModel.Companion;
                return new ArrayListSerializer(ChaloTextDataApiModel$$serializer.f2883a);
            case 19:
                ChaloBusHeaderAppModel.Companion companion17 = ChaloBusHeaderAppModel.Companion;
                return EnumsKt.b("app.chalo.providers.iconassetprovider.IconType", IconType.values());
            case 20:
                ChaloBusHeaderAppModel.Companion companion18 = ChaloBusHeaderAppModel.Companion;
                return TextFormatAppModel.INSTANCE.serializer();
            case 21:
                ChaloBusHeaderAppModel.Companion companion19 = ChaloBusHeaderAppModel.Companion;
                return new ArrayListSerializer(ChaloTextDataAppModel$$serializer.f2336a);
            case 22:
                ChaloBusRouteInfoScreenArgs.Companion companion20 = ChaloBusRouteInfoScreenArgs.Companion;
                return Source.INSTANCE.serializer();
            case 23:
                ChaloBusUserProfileSurveyArgs.Companion companion21 = ChaloBusUserProfileSurveyArgs.Companion;
                return Source.INSTANCE.serializer();
            case 24:
                ChaloBusWidgetSectionAppModel.Companion companion22 = ChaloBusWidgetSectionAppModel.INSTANCE;
                return EnumsKt.b("app.chalo.homescreen.data.model.app.ChaloBusPageSectionType", ChaloBusPageSectionType.values());
            case 25:
                ChaloBusWidgetSectionAppModel.Companion companion23 = ChaloBusWidgetSectionAppModel.INSTANCE;
                SealedClassSerializer sealedClassSerializer2 = new SealedClassSerializer("app.chalo.homescreen.data.model.app.ChaloBusWidgetSectionAppModel", Reflection.a(ChaloBusWidgetSectionAppModel.class), new KClass[]{Reflection.a(ChaloBusWidgetSectionAppModel.CustomerSupportSection.class), Reflection.a(ChaloBusWidgetSectionAppModel.PlotlineSection.class), Reflection.a(ChaloBusWidgetSectionAppModel.PremiumBusProductPurchaseSection.class), Reflection.a(ChaloBusWidgetSectionAppModel.TicketsPassesSection.class), Reflection.a(ChaloBusWidgetSectionAppModel.Unknown.class)}, new KSerializer[]{ChaloBusWidgetSectionAppModel$CustomerSupportSection$$serializer.f3726a, ChaloBusWidgetSectionAppModel$PlotlineSection$$serializer.f3727a, ChaloBusWidgetSectionAppModel$PremiumBusProductPurchaseSection$$serializer.f3728a, ChaloBusWidgetSectionAppModel$TicketsPassesSection$$serializer.f3729a, ChaloBusWidgetSectionAppModel$Unknown$$serializer.f3730a});
                sealedClassSerializer2.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer2;
            case 26:
                ChaloBusWidgetSectionAppModel.CustomerSupportSection.Companion companion24 = ChaloBusWidgetSectionAppModel.CustomerSupportSection.INSTANCE;
                return EnumsKt.b("app.chalo.homescreen.data.model.app.ChaloBusPageSectionType", ChaloBusPageSectionType.values());
            case 27:
                ChaloBusWidgetSectionAppModel.CustomerSupportSection.Companion companion25 = ChaloBusWidgetSectionAppModel.CustomerSupportSection.INSTANCE;
                return EnumsKt.b("app.chalo.homescreen.data.model.app.ChaloBusPageSectionType", ChaloBusPageSectionType.values());
            case 28:
                ChaloBusWidgetSectionAppModel.PlotlineSection.Companion companion26 = ChaloBusWidgetSectionAppModel.PlotlineSection.INSTANCE;
                return EnumsKt.b("app.chalo.homescreen.data.model.app.ChaloBusPageSectionType", ChaloBusPageSectionType.values());
            default:
                ChaloBusWidgetSectionAppModel.PlotlineSection.Companion companion27 = ChaloBusWidgetSectionAppModel.PlotlineSection.INSTANCE;
                return EnumsKt.b("app.chalo.homescreen.data.model.app.ChaloBusPageSectionType", ChaloBusPageSectionType.values());
        }
    }
}
