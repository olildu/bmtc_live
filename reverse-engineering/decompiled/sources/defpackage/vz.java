package defpackage;

import android.os.Handler;
import android.os.Looper;
import app.chalo.ads.ExitInterstitialAdManager;
import app.chalo.constants.Source;
import app.chalo.electricitybill.data.model.apimodel.response.ElectricityBillPaymentHistoryApiModel$$serializer;
import app.chalo.electricitybill.data.model.apimodel.response.ElectricityBillPaymentHistoryResponseApiModel;
import app.chalo.electricitybill.ui.paymenthistory.model.ElectricityBillPaymentHistoryUiModel;
import app.chalo.electricitybill.ui.paymenthistory.model.ElectricityBillPaymentStatus;
import app.chalo.homescreen.data.model.app.FAQAppModel$$serializer;
import app.chalo.homescreen.data.model.app.FAQSectionAppModel;
import app.chalo.instantticket.data.model.app.response.FareBreakupOperationType;
import app.chalo.models.remoteconfig.Experiment;
import app.chalo.ncmc.data.apiresponsemodel.EligibleCard$$serializer;
import app.chalo.ncmc.data.apiresponsemodel.EligibleCardResponseApiModel;
import app.chalo.network.model.ErrorDetails;
import app.chalo.premiumbus.data.models.api.response.EligibleStopApiModel$$serializer;
import app.chalo.premiumbus.data.models.api.response.EligibleStopChangesApiResponseModel;
import app.chalo.productbooking.common.data.models.entity.FareBreakupEntityModel;
import app.chalo.productpurchase.passpurchase.ui.proofoverview.EnlargeProofImageEventHandler;
import app.chalo.productpurchase.passpurchase.ui.proofoverview.EnlargeProofImageEventHandler$Companion$DEFAULT$2$1;
import app.chalo.productpurchase.passpurchase.ui.proofoverview.EnlargeProofImageEventHandler$Companion$NO_ZOOM$2$1;
import app.chalo.scenes.args.EBillFetchScreenArgs;
import app.chalo.scenes.args.EBillHistoryScreenArgs;
import app.chalo.scenes.args.EnterCardDetailsArgs;
import app.chalo.security.encryption.data.EncryptionKey$$serializer;
import app.chalo.security.sync.data.EncryptionKeyListData;
import app.chalo.security.sync.data.EncryptionKeySyncApiData;
import chalo_app_kmm.shared.chalo_base.generated.resources.Drawable3_commonMainKt;
import com.google.accompanist.drawablepainter.DrawablePainterKt;
import io.github.alexzhirkevich.compottie.internal.animation.AnimatedVectorN;
import io.github.alexzhirkevich.compottie.internal.effects.DropShadowEffect;
import io.github.alexzhirkevich.compottie.internal.effects.DropShadowEffect$Companion$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0;
import io.github.alexzhirkevich.compottie.internal.effects.EffectValue;
import io.github.alexzhirkevich.compottie.internal.effects.EffectValue$Angle$$serializer;
import io.github.alexzhirkevich.compottie.internal.effects.EffectValue$CheckBox$$serializer;
import io.github.alexzhirkevich.compottie.internal.effects.EffectValue$Color$$serializer;
import io.github.alexzhirkevich.compottie.internal.effects.EffectValue$DropDown$$serializer;
import io.github.alexzhirkevich.compottie.internal.effects.EffectValue$Layer$$serializer;
import io.github.alexzhirkevich.compottie.internal.effects.EffectValue$Point$$serializer;
import io.github.alexzhirkevich.compottie.internal.effects.EffectValue$Slider$$serializer;
import io.github.alexzhirkevich.compottie.internal.effects.EffectValue$Unsupported$$serializer;
import io.github.alexzhirkevich.compottie.internal.helpers.BooleanIntSerializer;
import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.collections.ArraysKt;
import kotlin.collections.EmptySet;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.ClassReference;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.ObjectSerializer;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.compose.resources.DensityQualifier;
import org.jetbrains.compose.resources.DrawableResource;
import org.jetbrains.compose.resources.ResourceItem;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class vz implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19877a;

    public /* synthetic */ vz(int i) {
        this.f19877a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f19877a) {
            case 0:
                Lazy lazy = Drawable3_commonMainKt.f11292a;
                return new DrawableResource("drawable:women_unavailable_seat", SetsKt.g(new ResourceItem(EmptySet.f17559a, "composeResources/chalo_app_kmm.shared.chalo_base.generated.resources/drawable/women_unavailable_seat.xml", -1L, -1L)));
            case 1:
                Lazy lazy2 = Drawable3_commonMainKt.f11292a;
                return new DrawableResource("drawable:women_unselected_seat", SetsKt.g(new ResourceItem(EmptySet.f17559a, "composeResources/chalo_app_kmm.shared.chalo_base.generated.resources/drawable/women_unselected_seat.xml", -1L, -1L)));
            case 2:
                Lazy lazy3 = Drawable3_commonMainKt.f11292a;
                return new DrawableResource("drawable:yes_bank", SetsKt.g(new ResourceItem(EmptySet.f17559a, "composeResources/chalo_app_kmm.shared.chalo_base.generated.resources/drawable/yes_bank.png", -1L, -1L)));
            case 3:
                Lazy lazy4 = Drawable3_commonMainKt.f11292a;
                return new DrawableResource("drawable:monorail_search", SetsKt.g(new ResourceItem(SetsKt.g(DensityQualifier.XXHDPI), "composeResources/chalo_app_kmm.shared.chalo_base.generated.resources/drawable-xxhdpi/monorail_search.png", -1L, -1L)));
            case 4:
                Lazy lazy5 = Drawable3_commonMainKt.f11292a;
                return new DrawableResource("drawable:other_gender_user", SetsKt.g(new ResourceItem(EmptySet.f17559a, "composeResources/chalo_app_kmm.shared.chalo_base.generated.resources/drawable/other_gender_user.xml", -1L, -1L)));
            case 5:
                Object obj = DrawablePainterKt.f13053a;
                return new Handler(Looper.getMainLooper());
            case 6:
                DropShadowEffect.Companion companion = DropShadowEffect.Companion;
                ClassReference classReferenceA = Reflection.a(EffectValue.class);
                KClass[] kClassArr = {Reflection.a(EffectValue.Angle.class), Reflection.a(EffectValue.CheckBox.class), Reflection.a(EffectValue.Color.class), Reflection.a(EffectValue.DropDown.class), Reflection.a(EffectValue.Layer.class), Reflection.a(EffectValue.Point.class), Reflection.a(EffectValue.Slider.class), Reflection.a(EffectValue.Unsupported.class)};
                KSerializer[] kSerializerArr = {EffectValue$Angle$$serializer.f16197a, EffectValue$CheckBox$$serializer.f16199a, EffectValue$Color$$serializer.f16201a, EffectValue$DropDown$$serializer.f16204a, EffectValue$Layer$$serializer.f16206a, EffectValue$Point$$serializer.f16208a, EffectValue$Slider$$serializer.f16210a, EffectValue$Unsupported$$serializer.f16212a};
                Annotation[] annotationArr = {new DropShadowEffect$Companion$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0()};
                SealedClassSerializer sealedClassSerializer = new SealedClassSerializer("io.github.alexzhirkevich.compottie.internal.effects.EffectValue", classReferenceA, kClassArr, kSerializerArr);
                sealedClassSerializer.b = ArraysKt.e(annotationArr);
                return new ArrayListSerializer(sealedClassSerializer);
            case 7:
                DropShadowEffect.Companion companion2 = DropShadowEffect.Companion;
                return new BooleanIntSerializer();
            case 8:
                return new ObjectSerializer("app.chalo.scenes.args.EBillFetchScreenArgs", EBillFetchScreenArgs.INSTANCE, new Annotation[0]);
            case 9:
                return new ObjectSerializer("app.chalo.scenes.args.EBillHistoryScreenArgs", EBillHistoryScreenArgs.INSTANCE, new Annotation[0]);
            case 10:
                EffectValue.Point.Companion companion3 = EffectValue.Point.INSTANCE;
                return AnimatedVectorN.INSTANCE.serializer();
            case 11:
                EffectValue.Unsupported.Companion companion4 = EffectValue.Unsupported.INSTANCE;
                return AnimatedVectorN.INSTANCE.serializer();
            case 12:
                ElectricityBillPaymentHistoryResponseApiModel.Companion companion5 = ElectricityBillPaymentHistoryResponseApiModel.INSTANCE;
                return new ArrayListSerializer(ElectricityBillPaymentHistoryApiModel$$serializer.f2533a);
            case 13:
                ElectricityBillPaymentHistoryUiModel.Companion companion6 = ElectricityBillPaymentHistoryUiModel.INSTANCE;
                return EnumsKt.b("app.chalo.electricitybill.ui.paymenthistory.model.ElectricityBillPaymentStatus", ElectricityBillPaymentStatus.values());
            case 14:
                EligibleCardResponseApiModel.Companion companion7 = EligibleCardResponseApiModel.Companion;
                return new ArrayListSerializer(EligibleCard$$serializer.f6096a);
            case 15:
                EligibleStopChangesApiResponseModel.Companion companion8 = EligibleStopChangesApiResponseModel.Companion;
                return new ArrayListSerializer(EligibleStopApiModel$$serializer.f7019a);
            case 16:
                EncryptionKeyListData.Companion companion9 = EncryptionKeyListData.INSTANCE;
                return new ArrayListSerializer(EncryptionKey$$serializer.f9353a);
            case 17:
                EncryptionKeyListData.Companion companion10 = EncryptionKeyListData.INSTANCE;
                return new LinkedHashMapSerializer(StringSerializer.f18170a, new ArrayListSerializer(EncryptionKey$$serializer.f9353a));
            case 18:
                EncryptionKeySyncApiData.Companion companion11 = EncryptionKeySyncApiData.Companion;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 19:
                EncryptionKeySyncApiData.Companion companion12 = EncryptionKeySyncApiData.Companion;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 20:
                EnlargeProofImageEventHandler.Companion companion13 = EnlargeProofImageEventHandler.Companion.f8457a;
                return new EnlargeProofImageEventHandler$Companion$DEFAULT$2$1();
            case 21:
                EnlargeProofImageEventHandler.Companion companion14 = EnlargeProofImageEventHandler.Companion.f8457a;
                return new EnlargeProofImageEventHandler$Companion$NO_ZOOM$2$1();
            case 22:
                EnterCardDetailsArgs.Companion companion15 = EnterCardDetailsArgs.Companion;
                return Source.INSTANCE.serializer();
            case 23:
                ErrorDetails.Companion companion16 = ErrorDetails.Companion;
                StringSerializer stringSerializer = StringSerializer.f18170a;
                return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
            case 24:
                Source source = ExitInterstitialAdManager.w;
                return Long.valueOf(System.currentTimeMillis());
            case 25:
                return Long.valueOf(System.currentTimeMillis());
            case 26:
                Experiment.Companion companion17 = Experiment.INSTANCE;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 27:
                Experiment.Companion companion18 = Experiment.INSTANCE;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 28:
                FAQSectionAppModel.Companion companion19 = FAQSectionAppModel.INSTANCE;
                return new ArrayListSerializer(FAQAppModel$$serializer.f3732a);
            default:
                FareBreakupEntityModel.Companion companion20 = FareBreakupEntityModel.INSTANCE;
                return EnumsKt.b("app.chalo.instantticket.data.model.app.response.FareBreakupOperationType", FareBreakupOperationType.values());
        }
    }
}
