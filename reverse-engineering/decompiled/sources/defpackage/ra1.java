package defpackage;

import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.text.SpanStyleKt;
import app.chalo.behaviour.policy.OnBoardingStartScreen;
import app.chalo.behaviour.policy.SplashPolicyOverride;
import app.chalo.citydata.data.model.api.request.StopDetailsApiRequestBody;
import app.chalo.citydata.data.model.api.request.StopImagesRequestBody;
import app.chalo.citydata.data.model.api.response.StopDetailsResponseApiModel;
import app.chalo.citydata.data.model.api.response.StopImagesResponseApiModel;
import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.citydata.data.model.app.response.NearbyStopToLocationAppModel$$serializer;
import app.chalo.citydata.data.model.app.response.StopDetailsAppModel;
import app.chalo.constants.Source;
import app.chalo.data.StopBasedRouteSelectionFlowType;
import app.chalo.data.StopBasedRouteSelectionFlowType$ONDC$$serializer;
import app.chalo.data.StopBasedRouteSelectionFlowType$PassPurchase$$serializer;
import app.chalo.livetracking.search.StopBasedSearchScreenData;
import app.chalo.livetracking.search.StopBasedSearchSelectedLocation;
import app.chalo.livetracking.search.StopBasedSearchSelectedLocation$AllNearbyStopSelected$$serializer;
import app.chalo.livetracking.search.StopBasedSearchSelectedLocation$NearestStopToPlaceSelected$$serializer;
import app.chalo.livetracking.search.StopBasedSearchSelectedLocation$PlaceSelected$$serializer;
import app.chalo.livetracking.search.StopBasedSearchSelectedLocation$StopSelected$$serializer;
import app.chalo.livetracking.stoptripplannerresult.StopTripPlannerLocationType;
import app.chalo.livetracking.stoptripplannerresult.StopTripPlannerLocationType$AllNearbyStopSelected$$serializer;
import app.chalo.livetracking.stoptripplannerresult.StopTripPlannerLocationType$NearestStopToPlaceSelected$$serializer;
import app.chalo.livetracking.stoptripplannerresult.StopTripPlannerLocationType$Stop$$serializer;
import app.chalo.livetracking.stoptripplannerresult.StopTripPlannerResultScreenData;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.scenes.args.SplashArgs;
import app.chalo.scenes.args.StopBasedMetroLandingArgs;
import app.chalo.scenes.args.StopTripDetailsArgs;
import app.chalo.sos.official.SosOfficialContactEligibilityApiModel;
import app.chalo.sos.official.SosOfficialContactEntryApiModel;
import app.chalo.sos.official.SosOfficialContactNumberApiModel$$serializer;
import app.chalo.stoptripdetails.data.model.app.StopTripAppModel;
import chalo_app_kmm.shared.chalo_base.generated.resources.String0_commonMainKt;
import com.arkivanov.decompose.extensions.compose.stack.animation.StackAnimationProviderKt;
import com.arkivanov.decompose.extensions.compose.stack.animation.StackAnimationProviderKt$LocalStackAnimationProvider$1$1;
import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.collections.ArraysKt;
import kotlin.collections.EmptySet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.ObjectSerializer;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.compose.resources.ResourceItem;
import org.jetbrains.compose.resources.StringResource;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ra1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19192a;

    public /* synthetic */ ra1(int i) {
        this.f19192a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f19192a) {
            case 0:
                SosOfficialContactEligibilityApiModel.Companion companion = SosOfficialContactEligibilityApiModel.INSTANCE;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 1:
                SosOfficialContactEntryApiModel.Companion companion2 = SosOfficialContactEntryApiModel.INSTANCE;
                return new ArrayListSerializer(SosOfficialContactNumberApiModel$$serializer.f9457a);
            case 2:
                return Source._init_$_anonymous_();
            case 3:
                return SpanStyleKt.DefaultColorForegroundStyle;
            case 4:
                return new ObjectSerializer("app.chalo.scenes.args.SplashArgs", SplashArgs.INSTANCE, new Annotation[0]);
            case 5:
                SplashPolicyOverride.Companion companion3 = SplashPolicyOverride.INSTANCE;
                return OnBoardingStartScreen.INSTANCE.serializer();
            case 6:
                ProvidableCompositionLocal providableCompositionLocal = StackAnimationProviderKt.f12315a;
                return new StackAnimationProviderKt$LocalStackAnimationProvider$1$1();
            case 7:
                StopAppModel.Companion companion4 = StopAppModel.INSTANCE;
                return ChaloTransitMode.INSTANCE.serializer();
            case 8:
                StopBasedMetroLandingArgs.Companion companion5 = StopBasedMetroLandingArgs.Companion;
                return Source.INSTANCE.serializer();
            case 9:
                StopBasedRouteSelectionFlowType.Companion companion6 = StopBasedRouteSelectionFlowType.INSTANCE;
                SealedClassSerializer sealedClassSerializer = new SealedClassSerializer("app.chalo.data.StopBasedRouteSelectionFlowType", Reflection.a(StopBasedRouteSelectionFlowType.class), new KClass[]{Reflection.a(StopBasedRouteSelectionFlowType.InstantTicket.class), Reflection.a(StopBasedRouteSelectionFlowType.ONDC.class), Reflection.a(StopBasedRouteSelectionFlowType.PassPurchase.class)}, new KSerializer[]{new ObjectSerializer("app.chalo.data.StopBasedRouteSelectionFlowType.InstantTicket", StopBasedRouteSelectionFlowType.InstantTicket.INSTANCE, new Annotation[0]), StopBasedRouteSelectionFlowType$ONDC$$serializer.f2401a, StopBasedRouteSelectionFlowType$PassPurchase$$serializer.f2402a});
                sealedClassSerializer.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer;
            case 10:
                return new ObjectSerializer("app.chalo.data.StopBasedRouteSelectionFlowType.InstantTicket", StopBasedRouteSelectionFlowType.InstantTicket.INSTANCE, new Annotation[0]);
            case 11:
                StopBasedSearchScreenData.Companion companion7 = StopBasedSearchScreenData.INSTANCE;
                return Source.INSTANCE.serializer();
            case 12:
                StopBasedSearchScreenData.Companion companion8 = StopBasedSearchScreenData.INSTANCE;
                return StopBasedSearchSelectedLocation.INSTANCE.serializer();
            case 13:
                StopBasedSearchScreenData.Companion companion9 = StopBasedSearchScreenData.INSTANCE;
                return StopBasedSearchSelectedLocation.INSTANCE.serializer();
            case 14:
                StopBasedSearchSelectedLocation.Companion companion10 = StopBasedSearchSelectedLocation.INSTANCE;
                SealedClassSerializer sealedClassSerializer2 = new SealedClassSerializer("app.chalo.livetracking.search.StopBasedSearchSelectedLocation", Reflection.a(StopBasedSearchSelectedLocation.class), new KClass[]{Reflection.a(StopBasedSearchSelectedLocation.AllNearbyStopSelected.class), Reflection.a(StopBasedSearchSelectedLocation.NearestStopToPlaceSelected.class), Reflection.a(StopBasedSearchSelectedLocation.PlaceSelected.class), Reflection.a(StopBasedSearchSelectedLocation.StopSelected.class)}, new KSerializer[]{StopBasedSearchSelectedLocation$AllNearbyStopSelected$$serializer.f4481a, StopBasedSearchSelectedLocation$NearestStopToPlaceSelected$$serializer.f4482a, StopBasedSearchSelectedLocation$PlaceSelected$$serializer.f4483a, StopBasedSearchSelectedLocation$StopSelected$$serializer.f4484a});
                sealedClassSerializer2.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer2;
            case 15:
                StopDetailsApiRequestBody.Companion companion11 = StopDetailsApiRequestBody.INSTANCE;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 16:
                StopDetailsAppModel.Companion companion12 = StopDetailsAppModel.INSTANCE;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 17:
                StopDetailsResponseApiModel.Companion companion13 = StopDetailsResponseApiModel.Companion;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 18:
                StopImagesRequestBody.Companion companion14 = StopImagesRequestBody.INSTANCE;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 19:
                StopImagesResponseApiModel.Companion companion15 = StopImagesResponseApiModel.Companion;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 20:
                StopTripAppModel.Companion companion16 = StopTripAppModel.INSTANCE;
                return ChaloTransitMode.INSTANCE.serializer();
            case 21:
                StopTripDetailsArgs.Companion companion17 = StopTripDetailsArgs.Companion;
                return ChaloTransitMode.INSTANCE.serializer();
            case 22:
                StopTripDetailsArgs.Companion companion18 = StopTripDetailsArgs.Companion;
                return Source.INSTANCE.serializer();
            case 23:
                StopTripPlannerLocationType.Companion companion19 = StopTripPlannerLocationType.INSTANCE;
                SealedClassSerializer sealedClassSerializer3 = new SealedClassSerializer("app.chalo.livetracking.stoptripplannerresult.StopTripPlannerLocationType", Reflection.a(StopTripPlannerLocationType.class), new KClass[]{Reflection.a(StopTripPlannerLocationType.AllNearbyStopSelected.class), Reflection.a(StopTripPlannerLocationType.NearestStopToPlaceSelected.class), Reflection.a(StopTripPlannerLocationType.None.class), Reflection.a(StopTripPlannerLocationType.Stop.class)}, new KSerializer[]{StopTripPlannerLocationType$AllNearbyStopSelected$$serializer.f4532a, StopTripPlannerLocationType$NearestStopToPlaceSelected$$serializer.f4533a, new ObjectSerializer("app.chalo.livetracking.stoptripplannerresult.StopTripPlannerLocationType.None", StopTripPlannerLocationType.None.INSTANCE, new Annotation[0]), StopTripPlannerLocationType$Stop$$serializer.f4534a});
                sealedClassSerializer3.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer3;
            case 24:
                StopTripPlannerLocationType.NearestStopToPlaceSelected.Companion companion20 = StopTripPlannerLocationType.NearestStopToPlaceSelected.INSTANCE;
                return new ArrayListSerializer(NearbyStopToLocationAppModel$$serializer.f1741a);
            case 25:
                return new ObjectSerializer("app.chalo.livetracking.stoptripplannerresult.StopTripPlannerLocationType.None", StopTripPlannerLocationType.None.INSTANCE, new Annotation[0]);
            case 26:
                StopTripPlannerResultScreenData.Companion companion21 = StopTripPlannerResultScreenData.INSTANCE;
                return StopTripPlannerLocationType.INSTANCE.serializer();
            case 27:
                StopTripPlannerResultScreenData.Companion companion22 = StopTripPlannerResultScreenData.INSTANCE;
                return StopTripPlannerLocationType.INSTANCE.serializer();
            case 28:
                StopTripPlannerResultScreenData.Companion companion23 = StopTripPlannerResultScreenData.INSTANCE;
                return Source.INSTANCE.serializer();
            default:
                Lazy lazy = String0_commonMainKt.f11294a;
                return new StringResource("string:Routes", "Routes", ArraysKt.j0(new ResourceItem[]{new ResourceItem(i71.j("as"), "composeResources/chalo_app_kmm.shared.chalo_base.generated.resources/values-as/strings.commonMain.cvr", 279L, 38L), new ResourceItem(i71.j("bn"), "composeResources/chalo_app_kmm.shared.chalo_base.generated.resources/values-bn/strings.commonMain.cvr", 181L, 62L), new ResourceItem(i71.j("es"), "composeResources/chalo_app_kmm.shared.chalo_base.generated.resources/values-es/strings.commonMain.cvr", 254L, 22L), new ResourceItem(i71.j("hi"), "composeResources/chalo_app_kmm.shared.chalo_base.generated.resources/values-hi/strings.commonMain.cvr", 231L, 26L), new ResourceItem(i71.j("kn"), "composeResources/chalo_app_kmm.shared.chalo_base.generated.resources/values-kn/strings.commonMain.cvr", 311L, 46L), new ResourceItem(i71.j("ml"), "composeResources/chalo_app_kmm.shared.chalo_base.generated.resources/values-ml/strings.commonMain.cvr", 311L, 50L), new ResourceItem(i71.j("mr"), "composeResources/chalo_app_kmm.shared.chalo_base.generated.resources/values-mr/strings.commonMain.cvr", 227L, 38L), new ResourceItem(i71.j("ta"), "composeResources/chalo_app_kmm.shared.chalo_base.generated.resources/values-ta/strings.commonMain.cvr", 331L, 62L), new ResourceItem(i71.j("te"), "composeResources/chalo_app_kmm.shared.chalo_base.generated.resources/values-te/strings.commonMain.cvr", 291L, 42L), new ResourceItem(EmptySet.f17559a, "composeResources/chalo_app_kmm.shared.chalo_base.generated.resources/values/strings.commonMain.cvr", 187L, 22L)}));
        }
    }
}
