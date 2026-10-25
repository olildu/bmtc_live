package app.chalo.home.data.model.api;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
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
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/home/data/model/api/ChaloTextDataApiModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/home/data/model/api/ChaloTextDataApiModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class ChaloTextDataApiModel$$serializer implements GeneratedSerializer<ChaloTextDataApiModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ChaloTextDataApiModel$$serializer f2883a;
    private static final SerialDescriptor descriptor;

    static {
        ChaloTextDataApiModel$$serializer chaloTextDataApiModel$$serializer = new ChaloTextDataApiModel$$serializer();
        f2883a = chaloTextDataApiModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.home.data.model.api.ChaloTextDataApiModel", chaloTextDataApiModel$$serializer, 6);
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
        KSerializer kSerializerC = BuiltinSerializersKt.c(BackgroundApiModel$$serializer.f2877a);
        StringSerializer stringSerializer = StringSerializer.f18170a;
        KSerializer kSerializerC2 = BuiltinSerializersKt.c(stringSerializer);
        IntSerializer intSerializer = IntSerializer.f18146a;
        return new KSerializer[]{kSerializerC, kSerializerC2, BuiltinSerializersKt.c(intSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(intSerializer), BuiltinSerializersKt.c(TextStyleApiModel$$serializer.f2909a)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        BackgroundApiModel backgroundApiModel;
        String str;
        Integer num;
        String str2;
        Integer num2;
        TextStyleApiModel textStyleApiModel;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 5;
        BackgroundApiModel backgroundApiModel2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            BackgroundApiModel backgroundApiModel3 = (BackgroundApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, BackgroundApiModel$$serializer.f2877a, null);
            StringSerializer stringSerializer = StringSerializer.f18170a;
            String str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            IntSerializer intSerializer = IntSerializer.f18146a;
            Integer num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, intSerializer, null);
            String str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            Integer num4 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, intSerializer, null);
            backgroundApiModel = backgroundApiModel3;
            textStyleApiModel = (TextStyleApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, TextStyleApiModel$$serializer.f2909a, null);
            str2 = str4;
            num2 = num4;
            num = num3;
            str = str3;
            i = 63;
        } else {
            boolean z = true;
            int i3 = 0;
            String str5 = null;
            Integer num5 = null;
            String str6 = null;
            Integer num6 = null;
            TextStyleApiModel textStyleApiModel2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 5;
                        break;
                    case 0:
                        backgroundApiModel2 = (BackgroundApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, BackgroundApiModel$$serializer.f2877a, backgroundApiModel2);
                        i3 |= 1;
                        i2 = 5;
                        break;
                    case 1:
                        str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.f18170a, str5);
                        i3 |= 2;
                        break;
                    case 2:
                        num5 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.f18146a, num5);
                        i3 |= 4;
                        break;
                    case 3:
                        str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.f18170a, str6);
                        i3 |= 8;
                        break;
                    case 4:
                        num6 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, IntSerializer.f18146a, num6);
                        i3 |= 16;
                        break;
                    case 5:
                        textStyleApiModel2 = (TextStyleApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, TextStyleApiModel$$serializer.f2909a, textStyleApiModel2);
                        i3 |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i3;
            backgroundApiModel = backgroundApiModel2;
            str = str5;
            num = num5;
            str2 = str6;
            num2 = num6;
            textStyleApiModel = textStyleApiModel2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ChaloTextDataApiModel(i, backgroundApiModel, str, num, str2, num2, textStyleApiModel);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        ChaloTextDataApiModel value = (ChaloTextDataApiModel) obj;
        Intrinsics.i(value, "value");
        TextStyleApiModel textStyleApiModel = value.f;
        Integer num = value.e;
        String str = value.d;
        Integer num2 = value.c;
        String str2 = value.b;
        BackgroundApiModel backgroundApiModel = value.f2882a;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 0) || backgroundApiModel != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, BackgroundApiModel$$serializer.f2877a, backgroundApiModel);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 1) || str2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.f18170a, str2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 2) || num2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.f18146a, num2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 3) || str != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.f18170a, str);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 4) || num != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, IntSerializer.f18146a, num);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 5) || textStyleApiModel != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, TextStyleApiModel$$serializer.f2909a, textStyleApiModel);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
