package defpackage;

import app.chalo.chalocard.ChaloCardEntryDestination;
import app.chalo.compose.components.chalomap.ChaloMapMarkerUIEventHandler;
import app.chalo.compose.components.chalomap.ChaloMapMarkerUIEventHandler$Companion$NO_OP$2$1;
import app.chalo.constants.Source;
import app.chalo.features.chaloconfig.data.model.ChaloConfigData$$serializer;
import app.chalo.features.chaloconfig.data.model.ChaloConfigResponse;
import app.chalo.homescreen.data.model.app.ChaloBusPageSectionType;
import app.chalo.homescreen.data.model.app.ChaloBusWidgetSectionAppModel;
import app.chalo.livetracking.frameworklivetracking.data.model.app.ChaloRtsServiceConfigAppModel;
import app.chalo.models.validation.ValidationProduct;
import app.chalo.ncmc.cardreceipt.ChaloCardReceiptData;
import app.chalo.ncmc.data.apiresponsemodel.ChaloCardRechargeFareInfoApiResponseModel;
import app.chalo.ncmc.data.apiresponsemodel.ChaloCardUnsyncedRechargesApiModel$$serializer;
import app.chalo.ncmc.data.apiresponsemodel.ChaloCardsInfoApiResponseModel;
import app.chalo.ncmc.data.appmodel.ChaloCardDetails;
import app.chalo.ncmc.data.appmodel.ChaloCardInfo;
import app.chalo.ncmc.data.appmodel.ChaloCardRechargeConfigAppModel;
import app.chalo.ncmc.data.appmodel.ChaloCardRechargeConfigAppModel$$serializer;
import app.chalo.ncmc.data.appmodel.ChaloCardRechargeConfigurationListAppModel;
import app.chalo.ncmc.data.appmodel.ChaloCardRechargeFareInfoAppModel;
import app.chalo.ncmc.data.appmodel.ChaloCardUnsyncedRechargeDetails$$serializer;
import app.chalo.ncmc.data.appmodel.ChaloCardsAppModel;
import app.chalo.ncmc.deserializer.ChaloCardsInfoDeserializer;
import app.chalo.ncmc.ui.enteramount.ChaloCardRechargeAmountFlowType;
import app.chalo.ncmc.ui.enteramount.ChaloCardRechargeAmountFlowType$WithChaloCardDetails$$serializer;
import app.chalo.ncmc.ui.enteramount.ChaloCardRechargeAmountFlowType$WithoutChaloCardDetails$$serializer;
import app.chalo.providers.RouteNamingSchemeType;
import app.chalo.ridefeedbacktracker.ChaloRideFeedback;
import app.chalo.scenes.args.ChaloCardLandingScreenArgs;
import app.chalo.uistate.components.map.ChaloMapUIEventHandler;
import app.chalo.uistate.components.map.ChaloMapUIEventHandler$Companion$NO_OP$2$1;
import app.chalo.usecase.ChaloFeedbackConfigData;
import app.chalo.usecase.FeedbackConfigDataForCity$$serializer;
import app.chalo.usecase.FeedbackTags$$serializer;
import java.lang.annotation.Annotation;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.ObjectSerializer;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ji implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17408a;

    public /* synthetic */ ji(int i) {
        this.f17408a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f17408a) {
            case 0:
                ChaloBusWidgetSectionAppModel.PremiumBusProductPurchaseSection.Companion companion = ChaloBusWidgetSectionAppModel.PremiumBusProductPurchaseSection.INSTANCE;
                return EnumsKt.b("app.chalo.homescreen.data.model.app.ChaloBusPageSectionType", ChaloBusPageSectionType.values());
            case 1:
                ChaloBusWidgetSectionAppModel.PremiumBusProductPurchaseSection.Companion companion2 = ChaloBusWidgetSectionAppModel.PremiumBusProductPurchaseSection.INSTANCE;
                return EnumsKt.b("app.chalo.homescreen.data.model.app.ChaloBusPageSectionType", ChaloBusPageSectionType.values());
            case 2:
                ChaloBusWidgetSectionAppModel.TicketsPassesSection.Companion companion3 = ChaloBusWidgetSectionAppModel.TicketsPassesSection.INSTANCE;
                return EnumsKt.b("app.chalo.homescreen.data.model.app.ChaloBusPageSectionType", ChaloBusPageSectionType.values());
            case 3:
                ChaloBusWidgetSectionAppModel.TicketsPassesSection.Companion companion4 = ChaloBusWidgetSectionAppModel.TicketsPassesSection.INSTANCE;
                return EnumsKt.b("app.chalo.homescreen.data.model.app.ChaloBusPageSectionType", ChaloBusPageSectionType.values());
            case 4:
                ChaloBusWidgetSectionAppModel.Unknown.Companion companion5 = ChaloBusWidgetSectionAppModel.Unknown.INSTANCE;
                return EnumsKt.b("app.chalo.homescreen.data.model.app.ChaloBusPageSectionType", ChaloBusPageSectionType.values());
            case 5:
                ChaloBusWidgetSectionAppModel.Unknown.Companion companion6 = ChaloBusWidgetSectionAppModel.Unknown.INSTANCE;
                return EnumsKt.b("app.chalo.homescreen.data.model.app.ChaloBusPageSectionType", ChaloBusPageSectionType.values());
            case 6:
                return ChaloCardEntryDestination._init_$_anonymous_();
            case 7:
                ChaloCardLandingScreenArgs.Companion companion7 = ChaloCardLandingScreenArgs.Companion;
                return Source.INSTANCE.serializer();
            case 8:
                ChaloCardReceiptData.Companion companion8 = ChaloCardReceiptData.Companion;
                return EnumsKt.b("app.chalo.providers.RouteNamingSchemeType", RouteNamingSchemeType.values());
            case 9:
                ChaloCardRechargeAmountFlowType.Companion companion9 = ChaloCardRechargeAmountFlowType.Companion;
                SealedClassSerializer sealedClassSerializer = new SealedClassSerializer("app.chalo.ncmc.ui.enteramount.ChaloCardRechargeAmountFlowType", Reflection.a(ChaloCardRechargeAmountFlowType.class), new KClass[]{Reflection.a(ChaloCardRechargeAmountFlowType.Unknown.class), Reflection.a(ChaloCardRechargeAmountFlowType.WithChaloCardDetails.class), Reflection.a(ChaloCardRechargeAmountFlowType.WithoutChaloCardDetails.class)}, new KSerializer[]{new ObjectSerializer("app.chalo.ncmc.ui.enteramount.ChaloCardRechargeAmountFlowType.Unknown", ChaloCardRechargeAmountFlowType.Unknown.INSTANCE, new Annotation[0]), ChaloCardRechargeAmountFlowType$WithChaloCardDetails$$serializer.f6320a, ChaloCardRechargeAmountFlowType$WithoutChaloCardDetails$$serializer.f6321a});
                sealedClassSerializer.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer;
            case 10:
                app.chalo.ncmc.ui.cardrechargeamount.ChaloCardRechargeAmountFlowType.Companion companion10 = app.chalo.ncmc.ui.cardrechargeamount.ChaloCardRechargeAmountFlowType.INSTANCE;
                SealedClassSerializer sealedClassSerializer2 = new SealedClassSerializer("app.chalo.ncmc.ui.cardrechargeamount.ChaloCardRechargeAmountFlowType", Reflection.a(app.chalo.ncmc.ui.cardrechargeamount.ChaloCardRechargeAmountFlowType.class), new KClass[]{Reflection.a(app.chalo.ncmc.ui.cardrechargeamount.ChaloCardRechargeAmountFlowType.Unknown.class), Reflection.a(app.chalo.ncmc.ui.cardrechargeamount.ChaloCardRechargeAmountFlowType.WithChaloCardDetails.class), Reflection.a(app.chalo.ncmc.ui.cardrechargeamount.ChaloCardRechargeAmountFlowType.WithoutChaloCardDetails.class)}, new KSerializer[]{new ObjectSerializer("app.chalo.ncmc.ui.cardrechargeamount.ChaloCardRechargeAmountFlowType.Unknown", app.chalo.ncmc.ui.cardrechargeamount.ChaloCardRechargeAmountFlowType.Unknown.INSTANCE, new Annotation[0]), app.chalo.ncmc.ui.cardrechargeamount.ChaloCardRechargeAmountFlowType$WithChaloCardDetails$$serializer.f6292a, app.chalo.ncmc.ui.cardrechargeamount.ChaloCardRechargeAmountFlowType$WithoutChaloCardDetails$$serializer.f6293a});
                sealedClassSerializer2.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer2;
            case 11:
                return new ObjectSerializer("app.chalo.ncmc.ui.enteramount.ChaloCardRechargeAmountFlowType.Unknown", ChaloCardRechargeAmountFlowType.Unknown.INSTANCE, new Annotation[0]);
            case 12:
                return new ObjectSerializer("app.chalo.ncmc.ui.cardrechargeamount.ChaloCardRechargeAmountFlowType.Unknown", app.chalo.ncmc.ui.cardrechargeamount.ChaloCardRechargeAmountFlowType.Unknown.INSTANCE, new Annotation[0]);
            case 13:
                ChaloCardRechargeAmountFlowType.WithChaloCardDetails.Companion companion11 = ChaloCardRechargeAmountFlowType.WithChaloCardDetails.Companion;
                return ChaloCardDetails.INSTANCE.serializer();
            case 14:
                app.chalo.ncmc.ui.cardrechargeamount.ChaloCardRechargeAmountFlowType.WithChaloCardDetails.Companion companion12 = app.chalo.ncmc.ui.cardrechargeamount.ChaloCardRechargeAmountFlowType.WithChaloCardDetails.INSTANCE;
                return ChaloCardDetails.INSTANCE.serializer();
            case 15:
                ChaloCardRechargeConfigAppModel.Companion companion13 = ChaloCardRechargeConfigAppModel.INSTANCE;
                return new ArrayListSerializer(BuiltinSerializersKt.c(StringSerializer.f18170a));
            case 16:
                ChaloCardRechargeConfigurationListAppModel.Companion companion14 = ChaloCardRechargeConfigurationListAppModel.INSTANCE;
                return new ArrayListSerializer(ChaloCardRechargeConfigAppModel$$serializer.f6127a);
            case 17:
                ChaloCardRechargeFareInfoApiResponseModel.Companion companion15 = ChaloCardRechargeFareInfoApiResponseModel.INSTANCE;
                return new ArrayListSerializer(BuiltinSerializersKt.c(LongSerializer.f18151a));
            case 18:
                ChaloCardRechargeFareInfoAppModel.Companion companion16 = ChaloCardRechargeFareInfoAppModel.INSTANCE;
                return new ArrayListSerializer(LongSerializer.f18151a);
            case 19:
                ChaloCardsAppModel.Companion companion17 = ChaloCardsAppModel.INSTANCE;
                return new ArrayListSerializer(ChaloCardInfo.INSTANCE.serializer());
            case 20:
                ChaloCardsAppModel.Companion companion18 = ChaloCardsAppModel.INSTANCE;
                return new ArrayListSerializer(ChaloCardUnsyncedRechargeDetails$$serializer.f6135a);
            case 21:
                ChaloCardsInfoApiResponseModel.Companion companion19 = ChaloCardsInfoApiResponseModel.Companion;
                return new ArrayListSerializer(ChaloCardsInfoDeserializer.c);
            case 22:
                ChaloCardsInfoApiResponseModel.Companion companion20 = ChaloCardsInfoApiResponseModel.Companion;
                return new ArrayListSerializer(ChaloCardUnsyncedRechargesApiModel$$serializer.f6084a);
            case 23:
                ChaloConfigResponse.Companion companion21 = ChaloConfigResponse.INSTANCE;
                return new LinkedHashMapSerializer(StringSerializer.f18170a, BuiltinSerializersKt.c(ChaloConfigData$$serializer.f2639a));
            case 24:
                ChaloFeedbackConfigData.Companion companion22 = ChaloFeedbackConfigData.INSTANCE;
                return new ArrayListSerializer(FeedbackConfigDataForCity$$serializer.f10168a);
            case 25:
                ChaloMapMarkerUIEventHandler.Companion companion23 = ChaloMapMarkerUIEventHandler.Companion.f1870a;
                return new ChaloMapMarkerUIEventHandler$Companion$NO_OP$2$1();
            case 26:
                ChaloMapUIEventHandler.Companion companion24 = ChaloMapUIEventHandler.Companion.f9961a;
                return new ChaloMapUIEventHandler$Companion$NO_OP$2$1();
            case 27:
                ChaloRideFeedback.Companion companion25 = ChaloRideFeedback.Companion;
                return new ArrayListSerializer(FeedbackTags$$serializer.f10173a);
            case 28:
                ChaloRideFeedback.Companion companion26 = ChaloRideFeedback.Companion;
                return ValidationProduct.INSTANCE.serializer();
            default:
                ChaloRtsServiceConfigAppModel.Companion companion27 = ChaloRtsServiceConfigAppModel.INSTANCE;
                SealedClassSerializer sealedClassSerializer3 = new SealedClassSerializer("app.chalo.livetracking.frameworklivetracking.data.model.app.ChaloRtsServiceConfigAppModel", Reflection.a(ChaloRtsServiceConfigAppModel.class), new KClass[0], new KSerializer[0]);
                sealedClassSerializer3.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer3;
        }
    }
}
