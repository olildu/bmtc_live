package defpackage;

import androidx.compose.material3.DefaultNavigationBarOverride;
import androidx.compose.material3.DefaultNavigationRailOverride;
import androidx.compose.runtime.ProvidableCompositionLocal;
import app.chalo.ads.NativeAdViewKt;
import app.chalo.behaviour.policy.OnBoardingStartScreen;
import app.chalo.citydata.data.model.api.response.NearbyRouteApiModel;
import app.chalo.citydata.data.model.api.response.NearbyRouteApiModel$$serializer;
import app.chalo.citydata.data.model.api.response.NearbyRoutesApiResponseModel;
import app.chalo.citydata.data.model.app.response.NearbyStopToLocationAppModel;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.constants.Source;
import app.chalo.homescreen.data.model.app.NavigationTabAppModel;
import app.chalo.homescreen.data.model.app.NavigationTabAppModel$ChaloBusTab$$serializer;
import app.chalo.homescreen.data.model.app.NavigationTabAppModel$HomeTab$$serializer;
import app.chalo.homescreen.data.model.app.NavigationTabAppModel$MyTicketsTab$$serializer;
import app.chalo.homescreen.data.model.app.NavigationTabAppModel$RegularBusTab$$serializer;
import app.chalo.homescreen.data.model.app.NearbyRoutesSectionAppModel;
import app.chalo.homescreen.data.model.app.NearbyStopsSectionAppModel;
import app.chalo.ncmc.data.NcmcCardRechargeConfigAppModel;
import app.chalo.ncmc.data.NcmcCardRechargeConfigResponseModel;
import app.chalo.ncmc.data.NcmcCardRechargeConfigResponseModel$$serializer;
import app.chalo.ncmc.data.NcmcCardRechargeConfigsListResponseModel;
import app.chalo.ncmc.data.NcmcCardRechargeModelItem$$serializer;
import app.chalo.ncmc.data.NcmcCardResponseApiModel;
import app.chalo.ncmc.ui.NcmcOnlineRechargeArgsModel;
import app.chalo.network.config.ChaloJson;
import app.chalo.network.logging.NetworkCallInfo;
import app.chalo.network.rest.request.MultipartRequestFormDataType;
import app.chalo.ondc.model.api.request.OndcBookingRequestApiModel;
import app.chalo.ondc.model.api.request.OndcFarePassengerDetailApiModel$$serializer;
import app.chalo.providers.ChaloCtaDisplayType;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.scenes.args.NearbyStopsMapArgs;
import app.chalo.scenes.args.NetworkInspectorArgs;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.divider.DividerOrientation;
import app.chalo.uistate.divider.DividerUIState;
import coil3.network.CacheStrategy;
import com.mmk.kmpnotifier.firebase.MyFirebaseMessagingService;
import com.mmk.kmpnotifier.notification.NotifierManagerImpl;
import io.github.alexzhirkevich.compottie.internal.effects.LayerEffect;
import io.github.alexzhirkevich.compottie.internal.helpers.BooleanIntSerializer;
import io.github.alexzhirkevich.compottie.internal.helpers.Mask$$serializer;
import io.github.alexzhirkevich.compottie.internal.layers.NullLayer;
import io.ktor.client.engine.okhttp.OkHttpEngine;
import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.ObjectSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonKt;
import okhttp3.OkHttpClient;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class jk0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17415a;

    public /* synthetic */ jk0(int i) {
        this.f17415a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f17415a;
        ChaloColorToken.SectionDividerColor sectionDividerColor = ChaloColorToken.SectionDividerColor.f9849a;
        DividerOrientation dividerOrientation = null;
        int i2 = 4;
        switch (i) {
            case 0:
                MultipartRequestFormDataType.Companion companion = MultipartRequestFormDataType.INSTANCE;
                SealedClassSerializer sealedClassSerializer = new SealedClassSerializer("app.chalo.network.rest.request.MultipartRequestFormDataType", Reflection.a(MultipartRequestFormDataType.class), new KClass[0], new KSerializer[0]);
                sealedClassSerializer.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer;
            case 1:
                int i3 = MyFirebaseMessagingService.c;
                return NotifierManagerImpl.f15315a;
            case 2:
                return new DividerUIState(ChaloThemeHelper.a().h, sectionDividerColor, dividerOrientation, i2);
            case 3:
                return new DividerUIState(ChaloThemeHelper.a().h, sectionDividerColor, dividerOrientation, i2);
            case 4:
                ProvidableCompositionLocal providableCompositionLocal = NativeAdViewKt.f801a;
                return null;
            case 5:
                return DefaultNavigationBarOverride.INSTANCE;
            case 6:
                return DefaultNavigationRailOverride.INSTANCE;
            case 7:
                NavigationTabAppModel.Companion companion2 = NavigationTabAppModel.INSTANCE;
                SealedClassSerializer sealedClassSerializer2 = new SealedClassSerializer("app.chalo.homescreen.data.model.app.NavigationTabAppModel", Reflection.a(NavigationTabAppModel.class), new KClass[]{Reflection.a(NavigationTabAppModel.ChaloBusTab.class), Reflection.a(NavigationTabAppModel.HomeTab.class), Reflection.a(NavigationTabAppModel.MyTicketsTab.class), Reflection.a(NavigationTabAppModel.RegularBusTab.class)}, new KSerializer[]{NavigationTabAppModel$ChaloBusTab$$serializer.f3762a, NavigationTabAppModel$HomeTab$$serializer.f3763a, NavigationTabAppModel$MyTicketsTab$$serializer.f3764a, NavigationTabAppModel$RegularBusTab$$serializer.f3765a});
                sealedClassSerializer2.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer2;
            case 8:
                NcmcCardRechargeConfigAppModel.Companion companion3 = NcmcCardRechargeConfigAppModel.INSTANCE;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 9:
                NcmcCardRechargeConfigResponseModel.Companion companion4 = NcmcCardRechargeConfigResponseModel.Companion;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 10:
                NcmcCardRechargeConfigsListResponseModel.Companion companion5 = NcmcCardRechargeConfigsListResponseModel.Companion;
                return new ArrayListSerializer(NcmcCardRechargeConfigResponseModel$$serializer.f6036a);
            case 11:
                NcmcCardResponseApiModel.Companion companion6 = NcmcCardResponseApiModel.Companion;
                return new ArrayListSerializer(NcmcCardRechargeModelItem$$serializer.f6041a);
            case 12:
                NcmcOnlineRechargeArgsModel.Companion companion7 = NcmcOnlineRechargeArgsModel.Companion;
                return Source.INSTANCE.serializer();
            case 13:
                NearbyRouteApiModel.Companion companion8 = NearbyRouteApiModel.Companion;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 14:
                NearbyRoutesApiResponseModel.Companion companion9 = NearbyRoutesApiResponseModel.Companion;
                return new ArrayListSerializer(NearbyRouteApiModel$$serializer.f1663a);
            case 15:
                NearbyRoutesSectionAppModel.Companion companion10 = NearbyRoutesSectionAppModel.Companion;
                return EnumsKt.b("app.chalo.providers.ChaloCtaDisplayType", ChaloCtaDisplayType.values());
            case 16:
                NearbyStopToLocationAppModel.Companion companion11 = NearbyStopToLocationAppModel.INSTANCE;
                return ChaloTransitMode.INSTANCE.serializer();
            case 17:
                NearbyStopsMapArgs.Companion companion12 = NearbyStopsMapArgs.Companion;
                return Source.INSTANCE.serializer();
            case 18:
                NearbyStopsMapArgs.Companion companion13 = NearbyStopsMapArgs.Companion;
                return ChaloTransitMode.INSTANCE.serializer();
            case 19:
                NearbyStopsSectionAppModel.Companion companion14 = NearbyStopsSectionAppModel.INSTANCE;
                return EnumsKt.b("app.chalo.providers.ChaloCtaDisplayType", ChaloCtaDisplayType.values());
            case 20:
                Lazy lazy = NetworkCallInfo.j;
                return JsonKt.a(ChaloJson.b, new im0(15));
            case 21:
                return CacheStrategy.f11568a;
            case 22:
                return new ObjectSerializer("app.chalo.scenes.args.NetworkInspectorArgs", NetworkInspectorArgs.INSTANCE, new Annotation[0]);
            case 23:
                NullLayer.Companion companion15 = NullLayer.Companion;
                return new BooleanIntSerializer();
            case 24:
                NullLayer.Companion companion16 = NullLayer.Companion;
                return new BooleanIntSerializer();
            case 25:
                NullLayer.Companion companion17 = NullLayer.Companion;
                return new ArrayListSerializer(Mask$$serializer.f16239a);
            case 26:
                NullLayer.Companion companion18 = NullLayer.Companion;
                return new ArrayListSerializer(LayerEffect.INSTANCE.serializer());
            case 27:
                Lazy lazy2 = OkHttpEngine.i;
                return new OkHttpClient.Builder().build();
            case 28:
                return OnBoardingStartScreen._init_$_anonymous_();
            default:
                OndcBookingRequestApiModel.Companion companion19 = OndcBookingRequestApiModel.INSTANCE;
                return new ArrayListSerializer(OndcFarePassengerDetailApiModel$$serializer.f6745a);
        }
    }
}
