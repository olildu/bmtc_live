package app.chalo.productpurchase.passselection.ui;

import app.chalo.constants.Source;
import app.chalo.models.productbooking.SuperPassPurchaseStopsInfo;
import app.chalo.models.productbooking.SuperPassPurchaseStopsInfo$$serializer;
import app.chalo.scenes.args.PostPassPurchaseSuccessFlowType;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/productpurchase/passselection/ui/PassSelectionRestoreState.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/productpurchase/passselection/ui/PassSelectionRestoreState;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class PassSelectionRestoreState$$serializer implements GeneratedSerializer<PassSelectionRestoreState> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PassSelectionRestoreState$$serializer f8541a;
    private static final SerialDescriptor descriptor;

    static {
        PassSelectionRestoreState$$serializer passSelectionRestoreState$$serializer = new PassSelectionRestoreState$$serializer();
        f8541a = passSelectionRestoreState$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.productpurchase.passselection.ui.PassSelectionRestoreState", passSelectionRestoreState$$serializer, 4);
        pluginGeneratedSerialDescriptor.j("productId", true);
        pluginGeneratedSerialDescriptor.j("previousScreenSource", true);
        pluginGeneratedSerialDescriptor.j("stopsInfo", true);
        pluginGeneratedSerialDescriptor.j("postSuccessFlow", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = PassSelectionRestoreState.e;
        return new KSerializer[]{StringSerializer.f18170a, BuiltinSerializersKt.c((KSerializer) lazyArr[1].getValue()), BuiltinSerializersKt.c(SuperPassPurchaseStopsInfo$$serializer.f5666a), BuiltinSerializersKt.c((KSerializer) lazyArr[3].getValue())};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        String str;
        Source source;
        SuperPassPurchaseStopsInfo superPassPurchaseStopsInfo;
        PostPassPurchaseSuccessFlowType postPassPurchaseSuccessFlowType;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = PassSelectionRestoreState.e;
        String strDecodeStringElement = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            Source source2 = (Source) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, (DeserializationStrategy) lazyArr[1].getValue(), null);
            SuperPassPurchaseStopsInfo superPassPurchaseStopsInfo2 = (SuperPassPurchaseStopsInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, SuperPassPurchaseStopsInfo$$serializer.f5666a, null);
            postPassPurchaseSuccessFlowType = (PostPassPurchaseSuccessFlowType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy) lazyArr[3].getValue(), null);
            str = strDecodeStringElement2;
            superPassPurchaseStopsInfo = superPassPurchaseStopsInfo2;
            i = 15;
            source = source2;
        } else {
            boolean z = true;
            int i2 = 0;
            Source source3 = null;
            SuperPassPurchaseStopsInfo superPassPurchaseStopsInfo3 = null;
            PostPassPurchaseSuccessFlowType postPassPurchaseSuccessFlowType2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    source3 = (Source) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, (DeserializationStrategy) lazyArr[1].getValue(), source3);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    superPassPurchaseStopsInfo3 = (SuperPassPurchaseStopsInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, SuperPassPurchaseStopsInfo$$serializer.f5666a, superPassPurchaseStopsInfo3);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    postPassPurchaseSuccessFlowType2 = (PostPassPurchaseSuccessFlowType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy) lazyArr[3].getValue(), postPassPurchaseSuccessFlowType2);
                    i2 |= 8;
                }
            }
            i = i2;
            str = strDecodeStringElement;
            source = source3;
            superPassPurchaseStopsInfo = superPassPurchaseStopsInfo3;
            postPassPurchaseSuccessFlowType = postPassPurchaseSuccessFlowType2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new PassSelectionRestoreState(i, source, superPassPurchaseStopsInfo, postPassPurchaseSuccessFlowType, str);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        PassSelectionRestoreState value = (PassSelectionRestoreState) obj;
        Intrinsics.i(value, "value");
        PostPassPurchaseSuccessFlowType postPassPurchaseSuccessFlowType = value.d;
        SuperPassPurchaseStopsInfo superPassPurchaseStopsInfo = value.c;
        Source source = value.b;
        String str = value.f8540a;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = PassSelectionRestoreState.e;
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.d(str, "")) {
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 1) || source != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, (SerializationStrategy) lazyArr[1].getValue(), source);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 2) || superPassPurchaseStopsInfo != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, SuperPassPurchaseStopsInfo$$serializer.f5666a, superPassPurchaseStopsInfo);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 3) || postPassPurchaseSuccessFlowType != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, (SerializationStrategy) lazyArr[3].getValue(), postPassPurchaseSuccessFlowType);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
