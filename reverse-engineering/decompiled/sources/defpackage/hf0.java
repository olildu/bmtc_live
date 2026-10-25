package defpackage;

import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.retain.ForgetfulRetainedValuesStore;
import androidx.compose.ui.text.font.Font;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.savedstate.compose.LocalSavedStateRegistryOwnerKt;
import app.chalo.citydata.data.model.app.LiveSeatAvailabilityApplicable;
import app.chalo.compose.LocalBackHandlerKt;
import app.chalo.compose.LocalComponentContextKt;
import app.chalo.compose.resources.LottieAssetHelperKt;
import app.chalo.constants.Source;
import app.chalo.login.data.models.request.LoginApiRequestModel;
import app.chalo.login.data.models.request.LoginApiRequestModel$PhoneAuthLoginApiRequestModel$$serializer;
import app.chalo.login.data.models.request.LoginApiRequestModel$TruecallerLoginApiRequestModel$$serializer;
import app.chalo.login.data.models.request.LoginApiRequestModel$TruecallerLoginApiRequestModel$$serializer$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0;
import app.chalo.models.CardDetails$$serializer;
import app.chalo.models.RecentPaymentMethod$$serializer;
import app.chalo.models.mticketing.MTicket;
import app.chalo.models.mticketing.MTicketPassengerInfo$$serializer;
import app.chalo.productpurchase.productselection.data.models.api.MTicketFareDataResponseApiModel;
import app.chalo.productpurchase.productselection.data.models.api.MTicketOrderCreationBookingDataRequestApiModel;
import app.chalo.productpurchase.productselection.data.models.api.MTicketPassengerFareBreakdownResponseApiModel;
import app.chalo.productpurchase.productselection.data.models.api.MTicketPassengerFareResponseApiModel$$serializer;
import app.chalo.scenes.args.LocationDisclaimerArgs;
import app.chalo.scenes.args.LoginOptionsArgs;
import app.chalo.scenes.args.LoginOtpSceneArgs;
import app.chalo.stoptripdetails.data.model.api.LocationSummaryAndRouteStatusApiResponseModel;
import app.chalo.stoptripdetails.data.model.api.LocationSummaryApiResponseModel;
import app.chalo.stoptripdetails.data.model.api.LocationSummaryPayloadApiResponseModel;
import app.chalo.stoptripdetails.data.model.api.LocationSummaryPayloadApiResponseModel$$serializer;
import app.chalo.stoptripdetails.data.model.api.RouteStatusApiModel$$serializer;
import app.chalo.stoptripdetails.data.model.api.StopTripDetailsResponseApiModel$$serializer;
import app.chalo.usecase.LiveTrackingRemoteConfigModel;
import app.chalo.usecase.LiveTrackingRemoteConfigModel$$serializer;
import app.chalo.usecase.LiveTrackingRemoteConfigModelApiModel;
import coil3.compose.AsyncImageModelEqualityDelegate;
import coil3.compose.LocalAsyncImageModelEqualityDelegateKt;
import io.github.alexzhirkevich.compottie.LottieCompositionCache;
import io.github.alexzhirkevich.compottie.LottieCompositionCacheKt;
import io.github.alexzhirkevich.compottie.internal.LottieJsonKt;
import io.github.alexzhirkevich.compottie.internal.assets.LottieFontAsset;
import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ClassReference;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.datetime.format.DateTimeFormatBuilderKt;
import kotlinx.datetime.format.LocalDateFormat;
import kotlinx.datetime.format.LocalDateFormatKt;
import kotlinx.datetime.format.LocalDateTimeFormat;
import kotlinx.datetime.format.LocalDateTimeFormatKt;
import kotlinx.datetime.format.LocalTimeFormatKt;
import kotlinx.datetime.format.Padding;
import kotlinx.datetime.internal.format.AppendableFormatStructure;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.ObjectSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class hf0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15821a;

    public /* synthetic */ hf0(int i) {
        this.f15821a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f15821a) {
            case 0:
                return new ObjectSerializer("app.chalo.citydata.data.model.app.LiveSeatAvailabilityApplicable.No", LiveSeatAvailabilityApplicable.No.INSTANCE, new Annotation[0]);
            case 1:
                LiveTrackingRemoteConfigModel.Companion companion = LiveTrackingRemoteConfigModel.INSTANCE;
                return new ArrayListSerializer(IntSerializer.f18146a);
            case 2:
                LiveTrackingRemoteConfigModelApiModel.Companion companion2 = LiveTrackingRemoteConfigModelApiModel.INSTANCE;
                return new ArrayListSerializer(LiveTrackingRemoteConfigModel$$serializer.f10210a);
            case 3:
                ProvidableCompositionLocal providableCompositionLocal = LocalAsyncImageModelEqualityDelegateKt.f11489a;
                return AsyncImageModelEqualityDelegate.f11475a;
            case 4:
                ProvidableCompositionLocal providableCompositionLocal2 = LocalBackHandlerKt.f1812a;
                return null;
            case 5:
                ProvidableCompositionLocal providableCompositionLocal3 = LocalComponentContextKt.f1813a;
                return null;
            case 6:
                Lazy lazy = LocalDateFormatKt.f17964a;
                LocalDateFormat.Builder builder = new LocalDateFormat.Builder(new AppendableFormatStructure());
                Lazy lazy2 = LocalDateFormatKt.f17964a;
                builder.t(Padding.ZERO);
                DateTimeFormatBuilderKt.b(builder, '-');
                builder.a(Padding.ZERO);
                DateTimeFormatBuilderKt.b(builder, '-');
                builder.f(Padding.ZERO);
                return new LocalDateFormat(d.c(builder));
            case 7:
                Lazy lazy3 = LocalDateFormatKt.f17964a;
                LocalDateFormat.Builder builder2 = new LocalDateFormat.Builder(new AppendableFormatStructure());
                Lazy lazy4 = LocalDateFormatKt.f17964a;
                builder2.t(Padding.ZERO);
                builder2.a(Padding.ZERO);
                builder2.f(Padding.ZERO);
                return new LocalDateFormat(d.c(builder2));
            case 8:
                Lazy lazy5 = LocalDateTimeFormatKt.f17967a;
                LocalDateTimeFormat.Builder builder3 = new LocalDateTimeFormat.Builder(new AppendableFormatStructure());
                Lazy lazy6 = LocalDateTimeFormatKt.f17967a;
                builder3.n(LocalDateFormatKt.a());
                DateTimeFormatBuilderKt.a(builder3, new Function1[]{new qd0(25)}, new qd0(26));
                builder3.i(LocalTimeFormatKt.a());
                return new LocalDateTimeFormat(d.c(builder3));
            case 9:
                return LocalLifecycleOwnerKt.LocalLifecycleOwner$lambda$3$lambda$2();
            case 10:
                return ForgetfulRetainedValuesStore.INSTANCE;
            case 11:
                return LocalSavedStateRegistryOwnerKt.LocalSavedStateRegistryOwner$lambda$3$lambda$2();
            case 12:
                return LocalViewModelStoreOwner.LocalViewModelStoreOwner$lambda$0();
            case 13:
                LocationDisclaimerArgs.Companion companion3 = LocationDisclaimerArgs.INSTANCE;
                return Source.INSTANCE.serializer();
            case 14:
                LocationSummaryAndRouteStatusApiResponseModel.Companion companion4 = LocationSummaryAndRouteStatusApiResponseModel.INSTANCE;
                return new ArrayListSerializer(RouteStatusApiModel$$serializer.f9481a);
            case 15:
                LocationSummaryApiResponseModel.Companion companion5 = LocationSummaryApiResponseModel.INSTANCE;
                return new ArrayListSerializer(LocationSummaryPayloadApiResponseModel$$serializer.f9478a);
            case 16:
                LocationSummaryPayloadApiResponseModel.Companion companion6 = LocationSummaryPayloadApiResponseModel.Companion;
                return new ArrayListSerializer(StopTripDetailsResponseApiModel$$serializer.f9483a);
            case 17:
                LoginApiRequestModel.Companion companion7 = LoginApiRequestModel.INSTANCE;
                ClassReference classReferenceA = Reflection.a(LoginApiRequestModel.class);
                KClass[] kClassArr = {Reflection.a(LoginApiRequestModel.PhoneAuthLoginApiRequestModel.class), Reflection.a(LoginApiRequestModel.TruecallerLoginApiRequestModel.class)};
                KSerializer[] kSerializerArr = {LoginApiRequestModel$PhoneAuthLoginApiRequestModel$$serializer.f5203a, LoginApiRequestModel$TruecallerLoginApiRequestModel$$serializer.f5204a};
                Annotation[] annotationArr = {new LoginApiRequestModel$TruecallerLoginApiRequestModel$$serializer$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0()};
                SealedClassSerializer sealedClassSerializer = new SealedClassSerializer("app.chalo.login.data.models.request.LoginApiRequestModel", classReferenceA, kClassArr, kSerializerArr);
                sealedClassSerializer.b = ArraysKt.e(annotationArr);
                return sealedClassSerializer;
            case 18:
                LoginOptionsArgs.Companion companion8 = LoginOptionsArgs.INSTANCE;
                return Source.INSTANCE.serializer();
            case 19:
                LoginOtpSceneArgs.Companion companion9 = LoginOtpSceneArgs.INSTANCE;
                return Source.INSTANCE.serializer();
            case 20:
                ProvidableCompositionLocal providableCompositionLocal4 = LottieAssetHelperKt.f1907a;
                throw new IllegalStateException("No LottieAssetProvider provided`");
            case 21:
                ProvidableCompositionLocal providableCompositionLocal5 = LottieCompositionCacheKt.f16104a;
                return new LottieCompositionCache() { // from class: io.github.alexzhirkevich.compottie.LottieCompositionCacheKt$LottieCompositionCache$1

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final LruMap f16105a = new LruMap();

                    @Override // io.github.alexzhirkevich.compottie.LottieCompositionCache
                    public final Object a(String str, Continuation continuation, Function1 function1) {
                        if (str == null) {
                            return ((LottieCompositionKt$rememberLottieComposition$2$1$composition$1.AnonymousClass1) function1).invoke(continuation);
                        }
                        LruMap lruMap = this.f16105a;
                        return lruMap.c.a(str, new LruMap$getOrPutSuspend$2(lruMap, str, function1, null), (ContinuationImpl) continuation);
                    }
                };
            case 22:
                LottieFontAsset.Companion companion10 = LottieFontAsset.INSTANCE;
                return new PolymorphicSerializer(Reflection.a(Font.class), new Annotation[0]);
            case 23:
                Lazy lazy7 = LottieJsonKt.f16127a;
                return JsonKt.a(Json.d, new ag0(12));
            case 24:
                MTicket.Companion companion11 = MTicket.INSTANCE;
                return new LinkedHashMapSerializer(StringSerializer.f18170a, MTicketPassengerInfo$$serializer.f5622a);
            case 25:
                MTicket.Companion companion12 = MTicket.INSTANCE;
                return new ArrayListSerializer(RecentPaymentMethod$$serializer.f5597a);
            case 26:
                MTicket.Companion companion13 = MTicket.INSTANCE;
                return new ArrayListSerializer(CardDetails$$serializer.f5572a);
            case 27:
                MTicketFareDataResponseApiModel.Companion companion14 = MTicketFareDataResponseApiModel.INSTANCE;
                return new LinkedHashMapSerializer(BuiltinSerializersKt.c(StringSerializer.f18170a), BuiltinSerializersKt.c(MTicketPassengerFareResponseApiModel$$serializer.f8584a));
            case 28:
                MTicketOrderCreationBookingDataRequestApiModel.Companion companion15 = MTicketOrderCreationBookingDataRequestApiModel.INSTANCE;
                return new ArrayListSerializer(StringSerializer.f18170a);
            default:
                MTicketPassengerFareBreakdownResponseApiModel.Companion companion16 = MTicketPassengerFareBreakdownResponseApiModel.INSTANCE;
                return new LinkedHashMapSerializer(BuiltinSerializersKt.c(StringSerializer.f18170a), BuiltinSerializersKt.c(DoubleSerializer.f18137a));
        }
    }
}
