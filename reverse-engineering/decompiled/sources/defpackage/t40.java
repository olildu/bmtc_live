package defpackage;

import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;
import app.chalo.geoquery.data.models.api.GeoQueryApiResponseModel;
import app.chalo.geoquery.data.models.api.GeoQueryBusInfoApiResponseModel$$serializer;
import app.chalo.geoquery.data.models.app.GeoQueryCityConfigModel$$serializer;
import app.chalo.geoquery.data.models.app.GeoQueryConfigModel;
import app.chalo.homescreen.data.model.app.FooterSectionAppModel;
import app.chalo.livetracking.frameworklivetracking.data.model.api.request.GetEtaForRouteStopIdRequestApiModel;
import app.chalo.livetracking.frameworklivetracking.data.model.api.request.GetSeatAvailabilityRequestApiModel;
import app.chalo.livetracking.frameworklivetracking.data.model.api.request.GetSeatAvailabilityRequestVehicleDetailsModel$$serializer;
import app.chalo.livetracking.frameworklivetracking.data.model.api.response.GetSeatAvailabilityResponseApiModel;
import app.chalo.livetracking.frameworklivetracking.data.model.api.response.SeatAvailabilityApiModel$$serializer;
import app.chalo.multimodalticket.data.model.api.GroupTicketLegFareDetailApiModel$$serializer;
import app.chalo.network.model.ErrorDetails$$serializer;
import app.chalo.network.model.GenericChaloErrorResponse;
import app.chalo.network.rest.request.GenericRequestData;
import app.chalo.ondc.model.api.TicketValidationEntityApiModel$$serializer;
import app.chalo.premiumbus.data.models.api.response.SeatInfoApiModel$$serializer;
import app.chalo.productbooking.common.data.models.api.response.GenericMobileTicketFareBreakupApiResponseModel$$serializer;
import app.chalo.productbooking.common.data.models.api.response.GenericMobileTicketPassengerDetailsApiResponseModel;
import app.chalo.productbooking.common.data.models.api.response.GenericMobileTicketPassengerDetailsApiResponseModel$$serializer;
import app.chalo.productbooking.common.data.models.api.response.GenericMobileTicketProductApiResponseModel;
import app.chalo.productbooking.common.data.models.api.response.GenericMobileTicketProductApiResponseModel$$serializer;
import app.chalo.productbooking.common.data.models.api.response.GenericMobileTicketProductDataApiResponseModel;
import app.chalo.productbooking.common.data.models.api.response.GenericMobileTicketSequenceInfoApiResponseModel$$serializer;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.scenes.args.ForceAppUpdateArgs;
import app.chalo.scenes.args.UpdateType;
import app.chalo.userprofile.Gender;
import chalo_app_kmm.shared.chalo_base.generated.resources.Font0_commonMainKt;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.maps.android.compose.internal.DefaultGoogleMapsInitializer;
import com.google.maps.android.compose.internal.GoogleMapsInitializerKt;
import io.github.alexzhirkevich.compottie.internal.assets.FontList;
import io.github.alexzhirkevich.compottie.internal.assets.LottieFontAsset$$serializer;
import io.github.alexzhirkevich.compottie.internal.effects.LayerEffectsState;
import io.github.alexzhirkevich.compottie.internal.shapes.GradientFillShape;
import io.ktor.util.date.GMTDate;
import io.ktor.util.date.Month;
import io.ktor.util.date.WeekDay;
import kotlin.Lazy;
import kotlin.collections.EmptySet;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.HashMapSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.compose.resources.FontResource;
import org.jetbrains.compose.resources.ResourceItem;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class t40 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19626a;

    public /* synthetic */ t40(int i) {
        this.f19626a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f19626a) {
            case 0:
                Lazy lazy = Font0_commonMainKt.f11293a;
                return new FontResource("font:notosansregular", SetsKt.g(new ResourceItem(EmptySet.f17559a, "composeResources/chalo_app_kmm.shared.chalo_base.generated.resources/font/notosansregular.ttf", -1L, -1L)));
            case 1:
                Lazy lazy2 = Font0_commonMainKt.f11293a;
                return new FontResource("font:notosanssemibold", SetsKt.g(new ResourceItem(EmptySet.f17559a, "composeResources/chalo_app_kmm.shared.chalo_base.generated.resources/font/notosanssemibold.ttf", -1L, -1L)));
            case 2:
                FontList.Companion companion = FontList.INSTANCE;
                return new ArrayListSerializer(LottieFontAsset$$serializer.f16190a);
            case 3:
                FooterSectionAppModel.Companion companion2 = FooterSectionAppModel.INSTANCE;
                return EnumsKt.b("app.chalo.providers.iconassetprovider.IconType", IconType.values());
            case 4:
                ForceAppUpdateArgs.Companion companion3 = ForceAppUpdateArgs.INSTANCE;
                return EnumsKt.b("app.chalo.scenes.args.UpdateType", UpdateType.values());
            case 5:
                return FrameworkSQLiteDatabase.getThreadSessionMethod_delegate$lambda$7();
            case 6:
                return FrameworkSQLiteDatabase.beginTransactionMethod_delegate$lambda$8();
            case 7:
                GMTDate.Companion companion4 = GMTDate.INSTANCE;
                return EnumsKt.b("io.ktor.util.date.WeekDay", WeekDay.values());
            case 8:
                GMTDate.Companion companion5 = GMTDate.INSTANCE;
                return EnumsKt.b("io.ktor.util.date.Month", Month.values());
            case 9:
                return Gender._init_$_anonymous_();
            case 10:
                GenericChaloErrorResponse.Companion companion6 = GenericChaloErrorResponse.INSTANCE;
                return new ArrayListSerializer(ErrorDetails$$serializer.f6496a);
            case 11:
                GenericMobileTicketPassengerDetailsApiResponseModel.Companion companion7 = GenericMobileTicketPassengerDetailsApiResponseModel.INSTANCE;
                return new ArrayListSerializer(GenericMobileTicketFareBreakupApiResponseModel$$serializer.f8121a);
            case 12:
                GenericMobileTicketProductApiResponseModel.Companion companion8 = GenericMobileTicketProductApiResponseModel.INSTANCE;
                return new ArrayListSerializer(GenericMobileTicketPassengerDetailsApiResponseModel$$serializer.f8123a);
            case 13:
                GenericMobileTicketProductApiResponseModel.Companion companion9 = GenericMobileTicketProductApiResponseModel.INSTANCE;
                return new ArrayListSerializer(SeatInfoApiModel$$serializer.f7063a);
            case 14:
                GenericMobileTicketProductApiResponseModel.Companion companion10 = GenericMobileTicketProductApiResponseModel.INSTANCE;
                return new ArrayListSerializer(TicketValidationEntityApiModel$$serializer.f6733a);
            case 15:
                GenericMobileTicketProductApiResponseModel.Companion companion11 = GenericMobileTicketProductApiResponseModel.INSTANCE;
                return new ArrayListSerializer(GenericMobileTicketFareBreakupApiResponseModel$$serializer.f8121a);
            case 16:
                GenericMobileTicketProductApiResponseModel.Companion companion12 = GenericMobileTicketProductApiResponseModel.INSTANCE;
                return new ArrayListSerializer(GenericMobileTicketSequenceInfoApiResponseModel$$serializer.f8129a);
            case 17:
                GenericMobileTicketProductApiResponseModel.Companion companion13 = GenericMobileTicketProductApiResponseModel.INSTANCE;
                return new ArrayListSerializer(GroupTicketLegFareDetailApiModel$$serializer.f5829a);
            case 18:
                GenericMobileTicketProductDataApiResponseModel.Companion companion14 = GenericMobileTicketProductDataApiResponseModel.INSTANCE;
                return new ArrayListSerializer(GenericMobileTicketProductApiResponseModel$$serializer.f8125a);
            case 19:
                GenericRequestData.Companion companion15 = GenericRequestData.INSTANCE;
                StringSerializer stringSerializer = StringSerializer.f18170a;
                return new HashMapSerializer(stringSerializer, stringSerializer);
            case 20:
                GenericRequestData.Companion companion16 = GenericRequestData.INSTANCE;
                StringSerializer stringSerializer2 = StringSerializer.f18170a;
                return new LinkedHashMapSerializer(stringSerializer2, stringSerializer2);
            case 21:
                GenericRequestData.Companion companion17 = GenericRequestData.INSTANCE;
                StringSerializer stringSerializer3 = StringSerializer.f18170a;
                return new HashMapSerializer(stringSerializer3, stringSerializer3);
            case 22:
                GeoQueryApiResponseModel.Companion companion18 = GeoQueryApiResponseModel.INSTANCE;
                return new ArrayListSerializer(BuiltinSerializersKt.c(GeoQueryBusInfoApiResponseModel$$serializer.f2808a));
            case 23:
                GeoQueryConfigModel.Companion companion19 = GeoQueryConfigModel.INSTANCE;
                return new ArrayListSerializer(GeoQueryCityConfigModel$$serializer.f2817a);
            case 24:
                GetEtaForRouteStopIdRequestApiModel.Companion companion20 = GetEtaForRouteStopIdRequestApiModel.INSTANCE;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 25:
                GetSeatAvailabilityRequestApiModel.Companion companion21 = GetSeatAvailabilityRequestApiModel.INSTANCE;
                return new ArrayListSerializer(GetSeatAvailabilityRequestVehicleDetailsModel$$serializer.f4273a);
            case 26:
                GetSeatAvailabilityResponseApiModel.Companion companion22 = GetSeatAvailabilityResponseApiModel.INSTANCE;
                return new ArrayListSerializer(SeatAvailabilityApiModel$$serializer.f4291a);
            case 27:
                return new GoogleMapOptions();
            case 28:
                ProvidableCompositionLocal providableCompositionLocal = GoogleMapsInitializerKt.f14659a;
                return new DefaultGoogleMapsInitializer();
            default:
                GradientFillShape.Companion companion23 = GradientFillShape.Companion;
                return new LayerEffectsState();
        }
    }
}
