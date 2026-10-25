package app.chalo.data;

import app.chalo.providers.iconassetprovider.IconType;
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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/data/ChaloTextDataAppModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/data/ChaloTextDataAppModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class ChaloTextDataAppModel$$serializer implements GeneratedSerializer<ChaloTextDataAppModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ChaloTextDataAppModel$$serializer f2336a;
    private static final SerialDescriptor descriptor;

    static {
        ChaloTextDataAppModel$$serializer chaloTextDataAppModel$$serializer = new ChaloTextDataAppModel$$serializer();
        f2336a = chaloTextDataAppModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.data.ChaloTextDataAppModel", chaloTextDataAppModel$$serializer, 6);
        pluginGeneratedSerialDescriptor.j("background", true);
        pluginGeneratedSerialDescriptor.j("endIcon", true);
        pluginGeneratedSerialDescriptor.j("endIconTextPadding", true);
        pluginGeneratedSerialDescriptor.j("startIcon", true);
        pluginGeneratedSerialDescriptor.j("startIconTextPadding", true);
        pluginGeneratedSerialDescriptor.j("textStyle", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = ChaloTextDataAppModel.g;
        KSerializer kSerializerC = BuiltinSerializersKt.c((KSerializer) lazyArr[1].getValue());
        KSerializer kSerializerC2 = BuiltinSerializersKt.c((KSerializer) lazyArr[3].getValue());
        IntSerializer intSerializer = IntSerializer.f18146a;
        return new KSerializer[]{BackgroundAppModel$$serializer.f2312a, kSerializerC, intSerializer, kSerializerC2, intSerializer, TextStyleAppModel$$serializer.f2407a};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        int i2;
        int i3;
        BackgroundAppModel backgroundAppModel;
        IconType iconType;
        IconType iconType2;
        TextStyleAppModel textStyleAppModel;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = ChaloTextDataAppModel.g;
        int i4 = 5;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            BackgroundAppModel backgroundAppModel2 = (BackgroundAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, BackgroundAppModel$$serializer.f2312a, null);
            IconType iconType3 = (IconType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, (DeserializationStrategy) lazyArr[1].getValue(), null);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
            IconType iconType4 = (IconType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy) lazyArr[3].getValue(), null);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 4);
            iconType2 = iconType4;
            backgroundAppModel = backgroundAppModel2;
            textStyleAppModel = (TextStyleAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, TextStyleAppModel$$serializer.f2407a, null);
            i = iDecodeIntElement2;
            i2 = iDecodeIntElement;
            i3 = 63;
            iconType = iconType3;
        } else {
            boolean z = true;
            int iDecodeIntElement3 = 0;
            int i5 = 0;
            BackgroundAppModel backgroundAppModel3 = null;
            IconType iconType5 = null;
            IconType iconType6 = null;
            TextStyleAppModel textStyleAppModel2 = null;
            int iDecodeIntElement4 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i4 = 5;
                        break;
                    case 0:
                        backgroundAppModel3 = (BackgroundAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, BackgroundAppModel$$serializer.f2312a, backgroundAppModel3);
                        i5 |= 1;
                        i4 = 5;
                        break;
                    case 1:
                        iconType5 = (IconType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, (DeserializationStrategy) lazyArr[1].getValue(), iconType5);
                        i5 |= 2;
                        break;
                    case 2:
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
                        i5 |= 4;
                        break;
                    case 3:
                        iconType6 = (IconType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy) lazyArr[3].getValue(), iconType6);
                        i5 |= 8;
                        break;
                    case 4:
                        iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 4);
                        i5 |= 16;
                        break;
                    case 5:
                        textStyleAppModel2 = (TextStyleAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i4, TextStyleAppModel$$serializer.f2407a, textStyleAppModel2);
                        i5 |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = iDecodeIntElement3;
            i2 = iDecodeIntElement4;
            i3 = i5;
            backgroundAppModel = backgroundAppModel3;
            iconType = iconType5;
            iconType2 = iconType6;
            textStyleAppModel = textStyleAppModel2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ChaloTextDataAppModel(i3, backgroundAppModel, iconType, i2, iconType2, i, textStyleAppModel);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        ChaloTextDataAppModel value = (ChaloTextDataAppModel) obj;
        Intrinsics.i(value, "value");
        TextStyleAppModel textStyleAppModel = value.f;
        int i = value.e;
        IconType iconType = value.d;
        int i2 = value.c;
        IconType iconType2 = value.b;
        BackgroundAppModel backgroundAppModel = value.f2335a;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = ChaloTextDataAppModel.g;
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.d(backgroundAppModel, new BackgroundAppModel())) {
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, BackgroundAppModel$$serializer.f2312a, backgroundAppModel);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 1) || iconType2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, (SerializationStrategy) lazyArr[1].getValue(), iconType2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 2) || i2 != 0) {
            compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 2, i2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 3) || iconType != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, (SerializationStrategy) lazyArr[3].getValue(), iconType);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 4) || i != 0) {
            compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 4, i);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.d(textStyleAppModel, new TextStyleAppModel())) {
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 5, TextStyleAppModel$$serializer.f2407a, textStyleAppModel);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
