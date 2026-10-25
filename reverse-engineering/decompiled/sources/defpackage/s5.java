package defpackage;

import androidx.compose.material3.AppBarDslKt;
import androidx.compose.material3.DefaultSingleRowTopAppBarOverride;
import androidx.compose.material3.DefaultTwoRowsTopAppBarOverride;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathMeasure;
import app.chalo.premiumbus.data.models.api.response.ApplicableRuleApiResponseModel;
import app.chalo.premiumbus.data.models.api.response.ApplicableRuleUxCopyApiResponseModel;
import app.chalo.premiumbus.data.models.api.response.ApplicableRuleUxCopyApiResponseModel$$serializer;
import app.chalo.premiumbus.data.models.app.ApplicableRuleAppModel;
import app.chalo.premiumbus.data.models.app.ApplicableRuleUxCopyAppModel;
import app.chalo.premiumbus.data.models.app.ApplicableRuleUxCopyAppModel$ChaloBusTab$$serializer;
import app.chalo.premiumbus.data.models.app.ApplicableRuleUxCopyAppModel$CheckoutScreen$$serializer;
import app.chalo.premiumbus.data.models.app.ApplicableRuleUxCopyAppModel$PassPlanScreen$$serializer;
import app.chalo.premiumbus.data.models.app.ApplicableRuleUxCopyAppModel$PassPurchaseConfirmationScreen$$serializer;
import app.chalo.premiumbus.data.models.app.ApplicableRuleUxCopyAppModel$ProductScreen$$serializer;
import app.chalo.premiumbus.data.models.app.ApplicableRuleUxCopyAppModel$SlotScreen$$serializer;
import app.chalo.scenes.args.AppMigrationPreconditionsArgs;
import chalo_app_kmm.shared.chalo_base.generated.resources.Array0_commonMainKt;
import io.github.alexzhirkevich.compottie.internal.Animation;
import io.github.alexzhirkevich.compottie.internal.Animation$Companion$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0;
import io.github.alexzhirkevich.compottie.internal.animation.AnimatedTextDocument;
import io.github.alexzhirkevich.compottie.internal.animation.AnimatedTextDocumentKt;
import io.github.alexzhirkevich.compottie.internal.animation.AnimatedVector2;
import io.github.alexzhirkevich.compottie.internal.animation.AnimatedVectorN;
import io.github.alexzhirkevich.compottie.internal.animation.PropertyGroup;
import io.github.alexzhirkevich.compottie.internal.animation.TextDocumentKeyframe$$serializer;
import io.github.alexzhirkevich.compottie.internal.animation.ToListSerializer;
import io.github.alexzhirkevich.compottie.internal.animation.VectorKeyframe$$serializer;
import io.github.alexzhirkevich.compottie.internal.assets.AssetSerializer;
import io.github.alexzhirkevich.compottie.internal.assets.CharacterData$$serializer;
import io.github.alexzhirkevich.compottie.internal.helpers.Marker$$serializer;
import io.github.alexzhirkevich.compottie.internal.layers.Layer;
import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.collections.ArraysKt;
import kotlin.collections.EmptySet;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.ObjectSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonElementSerializer;
import org.jetbrains.compose.resources.ResourceItem;
import org.jetbrains.compose.resources.StringArrayResource;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class s5 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19270a;

    public /* synthetic */ s5(int i) {
        this.f19270a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f19270a) {
            case 0:
                AnimatedTextDocument.Companion companion = AnimatedTextDocument.INSTANCE;
                return AnimatedTextDocumentKt.a(2);
            case 1:
                AnimatedTextDocument.Companion companion2 = AnimatedTextDocument.INSTANCE;
                return AnimatedTextDocumentKt.a(4);
            case 2:
                AnimatedTextDocument.Companion companion3 = AnimatedTextDocument.INSTANCE;
                return AnimatedTextDocumentKt.a(4);
            case 3:
                AnimatedTextDocument.Companion companion4 = AnimatedTextDocument.INSTANCE;
                return AnimatedTextDocumentKt.a(2);
            case 4:
                AnimatedTextDocument.Companion companion5 = AnimatedTextDocument.INSTANCE;
                return AnimatedTextDocumentKt.a(2);
            case 5:
                AnimatedTextDocument.Companion companion6 = AnimatedTextDocument.INSTANCE;
                return new ArrayListSerializer(TextDocumentKeyframe$$serializer.f16165a);
            case 6:
                AnimatedTextDocument.Companion companion7 = AnimatedTextDocument.INSTANCE;
                return new PolymorphicSerializer(Reflection.a(PropertyGroup.class), new Annotation[0]);
            case 7:
                AnimatedTextDocument.Companion companion8 = AnimatedTextDocument.INSTANCE;
                return AnimatedTextDocumentKt.a(4);
            case 8:
                AnimatedVector2.Animated.Companion companion9 = AnimatedVector2.Animated.INSTANCE;
                return new ArrayListSerializer(VectorKeyframe$$serializer.f16169a);
            case 9:
                AnimatedVector2.Animated.Companion companion10 = AnimatedVector2.Animated.INSTANCE;
                return new PolymorphicSerializer(Reflection.a(Path.class), new Annotation[0]);
            case 10:
                AnimatedVector2.Animated.Companion companion11 = AnimatedVector2.Animated.INSTANCE;
                return new PolymorphicSerializer(Reflection.a(PathMeasure.class), new Annotation[0]);
            case 11:
                AnimatedVector2.Default.Companion companion12 = AnimatedVector2.Default.INSTANCE;
                return new ArrayListSerializer(FloatSerializer.f18142a);
            case 12:
                AnimatedVectorN.Animated.Companion companion13 = AnimatedVectorN.Animated.INSTANCE;
                return new ArrayListSerializer(VectorKeyframe$$serializer.f16169a);
            case 13:
                AnimatedVectorN.Default.Companion companion14 = AnimatedVectorN.Default.INSTANCE;
                return new ToListSerializer(BuiltinSerializersKt.b(FloatSerializer.f18142a));
            case 14:
                Animation.Companion companion15 = Animation.INSTANCE;
                return new ArrayListSerializer(new PolymorphicSerializer(Reflection.a(Layer.class), new Annotation[]{new Animation$Companion$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0()}));
            case 15:
                Animation.Companion companion16 = Animation.INSTANCE;
                return new ArrayListSerializer(new AssetSerializer());
            case 16:
                Animation.Companion companion17 = Animation.INSTANCE;
                return new ArrayListSerializer(CharacterData$$serializer.f16174a);
            case 17:
                Animation.Companion companion18 = Animation.INSTANCE;
                return new ArrayListSerializer(Marker$$serializer.f16237a);
            case 18:
                Animation.Companion companion19 = Animation.INSTANCE;
                return new LinkedHashMapSerializer(StringSerializer.f18170a, JsonElementSerializer.f18193a);
            case 19:
                return AppBarDslKt.rememberAppBarOverflowState$lambda$1$lambda$0();
            case 20:
                return DefaultSingleRowTopAppBarOverride.INSTANCE;
            case 21:
                return DefaultTwoRowsTopAppBarOverride.INSTANCE;
            case 22:
                return new ObjectSerializer("app.chalo.scenes.args.AppMigrationPreconditionsArgs", AppMigrationPreconditionsArgs.INSTANCE, new Annotation[0]);
            case 23:
                ApplicableRuleApiResponseModel.Companion companion20 = ApplicableRuleApiResponseModel.INSTANCE;
                return new ArrayListSerializer(ApplicableRuleUxCopyApiResponseModel$$serializer.f7017a);
            case 24:
                ApplicableRuleAppModel.Companion companion21 = ApplicableRuleAppModel.INSTANCE;
                return new ArrayListSerializer(ApplicableRuleUxCopyAppModel.INSTANCE.serializer());
            case 25:
                ApplicableRuleUxCopyApiResponseModel.Companion companion22 = ApplicableRuleUxCopyApiResponseModel.INSTANCE;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 26:
                ApplicableRuleUxCopyAppModel.Companion companion23 = ApplicableRuleUxCopyAppModel.INSTANCE;
                SealedClassSerializer sealedClassSerializer = new SealedClassSerializer("app.chalo.premiumbus.data.models.app.ApplicableRuleUxCopyAppModel", Reflection.a(ApplicableRuleUxCopyAppModel.class), new KClass[]{Reflection.a(ApplicableRuleUxCopyAppModel.ChaloBusTab.class), Reflection.a(ApplicableRuleUxCopyAppModel.CheckoutScreen.class), Reflection.a(ApplicableRuleUxCopyAppModel.PassPlanScreen.class), Reflection.a(ApplicableRuleUxCopyAppModel.PassPurchaseConfirmationScreen.class), Reflection.a(ApplicableRuleUxCopyAppModel.ProductScreen.class), Reflection.a(ApplicableRuleUxCopyAppModel.SlotScreen.class)}, new KSerializer[]{ApplicableRuleUxCopyAppModel$ChaloBusTab$$serializer.f7073a, ApplicableRuleUxCopyAppModel$CheckoutScreen$$serializer.f7074a, ApplicableRuleUxCopyAppModel$PassPlanScreen$$serializer.f7075a, ApplicableRuleUxCopyAppModel$PassPurchaseConfirmationScreen$$serializer.f7076a, ApplicableRuleUxCopyAppModel$ProductScreen$$serializer.f7077a, ApplicableRuleUxCopyAppModel$SlotScreen$$serializer.f7078a});
                sealedClassSerializer.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer;
            case 27:
                ApplicableRuleUxCopyAppModel.CheckoutScreen.Companion companion24 = ApplicableRuleUxCopyAppModel.CheckoutScreen.INSTANCE;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 28:
                ApplicableRuleUxCopyAppModel.PassPurchaseConfirmationScreen.Companion companion25 = ApplicableRuleUxCopyAppModel.PassPurchaseConfirmationScreen.INSTANCE;
                return new ArrayListSerializer(StringSerializer.f18170a);
            default:
                Lazy lazy = Array0_commonMainKt.f11288a;
                return new StringArrayResource("string-array:gen_instructions_arr", SetsKt.g(new ResourceItem(EmptySet.f17559a, "composeResources/chalo_app_kmm.shared.chalo_base.generated.resources/values/arrays.commonMain.cvr", 657L, 369L)));
        }
    }
}
