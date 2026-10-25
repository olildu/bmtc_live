package app.chalo.models.validation;

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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/models/validation/RegularBusProductAndValidationMethod.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/models/validation/RegularBusProductAndValidationMethod;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class RegularBusProductAndValidationMethod$$serializer implements GeneratedSerializer<RegularBusProductAndValidationMethod> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final RegularBusProductAndValidationMethod$$serializer f5697a;
    private static final SerialDescriptor descriptor;

    static {
        RegularBusProductAndValidationMethod$$serializer regularBusProductAndValidationMethod$$serializer = new RegularBusProductAndValidationMethod$$serializer();
        f5697a = regularBusProductAndValidationMethod$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.models.validation.RegularBusProductAndValidationMethod", regularBusProductAndValidationMethod$$serializer, 3);
        pluginGeneratedSerialDescriptor.j("productType", true);
        pluginGeneratedSerialDescriptor.j("ble", true);
        pluginGeneratedSerialDescriptor.j("sound", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{StringSerializer.f18170a, BuiltinSerializersKt.c(RegularBusSlBleConfig$$serializer.f5703a), BuiltinSerializersKt.c(RegularBusSoundBasedValidationConfig$$serializer.f5705a)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        String strDecodeStringElement;
        RegularBusSlBleConfig regularBusSlBleConfig;
        RegularBusSoundBasedValidationConfig regularBusSoundBasedValidationConfig;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        String strDecodeStringElement2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            regularBusSlBleConfig = (RegularBusSlBleConfig) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, RegularBusSlBleConfig$$serializer.f5703a, null);
            regularBusSoundBasedValidationConfig = (RegularBusSoundBasedValidationConfig) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, RegularBusSoundBasedValidationConfig$$serializer.f5705a, null);
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            RegularBusSlBleConfig regularBusSlBleConfig2 = null;
            RegularBusSoundBasedValidationConfig regularBusSoundBasedValidationConfig2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    regularBusSlBleConfig2 = (RegularBusSlBleConfig) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, RegularBusSlBleConfig$$serializer.f5703a, regularBusSlBleConfig2);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    regularBusSoundBasedValidationConfig2 = (RegularBusSoundBasedValidationConfig) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, RegularBusSoundBasedValidationConfig$$serializer.f5705a, regularBusSoundBasedValidationConfig2);
                    i2 |= 4;
                }
            }
            i = i2;
            strDecodeStringElement = strDecodeStringElement2;
            regularBusSlBleConfig = regularBusSlBleConfig2;
            regularBusSoundBasedValidationConfig = regularBusSoundBasedValidationConfig2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new RegularBusProductAndValidationMethod(i, strDecodeStringElement, regularBusSlBleConfig, regularBusSoundBasedValidationConfig);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        RegularBusProductAndValidationMethod value = (RegularBusProductAndValidationMethod) obj;
        Intrinsics.i(value, "value");
        RegularBusSoundBasedValidationConfig regularBusSoundBasedValidationConfig = value.c;
        RegularBusSlBleConfig regularBusSlBleConfig = value.b;
        String str = value.f5696a;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.d(str, "")) {
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 1) || regularBusSlBleConfig != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, RegularBusSlBleConfig$$serializer.f5703a, regularBusSlBleConfig);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 2) || regularBusSoundBasedValidationConfig != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, RegularBusSoundBasedValidationConfig$$serializer.f5705a, regularBusSoundBasedValidationConfig);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
