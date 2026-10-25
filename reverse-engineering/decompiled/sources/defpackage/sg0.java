package defpackage;

import androidx.compose.material3.MaterialThemeKt;
import androidx.compose.runtime.retain.ManagedRetainedValuesStoreKt;
import app.chalo.citydata.data.model.app.StopAppModel$$serializer;
import app.chalo.constants.Source;
import app.chalo.homescreen.data.model.app.MetroCardAppModel;
import app.chalo.homescreen.data.model.app.RegularBusPageFeature;
import app.chalo.instantticket.data.model.api.response.FareBreakupApiModel$$serializer;
import app.chalo.mTicketing.validation.MTicketReceiptData;
import app.chalo.metro.data.api.MetroFinalFareResponseApiModel;
import app.chalo.metro.data.api.MetroLineStopListApiModel;
import app.chalo.metro.data.api.MetroLiveBookingStatusRequestApiModel;
import app.chalo.metro.ui.landing.MetroLandingScreenRestoredState;
import app.chalo.metro.ui.landing.MetroLineListItemState$$serializer;
import app.chalo.metro.ui.landing.PickStopRequestType;
import app.chalo.metro.ui.regular.MetroFlowType;
import app.chalo.models.mticketing.MTicketPassengerInfo;
import app.chalo.mticket.ui.passengerselection.MTicketPassengerItem$$serializer;
import app.chalo.mticket.ui.passengerselection.MTicketPassengerSelectionContainer;
import app.chalo.mticket.ui.passengerselection.MTicketPassengerSelectionRestoredState;
import app.chalo.mticket.ui.tripinfo.MTicketTripInfoRestoredState;
import app.chalo.ondc.model.api.MetroJourneyOverviewApiModel;
import app.chalo.ondc.model.api.MetroJourneyStopApiModel$$serializer;
import app.chalo.ondc.model.app.MetroJourneyOverview;
import app.chalo.ondc.model.app.MetroJourneyStop$$serializer;
import app.chalo.productbooking.common.data.models.api.response.OriginDestinationStopApiModel$$serializer;
import app.chalo.productpurchase.productselection.data.models.api.MTicketPassengerFareBreakdownResponseApiModel;
import app.chalo.providers.cityprovider.impl.data.models.api.MetaDataCityAgencyResponseApiModel$$serializer;
import app.chalo.providers.cityprovider.impl.data.models.api.MetaDataCityLineMapResponseApiModel$$serializer;
import app.chalo.providers.cityprovider.impl.data.models.api.MetaDataCityModeResponseApiModel;
import app.chalo.providers.cityprovider.impl.data.models.api.MetaDataCityModeResponseApiModel$$serializer;
import app.chalo.providers.cityprovider.impl.data.models.api.MetaDataPropsCityResponseApiModel;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.scenes.args.MTicketSelectionArgs;
import app.chalo.scenes.args.MetroLandingArgs;
import java.lang.annotation.Annotation;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class sg0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19301a;

    public /* synthetic */ sg0(int i) {
        this.f19301a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f19301a) {
            case 0:
                MTicketPassengerFareBreakdownResponseApiModel.Companion companion = MTicketPassengerFareBreakdownResponseApiModel.INSTANCE;
                return new LinkedHashMapSerializer(BuiltinSerializersKt.c(StringSerializer.f18170a), BuiltinSerializersKt.c(DoubleSerializer.f18137a));
            case 1:
                MTicketPassengerInfo.Companion companion2 = MTicketPassengerInfo.INSTANCE;
                return new LinkedHashMapSerializer(StringSerializer.f18170a, DoubleSerializer.f18137a);
            case 2:
                MTicketPassengerInfo.Companion companion3 = MTicketPassengerInfo.INSTANCE;
                return new LinkedHashMapSerializer(StringSerializer.f18170a, DoubleSerializer.f18137a);
            case 3:
                MTicketPassengerSelectionContainer.Companion companion4 = MTicketPassengerSelectionContainer.Companion;
                return new ArrayListSerializer(MTicketPassengerItem$$serializer.f5735a);
            case 4:
                MTicketPassengerSelectionRestoredState.Companion companion5 = MTicketPassengerSelectionRestoredState.Companion;
                return Source.INSTANCE.serializer();
            case 5:
                MTicketReceiptData.Companion companion6 = MTicketReceiptData.INSTANCE;
                return new LinkedHashMapSerializer(StringSerializer.f18170a, IntSerializer.f18146a);
            case 6:
                MTicketSelectionArgs.Companion companion7 = MTicketSelectionArgs.Companion;
                return Source.INSTANCE.serializer();
            case 7:
                MTicketTripInfoRestoredState.Companion companion8 = MTicketTripInfoRestoredState.Companion;
                return Source.INSTANCE.serializer();
            case 8:
                return ManagedRetainedValuesStoreKt.retainManagedRetainedValuesStore$lambda$0$0();
            case 9:
                return Boolean.valueOf(MaterialThemeKt.LocalUsingExpressiveTheme$lambda$3());
            case 10:
                return MaterialThemeKt._localMotionScheme$lambda$5();
            case 11:
                MetaDataCityModeResponseApiModel.Companion companion9 = MetaDataCityModeResponseApiModel.Companion;
                return new ArrayListSerializer(MetaDataCityAgencyResponseApiModel$$serializer.f8839a);
            case 12:
                MetaDataPropsCityResponseApiModel.Companion companion10 = MetaDataPropsCityResponseApiModel.Companion;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 13:
                MetaDataPropsCityResponseApiModel.Companion companion11 = MetaDataPropsCityResponseApiModel.Companion;
                return new ArrayListSerializer(MetaDataCityLineMapResponseApiModel$$serializer.f8845a);
            case 14:
                MetaDataPropsCityResponseApiModel.Companion companion12 = MetaDataPropsCityResponseApiModel.Companion;
                return new ArrayListSerializer(IntSerializer.f18146a);
            case 15:
                MetaDataPropsCityResponseApiModel.Companion companion13 = MetaDataPropsCityResponseApiModel.Companion;
                return new ArrayListSerializer(MetaDataCityModeResponseApiModel$$serializer.f8847a);
            case 16:
                MetaDataPropsCityResponseApiModel.Companion companion14 = MetaDataPropsCityResponseApiModel.Companion;
                return new ArrayListSerializer(new ArrayListSerializer(DoubleSerializer.f18137a));
            case 17:
                MetroCardAppModel.Companion companion15 = MetroCardAppModel.Companion;
                return EnumsKt.b("app.chalo.providers.iconassetprovider.IconType", IconType.values());
            case 18:
                MetroCardAppModel.Companion companion16 = MetroCardAppModel.Companion;
                return EnumsKt.b("app.chalo.homescreen.data.model.app.RegularBusPageFeature", RegularBusPageFeature.values());
            case 19:
                MetroFinalFareResponseApiModel.Companion companion17 = MetroFinalFareResponseApiModel.INSTANCE;
                return new ArrayListSerializer(FareBreakupApiModel$$serializer.f3862a);
            case 20:
                MetroFinalFareResponseApiModel.Companion companion18 = MetroFinalFareResponseApiModel.INSTANCE;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 21:
                MetroFlowType.Companion companion19 = MetroFlowType.Companion;
                SealedClassSerializer sealedClassSerializer = new SealedClassSerializer("app.chalo.metro.ui.regular.MetroFlowType", Reflection.a(MetroFlowType.class), new KClass[0], new KSerializer[0]);
                sealedClassSerializer.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer;
            case 22:
                MetroJourneyOverview.Companion companion20 = MetroJourneyOverview.INSTANCE;
                return new ArrayListSerializer(MetroJourneyStop$$serializer.f6765a);
            case 23:
                MetroJourneyOverviewApiModel.Companion companion21 = MetroJourneyOverviewApiModel.Companion;
                return new ArrayListSerializer(MetroJourneyStopApiModel$$serializer.f6725a);
            case 24:
                MetroLandingArgs.Companion companion22 = MetroLandingArgs.Companion;
                return Source.INSTANCE.serializer();
            case 25:
                MetroLandingScreenRestoredState.Companion companion23 = MetroLandingScreenRestoredState.INSTANCE;
                return EnumsKt.b("app.chalo.metro.ui.landing.PickStopRequestType", PickStopRequestType.values());
            case 26:
                MetroLandingScreenRestoredState.Companion companion24 = MetroLandingScreenRestoredState.INSTANCE;
                return new LinkedHashMapSerializer(StringSerializer.f18170a, new ArrayListSerializer(StopAppModel$$serializer.f1728a));
            case 27:
                MetroLandingScreenRestoredState.Companion companion25 = MetroLandingScreenRestoredState.INSTANCE;
                return new ArrayListSerializer(MetroLineListItemState$$serializer.f5510a);
            case 28:
                MetroLineStopListApiModel.Companion companion26 = MetroLineStopListApiModel.Companion;
                return new ArrayListSerializer(OriginDestinationStopApiModel$$serializer.f8142a);
            default:
                MetroLiveBookingStatusRequestApiModel.Companion companion27 = MetroLiveBookingStatusRequestApiModel.INSTANCE;
                return new ArrayListSerializer(StringSerializer.f18170a);
        }
    }
}
