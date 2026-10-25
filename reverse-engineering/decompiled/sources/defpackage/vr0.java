package defpackage;

import android.os.Build;
import androidx.compose.foundation.text.selection.PlatformSelectionBehaviors_androidKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorMatrix;
import app.chalo.checkout.data.model.app.CheckoutPaymentMethod;
import app.chalo.checkout.data.model.app.PreferredPaymentMethodsAppModel;
import app.chalo.constants.Source;
import app.chalo.livetracking.universalsearch.data.model.api.PlaceAddress;
import app.chalo.livetracking.universalsearch.data.model.api.PlaceAddressResult$$serializer;
import app.chalo.permissions.models.PlatformPermissionName;
import app.chalo.premiumbus.data.models.api.request.PremiumBusChangeSeatsRequestApiModel;
import app.chalo.premiumbus.data.models.api.response.PremiumBusBookingAvailableOptionsApiResponseModel;
import app.chalo.premiumbus.data.models.api.response.PremiumBusBookingPurchaseOptionApiResponseModel$$serializer;
import app.chalo.premiumbus.data.models.api.response.SeatInfoApiModel$$serializer;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.scenes.args.PassLandingFlowType;
import app.chalo.scenes.args.PickRouteLocationArgs;
import app.chalo.scenes.args.PickStopArgs;
import app.chalo.scenes.args.PremiumBusActivationArgs;
import app.chalo.scenes.args.PremiumBusArgs;
import app.chalo.scenes.args.PremiumBusArgs$PremiumBusBulkBookingConfirmationScreenArgs$$serializer;
import app.chalo.scenes.args.PremiumBusArgs$PremiumBusPassLandingScreenArgs$$serializer;
import app.chalo.scenes.args.PremiumBusArgs$PremiumBusSeatSelectionArgs$$serializer;
import app.chalo.scenes.args.PremiumBusArgs$PremiumBusSlotListScreenArgs$$serializer;
import app.chalo.scenes.args.PremiumBusArgs$PremiumProductSelectionArgs$$serializer;
import app.chalo.scenes.args.PremiumBusArgs$PremiumStopDetailsArgs$$serializer;
import app.chalo.scenes.args.PremiumBusArgs$SlotSelectionArgs$$serializer;
import app.chalo.scenes.args.PremiumBusArgs$StopSelectionArgs$$serializer;
import io.github.alexzhirkevich.compottie.internal.animation.expressions.ExpressionComposition;
import io.github.alexzhirkevich.compottie.internal.assets.PrecompositionAsset;
import io.github.alexzhirkevich.compottie.internal.assets.PrecompositionAsset$Companion$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0;
import io.github.alexzhirkevich.compottie.internal.effects.LayerEffect;
import io.github.alexzhirkevich.compottie.internal.helpers.BooleanIntSerializer;
import io.github.alexzhirkevich.compottie.internal.helpers.Mask$$serializer;
import io.github.alexzhirkevich.compottie.internal.layers.Layer;
import io.github.alexzhirkevich.compottie.internal.layers.PrecompositionLayer;
import io.github.alexzhirkevich.compottie.internal.platform.PlatformShaderKt;
import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class vr0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19861a;

    public /* synthetic */ vr0(int i) {
        this.f19861a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f19861a) {
            case 0:
                PickRouteLocationArgs.Companion companion = PickRouteLocationArgs.Companion;
                return Source.INSTANCE.serializer();
            case 1:
                PickStopArgs.Companion companion2 = PickStopArgs.INSTANCE;
                return Source.INSTANCE.serializer();
            case 2:
                PickStopArgs.Companion companion3 = PickStopArgs.INSTANCE;
                return ChaloTransitMode.INSTANCE.serializer();
            case 3:
                PlaceAddress.Companion companion4 = PlaceAddress.Companion;
                return new ArrayListSerializer(PlaceAddressResult$$serializer.f4976a);
            case 4:
                Lazy lazy = PlatformPermissionName.b;
                return new PlatformPermissionName(Build.VERSION.SDK_INT >= 33 ? "android.permission.POST_NOTIFICATIONS" : "POST_NOTIFICATIONS");
            case 5:
                Lazy lazy2 = PlatformPermissionName.b;
                return new PlatformPermissionName(Build.VERSION.SDK_INT >= 31 ? "android.permission.BLUETOOTH_SCAN" : "BLUETOOTH_SCAN");
            case 6:
                Lazy lazy3 = PlatformPermissionName.b;
                return new PlatformPermissionName(Build.VERSION.SDK_INT >= 31 ? "android.permission.BLUETOOTH_CONNECT" : "BLUETOOTH_CONNECT");
            case 7:
                Lazy lazy4 = PlatformPermissionName.b;
                return new PlatformPermissionName(Build.VERSION.SDK_INT >= 31 ? "android.permission.BLUETOOTH_ADVERTISE" : "BLUETOOTH_ADVERTISE");
            case 8:
                return PlatformSelectionBehaviors_androidKt.LocalTextClassifierCoroutineContext$lambda$0();
            case 9:
                Lazy lazy5 = PlatformShaderKt.f16289a;
                return ColorFilter.INSTANCE.m4647colorMatrixjHGOpc(ColorMatrix.m4661constructorimpl(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2126f, 0.7152f, 0.0722f, 0.0f, 0.0f}));
            case 10:
                PrecompositionAsset.Companion companion5 = PrecompositionAsset.Companion;
                return new ArrayListSerializer(new PolymorphicSerializer(Reflection.a(Layer.class), new Annotation[]{new PrecompositionAsset$Companion$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0()}));
            case 11:
                PrecompositionLayer.Companion companion6 = PrecompositionLayer.Companion;
                return new ArrayListSerializer(Mask$$serializer.f16239a);
            case 12:
                PrecompositionLayer.Companion companion7 = PrecompositionLayer.Companion;
                return new ArrayListSerializer(LayerEffect.INSTANCE.serializer());
            case 13:
                PrecompositionLayer.Companion companion8 = PrecompositionLayer.Companion;
                return new BooleanIntSerializer();
            case 14:
                PrecompositionLayer.Companion companion9 = PrecompositionLayer.Companion;
                return new BooleanIntSerializer();
            case 15:
                PrecompositionLayer.Companion companion10 = PrecompositionLayer.Companion;
                return new PolymorphicSerializer(Reflection.a(ExpressionComposition.class), new Annotation[0]);
            case 16:
                return Modifier.INSTANCE;
            case 17:
                PreferredPaymentMethodsAppModel.Companion companion11 = PreferredPaymentMethodsAppModel.INSTANCE;
                return CheckoutPaymentMethod.INSTANCE.serializer();
            case 18:
                PremiumBusActivationArgs.Companion companion12 = PremiumBusActivationArgs.Companion;
                return Source.INSTANCE.serializer();
            case 19:
                PremiumBusArgs.Companion companion13 = PremiumBusArgs.INSTANCE;
                SealedClassSerializer sealedClassSerializer = new SealedClassSerializer("app.chalo.scenes.args.PremiumBusArgs", Reflection.a(PremiumBusArgs.class), new KClass[]{Reflection.a(PremiumBusArgs.PremiumBusBulkBookingConfirmationScreenArgs.class), Reflection.a(PremiumBusArgs.PremiumBusPassLandingScreenArgs.class), Reflection.a(PremiumBusArgs.PremiumBusSeatSelectionArgs.class), Reflection.a(PremiumBusArgs.PremiumBusSlotListScreenArgs.class), Reflection.a(PremiumBusArgs.PremiumProductSelectionArgs.class), Reflection.a(PremiumBusArgs.PremiumStopDetailsArgs.class), Reflection.a(PremiumBusArgs.SlotSelectionArgs.class), Reflection.a(PremiumBusArgs.StopSelectionArgs.class)}, new KSerializer[]{PremiumBusArgs$PremiumBusBulkBookingConfirmationScreenArgs$$serializer.f9284a, PremiumBusArgs$PremiumBusPassLandingScreenArgs$$serializer.f9285a, PremiumBusArgs$PremiumBusSeatSelectionArgs$$serializer.f9286a, PremiumBusArgs$PremiumBusSlotListScreenArgs$$serializer.f9287a, PremiumBusArgs$PremiumProductSelectionArgs$$serializer.f9288a, PremiumBusArgs$PremiumStopDetailsArgs$$serializer.f9289a, PremiumBusArgs$SlotSelectionArgs$$serializer.f9290a, PremiumBusArgs$StopSelectionArgs$$serializer.f9291a});
                sealedClassSerializer.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer;
            case 20:
                PremiumBusArgs.PremiumBusBulkBookingConfirmationScreenArgs.Companion companion14 = PremiumBusArgs.PremiumBusBulkBookingConfirmationScreenArgs.INSTANCE;
                return Source.INSTANCE.serializer();
            case 21:
                PremiumBusArgs.PremiumBusPassLandingScreenArgs.Companion companion15 = PremiumBusArgs.PremiumBusPassLandingScreenArgs.INSTANCE;
                return PassLandingFlowType.INSTANCE.serializer();
            case 22:
                PremiumBusArgs.PremiumBusPassLandingScreenArgs.Companion companion16 = PremiumBusArgs.PremiumBusPassLandingScreenArgs.INSTANCE;
                return Source.INSTANCE.serializer();
            case 23:
                PremiumBusArgs.PremiumBusSeatSelectionArgs.Companion companion17 = PremiumBusArgs.PremiumBusSeatSelectionArgs.INSTANCE;
                return Source.INSTANCE.serializer();
            case 24:
                PremiumBusArgs.PremiumBusSlotListScreenArgs.Companion companion18 = PremiumBusArgs.PremiumBusSlotListScreenArgs.INSTANCE;
                return Source.INSTANCE.serializer();
            case 25:
                PremiumBusArgs.PremiumStopDetailsArgs.Companion companion19 = PremiumBusArgs.PremiumStopDetailsArgs.INSTANCE;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 26:
                PremiumBusArgs.SlotSelectionArgs.Companion companion20 = PremiumBusArgs.SlotSelectionArgs.INSTANCE;
                return Source.INSTANCE.serializer();
            case 27:
                PremiumBusArgs.StopSelectionArgs.Companion companion21 = PremiumBusArgs.StopSelectionArgs.INSTANCE;
                return Source.INSTANCE.serializer();
            case 28:
                PremiumBusBookingAvailableOptionsApiResponseModel.Companion companion22 = PremiumBusBookingAvailableOptionsApiResponseModel.Companion;
                return new ArrayListSerializer(PremiumBusBookingPurchaseOptionApiResponseModel$$serializer.f7041a);
            default:
                PremiumBusChangeSeatsRequestApiModel.Companion companion23 = PremiumBusChangeSeatsRequestApiModel.Companion;
                return new ArrayListSerializer(SeatInfoApiModel$$serializer.f7063a);
        }
    }
}
